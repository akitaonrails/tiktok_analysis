package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzi;
import com.google.android.gms.internal.wallet.zzk;
import com.google.android.gms.internal.wallet.zzm;
import com.google.android.gms.internal.wallet.zzo;
import com.google.android.gms.internal.wallet.zzq;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzau;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Wp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class BinderC834860Wp2 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC834860Wp2() {
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
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
        AbstractBinderC834850Wp1 abstractBinderC834850Wp1 = (AbstractBinderC834850Wp1) this;
        boolean z = false;
        switch (i) {
            case 1:
                parcel.readInt();
                C833770WnH.LIZ(parcel, MaskedWallet.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 2:
                parcel.readInt();
                C833770WnH.LIZ(parcel, FullWallet.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 3:
                int i3 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                abstractBinderC834850Wp1.LLLII(i3, z);
                break;
            case 4:
                parcel.readInt();
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 6:
                parcel.readInt();
                parcel.readInt();
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 7:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, zzi.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 8:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                Status status = (Status) C833770WnH.LIZ(parcel, Status.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                abstractBinderC834850Wp1.m(status, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, zzk.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, zzau.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 14:
                Status status2 = (Status) C833770WnH.LIZ(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) C833770WnH.LIZ(parcel, PaymentData.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                abstractBinderC834850Wp1.LLFZ(status2, paymentData);
                break;
            case 15:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, zzq.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 16:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, zzm.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, zzo.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                parcel.readInt();
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
            case 19:
                C833770WnH.LIZ(parcel, Status.CREATOR);
                C833770WnH.LIZ(parcel, PaymentCardRecognitionIntentResponse.CREATOR);
                C833770WnH.LIZ(parcel, Bundle.CREATOR);
                break;
        }
        return true;
    }
}
