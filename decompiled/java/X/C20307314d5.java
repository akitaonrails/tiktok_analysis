package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.compose.runtime.ParcelableSnapshotMutableDoubleState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.navigation.NavBackStackEntryState;
import com.bytedance.apm.util.SpPair;
import com.ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.ss.android.vesdk.VERecordData;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;

/* JADX INFO: renamed from: X.14d5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20307314d5 implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C20307314d5(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C20307314d5 c20307314d5, Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    public static final Object createFromParcel$1(C20307314d5 c20307314d5, Parcel parcel) {
        return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
    }

    public static final Object createFromParcel$2(C20307314d5 c20307314d5, Parcel parcel) {
        return new ParcelableSnapshotMutableLongState(parcel.readLong());
    }

    public static final Object createFromParcel$3(C20307314d5 c20307314d5, Parcel parcel) {
        return new NavBackStackEntryState(parcel);
    }

    public static final Object createFromParcel$4(C20307314d5 c20307314d5, Parcel parcel) {
        return new SpPair(parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object createFromParcel$5(X.C20307314d5 r80, android.os.Parcel r81) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20307314d5.createFromParcel$5(X.14d5, android.os.Parcel):java.lang.Object");
    }

    public static final Object createFromParcel$6(C20307314d5 c20307314d5, Parcel parcel) {
        return new VERecordData(parcel);
    }

    public static final Object createFromParcel$7(C20307314d5 c20307314d5, Parcel parcel) {
        return new Album(parcel);
    }

    public static final Object createFromParcel$8(C20307314d5 c20307314d5, Parcel parcel) {
        return new Item(parcel);
    }

    public static final Object[] newArray$0(C20307314d5 c20307314d5, int i) {
        return new ResultReceiver[i];
    }

    public static final Object[] newArray$1(C20307314d5 c20307314d5, int i) {
        return new ParcelableSnapshotMutableDoubleState[i];
    }

    public static final Object[] newArray$2(C20307314d5 c20307314d5, int i) {
        return new ParcelableSnapshotMutableLongState[i];
    }

    public static final Object[] newArray$3(C20307314d5 c20307314d5, int i) {
        return new NavBackStackEntryState[i];
    }

    public static final Object[] newArray$4(C20307314d5 c20307314d5, int i) {
        return new SpPair[i];
    }

    public static final Object[] newArray$5(C20307314d5 c20307314d5, int i) {
        return new FilterEffect[i];
    }

    public static final Object[] newArray$6(C20307314d5 c20307314d5, int i) {
        return new VERecordData[i];
    }

    public static final Object[] newArray$7(C20307314d5 c20307314d5, int i) {
        return new Album[i];
    }

    public static final Object[] newArray$8(C20307314d5 c20307314d5, int i) {
        return new Item[i];
    }
}
