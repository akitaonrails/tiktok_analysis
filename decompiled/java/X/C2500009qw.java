package X;

import android.os.Parcel;
import android.os.Parcelable;
import bytedance.io.BdMediaFolder;
import bytedance.io.BdMediaItem;
import com.bytedance.effectcreatormobile.ckeapi.api.album.Media;
import com.ss.android.vesdk.VEBitmapWithInfo;

/* JADX INFO: renamed from: X.09qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2500009qw implements Parcelable.Creator {
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

    public C2500009qw(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C2500009qw c2500009qw, Parcel parcel) {
        return new BdMediaFolder(parcel);
    }

    public static final Object createFromParcel$1(C2500009qw c2500009qw, Parcel parcel) {
        return new BdMediaItem(parcel);
    }

    public static final Object createFromParcel$2(C2500009qw c2500009qw, Parcel parcel) {
        return new Media(parcel);
    }

    public static final Object createFromParcel$3(C2500009qw c2500009qw, Parcel parcel) {
        return new VEBitmapWithInfo(parcel);
    }

    public static final Object createFromParcel$4(C2500009qw c2500009qw, Parcel parcel) {
        return new com.ss.ugc.android.editor.base.data.Media(parcel);
    }

    public static final Object[] newArray$0(C2500009qw c2500009qw, int i) {
        return new BdMediaFolder[i];
    }

    public static final Object[] newArray$1(C2500009qw c2500009qw, int i) {
        return new BdMediaItem[i];
    }

    public static final Object[] newArray$2(C2500009qw c2500009qw, int i) {
        return new Media[i];
    }

    public static final Object[] newArray$3(C2500009qw c2500009qw, int i) {
        return new VEBitmapWithInfo[i];
    }

    public static final Object[] newArray$4(C2500009qw c2500009qw, int i) {
        return new com.ss.ugc.android.editor.base.data.Media[i];
    }
}
