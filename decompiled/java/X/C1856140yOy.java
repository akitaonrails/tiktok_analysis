package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaireText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS133S0101000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856140yOy extends AbstractC1856150yOz {
    public final int LLILLJJLI;
    public final TakoQuestionnaireText LLILLL;
    public final boolean LLILZ;
    public final Function1<TakoQuestionnaireText, Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856140yOy)) {
            return false;
        }
        C1856140yOy c1856140yOy = (C1856140yOy) obj;
        return this.LLILLJJLI == c1856140yOy.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1856140yOy.LLILLL) && this.LLILZ == c1856140yOy.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1856140yOy.LLILZIL);
    }

    public final int hashCode() {
        return (((((this.LLILLJJLI * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSecondLevelQuestionnaireOptionItem(rank=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1856150yOz, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1856140yOy c1856140yOy;
        if (!super.areContentsTheSame(interfaceC1891350zJl) || !(interfaceC1891350zJl instanceof C1856140yOy) || (c1856140yOy = (C1856140yOy) interfaceC1891350zJl) == null || c1856140yOy.LLILZ != this.LLILZ) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1856150yOz, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1856140yOy c1856140yOy;
        C1856140yOy c1856140yOy2;
        TakoQuestionnaireText takoQuestionnaireText;
        if (!super.areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        boolean z = interfaceC1891350zJl instanceof C1856140yOy;
        String str = null;
        if (z && (c1856140yOy2 = (C1856140yOy) interfaceC1891350zJl) != null && (takoQuestionnaireText = c1856140yOy2.LLILLL) != null) {
            str = takoQuestionnaireText.enText;
        }
        if (!Intrinsics.LJFF(str, this.LLILLL.enText) || !z || (c1856140yOy = (C1856140yOy) interfaceC1891350zJl) == null || c1856140yOy.LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return true;
    }

    public C1856140yOy(int i, TakoQuestionnaireText takoQuestionnaireText, boolean z, AwS133S0101000_27 awS133S0101000_27) {
        super(0);
        this.LLILLJJLI = i;
        this.LLILLL = takoQuestionnaireText;
        this.LLILZ = z;
        this.LLILZIL = awS133S0101000_27;
    }
}
