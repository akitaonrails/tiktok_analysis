package X;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.ServiceParcelable;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.push.PushBody;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.AuthenticationTokenHeader;
import com.heytap.mcs.liquid.model.ActionInfo;
import com.heytap.mcs.liquid.model.ActionResult;
import com.heytap.mcs.liquid.model.SeedingRequest;
import com.heytap.mcs.liquid.model.SeedingRequestResult;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VEAudioEffectBean;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import com.ttnet.org.chromium.base.library_loader.Linker;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Xfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854630Xfp implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            case 3:
                return createFromParcel$3(this, parcel);
            case 4:
                return createFromParcel$4(this, parcel);
            case 5:
                return createFromParcel$5(this, parcel);
            case 6:
                return createFromParcel$6(this, parcel);
            case 7:
                return createFromParcel$7(this, parcel);
            case 8:
                return createFromParcel$8(this, parcel);
            case BdTuring.TYPE_ECAF /* 9 */:
                return createFromParcel$9(this, parcel);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return createFromParcel$10(this, parcel);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return createFromParcel$11(this, parcel);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return createFromParcel$12(this, parcel);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return createFromParcel$13(this, parcel);
            case 14:
                return createFromParcel$14(this, parcel);
            case 15:
                return createFromParcel$15(this, parcel);
            case 16:
                return createFromParcel$16(this, parcel);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return createFromParcel$17(this, parcel);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return createFromParcel$18(this, parcel);
            case 19:
                return createFromParcel$19(this, parcel);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return createFromParcel$20(this, parcel);
            case 21:
                return createFromParcel$21(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            case 3:
                return newArray$3(this, i);
            case 4:
                return newArray$4(this, i);
            case 5:
                return newArray$5(this, i);
            case 6:
                return newArray$6(this, i);
            case 7:
                return newArray$7(this, i);
            case 8:
                return newArray$8(this, i);
            case BdTuring.TYPE_ECAF /* 9 */:
                return newArray$9(this, i);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return newArray$10(this, i);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return newArray$11(this, i);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return newArray$12(this, i);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return newArray$13(this, i);
            case 14:
                return newArray$14(this, i);
            case 15:
                return newArray$15(this, i);
            case 16:
                return newArray$16(this, i);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return newArray$17(this, i);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return newArray$18(this, i);
            case 19:
                return newArray$19(this, i);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return newArray$20(this, i);
            case 21:
                return newArray$21(this, i);
            default:
                return new Object[0];
        }
    }

    public C854630Xfp(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C854630Xfp c854630Xfp, Parcel parcel) {
        return new MediaBrowserCompat.MediaItem(parcel);
    }

    public static final Object createFromParcel$1(C854630Xfp c854630Xfp, Parcel parcel) {
        return MediaDescriptionCompat.LIZ(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    public static final Object createFromParcel$10(C854630Xfp c854630Xfp, Parcel parcel) {
        WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
        msgHeader.key = parcel.readString();
        msgHeader.value = parcel.readString();
        return msgHeader;
    }

    public static final Object createFromParcel$11(C854630Xfp c854630Xfp, Parcel parcel) {
        return new PushBody(parcel);
    }

    public static final Object createFromParcel$12(C854630Xfp c854630Xfp, Parcel parcel) {
        return new AuthenticationToken(parcel);
    }

    public static final Object createFromParcel$13(C854630Xfp c854630Xfp, Parcel parcel) {
        return new AuthenticationTokenClaims(parcel);
    }

    public static final Object createFromParcel$14(C854630Xfp c854630Xfp, Parcel parcel) {
        return new AuthenticationTokenHeader(parcel);
    }

    public static final Object createFromParcel$15(C854630Xfp c854630Xfp, Parcel parcel) {
        return new ActionInfo(parcel);
    }

    public static final Object createFromParcel$16(C854630Xfp c854630Xfp, Parcel parcel) {
        return new ActionResult(parcel);
    }

    public static final Object createFromParcel$17(C854630Xfp c854630Xfp, Parcel parcel) {
        return new SeedingRequest(parcel);
    }

    public static final Object createFromParcel$18(C854630Xfp c854630Xfp, Parcel parcel) {
        return new SeedingRequestResult(parcel);
    }

    public static final Object createFromParcel$19(C854630Xfp c854630Xfp, Parcel parcel) {
        return new VEAudioEffectBean(parcel);
    }

    public static final Object createFromParcel$2(C854630Xfp c854630Xfp, Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    public static final Object createFromParcel$20(C854630Xfp c854630Xfp, Parcel parcel) {
        return new PushProvisioningActivityStarter.Args(parcel);
    }

    public static final Object createFromParcel$21(C854630Xfp c854630Xfp, Parcel parcel) {
        return new Linker.LibInfo(parcel);
    }

    public static final Object createFromParcel$3(C854630Xfp c854630Xfp, Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    public static final Object createFromParcel$4(C854630Xfp c854630Xfp, Parcel parcel) {
        return new IntegerParcelable(parcel);
    }

    public static final Object createFromParcel$5(C854630Xfp c854630Xfp, Parcel parcel) {
        return new NewMsgTimeHolder(parcel);
    }

    public static final Object createFromParcel$6(C854630Xfp c854630Xfp, Parcel parcel) {
        boolean z;
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ServiceConnectEvent(i, i2, parcel.readString(), z);
    }

    public static final Object createFromParcel$7(C854630Xfp c854630Xfp, Parcel parcel) {
        return new ServiceParcelable(parcel.readInt(), parcel.readInt());
    }

    public static final Object createFromParcel$8(C854630Xfp c854630Xfp, Parcel parcel) {
        return new SocketState(parcel);
    }

    public static final Object createFromParcel$9(C854630Xfp c854630Xfp, Parcel parcel) {
        return new SsWsApp(parcel);
    }

    public static final Object[] newArray$0(C854630Xfp c854630Xfp, int i) {
        return new MediaBrowserCompat.MediaItem[i];
    }

    public static final Object[] newArray$1(C854630Xfp c854630Xfp, int i) {
        return new MediaDescriptionCompat[i];
    }

    public static final Object[] newArray$10(C854630Xfp c854630Xfp, int i) {
        return new WsChannelMsg.MsgHeader[i];
    }

    public static final Object[] newArray$11(C854630Xfp c854630Xfp, int i) {
        return new PushBody[i];
    }

    public static final Object[] newArray$12(C854630Xfp c854630Xfp, int i) {
        return new AuthenticationToken[i];
    }

    public static final Object[] newArray$13(C854630Xfp c854630Xfp, int i) {
        return new AuthenticationTokenClaims[i];
    }

    public static final Object[] newArray$14(C854630Xfp c854630Xfp, int i) {
        return new AuthenticationTokenHeader[i];
    }

    public static final Object[] newArray$15(C854630Xfp c854630Xfp, int i) {
        return new ActionInfo[i];
    }

    public static final Object[] newArray$16(C854630Xfp c854630Xfp, int i) {
        return new ActionResult[i];
    }

    public static final Object[] newArray$17(C854630Xfp c854630Xfp, int i) {
        return new SeedingRequest[i];
    }

    public static final Object[] newArray$18(C854630Xfp c854630Xfp, int i) {
        return new SeedingRequestResult[i];
    }

    public static final Object[] newArray$19(C854630Xfp c854630Xfp, int i) {
        return new VEAudioEffectBean[i];
    }

    public static final Object[] newArray$2(C854630Xfp c854630Xfp, int i) {
        return new MediaMetadataCompat[i];
    }

    public static final Object[] newArray$20(C854630Xfp c854630Xfp, int i) {
        return new PushProvisioningActivityStarter.Args[i];
    }

    public static final Object[] newArray$21(C854630Xfp c854630Xfp, int i) {
        return new Linker.LibInfo[i];
    }

    public static final Object[] newArray$3(C854630Xfp c854630Xfp, int i) {
        return new ParcelImpl[i];
    }

    public static final Object[] newArray$4(C854630Xfp c854630Xfp, int i) {
        return new IntegerParcelable[i];
    }

    public static final Object[] newArray$5(C854630Xfp c854630Xfp, int i) {
        return new NewMsgTimeHolder[i];
    }

    public static final Object[] newArray$6(C854630Xfp c854630Xfp, int i) {
        return new ServiceConnectEvent[i];
    }

    public static final Object[] newArray$7(C854630Xfp c854630Xfp, int i) {
        return new ServiceParcelable[i];
    }

    public static final Object[] newArray$8(C854630Xfp c854630Xfp, int i) {
        return new SocketState[i];
    }

    public static final Object[] newArray$9(C854630Xfp c854630Xfp, int i) {
        return new SsWsApp[i];
    }
}
