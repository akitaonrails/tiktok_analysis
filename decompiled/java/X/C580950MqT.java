package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.tts.oecverify.BdTuring;
import dmt.av.video.VEPreviewParams;

/* JADX INFO: renamed from: X.0MqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580950MqT implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C580950MqT(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C580950MqT c580950MqT, Parcel parcel) {
        return new EffectListModel(parcel);
    }

    public static final Object createFromParcel$1(C580950MqT c580950MqT, Parcel parcel) {
        return new MediaModel(parcel);
    }

    public static final Object createFromParcel$2(C580950MqT c580950MqT, Parcel parcel) {
        return new VideoSegment(parcel);
    }

    public static final Object createFromParcel$3(C580950MqT c580950MqT, Parcel parcel) {
        return new EditPreviewInfo(parcel);
    }

    public static final Object createFromParcel$4(C580950MqT c580950MqT, Parcel parcel) {
        return new EditVideoSegment(parcel);
    }

    public static final Object createFromParcel$5(C580950MqT c580950MqT, Parcel parcel) {
        return new ReactionParams(parcel);
    }

    public static final Object createFromParcel$6(C580950MqT c580950MqT, Parcel parcel) {
        return new MvThemeData(parcel);
    }

    public static final Object createFromParcel$7(C580950MqT c580950MqT, Parcel parcel) {
        return new VERecordData.VERecordSegmentData(parcel);
    }

    public static final Object createFromParcel$8(C580950MqT c580950MqT, Parcel parcel) {
        return new VEClipTimelineParam(parcel);
    }

    public static final Object createFromParcel$9(C580950MqT c580950MqT, Parcel parcel) {
        return new VEPreviewParams(parcel);
    }

    public static final Object[] newArray$0(C580950MqT c580950MqT, int i) {
        return new EffectListModel[i];
    }

    public static final Object[] newArray$1(C580950MqT c580950MqT, int i) {
        return new MediaModel[i];
    }

    public static final Object[] newArray$2(C580950MqT c580950MqT, int i) {
        return new VideoSegment[i];
    }

    public static final Object[] newArray$3(C580950MqT c580950MqT, int i) {
        return new EditPreviewInfo[i];
    }

    public static final Object[] newArray$4(C580950MqT c580950MqT, int i) {
        return new EditVideoSegment[i];
    }

    public static final Object[] newArray$5(C580950MqT c580950MqT, int i) {
        return new ReactionParams[i];
    }

    public static final Object[] newArray$6(C580950MqT c580950MqT, int i) {
        return new MvThemeData[i];
    }

    public static final Object[] newArray$7(C580950MqT c580950MqT, int i) {
        return new VERecordData.VERecordSegmentData[i];
    }

    public static final Object[] newArray$8(C580950MqT c580950MqT, int i) {
        return new VEClipTimelineParam[i];
    }

    public static final Object[] newArray$9(C580950MqT c580950MqT, int i) {
        return new VEPreviewParams[i];
    }
}
