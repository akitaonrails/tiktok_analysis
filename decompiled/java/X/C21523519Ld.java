package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import com.bytedance.scene.group.GroupRecord;
import com.bytedance.scene.navigation.ActivityStatusRecord;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;

/* JADX INFO: renamed from: X.19Ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21523519Ld implements Parcelable.Creator {
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

    public C21523519Ld(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C21523519Ld c21523519Ld, Parcel parcel) {
        Intent intent;
        int i = parcel.readInt();
        if (parcel.readInt() == 0) {
            intent = null;
        } else {
            intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        }
        return new ActivityResult(i, intent);
    }

    public static final Object createFromParcel$1(C21523519Ld c21523519Ld, Parcel parcel) {
        return new BackStackRecordState(parcel);
    }

    public static final Object createFromParcel$2(C21523519Ld c21523519Ld, Parcel parcel) {
        return new BackStackState(parcel);
    }

    public static final Object createFromParcel$3(C21523519Ld c21523519Ld, Parcel parcel) {
        return new FragmentManager.LaunchedFragmentInfo(parcel);
    }

    public static final Object createFromParcel$4(C21523519Ld c21523519Ld, Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public static final Object createFromParcel$5(C21523519Ld c21523519Ld, Parcel parcel) {
        return new FragmentState(parcel);
    }

    public static final Object createFromParcel$6(C21523519Ld c21523519Ld, Parcel parcel) {
        return new GroupRecord(parcel);
    }

    public static final Object createFromParcel$7(C21523519Ld c21523519Ld, Parcel parcel) {
        return new ActivityStatusRecord(parcel);
    }

    public static final Object createFromParcel$8(C21523519Ld c21523519Ld, Parcel parcel) {
        return new ExtraParams(parcel);
    }

    public static final Object[] newArray$0(C21523519Ld c21523519Ld, int i) {
        return new ActivityResult[i];
    }

    public static final Object[] newArray$1(C21523519Ld c21523519Ld, int i) {
        return new BackStackRecordState[i];
    }

    public static final Object[] newArray$2(C21523519Ld c21523519Ld, int i) {
        return new BackStackState[i];
    }

    public static final Object[] newArray$3(C21523519Ld c21523519Ld, int i) {
        return new FragmentManager.LaunchedFragmentInfo[i];
    }

    public static final Object[] newArray$4(C21523519Ld c21523519Ld, int i) {
        return new FragmentManagerState[i];
    }

    public static final Object[] newArray$5(C21523519Ld c21523519Ld, int i) {
        return new FragmentState[i];
    }

    public static final Object[] newArray$6(C21523519Ld c21523519Ld, int i) {
        return new GroupRecord[i];
    }

    public static final Object[] newArray$7(C21523519Ld c21523519Ld, int i) {
        return new ActivityStatusRecord[i];
    }

    public static final Object[] newArray$8(C21523519Ld c21523519Ld, int i) {
        return new ExtraParams[i];
    }
}
