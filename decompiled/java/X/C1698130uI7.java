package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.0uI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698130uI7 implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C1698130uI7(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C1698130uI7 c1698130uI7, Parcel parcel) {
        return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
    }

    public static final Object createFromParcel$1(C1698130uI7 c1698130uI7, Parcel parcel) {
        return new FilterBean(parcel);
    }

    public static final Object createFromParcel$2(C1698130uI7 c1698130uI7, Parcel parcel) {
        return new StickerWrapper(parcel);
    }

    public static final Object createFromParcel$3(C1698130uI7 c1698130uI7, Parcel parcel) {
        return new FaceStickerCommerceBean(parcel);
    }

    public static final Object createFromParcel$4(C1698130uI7 c1698130uI7, Parcel parcel) {
        return new ToolsUrlModel(parcel);
    }

    public static final Object createFromParcel$5(C1698130uI7 c1698130uI7, Parcel parcel) {
        return VECameraSettings.CAMERA_MODE_TYPE.values()[parcel.readInt()];
    }

    public static final Object[] newArray$0(C1698130uI7 c1698130uI7, int i) {
        return new ParcelableSnapshotMutableFloatState[i];
    }

    public static final Object[] newArray$1(C1698130uI7 c1698130uI7, int i) {
        return new FilterBean[i];
    }

    public static final Object[] newArray$2(C1698130uI7 c1698130uI7, int i) {
        return new StickerWrapper[i];
    }

    public static final Object[] newArray$3(C1698130uI7 c1698130uI7, int i) {
        return new FaceStickerCommerceBean[i];
    }

    public static final Object[] newArray$4(C1698130uI7 c1698130uI7, int i) {
        return new ToolsUrlModel[i];
    }

    public static final Object[] newArray$5(C1698130uI7 c1698130uI7, int i) {
        return new VECameraSettings.CAMERA_MODE_TYPE[i];
    }
}
