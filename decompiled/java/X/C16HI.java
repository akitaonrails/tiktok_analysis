package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView$SavedState;
import com.bytedance.android.live.design.view.sheet.SheetOptions;

/* JADX INFO: renamed from: X.16HI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HI implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
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
            default:
                return new Object[0];
        }
    }

    public C16HI(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C16HI c16hi, Parcel parcel) {
        return new NestedScrollView$SavedState(parcel);
    }

    public static final Object createFromParcel$1(C16HI c16hi, Parcel parcel) {
        return new SheetOptions(parcel);
    }

    public static final Object[] newArray$0(C16HI c16hi, int i) {
        return new NestedScrollView$SavedState[i];
    }

    public static final Object[] newArray$1(C16HI c16hi, int i) {
        return new SheetOptions[i];
    }
}
