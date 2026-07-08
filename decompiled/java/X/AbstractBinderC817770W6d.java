package X;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.firstparty.zzab;
import com.google.android.gms.tapandpay.firstparty.zzad;
import com.google.android.gms.tapandpay.firstparty.zzap;
import com.google.android.gms.tapandpay.firstparty.zzg;
import com.google.android.gms.tapandpay.firstparty.zzj;
import com.google.android.gms.tapandpay.firstparty.zzl;
import com.google.android.gms.tapandpay.firstparty.zzn;
import com.google.android.gms.tapandpay.firstparty.zzp;
import com.google.android.gms.tapandpay.firstparty.zzr;
import com.google.android.gms.tapandpay.firstparty.zzt;
import com.google.android.gms.tapandpay.firstparty.zzv;
import com.google.android.gms.tapandpay.firstparty.zzx;
import com.google.android.gms.tapandpay.firstparty.zzz;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0W6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC817770W6d extends BinderC812940Vum implements InterfaceC817790W6f {
    public AbstractBinderC817770W6d() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // X.BinderC812940Vum
    public final boolean LJJJZ(int i, Parcel parcel) {
        switch (i) {
            case 2:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 3:
                Status status = (Status) C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, Bundle.CREATOR);
                C2468809lu.LIZIZ(parcel);
                w(status);
                return true;
            case 4:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzp.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 5:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 6:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 7:
            case 16:
            case 26:
            case 32:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
            case 37:
            case 54:
            default:
                return false;
            case 8:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzj.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case BdTuring.TYPE_ECAF /* 9 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                throw new UnsupportedOperationException();
            case BdTuring.TYPE_EMAIL /* 11 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readInt();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readInt();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 14:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 15:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzl.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, RetrieveInAppPaymentCredentialResponse.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readString();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 19:
                Status status2 = (Status) C2468809lu.LIZ(parcel, Status.CREATOR);
                String string = parcel.readString();
                C2468809lu.LIZIZ(parcel);
                LLLLIILL(status2, string);
                return true;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, TokenStatus.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 21:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readInt();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 22:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 23:
                Status status3 = (Status) C2468809lu.LIZ(parcel, Status.CREATOR);
                String string2 = parcel.readString();
                C2468809lu.LIZIZ(parcel);
                LLILZLL(status3, string2);
                return true;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readString();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 25:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 27:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzad.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 28:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzz.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 29:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 30:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzr.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 31:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzn.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 35:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzab.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 38:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 39:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzv.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 40:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 41:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzap.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 42:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, GetGlobalActionCardsResponse.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 43:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readString();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 44:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 45:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 46:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzx.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 47:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, QuickAccessWalletConfig.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 48:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzt.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 49:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readInt();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                Status status4 = (Status) C2468809lu.LIZ(parcel, Status.CREATOR);
                TokenInfo[] tokenInfoArr = (TokenInfo[]) parcel.createTypedArray(TokenInfo.CREATOR);
                C2468809lu.LIZIZ(parcel);
                K(status4, tokenInfoArr);
                return true;
            case 51:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, zzg.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 52:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.createByteArray();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 53:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                C2468809lu.LIZ(parcel, PushProvisionSessionContext.CREATOR);
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 55:
                C2468809lu.LIZ(parcel, Status.CREATOR);
                parcel.readInt();
                C2468809lu.LIZIZ(parcel);
                throw new UnsupportedOperationException();
        }
    }
}
