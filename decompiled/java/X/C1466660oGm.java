package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.utils.ParcelableConcurrentSet;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.settings.VideoInvisibleWatermarkSettings;
import com.tts.oecverify.BdTuring;
import dmt.av.video.VEPreviewMusicParams;

/* JADX INFO: renamed from: X.0oGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466660oGm implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C1466660oGm(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C1466660oGm c1466660oGm, Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new ObservableBoolean(z);
    }

    public static final Object createFromParcel$1(C1466660oGm c1466660oGm, Parcel parcel) {
        return new ObservableChar((char) parcel.readInt());
    }

    public static final Object createFromParcel$10(C1466660oGm c1466660oGm, Parcel parcel) {
        return new TimeSpeedModelExtension(parcel);
    }

    public static final Object createFromParcel$11(C1466660oGm c1466660oGm, Parcel parcel) {
        return new FaceStickerBean(parcel);
    }

    public static final Object createFromParcel$12(C1466660oGm c1466660oGm, Parcel parcel) {
        return new ParcelableConcurrentSet(parcel);
    }

    public static final Object createFromParcel$13(C1466660oGm c1466660oGm, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_PRESET.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$14(C1466660oGm c1466660oGm, Parcel parcel) {
        return new VideoInvisibleWatermarkSettings(parcel);
    }

    public static final Object createFromParcel$15(C1466660oGm c1466660oGm, Parcel parcel) {
        return new VEPreviewMusicParams(parcel);
    }

    public static final Object createFromParcel$2(C1466660oGm c1466660oGm, Parcel parcel) {
        return new ObservableDouble(parcel.readDouble());
    }

    public static final Object createFromParcel$3(C1466660oGm c1466660oGm, Parcel parcel) {
        return new ObservableFloat(parcel.readFloat());
    }

    public static final Object createFromParcel$4(C1466660oGm c1466660oGm, Parcel parcel) {
        return new ObservableInt(parcel.readInt());
    }

    public static final Object createFromParcel$5(C1466660oGm c1466660oGm, Parcel parcel) {
        return new ObservableLong(parcel.readLong());
    }

    public static final Object createFromParcel$6(C1466660oGm c1466660oGm, Parcel parcel) {
        return new MultiEditVideoStatusRecordData(parcel);
    }

    public static final Object createFromParcel$7(C1466660oGm c1466660oGm, Parcel parcel) {
        return new InfoStickerModel(parcel);
    }

    public static final Object createFromParcel$8(C1466660oGm c1466660oGm, Parcel parcel) {
        return new StrArray(parcel);
    }

    public static final Object createFromParcel$9(C1466660oGm c1466660oGm, Parcel parcel) {
        return new VideoPublishEditModel(parcel);
    }

    public static final Object[] newArray$0(C1466660oGm c1466660oGm, int i) {
        return new ObservableBoolean[i];
    }

    public static final Object[] newArray$1(C1466660oGm c1466660oGm, int i) {
        return new ObservableChar[i];
    }

    public static final Object[] newArray$10(C1466660oGm c1466660oGm, int i) {
        return new TimeSpeedModelExtension[i];
    }

    public static final Object[] newArray$11(C1466660oGm c1466660oGm, int i) {
        return new FaceStickerBean[i];
    }

    public static final Object[] newArray$12(C1466660oGm c1466660oGm, int i) {
        return new ParcelableConcurrentSet[i];
    }

    public static final Object[] newArray$13(C1466660oGm c1466660oGm, int i) {
        return new VEVideoEncodeSettings.ENCODE_PRESET[i];
    }

    public static final Object[] newArray$14(C1466660oGm c1466660oGm, int i) {
        return new VideoInvisibleWatermarkSettings[i];
    }

    public static final Object[] newArray$15(C1466660oGm c1466660oGm, int i) {
        return new VEPreviewMusicParams[i];
    }

    public static final Object[] newArray$2(C1466660oGm c1466660oGm, int i) {
        return new ObservableDouble[i];
    }

    public static final Object[] newArray$3(C1466660oGm c1466660oGm, int i) {
        return new ObservableFloat[i];
    }

    public static final Object[] newArray$4(C1466660oGm c1466660oGm, int i) {
        return new ObservableInt[i];
    }

    public static final Object[] newArray$5(C1466660oGm c1466660oGm, int i) {
        return new ObservableLong[i];
    }

    public static final Object[] newArray$6(C1466660oGm c1466660oGm, int i) {
        return new MultiEditVideoStatusRecordData[i];
    }

    public static final Object[] newArray$7(C1466660oGm c1466660oGm, int i) {
        return new InfoStickerModel[i];
    }

    public static final Object[] newArray$8(C1466660oGm c1466660oGm, int i) {
        return new StrArray[i];
    }

    public static final Object[] newArray$9(C1466660oGm c1466660oGm, int i) {
        return new VideoPublishEditModel[i];
    }
}
