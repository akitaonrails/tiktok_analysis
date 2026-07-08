package X;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B73, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B73 extends C1B74 implements ServiceConnection {
    public static final String LLJILJIL = C1B73.class.getSimpleName();
    public C1B7C LLJ;
    public C1B77 LLJI;
    public int LLJIJIL = -1;

    @Override // X.C1B74, X.C1B7F
    public final void LIZ() {
        if (this.LLJ == null) {
            LJII(C2199681B7e.LJFF(), this);
        }
    }

    public final void LJIIIIZZ() {
        SparseArray<List<DownloadTask>> sparseArrayClone;
        try {
            synchronized (this.LLILLJJLI) {
                try {
                    sparseArrayClone = this.LLILLJJLI.clone();
                    this.LLILLJJLI.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (sparseArrayClone == null || sparseArrayClone.size() <= 0 || C2199681B7e.LJIILIIL() == null) {
                return;
            }
            for (int i = 0; i < sparseArrayClone.size(); i++) {
                List<DownloadTask> list = sparseArrayClone.get(sparseArrayClone.keyAt(i));
                if (list != null) {
                    Iterator<DownloadTask> it2 = list.iterator();
                    while (it2.hasNext()) {
                        DownloadTask next = it2.next();
                        try {
                            this.LLJ.W(next == null ? null : new C1B6S(next));
                        } catch (RemoteException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            String str = LLJILJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception:");
            sbLIZ.append(th2);
            C1490830otl.LIZJ(str, "resumePendingTaskForIndependent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C1B74, X.C1B7F
    public final IBinder LIZJ(Intent intent) {
        String str = LLJILJIL;
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZIZ(str, "onBind", "Downloader process sync database on main process");
            }
            try {
                if (C2199751B7l.LJII == null) {
                    C2199751B7l.LJII = new JSONObject();
                }
                C2199751B7l.LJII.put("fix_sigbus_downloader_db", 1);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(str, "onBind", "IndependentDownloadBinder");
        }
        return new C1B78();
    }

    @Override // X.C1B74, X.C1B7F
    public final void LIZLLL(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        C1B7M.LJ().LJIIIIZZ(downloadTask.getDownloadId(), true);
        C1B7G c1b7gLJIILIIL = C2199681B7e.LJIILIIL();
        if (c1b7gLJIILIIL != null) {
            c1b7gLJIILIIL.LJIL(downloadTask);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.LLJ = null;
        C1B77 c1b77 = this.LLJI;
        if (c1b77 != null) {
            ((C1B7B) c1b77).LIZ = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(LLJILJIL, "onServiceDisconnected", "Run");
        }
        this.LLJ = null;
        this.LLILLL = false;
        C1B77 c1b77 = this.LLJI;
        if (c1b77 != null) {
            ((C1B7B) c1b77).LIZ = null;
        }
    }

    @Override // X.C1B74, X.C1B7F
    public final void setLogLevel(int i) {
        C1B7C c1b7c = this.LLJ;
        if (c1b7c == null) {
            this.LLJIJIL = i;
            return;
        }
        try {
            c1b7c.setLogLevel(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C1B74, X.C1B7F
    public final void tryDownload(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask == null) {
            return;
        }
        if (C1490830otl.LIZ()) {
            String str = LLJILJIL;
            int downloadId = downloadTask.getDownloadId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AidlService == null:");
            if (this.LLJ == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C1490830otl.LIZLLL(downloadId, str, "tryDownload", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJ == null) {
            LJFF(downloadTask);
            LJII(C2199681B7e.LJFF(), this);
            return;
        }
        LJIIIIZZ();
        try {
            this.LLJ.W(new C1B6S(downloadTask));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C1B74
    public final void LJII(Context context, ServiceConnection serviceConnection) {
        try {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZIZ(LLJILJIL, "startService", "BindService");
            }
            Intent intent = new Intent(context, (Class<?>) IndependentProcessDownloadService.class);
            if (C2199661B7c.LJIILJJIL()) {
                intent.putExtra("fix_downloader_db_sigbus", C2199751B7l.LJFF.LJI("fix_sigbus_downloader_db", false));
            }
            if (serviceConnection != null) {
                C2204961BRm.LJJJJ(context, intent, serviceConnection, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofPP81MBTC5OTGWTfGcxjUssrEeSj5Y5jZ4cfu3+JG43M8zZaMmR4g==", null));
            }
            C786410Ut5.s3(context, intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.13sL] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        C1B7C c1b7c;
        boolean z;
        final IBinder iBinder2 = iBinder;
        C1B7C c1b7c2 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/socialbase/downloader/impls/IndependentDownloadServiceHandler", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofPP81MBTC5OTGWTfGcxjUssrEeSj5Y5jZ4cfu3+JG43M8zZaMmR4g==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder2 = (IBinder) obj2;
            }
        }
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(LLJILJIL, "onServiceConnected", "Run");
        }
        if (iBinder2 == null) {
            c1b7c = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C1B7C)) {
                c1b7c = (C1B7C) iInterfaceQueryLocalInterface;
            } else {
                c1b7c = new C1B7C(iBinder2) { // from class: X.1B6E
                    public final IBinder LL;

                    @Override // X.C1B7C
                    public final boolean LJJIJIL() {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            this.LL.transact(47, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            boolean z2 = parcelObtain2.readInt() != 0;
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void clearData() {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            this.LL.transact(39, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final List<DownloadInfo> getAllDownloadInfo() {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            this.LL.transact(18, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return arrayListCreateTypedArrayList;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final boolean isDownloadCacheSyncSuccess() {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            this.LL.transact(33, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            boolean z2 = parcelObtain2.readInt() != 0;
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void pauseAll() {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            this.LL.transact(7, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = iBinder2;
                    }

                    @Override // X.C1B7C
                    public final boolean LJIIIIZZ(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            boolean z2 = false;
                            this.LL.transact(38, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() != 0) {
                                z2 = true;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJIIIZ(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(40, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final boolean LJIILLIIL(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            boolean z2 = false;
                            this.LL.transact(37, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() != 0) {
                                z2 = true;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJJIIZ(boolean z2) {
                        int i;
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            if (z2) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            parcelObtain.writeInt(i);
                            this.LL.transact(29, parcelObtain, null, 1);
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final int LJJLIIIJL(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(35, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            int i2 = parcelObtain2.readInt();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return i2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LLLLLLLLL(InterfaceC2199541B6q interfaceC2199541B6q) {
                        IBinder iBinderAsBinder;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            if (interfaceC2199541B6q == null) {
                                iBinderAsBinder = null;
                            } else {
                                iBinderAsBinder = interfaceC2199541B6q.asBinder();
                            }
                            parcelObtain.writeStrongBinder(iBinderAsBinder);
                            this.LL.transact(41, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void W(InterfaceC2199581B6u interfaceC2199581B6u) {
                        IBinder iBinderAsBinder;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            if (interfaceC2199581B6u == null) {
                                iBinderAsBinder = null;
                            } else {
                                iBinderAsBinder = interfaceC2199581B6u.asBinder();
                            }
                            parcelObtain.writeStrongBinder(iBinderAsBinder);
                            this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final boolean canResume(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            boolean z2 = false;
                            this.LL.transact(4, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() != 0) {
                                z2 = true;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void forceDownloadIngoreRecommendSize(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(23, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final long getCurBytes(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(8, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            long j = parcelObtain2.readLong();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return j;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final InterfaceC19860412nC getDownloadFileUriProvider(int i) {
                        InterfaceC19860412nC c19860212nA;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(46, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            IBinder strongBinder = parcelObtain2.readStrongBinder();
                            if (strongBinder != null) {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                                if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC19860412nC)) {
                                    c19860212nA = (InterfaceC19860412nC) iInterfaceQueryLocalInterface2;
                                } else {
                                    c19860212nA = new C19860212nA(strongBinder);
                                }
                            } else {
                                c19860212nA = null;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return c19860212nA;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final DownloadInfo getDownloadInfo(int i) {
                        DownloadInfo downloadInfoCreateFromParcel;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(11, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() != 0) {
                                downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcelObtain2);
                            } else {
                                downloadInfoCreateFromParcel = null;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return downloadInfoCreateFromParcel;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final List<DownloadInfo> getDownloadInfoList(String str) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeString(str);
                            this.LL.transact(12, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return arrayListCreateTypedArrayList;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeString(str);
                            this.LL.transact(17, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return arrayListCreateTypedArrayList;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final C1B5O getDownloadNotificationEventListener(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(43, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            C1B5O c1b5oLJJJZ = C1B5M.LJJJZ(parcelObtain2.readStrongBinder());
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return c1b5oLJJJZ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeString(str);
                            this.LL.transact(16, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return arrayListCreateTypedArrayList;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final C1B6B getNotificationClickCallback(int i) {
                        C1B6B c1b68;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(44, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            IBinder strongBinder = parcelObtain2.readStrongBinder();
                            if (strongBinder != null) {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                                if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof C1B6B)) {
                                    c1b68 = (C1B6B) iInterfaceQueryLocalInterface2;
                                } else {
                                    c1b68 = new C1B68(strongBinder);
                                }
                            } else {
                                c1b68 = null;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return c1b68;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final int getStatus(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(9, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            int i2 = parcelObtain2.readInt();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return i2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeString(str);
                            this.LL.transact(15, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return arrayListCreateTypedArrayList;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeString(str);
                            this.LL.transact(31, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return arrayListCreateTypedArrayList;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            boolean z2 = true;
                            if (downloadInfo == null) {
                                parcelObtain.writeInt(0);
                            } else {
                                parcelObtain.writeInt(1);
                                downloadInfo.writeToParcel(parcelObtain, 0);
                            }
                            this.LL.transact(27, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() == 0) {
                                z2 = false;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final boolean isDownloading(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            boolean z2 = false;
                            this.LL.transact(10, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() != 0) {
                                z2 = true;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void restart(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(6, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void restartAllFailedDownloadTasks(List<String> list) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeStringList(list);
                            this.LL.transact(19, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeStringList(list);
                            this.LL.transact(20, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void resume(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(5, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void setLogLevel(int i) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            this.LL.transact(32, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            boolean z2 = true;
                            if (downloadInfo == null) {
                                parcelObtain.writeInt(0);
                            } else {
                                parcelObtain.writeInt(1);
                                downloadInfo.writeToParcel(parcelObtain, 0);
                            }
                            this.LL.transact(36, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() == 0) {
                                z2 = false;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return z2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJJJJJ(int i, int i2) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            parcelObtain.writeInt(i2);
                            this.LL.transact(42, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJJLIIIJJI(int i, boolean z2) {
                        int i2;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            if (z2) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            parcelObtain.writeInt(i2);
                            this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJJLIIIJLJLI(int i, boolean z2) {
                        int i2;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            if (z2) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            parcelObtain.writeInt(i2);
                            this.LL.transact(34, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJLI(int i, Notification notification) {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            if (notification != null) {
                                parcelObtain.writeInt(1);
                                notification.writeToParcel(parcelObtain, 0);
                            } else {
                                parcelObtain.writeInt(0);
                            }
                            this.LL.transact(28, parcelObtain, null, 1);
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void cancel(int i, boolean z2) {
                        int i2;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            if (z2) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            parcelObtain.writeInt(i2);
                            this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void f(int i, C1B5O c1b5o) {
                        IBinder iBinderAsBinder;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            if (c1b5o == null) {
                                iBinderAsBinder = null;
                            } else {
                                iBinderAsBinder = c1b5o.asBinder();
                            }
                            parcelObtain.writeStrongBinder(iBinderAsBinder);
                            this.LL.transact(45, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJJJJZ(int i, boolean z2, boolean z3) {
                        int i2;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            int i3 = 1;
                            if (z2) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            parcelObtain.writeInt(i2);
                            if (!z3) {
                                i3 = 0;
                            }
                            parcelObtain.writeInt(i3);
                            this.LL.transact(21, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void setThrottleNetSpeed(int i, long j, int i2) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            parcelObtain.writeLong(j);
                            parcelObtain.writeInt(i2);
                            this.LL.transact(48, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void LJLJJLL(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z2) {
                        IBinder iBinderAsBinder;
                        int i4;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            parcelObtain.writeInt(i2);
                            if (interfaceC2200291B9n == null) {
                                iBinderAsBinder = null;
                            } else {
                                iBinderAsBinder = interfaceC2200291B9n.asBinder();
                            }
                            parcelObtain.writeStrongBinder(iBinderAsBinder);
                            parcelObtain.writeInt(i3);
                            if (z2) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            parcelObtain.writeInt(i4);
                            this.LL.transact(25, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void v0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z2) {
                        IBinder iBinderAsBinder;
                        int i4;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            parcelObtain.writeInt(i2);
                            if (interfaceC2200291B9n == null) {
                                iBinderAsBinder = null;
                            } else {
                                iBinderAsBinder = interfaceC2200291B9n.asBinder();
                            }
                            parcelObtain.writeStrongBinder(iBinderAsBinder);
                            parcelObtain.writeInt(i3);
                            if (z2) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            parcelObtain.writeInt(i4);
                            this.LL.transact(24, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.C1B7C
                    public final void A0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z2, boolean z3) {
                        IBinder iBinderAsBinder;
                        int i4;
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                            parcelObtain.writeInt(i);
                            parcelObtain.writeInt(i2);
                            if (interfaceC2200291B9n == null) {
                                iBinderAsBinder = null;
                            } else {
                                iBinderAsBinder = interfaceC2200291B9n.asBinder();
                            }
                            parcelObtain.writeStrongBinder(iBinderAsBinder);
                            parcelObtain.writeInt(i3);
                            int i5 = 1;
                            if (z2) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            parcelObtain.writeInt(i4);
                            if (!z3) {
                                i5 = 0;
                            }
                            parcelObtain.writeInt(i5);
                            this.LL.transact(26, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }
                };
            }
        }
        this.LLJ = c1b7c;
        C1B77 c1b77 = this.LLJI;
        if (c1b77 != null) {
            C1B7B c1b7b = (C1B7B) c1b77;
            if (iBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof C1B7C)) {
                    c1b7c2 = (C1B7C) iInterfaceQueryLocalInterface2;
                } else {
                    c1b7c2 = new C1B7C(iBinder2) { // from class: X.1B6E
                        public final IBinder LL;

                        @Override // X.C1B7C
                        public final boolean LJJIJIL() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                this.LL.transact(47, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                boolean z2 = parcelObtain2.readInt() != 0;
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void clearData() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                this.LL.transact(39, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final List<DownloadInfo> getAllDownloadInfo() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                this.LL.transact(18, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return arrayListCreateTypedArrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final boolean isDownloadCacheSyncSuccess() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                this.LL.transact(33, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                boolean z2 = parcelObtain2.readInt() != 0;
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void pauseAll() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                this.LL.transact(7, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // android.os.IInterface
                        public final IBinder asBinder() {
                            return this.LL;
                        }

                        {
                            this.LL = iBinder2;
                        }

                        @Override // X.C1B7C
                        public final boolean LJIIIIZZ(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                boolean z2 = false;
                                this.LL.transact(38, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z2 = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJIIIZ(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(40, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final boolean LJIILLIIL(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                boolean z2 = false;
                                this.LL.transact(37, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z2 = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJJIIZ(boolean z2) {
                            int i;
                            Parcel parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                if (z2) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                parcelObtain.writeInt(i);
                                this.LL.transact(29, parcelObtain, null, 1);
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final int LJJLIIIJL(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(35, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                int i2 = parcelObtain2.readInt();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return i2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LLLLLLLLL(InterfaceC2199541B6q interfaceC2199541B6q) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                if (interfaceC2199541B6q == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2199541B6q.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                this.LL.transact(41, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void W(InterfaceC2199581B6u interfaceC2199581B6u) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                if (interfaceC2199581B6u == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2199581B6u.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final boolean canResume(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                boolean z2 = false;
                                this.LL.transact(4, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z2 = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void forceDownloadIngoreRecommendSize(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(23, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final long getCurBytes(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(8, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                long j = parcelObtain2.readLong();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return j;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final InterfaceC19860412nC getDownloadFileUriProvider(int i) {
                            InterfaceC19860412nC c19860212nA;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(46, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                IBinder strongBinder = parcelObtain2.readStrongBinder();
                                if (strongBinder != null) {
                                    IInterface iInterfaceQueryLocalInterface22 = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                                    if (iInterfaceQueryLocalInterface22 != null && (iInterfaceQueryLocalInterface22 instanceof InterfaceC19860412nC)) {
                                        c19860212nA = (InterfaceC19860412nC) iInterfaceQueryLocalInterface22;
                                    } else {
                                        c19860212nA = new C19860212nA(strongBinder);
                                    }
                                } else {
                                    c19860212nA = null;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return c19860212nA;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final DownloadInfo getDownloadInfo(int i) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(11, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcelObtain2);
                                } else {
                                    downloadInfoCreateFromParcel = null;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return downloadInfoCreateFromParcel;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final List<DownloadInfo> getDownloadInfoList(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeString(str);
                                this.LL.transact(12, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return arrayListCreateTypedArrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeString(str);
                                this.LL.transact(17, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return arrayListCreateTypedArrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final C1B5O getDownloadNotificationEventListener(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(43, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                C1B5O c1b5oLJJJZ = C1B5M.LJJJZ(parcelObtain2.readStrongBinder());
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return c1b5oLJJJZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeString(str);
                                this.LL.transact(16, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return arrayListCreateTypedArrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final C1B6B getNotificationClickCallback(int i) {
                            C1B6B c1b68;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(44, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                IBinder strongBinder = parcelObtain2.readStrongBinder();
                                if (strongBinder != null) {
                                    IInterface iInterfaceQueryLocalInterface22 = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                                    if (iInterfaceQueryLocalInterface22 != null && (iInterfaceQueryLocalInterface22 instanceof C1B6B)) {
                                        c1b68 = (C1B6B) iInterfaceQueryLocalInterface22;
                                    } else {
                                        c1b68 = new C1B68(strongBinder);
                                    }
                                } else {
                                    c1b68 = null;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return c1b68;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final int getStatus(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(9, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                int i2 = parcelObtain2.readInt();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return i2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeString(str);
                                this.LL.transact(15, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return arrayListCreateTypedArrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeString(str);
                                this.LL.transact(31, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(DownloadInfo.CREATOR);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return arrayListCreateTypedArrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                boolean z2 = true;
                                if (downloadInfo == null) {
                                    parcelObtain.writeInt(0);
                                } else {
                                    parcelObtain.writeInt(1);
                                    downloadInfo.writeToParcel(parcelObtain, 0);
                                }
                                this.LL.transact(27, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() == 0) {
                                    z2 = false;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final boolean isDownloading(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                boolean z2 = false;
                                this.LL.transact(10, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z2 = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void restart(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(6, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void restartAllFailedDownloadTasks(List<String> list) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeStringList(list);
                                this.LL.transact(19, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeStringList(list);
                                this.LL.transact(20, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void resume(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(5, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void setLogLevel(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                this.LL.transact(32, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                boolean z2 = true;
                                if (downloadInfo == null) {
                                    parcelObtain.writeInt(0);
                                } else {
                                    parcelObtain.writeInt(1);
                                    downloadInfo.writeToParcel(parcelObtain, 0);
                                }
                                this.LL.transact(36, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() == 0) {
                                    z2 = false;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJJJJJ(int i, int i2) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeInt(i2);
                                this.LL.transact(42, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJJLIIIJJI(int i, boolean z2) {
                            int i2;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                if (z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                parcelObtain.writeInt(i2);
                                this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJJLIIIJLJLI(int i, boolean z2) {
                            int i2;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                if (z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                parcelObtain.writeInt(i2);
                                this.LL.transact(34, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJLI(int i, Notification notification) {
                            Parcel parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                if (notification != null) {
                                    parcelObtain.writeInt(1);
                                    notification.writeToParcel(parcelObtain, 0);
                                } else {
                                    parcelObtain.writeInt(0);
                                }
                                this.LL.transact(28, parcelObtain, null, 1);
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void cancel(int i, boolean z2) {
                            int i2;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                if (z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                parcelObtain.writeInt(i2);
                                this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void f(int i, C1B5O c1b5o) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                if (c1b5o == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = c1b5o.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                this.LL.transact(45, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJJJJZ(int i, boolean z2, boolean z3) {
                            int i2;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                int i3 = 1;
                                if (z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                parcelObtain.writeInt(i2);
                                if (!z3) {
                                    i3 = 0;
                                }
                                parcelObtain.writeInt(i3);
                                this.LL.transact(21, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void setThrottleNetSpeed(int i, long j, int i2) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeLong(j);
                                parcelObtain.writeInt(i2);
                                this.LL.transact(48, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void LJLJJLL(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z2) {
                            IBinder iBinderAsBinder;
                            int i4;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeInt(i2);
                                if (interfaceC2200291B9n == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2200291B9n.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                parcelObtain.writeInt(i3);
                                if (z2) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                parcelObtain.writeInt(i4);
                                this.LL.transact(25, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void v0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z2) {
                            IBinder iBinderAsBinder;
                            int i4;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeInt(i2);
                                if (interfaceC2200291B9n == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2200291B9n.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                parcelObtain.writeInt(i3);
                                if (z2) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                parcelObtain.writeInt(i4);
                                this.LL.transact(24, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C1B7C
                        public final void A0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z2, boolean z3) {
                            IBinder iBinderAsBinder;
                            int i4;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeInt(i2);
                                if (interfaceC2200291B9n == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2200291B9n.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                parcelObtain.writeInt(i3);
                                int i5 = 1;
                                if (z2) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                parcelObtain.writeInt(i4);
                                if (!z3) {
                                    i5 = 0;
                                }
                                parcelObtain.writeInt(i5);
                                this.LL.transact(26, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }
                    };
                }
            }
            c1b7b.LIZ = c1b7c2;
            if (C2199661B7c.LJIILJJIL()) {
                ?? r2 = new InterfaceC2199571B6t() { // from class: X.13sL
                    @Override // X.InterfaceC2199571B6t
                    public final void LJJLIIIJJIZ(int i, int i2) {
                        if (i2 == 1) {
                            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C2199681B7e.LJFF()).pause(i);
                        } else {
                            if (i2 != 2) {
                                return;
                            }
                            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C2199681B7e.LJFF()).cancel(i);
                        }
                    }
                };
                if (c1b7b.LIZ != null) {
                    try {
                        c1b7b.LIZ.LLLLLLLLL(new BinderC2199551B6r(r2));
                    } catch (RemoteException e) {
                    }
                }
            }
        }
        if (C1490830otl.LIZ()) {
            String str = LLJILJIL;
            StringBuilder sb = new StringBuilder("AidlService!=null");
            if (this.LLJ != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" pendingTasks.size:");
            sb.append(this.LLILLJJLI.size());
            C1490830otl.LIZIZ(str, "onServiceConnected", sb.toString());
        }
        if (this.LLJ != null) {
            C1B7M c1b7mLJ = C1B7M.LJ();
            synchronized (c1b7mLJ.LIZIZ) {
                try {
                    for (C1B76 c1b76 : (ArrayList) c1b7mLJ.LIZIZ) {
                        if (c1b76 != null) {
                            c1b76.LIZ();
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLILLL = true;
            this.LLILZIL = false;
            int i = this.LLJIJIL;
            if (i != -1) {
                try {
                    this.LLJ.setLogLevel(i);
                } catch (RemoteException e2) {
                }
            }
            if (this.LLJ != null) {
                LJIIIIZZ();
            }
        }
    }
}
