package androidx.loader.app;

import X.AbstractC20148113sV;
import X.C08P7;
import X.C1119470fEn;
import X.C20147913sT;
import X.C20148213sW;
import X.C20307614d8;
import X.C2188811AlT;
import X.InterfaceC20148313sX;
import X.InterfaceC20148413sY;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes31.dex */
public final class LoaderManagerImpl extends AbstractC20148113sV {
    public final LifecycleOwner LIZ;
    public final LoaderViewModel LIZIZ;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements InterfaceC20148413sY<D> {
        public final Bundle mArgs;
        public final int mId;
        public LifecycleOwner mLifecycleOwner;
        public final C20147913sT<D> mLoader;
        public C20148213sW<D> mObserver;
        public C20147913sT<D> mPriorLoader;

        public void markForRedelivery() {
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            C20148213sW<D> c20148213sW = this.mObserver;
            if (lifecycleOwner == null || c20148213sW == null) {
                return;
            }
            super.removeObserver(c20148213sW);
            observe(lifecycleOwner, c20148213sW);
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            C20147913sT<D> c20147913sT = this.mLoader;
            c20147913sT.LIZLLL = true;
            c20147913sT.LJFF = false;
            c20147913sT.LJ = false;
            c20147913sT.LJI();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            C20147913sT<D> c20147913sT = this.mLoader;
            c20147913sT.LIZLLL = false;
            c20147913sT.LJII();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.mId);
            sb.append(" : ");
            C08P7.LIZ(this.mLoader, sb);
            sb.append("}}");
            return sb.toString();
        }

        public boolean isCallbackWaitingForData() {
            C20148213sW<D> c20148213sW;
            return (!hasActiveObservers() || (c20148213sW = this.mObserver) == null || c20148213sW.LLILLJJLI) ? false : true;
        }

        public C20147913sT<D> getLoader() {
            return this.mLoader;
        }

        public C20147913sT<D> destroy(boolean z) {
            this.mLoader.LIZ();
            this.mLoader.LJ = true;
            C20148213sW<D> c20148213sW = this.mObserver;
            if (c20148213sW != null) {
                removeObserver(c20148213sW);
                if (z && c20148213sW.LLILLJJLI) {
                    c20148213sW.LL.LIZJ();
                }
            }
            C20147913sT<D> c20147913sT = this.mLoader;
            InterfaceC20148413sY<D> interfaceC20148413sY = c20147913sT.LIZIZ;
            if (interfaceC20148413sY != null) {
                if (interfaceC20148413sY == this) {
                    c20147913sT.LIZIZ = null;
                    if ((c20148213sW == null || c20148213sW.LLILLJJLI) && !z) {
                        return c20147913sT;
                    }
                    c20147913sT.LJFF();
                    c20147913sT.LJFF = true;
                    c20147913sT.LIZLLL = false;
                    c20147913sT.LJ = false;
                    c20147913sT.LJI = false;
                    c20147913sT.LJII = false;
                    return this.mPriorLoader;
                }
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            throw new IllegalStateException("No listener register");
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(Observer<? super D> observer) {
            super.removeObserver(observer);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            C20147913sT<D> c20147913sT = this.mPriorLoader;
            if (c20147913sT != null) {
                c20147913sT.LJFF();
                c20147913sT.LJFF = true;
                c20147913sT.LIZLLL = false;
                c20147913sT.LJ = false;
                c20147913sT.LJI = false;
                c20147913sT.LJII = false;
                this.mPriorLoader = null;
            }
        }

        @Override // X.InterfaceC20148413sY
        public void onLoadComplete(C20147913sT<D> c20147913sT, D d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
            } else {
                postValue(d);
            }
        }

        public C20147913sT<D> setCallback(LifecycleOwner lifecycleOwner, InterfaceC20148313sX<D> interfaceC20148313sX) {
            C20148213sW<D> c20148213sW = new C20148213sW<>(this.mLoader, interfaceC20148313sX);
            observe(lifecycleOwner, c20148213sW);
            C20148213sW<D> c20148213sW2 = this.mObserver;
            if (c20148213sW2 != null) {
                removeObserver(c20148213sW2);
            }
            this.mLifecycleOwner = lifecycleOwner;
            this.mObserver = c20148213sW;
            return this.mLoader;
        }

        public LoaderInfo(int i, Bundle bundle, C20147913sT<D> c20147913sT, C20147913sT<D> c20147913sT2) {
            this.mId = i;
            this.mArgs = bundle;
            this.mLoader = c20147913sT;
            this.mPriorLoader = c20147913sT2;
            if (c20147913sT.LIZIZ == null) {
                c20147913sT.LIZIZ = this;
                c20147913sT.LIZ = i;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.mId);
            printWriter.print(" mArgs=");
            printWriter.println(this.mArgs);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.mLoader);
            C20147913sT<D> c20147913sT = this.mLoader;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("  ");
            c20147913sT.LIZJ(C2188811AlT.LIZIZ(sbLIZ), fileDescriptor, printWriter, strArr);
            if (this.mObserver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mObserver);
                C20148213sW<D> c20148213sW = this.mObserver;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("  ");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c20148213sW.getClass();
                printWriter.print(strLIZIZ);
                printWriter.print("mDeliveredData=");
                printWriter.println(c20148213sW.LLILLJJLI);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            C20147913sT<D> loader = getLoader();
            D value = getValue();
            loader.getClass();
            StringBuilder sb = new StringBuilder(64);
            C08P7.LIZ(value, sb);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }
    }

    public static class LoaderViewModel extends ViewModel {
        public static final C20307614d8 LLILLL = new C20307614d8(0);
        public final C1119470fEn<LoaderInfo> LL = new C1119470fEn<>();
        public boolean LLILLJJLI = false;

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            int iLJII = this.LL.LJII();
            for (int i = 0; i < iLJII; i++) {
                this.LL.LJIIIIZZ(i).destroy(true);
            }
            this.LL.LIZIZ();
        }
    }

    public final void LJ() {
        LoaderViewModel loaderViewModel = this.LIZIZ;
        int iLJII = loaderViewModel.LL.LJII();
        for (int i = 0; i < iLJII; i++) {
            loaderViewModel.LL.LJIIIIZZ(i).markForRedelivery();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C08P7.LIZ(this.LIZ, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // X.AbstractC20148113sV
    public final void LIZ(int i) {
        if (!this.LIZIZ.LLILLJJLI) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                LoaderInfo loaderInfoLIZLLL = this.LIZIZ.LL.LIZLLL(i);
                if (loaderInfoLIZLLL != null) {
                    loaderInfoLIZLLL.destroy(true);
                    this.LIZIZ.LL.LJI(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = (LoaderViewModel) new ViewModelProvider(viewModelStore, LoaderViewModel.LLILLL).get(LoaderViewModel.class);
    }

    @Override // X.AbstractC20148113sV
    public final <D> C20147913sT<D> LIZJ(int i, Bundle bundle, InterfaceC20148313sX<D> interfaceC20148313sX) {
        if (!this.LIZIZ.LLILLJJLI) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                LoaderInfo loaderInfoLIZLLL = this.LIZIZ.LL.LIZLLL(i);
                if (loaderInfoLIZLLL == null) {
                    try {
                        this.LIZIZ.LLILLJJLI = true;
                        C20147913sT c20147913sTLIZIZ = interfaceC20148313sX.LIZIZ(bundle);
                        if (c20147913sTLIZIZ != null) {
                            if (c20147913sTLIZIZ.getClass().isMemberClass() && !Modifier.isStatic(c20147913sTLIZIZ.getClass().getModifiers())) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                                sbLIZ.append(c20147913sTLIZIZ);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            LoaderInfo loaderInfo = new LoaderInfo(i, bundle, c20147913sTLIZIZ, null);
                            this.LIZIZ.LL.LJFF(i, loaderInfo);
                            this.LIZIZ.LLILLJJLI = false;
                            return loaderInfo.setCallback(this.LIZ, interfaceC20148313sX);
                        }
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZIZ.LLILLJJLI = false;
                        throw th;
                    }
                }
                return loaderInfoLIZLLL.setCallback(this.LIZ, interfaceC20148313sX);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void LIZLLL(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.LIZIZ;
        if (loaderViewModel.LL.LJII() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("    ");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            for (int i = 0; i < loaderViewModel.LL.LJII(); i++) {
                LoaderInfo loaderInfoLJIIIIZZ = loaderViewModel.LL.LJIIIIZZ(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.LL.LJ(i));
                printWriter.print(": ");
                printWriter.println(loaderInfoLJIIIIZZ.toString());
                loaderInfoLJIIIIZZ.dump(strLIZIZ, fileDescriptor, printWriter, strArr);
            }
        }
    }
}
