package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868720yjG extends AbstractC1868670yjB {
    public final Function1<Context, SpannableStringBuilder> LIZIZ;
    public final int LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868720yjG)) {
            return false;
        }
        C1868720yjG c1868720yjG = (C1868720yjG) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1868720yjG.LIZIZ) && this.LIZJ == c1868720yjG.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1868720yjG.LIZLLL) && Intrinsics.LJFF(this.LJ, c1868720yjG.LJ) && Intrinsics.LJFF(this.LJFF, c1868720yjG.LJFF);
    }

    public final int hashCode() {
        return (((((((this.LIZIZ.hashCode() * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UiType3(text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onShowCallback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onCloseClickCallback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", eventPopUpType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1868670yjB
    public final String LIZ() {
        return this.LJFF;
    }

    public C1868720yjG(AFwS187S0000000_2 aFwS187S0000000_2, AFwS187S0000000_2 aFwS187S0000000_22, AFwS229S0000000_2 aFwS229S0000000_2) {
        super("disable_dm_by_age_restriction");
        this.LIZIZ = aFwS229S0000000_2;
        this.LIZJ = R.raw.icon_danmu_slash;
        this.LIZLLL = aFwS187S0000000_2;
        this.LJ = aFwS187S0000000_22;
        this.LJFF = "disable_dm_by_age_restriction";
    }
}
