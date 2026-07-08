package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.DeviceAuthMethodHandler;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.InstagramAppLoginMethodHandler;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.WebViewLoginMethodHandler;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.model.NewUserCount;
import com.tencent.wcdb.BulkCursorDescriptor;
import com.tencent.wcdb.CursorWindow;
import com.ttnet.org.chromium.base.UnguessableToken;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1D13, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D13 implements Parcelable.Creator {
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
            case 22:
                return createFromParcel$22(this, parcel);
            case 23:
                return createFromParcel$23(this, parcel);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return createFromParcel$24(this, parcel);
            case 25:
                return createFromParcel$25(this, parcel);
            case 26:
                return createFromParcel$26(this, parcel);
            case 27:
                return createFromParcel$27(this, parcel);
            case 28:
                return createFromParcel$28(this, parcel);
            case 29:
                return createFromParcel$29(this, parcel);
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
            case 22:
                return newArray$22(this, i);
            case 23:
                return newArray$23(this, i);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return newArray$24(this, i);
            case 25:
                return newArray$25(this, i);
            case 26:
                return newArray$26(this, i);
            case 27:
                return newArray$27(this, i);
            case 28:
                return newArray$28(this, i);
            case 29:
                return newArray$29(this, i);
            default:
                return new Object[0];
        }
    }

    public C1D13(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C1D13 c1d13, Parcel parcel) {
        return new AccessToken(parcel);
    }

    public static final Object createFromParcel$1(C1D13 c1d13, Parcel parcel) {
        return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public static final Object createFromParcel$10(C1D13 c1d13, Parcel parcel) {
        return new LoginClient.Request(parcel);
    }

    public static final Object createFromParcel$11(C1D13 c1d13, Parcel parcel) {
        return new LoginClient.Result(parcel);
    }

    public static final Object createFromParcel$12(C1D13 c1d13, Parcel parcel) {
        return new LoginClient(parcel);
    }

    public static final Object createFromParcel$13(C1D13 c1d13, Parcel parcel) {
        return new WebViewLoginMethodHandler(parcel);
    }

    public static final Object createFromParcel$14(C1D13 c1d13, Parcel parcel) {
        return new ShareFeedContent(parcel);
    }

    public static final Object createFromParcel$15(C1D13 c1d13, Parcel parcel) {
        return new AppGroupCreationContent(parcel);
    }

    public static final Object createFromParcel$16(C1D13 c1d13, Parcel parcel) {
        return new GameRequestContent(parcel);
    }

    public static final Object createFromParcel$17(C1D13 c1d13, Parcel parcel) {
        return new ShareHashtag(parcel);
    }

    public static final Object createFromParcel$18(C1D13 c1d13, Parcel parcel) {
        return new ShareLinkContent(parcel);
    }

    public static final Object createFromParcel$19(C1D13 c1d13, Parcel parcel) {
        return new ShareMediaContent(parcel);
    }

    public static final Object createFromParcel$2(C1D13 c1d13, Parcel parcel) {
        return new GraphRequest.ParcelableResourceWithMimeType(parcel);
    }

    public static final Object createFromParcel$20(C1D13 c1d13, Parcel parcel) {
        return new ShareMessengerURLActionButton(parcel);
    }

    public static final Object createFromParcel$21(C1D13 c1d13, Parcel parcel) {
        return new SharePhoto(parcel);
    }

    public static final Object createFromParcel$22(C1D13 c1d13, Parcel parcel) {
        return new SharePhotoContent(parcel);
    }

    public static final Object createFromParcel$23(C1D13 c1d13, Parcel parcel) {
        return new ShareStoryContent(parcel);
    }

    public static final Object createFromParcel$24(C1D13 c1d13, Parcel parcel) {
        return new ShareVideo(parcel);
    }

    public static final Object createFromParcel$25(C1D13 c1d13, Parcel parcel) {
        return new ShareVideoContent(parcel);
    }

    public static final Object createFromParcel$26(C1D13 c1d13, Parcel parcel) {
        return new DownloadInfo(parcel);
    }

    public static final Object createFromParcel$27(C1D13 c1d13, Parcel parcel) {
        return new NewUserCount(parcel);
    }

    public static final Object createFromParcel$28(C1D13 c1d13, Parcel parcel) {
        C1B7R c1b7r;
        BulkCursorDescriptor bulkCursorDescriptor = new BulkCursorDescriptor();
        final IBinder strongBinder = parcel.readStrongBinder();
        String[] strArr = null;
        if (strongBinder == null) {
            c1b7r = null;
        } else {
            c1b7r = (C1B7R) strongBinder.queryLocalInterface("android.content.IBulkCursor");
            if (c1b7r == null) {
                c1b7r = new C1B7R(strongBinder) { // from class: X.1BZS
                    public final IBinder LL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = strongBinder;
                    }
                };
            }
        }
        bulkCursorDescriptor.cursor = c1b7r;
        int i = parcel.readInt();
        boolean z = false;
        if (i >= 0) {
            strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                strArr[i2] = parcel.readString();
            }
        }
        bulkCursorDescriptor.columnNames = strArr;
        if (parcel.readInt() != 0) {
            z = true;
        }
        bulkCursorDescriptor.wantsAllOnMoveCalls = z;
        bulkCursorDescriptor.count = parcel.readInt();
        if (parcel.readInt() != 0) {
            bulkCursorDescriptor.window = CursorWindow.CREATOR.createFromParcel(parcel);
        }
        return bulkCursorDescriptor;
    }

    public static final Object createFromParcel$29(C1D13 c1d13, Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        if (j != 0 && j2 != 0) {
            return new UnguessableToken(j, j2);
        }
        return null;
    }

    public static final Object createFromParcel$3(C1D13 c1d13, Parcel parcel) {
        return new Profile(parcel);
    }

    public static final Object createFromParcel$4(C1D13 c1d13, Parcel parcel) {
        return new CustomTabLoginMethodHandler(parcel);
    }

    public static final Object createFromParcel$5(C1D13 c1d13, Parcel parcel) {
        return new DeviceAuthDialog.RequestState(parcel);
    }

    public static final Object createFromParcel$6(C1D13 c1d13, Parcel parcel) {
        return new DeviceAuthMethodHandler(parcel);
    }

    public static final Object createFromParcel$7(C1D13 c1d13, Parcel parcel) {
        return new GetTokenLoginMethodHandler(parcel);
    }

    public static final Object createFromParcel$8(C1D13 c1d13, Parcel parcel) {
        return new InstagramAppLoginMethodHandler(parcel);
    }

    public static final Object createFromParcel$9(C1D13 c1d13, Parcel parcel) {
        return new KatanaProxyLoginMethodHandler(parcel);
    }

    public static final Object[] newArray$0(C1D13 c1d13, int i) {
        return new AccessToken[i];
    }

    public static final Object[] newArray$1(C1D13 c1d13, int i) {
        return new FacebookRequestError[i];
    }

    public static final Object[] newArray$10(C1D13 c1d13, int i) {
        return new LoginClient.Request[i];
    }

    public static final Object[] newArray$11(C1D13 c1d13, int i) {
        return new LoginClient.Result[i];
    }

    public static final Object[] newArray$12(C1D13 c1d13, int i) {
        return new LoginClient[i];
    }

    public static final Object[] newArray$13(C1D13 c1d13, int i) {
        return new WebViewLoginMethodHandler[i];
    }

    public static final Object[] newArray$14(C1D13 c1d13, int i) {
        return new ShareFeedContent[i];
    }

    public static final Object[] newArray$15(C1D13 c1d13, int i) {
        return new AppGroupCreationContent[i];
    }

    public static final Object[] newArray$16(C1D13 c1d13, int i) {
        return new GameRequestContent[i];
    }

    public static final Object[] newArray$17(C1D13 c1d13, int i) {
        return new ShareHashtag[i];
    }

    public static final Object[] newArray$18(C1D13 c1d13, int i) {
        return new ShareLinkContent[i];
    }

    public static final Object[] newArray$19(C1D13 c1d13, int i) {
        return new ShareMediaContent[i];
    }

    public static final Object[] newArray$2(C1D13 c1d13, int i) {
        return new GraphRequest.ParcelableResourceWithMimeType[i];
    }

    public static final Object[] newArray$20(C1D13 c1d13, int i) {
        return new ShareMessengerURLActionButton[i];
    }

    public static final Object[] newArray$21(C1D13 c1d13, int i) {
        return new SharePhoto[i];
    }

    public static final Object[] newArray$22(C1D13 c1d13, int i) {
        return new SharePhotoContent[i];
    }

    public static final Object[] newArray$23(C1D13 c1d13, int i) {
        return new ShareStoryContent[i];
    }

    public static final Object[] newArray$24(C1D13 c1d13, int i) {
        return new ShareVideo[i];
    }

    public static final Object[] newArray$25(C1D13 c1d13, int i) {
        return new ShareVideoContent[i];
    }

    public static final Object[] newArray$26(C1D13 c1d13, int i) {
        return new DownloadInfo[i];
    }

    public static final Object[] newArray$27(C1D13 c1d13, int i) {
        return new NewUserCount[i];
    }

    public static final Object[] newArray$28(C1D13 c1d13, int i) {
        return new BulkCursorDescriptor[i];
    }

    public static final Object[] newArray$29(C1D13 c1d13, int i) {
        return new UnguessableToken[i];
    }

    public static final Object[] newArray$3(C1D13 c1d13, int i) {
        return new Profile[i];
    }

    public static final Object[] newArray$4(C1D13 c1d13, int i) {
        return new CustomTabLoginMethodHandler[i];
    }

    public static final Object[] newArray$5(C1D13 c1d13, int i) {
        return new DeviceAuthDialog.RequestState[i];
    }

    public static final Object[] newArray$6(C1D13 c1d13, int i) {
        return new DeviceAuthMethodHandler[i];
    }

    public static final Object[] newArray$7(C1D13 c1d13, int i) {
        return new GetTokenLoginMethodHandler[i];
    }

    public static final Object[] newArray$8(C1D13 c1d13, int i) {
        return new InstagramAppLoginMethodHandler[i];
    }

    public static final Object[] newArray$9(C1D13 c1d13, int i) {
        return new KatanaProxyLoginMethodHandler[i];
    }
}
