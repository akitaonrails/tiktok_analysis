package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1B6R, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B6R extends Binder implements InterfaceC2199581B6u {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B6R() {
        attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    DownloadInfo downloadInfo = ((C1B6S) this).getDownloadInfo();
                    parcel2.writeNoException();
                    if (downloadInfo != null) {
                        parcel2.writeInt(1);
                        downloadInfo.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    int iLLLLJ = ((C1B6S) this).LLLLJ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iLLLLJ);
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC2200291B9n interfaceC2200291B9nLLIILZL = ((C1B6S) this).LLIILZL(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (interfaceC2200291B9nLLIILZL != null) {
                        iBinder = (AbstractBinderC2199511B6n) interfaceC2200291B9nLLIILZL;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC2200291B9n interfaceC2200291B9nLLLLLJLJLL = ((C1B6S) this).LLLLLJLJLL(parcel.readInt());
                    parcel2.writeNoException();
                    if (interfaceC2200291B9nLLLLLJLJLL != null) {
                        iBinder = (AbstractBinderC2199511B6n) interfaceC2200291B9nLLLLLJLJLL;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    C1B5O c1b5oK = ((C1B6S) this).k();
                    parcel2.writeNoException();
                    if (c1b5oK != null) {
                        iBinder = (C1B5M) c1b5oK;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    C1B6B c1b6bX = ((C1B6S) this).X();
                    parcel2.writeNoException();
                    if (c1b6bX != null) {
                        iBinder = (C1B69) c1b6bX;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    C1B6M interceptor = ((C1B6S) this).getInterceptor();
                    parcel2.writeNoException();
                    if (interceptor != null) {
                        iBinder = (C1B6L) interceptor;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    C1B63 c1b63Mh = ((C1B6S) this).Mh();
                    parcel2.writeNoException();
                    if (c1b63Mh != null) {
                        iBinder = (C1B64) c1b63Mh;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case BdTuring.TYPE_ECAF /* 9 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC2199311B5t interfaceC2199311B5tLLLZIIL = ((C1B6S) this).LLLZIIL();
                    parcel2.writeNoException();
                    if (interfaceC2199311B5tLLLZIIL != null) {
                        iBinder = (AbstractBinderC2199271B5p) interfaceC2199311B5tLLLZIIL;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    C1B6N c1b6nLLILLJJLI = ((C1B6S) this).LLILLJJLI();
                    parcel2.writeNoException();
                    if (c1b6nLLILLJJLI != null) {
                        iBinder = (C1B6J) c1b6nLLILLJJLI;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC2199401B6c interfaceC2199401B6cQ = ((C1B6S) this).q();
                    parcel2.writeNoException();
                    if (interfaceC2199401B6cQ != null) {
                        iBinder = (C1B6T) interfaceC2199401B6cQ;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC2199491B6l interfaceC2199491B6lLJJII = ((C1B6S) this).LJJII();
                    parcel2.writeNoException();
                    if (interfaceC2199491B6lLJJII != null) {
                        iBinder = (C1B6U) interfaceC2199491B6lLJJII;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC19860412nC fileProvider = ((C1B6S) this).getFileProvider();
                    parcel2.writeNoException();
                    if (fileProvider != null) {
                        iBinder = (AbstractBinderC19860312nB) fileProvider;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    int iA = ((C1B6S) this).A();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC2199371B5z interfaceC2199371B5zP = ((C1B6S) this).P(parcel.readInt());
                    parcel2.writeNoException();
                    if (interfaceC2199371B5zP != null) {
                        iBinder = (AbstractBinderC2199341B5w) interfaceC2199371B5zP;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        return true;
    }
}
