package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1B6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractBinderC2199511B6n extends Binder implements InterfaceC2200291B9n {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2199511B6n() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
    }

    public static InterfaceC2200291B9n LJJJZ(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2200291B9n)) {
            return (InterfaceC2200291B9n) iInterfaceQueryLocalInterface;
        }
        return new InterfaceC2200291B9n(iBinder) { // from class: X.1B61
            public final IBinder LL;

            @Override // X.InterfaceC2200291B9n
            public final int LJLJJI() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i;
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

            @Override // X.InterfaceC2200291B9n
            public final void LJJIL(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(13, parcelObtain, parcelObtain2, 0);
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

            @Override // X.InterfaceC2200291B9n
            public final void onCanceled(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(8, parcelObtain, parcelObtain2, 0);
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

            @Override // X.InterfaceC2200291B9n
            public final void onFirstStart(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(9, parcelObtain, parcelObtain2, 0);
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

            @Override // X.InterfaceC2200291B9n
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(10, parcelObtain, parcelObtain2, 0);
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

            @Override // X.InterfaceC2200291B9n
            public final void onPause(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
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

            @Override // X.InterfaceC2200291B9n
            public final void onPrepare(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
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

            @Override // X.InterfaceC2200291B9n
            public final void onProgress(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(4, parcelObtain, parcelObtain2, 0);
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

            @Override // X.InterfaceC2200291B9n
            public final void onStart(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
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

            @Override // X.InterfaceC2200291B9n
            public final void onSuccessed(DownloadInfo downloadInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
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

            @Override // X.InterfaceC2200291B9n
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (baseException != null) {
                        parcelObtain.writeInt(1);
                        baseException.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
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

            @Override // X.InterfaceC2200291B9n
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (baseException != null) {
                        parcelObtain.writeInt(1);
                        baseException.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(11, parcelObtain, parcelObtain2, 0);
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

            @Override // X.InterfaceC2200291B9n
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (baseException != null) {
                        parcelObtain.writeInt(1);
                        baseException.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
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
        };
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfoCreateFromParcel;
        DownloadInfo downloadInfoCreateFromParcel2;
        DownloadInfo downloadInfoCreateFromParcel3;
        if (i != 1598968902) {
            DownloadInfo downloadInfoCreateFromParcel4 = null;
            DownloadInfo downloadInfoCreateFromParcel5 = null;
            DownloadInfo downloadInfoCreateFromParcel6 = null;
            DownloadInfo downloadInfoCreateFromParcel7 = null;
            DownloadInfo downloadInfoCreateFromParcel8 = null;
            DownloadInfo downloadInfoCreateFromParcel9 = null;
            BaseException baseExceptionCreateFromParcel = null;
            DownloadInfo downloadInfoCreateFromParcel10 = null;
            DownloadInfo downloadInfoCreateFromParcel11 = null;
            DownloadInfo downloadInfoCreateFromParcel12 = null;
            BaseException baseExceptionCreateFromParcel2 = null;
            BaseException baseExceptionCreateFromParcel3 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    int iLJLJJI = ((BinderC2199601B6w) this).LJLJJI();
                    parcel2.writeNoException();
                    parcel2.writeInt(iLJLJJI);
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel5 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onPrepare(downloadInfoCreateFromParcel5);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel6 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onStart(downloadInfoCreateFromParcel6);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel7 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onProgress(downloadInfoCreateFromParcel7);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel8 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onPause(downloadInfoCreateFromParcel8);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel9 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onSuccessed(downloadInfoCreateFromParcel9);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel3 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    } else {
                        downloadInfoCreateFromParcel3 = null;
                    }
                    if (parcel.readInt() != 0) {
                        baseExceptionCreateFromParcel = BaseException.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onFailed(downloadInfoCreateFromParcel3, baseExceptionCreateFromParcel);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel10 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onCanceled(downloadInfoCreateFromParcel10);
                    parcel2.writeNoException();
                    return true;
                case BdTuring.TYPE_ECAF /* 9 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel11 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onFirstStart(downloadInfoCreateFromParcel11);
                    parcel2.writeNoException();
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel12 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onFirstSuccess(downloadInfoCreateFromParcel12);
                    parcel2.writeNoException();
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    } else {
                        downloadInfoCreateFromParcel2 = null;
                    }
                    if (parcel.readInt() != 0) {
                        baseExceptionCreateFromParcel2 = BaseException.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onRetry(downloadInfoCreateFromParcel2, baseExceptionCreateFromParcel2);
                    parcel2.writeNoException();
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
                    } else {
                        downloadInfoCreateFromParcel = null;
                    }
                    if (parcel.readInt() != 0) {
                        baseExceptionCreateFromParcel3 = BaseException.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).onRetryDelay(downloadInfoCreateFromParcel, baseExceptionCreateFromParcel3);
                    parcel2.writeNoException();
                    return true;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel4 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2199601B6w) this).LJJIL(downloadInfoCreateFromParcel4);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        return true;
    }
}
