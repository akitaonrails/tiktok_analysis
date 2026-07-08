package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734460vEi implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final C291001Au<AbstractC788420UwK> LLILLJJLI;
    public final AbstractC1734470vEj LLILLL;
    public final boolean LLILZ;
    public final Throwable LLILZIL;
    public final C291001Au<C337280DKc> LLILZLL;

    public C1734460vEi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1734460vEi)) {
            return false;
        }
        C1734460vEi c1734460vEi = (C1734460vEi) obj;
        return Intrinsics.LJFF(this.LL, c1734460vEi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1734460vEi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1734460vEi.LLILLL) && this.LLILZ == c1734460vEi.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1734460vEi.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1734460vEi.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<AbstractC788420UwK> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Throwable th = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        C291001Au<C337280DKc> c291001Au2 = this.LLILZLL;
        return iHashCode3 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsFormPageState(contentList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", formStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasClickedSubmit=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pageError=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", scrollToFieldEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1734460vEi(int i) {
        this(C13BV.INSTANCE, null, C1734490vEl.LIZ, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1734460vEi(List<? extends InterfaceC1891350zJl> list, C291001Au<? extends AbstractC788420UwK> c291001Au, AbstractC1734470vEj abstractC1734470vEj, boolean z, Throwable th, C291001Au<C337280DKc> c291001Au2) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = abstractC1734470vEj;
        this.LLILZ = z;
        this.LLILZIL = th;
        this.LLILZLL = c291001Au2;
    }

    public static C1734460vEi LIZ(C1734460vEi c1734460vEi, List list, C291001Au c291001Au, AbstractC1734470vEj abstractC1734470vEj, boolean z, Throwable th, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        Throwable th2 = th;
        boolean z2 = z;
        AbstractC1734470vEj abstractC1734470vEj2 = abstractC1734470vEj;
        C291001Au c291001Au4 = c291001Au;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c1734460vEi.LL;
        }
        if ((i & 2) != 0) {
            c291001Au4 = c1734460vEi.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1734470vEj2 = c1734460vEi.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1734460vEi.LLILZ;
        }
        if ((i & 16) != 0) {
            th2 = c1734460vEi.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au3 = c1734460vEi.LLILZLL;
        }
        c1734460vEi.getClass();
        return new C1734460vEi(list2, c291001Au4, abstractC1734470vEj2, z2, th2, c291001Au3);
    }
}
