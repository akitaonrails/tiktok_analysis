package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856130yOx extends AbstractC1856150yOz {
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function1<String, Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856130yOx)) {
            return false;
        }
        C1856130yOx c1856130yOx = (C1856130yOx) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1856130yOx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1856130yOx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1856130yOx.LLILZ);
    }

    public final int hashCode() {
        return (((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSecondLevelQuestionnaireInputItem(characterLimitText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", inputTips=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onInputChanged=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1856150yOz, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return areItemTheSame(interfaceC1891350zJl);
    }

    @Override // X.AbstractC1856150yOz, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1856130yOx c1856130yOx;
        C1856130yOx c1856130yOx2;
        boolean z = interfaceC1891350zJl instanceof C1856130yOx;
        String str2 = null;
        if (z && (c1856130yOx2 = (C1856130yOx) interfaceC1891350zJl) != null) {
            str = c1856130yOx2.LLILLJJLI;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, this.LLILLJJLI)) {
            if (z && (c1856130yOx = (C1856130yOx) interfaceC1891350zJl) != null) {
                str2 = c1856130yOx.LLILLL;
            }
            if (Intrinsics.LJFF(str2, this.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1856130yOx(String str, String str2, AwS606S0100000_27 awS606S0100000_27) {
        super(1);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = awS606S0100000_27;
    }
}
