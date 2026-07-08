package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260810iul {
    public static final /* synthetic */ int LJII = 0;
    public final CharSequence LIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final View.OnClickListener LJI;
    public final int LIZIZ = R.attr.z_;
    public final float LJ = 1.0f;
    public final boolean LJFF = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260810iul)) {
            return false;
        }
        C1260810iul c1260810iul = (C1260810iul) obj;
        return Intrinsics.LJFF(this.LIZ, c1260810iul.LIZ) && this.LIZIZ == c1260810iul.LIZIZ && Float.compare(this.LIZJ, c1260810iul.LIZJ) == 0 && this.LIZLLL == c1260810iul.LIZLLL && Float.compare(this.LJ, c1260810iul.LJ) == 0 && this.LJFF == c1260810iul.LJFF && Intrinsics.LJFF(this.LJI, c1260810iul.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoteBubbleConfig(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textAlpha=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bgTintColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bgAlpha=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hasShadow=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", click=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public C1260810iul(CharSequence charSequence, float f, int i, View.OnClickListener onClickListener) {
        this.LIZ = charSequence;
        this.LIZJ = f;
        this.LIZLLL = i;
        this.LJI = onClickListener;
    }
}
