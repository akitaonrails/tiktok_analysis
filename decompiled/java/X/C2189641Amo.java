package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bmf_mods_lite_api.packageHandler.model.AesBoostLut1dOperation;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$SavedState;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSavedState;
import com.ss.android.ugc.aweme.discover.adapter.AbstractLoadingLayout$SavedState;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$MentionSavedState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton$SavedState;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1Amo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189641Amo implements Parcelable.Creator {
    public final int $t;

    public static final Object[] newArray$14(C2189641Amo c2189641Amo, int i) {
        return new AuthResult[0];
    }

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
            default:
                return new Object[0];
        }
    }

    public C2189641Amo(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C2189641Amo c2189641Amo, Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    public static final Object createFromParcel$1(C2189641Amo c2189641Amo, Parcel parcel) {
        return new MediaSessionCompat.QueueItem(parcel);
    }

    public static final Object createFromParcel$10(C2189641Amo c2189641Amo, Parcel parcel) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
    }

    public static final Object createFromParcel$11(C2189641Amo c2189641Amo, Parcel parcel) {
        return new StaggeredGridLayoutManager.SavedState(parcel);
    }

    public static final Object createFromParcel$12(C2189641Amo c2189641Amo, Parcel parcel) {
        return new SpannedGridLayoutManager.SavedState(parcel.readInt());
    }

    public static final Object createFromParcel$13(C2189641Amo c2189641Amo, Parcel parcel) {
        return new AesBoostLut1dOperation(parcel);
    }

    public static final Object createFromParcel$14(C2189641Amo c2189641Amo, Parcel parcel) {
        return new AuthResult(parcel);
    }

    public static final Object createFromParcel$15(C2189641Amo c2189641Amo, Parcel parcel) {
        return new VEFrame.FrameBase(parcel);
    }

    public static final Object createFromParcel$16(C2189641Amo c2189641Amo, Parcel parcel) {
        return new VEFrame(parcel);
    }

    public static final Object createFromParcel$17(C2189641Amo c2189641Amo, Parcel parcel) {
        return new CanCancelRadioButton$SavedState(parcel);
    }

    public static final Object createFromParcel$18(C2189641Amo c2189641Amo, Parcel parcel) {
        try {
            return new CommentEditText$MentionSavedState(parcel);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object createFromParcel$19(C2189641Amo c2189641Amo, Parcel parcel) {
        return new AbstractLoadingLayout$SavedState(parcel);
    }

    public static final Object createFromParcel$2(C2189641Amo c2189641Amo, Parcel parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(parcel);
    }

    public static final Object createFromParcel$20(C2189641Amo c2189641Amo, Parcel parcel) {
        try {
            return new MentionEditText$MentionSavedState(parcel);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object createFromParcel$21(C2189641Amo c2189641Amo, Parcel parcel) {
        return new SwitchButton$SavedState(parcel);
    }

    public static final Object createFromParcel$22(C2189641Amo c2189641Amo, Parcel parcel) {
        try {
            return new com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState(parcel);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object createFromParcel$23(C2189641Amo c2189641Amo, Parcel parcel) {
        return new com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout$SavedState(parcel);
    }

    public static final Object createFromParcel$24(C2189641Amo c2189641Amo, Parcel parcel) {
        return VECameraSettings.CAMERA_FACING_ID.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$25(C2189641Amo c2189641Amo, Parcel parcel) {
        return VECameraSettings.CAMERA_FLASH_MODE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$26(C2189641Amo c2189641Amo, Parcel parcel) {
        return VEPreviewSettings.CAMERA_OUTPUT_MODE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$3(C2189641Amo c2189641Amo, Parcel parcel) {
        return new MediaSessionCompat.Token(parcel.readParcelable(null), null);
    }

    public static final Object createFromParcel$4(C2189641Amo c2189641Amo, Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    public static final Object createFromParcel$5(C2189641Amo c2189641Amo, Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    public static final Object createFromParcel$6(C2189641Amo c2189641Amo, Parcel parcel) {
        return new PlaybackStateCompat(parcel);
    }

    public static final Object createFromParcel$7(C2189641Amo c2189641Amo, Parcel parcel) {
        return new ActionMenuPresenter.SavedState(parcel);
    }

    public static final Object createFromParcel$8(C2189641Amo c2189641Amo, Parcel parcel) {
        return new AppCompatSpinner$SavedState(parcel);
    }

    public static final Object createFromParcel$9(C2189641Amo c2189641Amo, Parcel parcel) {
        return new LinearLayoutManager.SavedState(parcel);
    }

    public static final Object[] newArray$0(C2189641Amo c2189641Amo, int i) {
        return new RatingCompat[i];
    }

    public static final Object[] newArray$1(C2189641Amo c2189641Amo, int i) {
        return new MediaSessionCompat.QueueItem[i];
    }

    public static final Object[] newArray$10(C2189641Amo c2189641Amo, int i) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
    }

    public static final Object[] newArray$11(C2189641Amo c2189641Amo, int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }

    public static final Object[] newArray$12(C2189641Amo c2189641Amo, int i) {
        return new SpannedGridLayoutManager.SavedState[i];
    }

    public static final Object[] newArray$13(C2189641Amo c2189641Amo, int i) {
        return new AesBoostLut1dOperation[i];
    }

    public static final Object[] newArray$15(C2189641Amo c2189641Amo, int i) {
        return new VEFrame.FrameBase[i];
    }

    public static final Object[] newArray$16(C2189641Amo c2189641Amo, int i) {
        return new VEFrame[i];
    }

    public static final Object[] newArray$17(C2189641Amo c2189641Amo, int i) {
        return new CanCancelRadioButton$SavedState[i];
    }

    public static final Object[] newArray$18(C2189641Amo c2189641Amo, int i) {
        return new CommentEditText$MentionSavedState[i];
    }

    public static final Object[] newArray$19(C2189641Amo c2189641Amo, int i) {
        return new AbstractLoadingLayout$SavedState[i];
    }

    public static final Object[] newArray$2(C2189641Amo c2189641Amo, int i) {
        return new MediaSessionCompat.ResultReceiverWrapper[i];
    }

    public static final Object[] newArray$20(C2189641Amo c2189641Amo, int i) {
        return new MentionEditText$MentionSavedState[i];
    }

    public static final Object[] newArray$21(C2189641Amo c2189641Amo, int i) {
        return new SwitchButton$SavedState[i];
    }

    public static final Object[] newArray$22(C2189641Amo c2189641Amo, int i) {
        return new com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState[i];
    }

    public static final Object[] newArray$23(C2189641Amo c2189641Amo, int i) {
        return new com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout$SavedState[i];
    }

    public static final Object[] newArray$24(C2189641Amo c2189641Amo, int i) {
        return new VECameraSettings.CAMERA_FACING_ID[i];
    }

    public static final Object[] newArray$25(C2189641Amo c2189641Amo, int i) {
        return new VECameraSettings.CAMERA_FLASH_MODE[i];
    }

    public static final Object[] newArray$26(C2189641Amo c2189641Amo, int i) {
        return new VEPreviewSettings.CAMERA_OUTPUT_MODE[i];
    }

    public static final Object[] newArray$3(C2189641Amo c2189641Amo, int i) {
        return new MediaSessionCompat.Token[i];
    }

    public static final Object[] newArray$4(C2189641Amo c2189641Amo, int i) {
        return new ParcelableVolumeInfo[i];
    }

    public static final Object[] newArray$5(C2189641Amo c2189641Amo, int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }

    public static final Object[] newArray$6(C2189641Amo c2189641Amo, int i) {
        return new PlaybackStateCompat[i];
    }

    public static final Object[] newArray$7(C2189641Amo c2189641Amo, int i) {
        return new ActionMenuPresenter.SavedState[i];
    }

    public static final Object[] newArray$8(C2189641Amo c2189641Amo, int i) {
        return new AppCompatSpinner$SavedState[i];
    }

    public static final Object[] newArray$9(C2189641Amo c2189641Amo, int i) {
        return new LinearLayoutManager.SavedState[i];
    }
}
