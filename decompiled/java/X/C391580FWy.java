package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.mention.MentionSpanData;

/* JADX INFO: renamed from: X.0FWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391580FWy implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C391580FWy(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C391580FWy c391580FWy, Parcel parcel) {
        return new MultiEditVideoRecordData(parcel);
    }

    public static final Object createFromParcel$1(C391580FWy c391580FWy, Parcel parcel) {
        return new MultiEditVideoSegmentRecordData(parcel);
    }

    public static final Object createFromParcel$2(C391580FWy c391580FWy, Parcel parcel) {
        return new StickerItemModel(parcel);
    }

    public static final Object createFromParcel$3(C391580FWy c391580FWy, Parcel parcel) {
        return new EffectPointModel(parcel);
    }

    public static final Object createFromParcel$4(C391580FWy c391580FWy, Parcel parcel) {
        return new MentionSpanData(parcel);
    }

    public static final Object[] newArray$0(C391580FWy c391580FWy, int i) {
        return new MultiEditVideoRecordData[i];
    }

    public static final Object[] newArray$1(C391580FWy c391580FWy, int i) {
        return new MultiEditVideoSegmentRecordData[i];
    }

    public static final Object[] newArray$2(C391580FWy c391580FWy, int i) {
        return new StickerItemModel[i];
    }

    public static final Object[] newArray$3(C391580FWy c391580FWy, int i) {
        return new EffectPointModel[i];
    }

    public static final Object[] newArray$4(C391580FWy c391580FWy, int i) {
        return new MentionSpanData[i];
    }
}
