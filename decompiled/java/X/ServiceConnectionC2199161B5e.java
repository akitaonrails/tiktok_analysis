package X;

import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.1B5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class ServiceConnectionC2199161B5e implements C1B5Y, ServiceConnection {
    public static boolean LLIZLLLIL;
    public static int LLJ;
    public static long LLJI;
    public InterfaceC2199171B5f LL;
    public InterfaceC2199201B5i LLILZ;
    public Future<?> LLILZLL;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public C1B5G LLILLL = null;
    public final ARunnableS134S0100000_34 LLILZIL = new ARunnableS134S0100000_34(this, 44);
    public final CountDownLatch LLIZ = new CountDownLatch(1);

    @Override // X.InterfaceC2199141B5c
    public final void LJJJZ(int i) {
    }

    @Override // X.InterfaceC2199141B5c
    public final /* bridge */ /* synthetic */ List LLILLIZIL(int i) {
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public final void LLLIIL() {
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LLLLII(int i, Map<Long, C2199811B7r> map) {
        return false;
    }

    @Override // X.InterfaceC2199141B5c
    public final void clearMemoryCacheData(double d) {
    }

    @Override // X.InterfaceC2199141B5c
    public final Map<Long, C2199811B7r> x(int i) {
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LJL() {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJL();
            }
            return false;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final void clearData() {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                interfaceC2199171B5f.clearData();
            }
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getAllDownloadInfo() {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.getAllDownloadInfo();
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean isDownloadCacheSyncSuccess() {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.isDownloadCacheSyncSuccess();
            }
            return false;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public ServiceConnectionC2199161B5e() {
        SqlDownloadCacheService.LIZ(C2199681B7e.LJFF(), this);
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LJIIIIZZ(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJIIIIZZ(i);
            }
            return false;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final void LJIIIZ(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                interfaceC2199171B5f.LJIIIZ(i);
            }
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LJIILLIIL(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJIILLIIL(i);
            }
            return false;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final void LJIJI(DownloadInfo downloadInfo) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                interfaceC2199171B5f.LJIJI(downloadInfo);
            }
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIIJ(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJIIJ(i);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJ(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJIJ(i);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJL(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJIJL(i);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJJJ(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJJJ(i);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo getDownloadInfo(int i) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.getDownloadInfo(i);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.getDownloadInfoList(str);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.getDownloadInfosByFileExtension(str);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.getSuccessedDownloadInfosWithMimeType(str);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.getUnCompletedDownloadInfosWithMimeType(str);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LL = null;
        LLIZLLLIL = false;
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.updateDownloadInfo(downloadInfo);
            }
            return false;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJIIJI(int i, long j) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJIJIIJI(i, j);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJJ(int i, long j) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJJ(i, j);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJLIIIJLLLLLLLZ(i, j);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJZZI(int i, long j) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJZZI(i, j);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
        InterfaceC2199171B5f interfaceC2199171B5f = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/socialbase/downloader/db/SqlDownloadCacheAidlWrapper", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisof7ArWwDDiNPX26P6aaWjf0ChvhEuwzfprWdzskJqA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder = (IBinder) obj2;
            }
        }
        LLIZLLLIL = true;
        this.LLILLJJLI.removeCallbacks(this.LLILZIL);
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2199171B5f)) {
                    interfaceC2199171B5f = (InterfaceC2199171B5f) iInterfaceQueryLocalInterface;
                } else {
                    interfaceC2199171B5f = new InterfaceC2199171B5f(iBinder) { // from class: X.1B5K
                        public final IBinder LL;

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final boolean LJL() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                this.LL.transact(24, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                boolean z = parcelObtain2.readInt() != 0;
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final void clearData() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                this.LL.transact(12, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final List<DownloadInfo> getAllDownloadInfo() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                this.LL.transact(8, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final boolean isDownloadCacheSyncSuccess() {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                this.LL.transact(23, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                boolean z = parcelObtain2.readInt() != 0;
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
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
                            this.LL = iBinder;
                        }

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final boolean LJIIIIZZ(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                boolean z = false;
                                this.LL.transact(11, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final void LJIIIZ(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final boolean LJIILLIIL(int i) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                boolean z = false;
                                this.LL.transact(10, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final void LJIJI(DownloadInfo downloadInfo) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(1);
                                downloadInfo.writeToParcel(parcelObtain, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJIIJ(int i) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                this.LL.transact(22, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJIJ(int i) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                this.LL.transact(21, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJIJL(int i) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                this.LL.transact(13, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJJJ(int i) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                this.LL.transact(17, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f
                        public final void N(boolean z) {
                            int i;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                if (z) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                parcelObtain.writeInt(i);
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

                        @Override // X.InterfaceC2199171B5f
                        public final void d1(C1B5G c1b5g) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                if (c1b5g == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = c1b5g.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                this.LL.transact(27, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo getDownloadInfo(int i) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                this.LL.transact(3, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final List<DownloadInfo> getDownloadInfoList(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeString(str);
                                this.LL.transact(4, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeString(str);
                                this.LL.transact(7, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeString(str);
                                this.LL.transact(5, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeString(str);
                                this.LL.transact(6, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                boolean z = true;
                                if (downloadInfo == null) {
                                    parcelObtain.writeInt(0);
                                } else {
                                    parcelObtain.writeInt(1);
                                    downloadInfo.writeToParcel(parcelObtain, 0);
                                }
                                this.LL.transact(9, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() == 0) {
                                    z = false;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJIJIIJI(int i, long j) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeLong(j);
                                this.LL.transact(19, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJJ(int i, long j) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeLong(j);
                                this.LL.transact(16, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeLong(j);
                                this.LL.transact(18, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJZZI(int i, long j) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeLong(j);
                                this.LL.transact(15, parcelObtain, parcelObtain2, 0);
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

                        @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
                        public final DownloadInfo LJJJI(int i, String str, long j, String str2) {
                            DownloadInfo downloadInfoCreateFromParcel;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                                parcelObtain.writeInt(i);
                                parcelObtain.writeLong(j);
                                parcelObtain.writeString(str);
                                parcelObtain.writeString(str2);
                                this.LL.transact(14, parcelObtain, parcelObtain2, 0);
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
                    };
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LL = interfaceC2199171B5f;
        this.LLILZLL = C2199681B7e.LJI().submit(new ARunnableS103S0200000_34(iBinder, this, 27));
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJJI(int i, String str, long j, String str2) {
        try {
            InterfaceC2199171B5f interfaceC2199171B5f = this.LL;
            if (interfaceC2199171B5f != null) {
                return interfaceC2199171B5f.LJJJI(i, str, j, str2);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C1B5Y
    public final void m0(SparseArray sparseArray, HashMap map, List list, List list2, C2199121B5a c2199121B5a) {
        C2199681B7e.LJI().submit(new C1B5S(this, sparseArray, map, list, c2199121B5a));
    }
}
