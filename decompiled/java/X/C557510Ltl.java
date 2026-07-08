package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ltl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557510Ltl {
    public final Function1<C1279504zZ, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function2<Boolean, List<MentionDataItem>, Unit> LIZJ;
    public final InterfaceC1631630sYr<SpannableString, List<C0M37>, List<? extends MetricAffectingSpan>, Boolean, Unit> LIZLLL;
    public final Function1<Boolean, Unit> LJ;
    public final Function1<C557390LtZ, Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function2<MentionDataItem, MentionDataItem, Unit> LJII;
    public final Function0<Drawable> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C557510Ltl)) {
            return false;
        }
        C557510Ltl c557510Ltl = (C557510Ltl) obj;
        return Intrinsics.LJFF(this.LIZ, c557510Ltl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c557510Ltl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c557510Ltl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c557510Ltl.LIZLLL) && Intrinsics.LJFF(this.LJ, c557510Ltl.LJ) && Intrinsics.LJFF(this.LJFF, c557510Ltl.LJFF) && Intrinsics.LJFF(this.LJI, c557510Ltl.LJI) && Intrinsics.LJFF(this.LJII, c557510Ltl.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c557510Ltl.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputBoxActions(searchMentionUser=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onUserInputAt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showOrHideMention=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inputUpdate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", keyboardShowOrHide=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onImageSpanPreview=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cancelChangeUser=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", changeUser=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", createCommonDrawableBG=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C557510Ltl(AwS587S0100000_8 awS587S0100000_8, AwS552S0100000_8 awS552S0100000_8, AwS622S0100000_8 awS622S0100000_8, C557400Lta c557400Lta, AwS587S0100000_8 awS587S0100000_82, AwS587S0100000_8 awS587S0100000_83, AwS552S0100000_8 awS552S0100000_82, AwS622S0100000_8 awS622S0100000_82, AwS552S0100000_8 awS552S0100000_83) {
        this.LIZ = awS587S0100000_8;
        this.LIZIZ = awS552S0100000_8;
        this.LIZJ = awS622S0100000_8;
        this.LIZLLL = c557400Lta;
        this.LJ = awS587S0100000_82;
        this.LJFF = awS587S0100000_83;
        this.LJI = awS552S0100000_82;
        this.LJII = awS622S0100000_82;
        this.LJIIIIZZ = awS552S0100000_83;
    }
}
