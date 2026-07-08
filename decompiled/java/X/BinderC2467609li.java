package X;

import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.09li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class BinderC2467609li extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC2467609li() {
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC2468309lp abstractBinderC2468309lp = (AbstractBinderC2468309lp) this;
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                abstractBinderC2468309lp.LLIIIILZ(i3, bundle);
                break;
            case 3:
                int i4 = parcel.readInt();
                C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj.LL);
                C2459309kN.LIZJ.LIZLLL("onCompleteInstall(%d)", Integer.valueOf(i4));
                break;
            case 4:
                int i5 = parcel.readInt();
                Bundle bundle2 = (Bundle) C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                abstractBinderC2468309lp.LJLJLLL(i5, bundle2);
                break;
            case 5:
                int i6 = parcel.readInt();
                C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj2 = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj2.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj2.LL);
                C2459309kN.LIZJ.LIZLLL("onGetSession(%d)", Integer.valueOf(i6));
                break;
            case 6:
                BaseBundle baseBundle = (BaseBundle) C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj3 = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj3.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj3.LL);
                int i7 = baseBundle.getInt("error_code");
                C2459309kN.LIZJ.LIZIZ("onError(%d)", Integer.valueOf(i7));
                binderC2467709lj3.LL.LIZJ(new C812870Vuf(i7));
                break;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj4 = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj4.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj4.LL);
                C2459309kN.LIZJ.LIZLLL("onGetSessionStates", new Object[0]);
                break;
            case 8:
                Bundle bundle3 = (Bundle) C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                abstractBinderC2468309lp.u0(bundle3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                Bundle bundle4 = (Bundle) C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                abstractBinderC2468309lp.LJJZ(bundle4);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj5 = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj5.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj5.LL);
                C2459309kN.LIZJ.LIZLLL("onGetSplitsForAppUpdate", new Object[0]);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj6 = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj6.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj6.LL);
                C2459309kN.LIZJ.LIZLLL("onCompleteInstallForAppUpdate", new Object[0]);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj7 = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj7.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj7.LL);
                C2459309kN.LIZJ.LIZLLL("onDeferredLanguageInstall", new Object[0]);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C2468409lq.LIZ(parcel, Bundle.CREATOR);
                C2468409lq.LIZIZ(parcel);
                BinderC2467709lj binderC2467709lj8 = (BinderC2467709lj) abstractBinderC2468309lp;
                binderC2467709lj8.LLILLJJLI.LIZIZ.LIZLLL(binderC2467709lj8.LL);
                C2459309kN.LIZJ.LIZLLL("onDeferredLanguageUninstall", new Object[0]);
                break;
        }
        return true;
    }
}
