package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781260wSC implements InterfaceC1891350zJl {
    public final CreativeTemplate LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final Function0<Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781260wSC)) {
            return false;
        }
        C1781260wSC c1781260wSC = (C1781260wSC) obj;
        return Intrinsics.LJFF(this.LL, c1781260wSC.LL) && this.LLILLJJLI == c1781260wSC.LLILLJJLI && this.LLILLL == c1781260wSC.LLILLL && Intrinsics.LJFF(this.LLILZ, c1781260wSC.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoInspirationListTemplateItem(template=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onTryNowClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1781260wSC) {
            C1781260wSC c1781260wSC = (C1781260wSC) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1781260wSC.LL, this.LL) && c1781260wSC.LLILLL == this.LLILLL) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1781260wSC) && Intrinsics.LJFF(((C1781260wSC) interfaceC1891350zJl).LL.templateId, this.LL.templateId)) {
            return true;
        }
        return false;
    }

    public C1781260wSC(CreativeTemplate creativeTemplate, int i, boolean z, C1852250yIh c1852250yIh) {
        this.LL = creativeTemplate;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = c1852250yIh;
    }
}
