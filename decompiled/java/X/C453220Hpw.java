package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453220Hpw implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final AbstractC453140Hpo LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C453220Hpw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C453220Hpw)) {
            return false;
        }
        C453220Hpw c453220Hpw = (C453220Hpw) obj;
        return Intrinsics.LJFF(this.LL, c453220Hpw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c453220Hpw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c453220Hpw.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyToStickerRecommendationVMState(requestShowKeyboard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", recommendationState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cancelRecommendationEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C453220Hpw(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), C453270Hq1.LIZ, new C291001Au(bool));
    }

    public C453220Hpw(C291001Au<Boolean> c291001Au, AbstractC453140Hpo abstractC453140Hpo, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = abstractC453140Hpo;
        this.LLILLL = c291001Au2;
    }

    public static C453220Hpw LIZ(C453220Hpw c453220Hpw, C291001Au c291001Au, AbstractC453140Hpo abstractC453140Hpo, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c453220Hpw.LL;
        }
        if ((i & 2) != 0) {
            abstractC453140Hpo = c453220Hpw.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c453220Hpw.LLILLL;
        }
        c453220Hpw.getClass();
        return new C453220Hpw(c291001Au, abstractC453140Hpo, c291001Au2);
    }
}
