package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;

/* JADX INFO: renamed from: X.12YO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YO implements Parcelable.Creator {
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

    public C12YO(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C12YO c12yo, Parcel parcel) {
        return new AVChallenge(parcel);
    }

    public static final Object createFromParcel$1(C12YO c12yo, Parcel parcel) {
        return new CutVideoContext(parcel);
    }

    public static final Object[] newArray$0(C12YO c12yo, int i) {
        return new AVChallenge[i];
    }

    public static final Object[] newArray$1(C12YO c12yo, int i) {
        return new CutVideoContext[i];
    }
}
