package X;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069960dww implements InterfaceC0148002o {
    public final C291001Au<EnumC1070410dxf> LL;
    public final AbstractC1623806Xk<Pair<InputStream, String>> LLILLJJLI;
    public final boolean LLILLL;

    public C1069960dww() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069960dww)) {
            return false;
        }
        C1069960dww c1069960dww = (C1069960dww) obj;
        return Intrinsics.LJFF(this.LL, c1069960dww.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1069960dww.LLILLJJLI) && this.LLILLL == c1069960dww.LLILLL;
    }

    public final int hashCode() {
        C291001Au<EnumC1070410dxf> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        AbstractC1623806Xk<Pair<InputStream, String>> abstractC1623806Xk = this.LLILLJJLI;
        return ((iHashCode + (abstractC1623806Xk != null ? abstractC1623806Xk.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimAuthVMState(showAuthPopupEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lottieState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAuthFlowEnd=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1069960dww(int i) {
        this(null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1069960dww(C291001Au<? extends EnumC1070410dxf> c291001Au, AbstractC1623806Xk<? extends Pair<? extends InputStream, String>> abstractC1623806Xk, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = z;
    }

    public static C1069960dww LIZ(C1069960dww c1069960dww, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk, boolean z, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1069960dww.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1069960dww.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1069960dww.LLILLL;
        }
        c1069960dww.getClass();
        return new C1069960dww(c291001Au, abstractC1623806Xk, z);
    }
}
