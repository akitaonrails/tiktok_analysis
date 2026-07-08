package X;

import X.C1339250kxH;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentTabHost$SavedState;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.ss.android.medialib.util.VEPlatformUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0kxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339250kxH implements Parcelable.Creator {
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

    public C1339250kxH(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C1339250kxH c1339250kxH, final Parcel parcel) {
        return new View.BaseSavedState(parcel) { // from class: androidx.fragment.app.FragmentTabHost$SavedState
            public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new C1339250kxH(0);
            public final String LL;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FragmentTabHost.SavedState{");
                sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
                sbLIZ.append(" curTab=");
                sbLIZ.append(this.LL);
                sbLIZ.append("}");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super(parcel);
                this.LL = parcel.readString();
            }

            @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel2, int i) {
                super.writeToParcel(parcel2, i);
                parcel2.writeString(this.LL);
            }
        };
    }

    public static final Object createFromParcel$1(C1339250kxH c1339250kxH, Parcel parcel) {
        return new LottieAnimationView$SavedState(parcel);
    }

    public static final Object createFromParcel$2(C1339250kxH c1339250kxH, Parcel parcel) {
        return new com.bytedance.lottie.LottieAnimationView$SavedState(parcel);
    }

    public static final Object createFromParcel$3(C1339250kxH c1339250kxH, Parcel parcel) {
        return VEPlatformUtils.VEPlatform.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$4(C1339250kxH c1339250kxH, Parcel parcel) {
        return new BaseException(parcel);
    }

    public static final Object createFromParcel$5(C1339250kxH c1339250kxH, Parcel parcel) {
        return new TEFrameRateRange(parcel);
    }

    public static final Object createFromParcel$6(C1339250kxH c1339250kxH, Parcel parcel) {
        return new TEFrameSizei(parcel);
    }

    public static final Object createFromParcel$7(C1339250kxH c1339250kxH, Parcel parcel) {
        return new FragmentTabHost.SavedState(parcel);
    }

    public static final Object createFromParcel$8(C1339250kxH c1339250kxH, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values()[parcel.readInt()];
    }

    public static final Object[] newArray$0(C1339250kxH c1339250kxH, int i) {
        return new FragmentTabHost$SavedState[i];
    }

    public static final Object[] newArray$1(C1339250kxH c1339250kxH, int i) {
        return new LottieAnimationView$SavedState[i];
    }

    public static final Object[] newArray$2(C1339250kxH c1339250kxH, int i) {
        return new com.bytedance.lottie.LottieAnimationView$SavedState[i];
    }

    public static final Object[] newArray$3(C1339250kxH c1339250kxH, int i) {
        return new VEPlatformUtils.VEPlatform[i];
    }

    public static final Object[] newArray$4(C1339250kxH c1339250kxH, int i) {
        return new BaseException[i];
    }

    public static final Object[] newArray$5(C1339250kxH c1339250kxH, int i) {
        return new TEFrameRateRange[i];
    }

    public static final Object[] newArray$6(C1339250kxH c1339250kxH, int i) {
        return new TEFrameSizei[i];
    }

    public static final Object[] newArray$7(C1339250kxH c1339250kxH, int i) {
        return new FragmentTabHost.SavedState[i];
    }

    public static final Object[] newArray$8(C1339250kxH c1339250kxH, int i) {
        return new VEVideoEncodeSettings.ENCODE_BITRATE_MODE[i];
    }
}
