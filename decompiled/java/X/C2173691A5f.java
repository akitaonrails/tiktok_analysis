package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173691A5f implements InterfaceC0148002o {
    public final AbstractC2173741A5k LL;
    public final boolean LLILLJJLI;
    public final AbstractC489590JHx LLILLL;
    public final int LLILZ;

    public C2173691A5f() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2173691A5f)) {
            return false;
        }
        C2173691A5f c2173691A5f = (C2173691A5f) obj;
        return Intrinsics.LJFF(this.LL, c2173691A5f.LL) && this.LLILLJJLI == c2173691A5f.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c2173691A5f.LLILLL) && this.LLILZ == c2173691A5f.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadingState(loadStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isBlockPageInteraction=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadingType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2173691A5f(int i) {
        this(C2173761A5m.LIZ, false, C489600JHy.LIZ, 0);
    }

    public C2173691A5f(AbstractC2173741A5k abstractC2173741A5k, boolean z, AbstractC489590JHx abstractC489590JHx, int i) {
        this.LL = abstractC2173741A5k;
        this.LLILLJJLI = z;
        this.LLILLL = abstractC489590JHx;
        this.LLILZ = i;
    }

    public static C2173691A5f LIZ(C2173691A5f c2173691A5f, AbstractC2173741A5k abstractC2173741A5k, boolean z, AbstractC489590JHx abstractC489590JHx, int i, int i2) {
        if ((i2 & 1) != 0) {
            abstractC2173741A5k = c2173691A5f.LL;
        }
        if ((i2 & 2) != 0) {
            z = c2173691A5f.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            abstractC489590JHx = c2173691A5f.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i = c2173691A5f.LLILZ;
        }
        c2173691A5f.getClass();
        return new C2173691A5f(abstractC2173741A5k, z, abstractC489590JHx, i);
    }
}
