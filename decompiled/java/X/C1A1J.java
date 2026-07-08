package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1J, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1J implements InterfaceC0148002o {
    public final C1A1K LL;
    public final C1A1I LLILLJJLI;
    public final C1A1O LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Boolean> LLILZIL;

    public C1A1J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A1J)) {
            return false;
        }
        C1A1J c1a1j = (C1A1J) obj;
        return this.LL == c1a1j.LL && Intrinsics.LJFF(this.LLILLJJLI, c1a1j.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1a1j.LLILLL) && this.LLILZ == c1a1j.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1a1j.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C1A1O c1a1o = this.LLILLL;
        return ((((iHashCode + (c1a1o == null ? 0 : c1a1o.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MufQuickReplyState(entrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", quickReplyBoxConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", repostDisplayType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isRepostGuideShown=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", quickReplySentEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1A1J(int i) {
        this(C1A1K.NOT_SET, new C1A1I((C1A1W) null, 3), null, false, new C291001Au(Boolean.FALSE));
    }

    public C1A1J(C1A1K c1a1k, C1A1I c1a1i, C1A1O c1a1o, boolean z, C291001Au<Boolean> c291001Au) {
        this.LL = c1a1k;
        this.LLILLJJLI = c1a1i;
        this.LLILLL = c1a1o;
        this.LLILZ = z;
        this.LLILZIL = c291001Au;
    }

    public static C1A1J LIZ(C1A1J c1a1j, C1A1K c1a1k, C1A1I c1a1i, C1A1O c1a1o, boolean z, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        C1A1O c1a1o2 = c1a1o;
        C1A1I c1a1i2 = c1a1i;
        C1A1K c1a1k2 = c1a1k;
        if ((i & 1) != 0) {
            c1a1k2 = c1a1j.LL;
        }
        if ((i & 2) != 0) {
            c1a1i2 = c1a1j.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1a1o2 = c1a1j.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1a1j.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1a1j.LLILZIL;
        }
        c1a1j.getClass();
        return new C1A1J(c1a1k2, c1a1i2, c1a1o2, z2, c291001Au2);
    }
}
