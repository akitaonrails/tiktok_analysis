package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619990OTl implements InterfaceC0148002o {
    public final C0OSF LL;
    public final C0OWM LLILLJJLI;
    public final EnumC620000OTm LLILLL;
    public final boolean LLILZ;
    public final C0OVT LLILZIL;

    public C619990OTl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C619990OTl)) {
            return false;
        }
        C619990OTl c619990OTl = (C619990OTl) obj;
        return this.LL == c619990OTl.LL && this.LLILLJJLI == c619990OTl.LLILLJJLI && this.LLILLL == c619990OTl.LLILLL && this.LLILZ == c619990OTl.LLILZ && Intrinsics.LJFF(this.LLILZIL, c619990OTl.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinInputState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", panelState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", occupancy=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFullScreenAnimating=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", editSource=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C619990OTl(int i) {
        this(C0OSF.NORMAL, C0OWM.HIDE, EnumC620000OTm.INPUT, false, new C0OVT(null, 1023));
    }

    public C619990OTl(C0OSF c0osf, C0OWM c0owm, EnumC620000OTm enumC620000OTm, boolean z, C0OVT c0ovt) {
        this.LL = c0osf;
        this.LLILLJJLI = c0owm;
        this.LLILLL = enumC620000OTm;
        this.LLILZ = z;
        this.LLILZIL = c0ovt;
    }

    public static C619990OTl LIZ(C619990OTl c619990OTl, C0OSF c0osf, C0OWM c0owm, EnumC620000OTm enumC620000OTm, C0OVT c0ovt, int i) {
        boolean z;
        C0OVT c0ovt2 = c0ovt;
        EnumC620000OTm enumC620000OTm2 = enumC620000OTm;
        C0OWM c0owm2 = c0owm;
        C0OSF c0osf2 = c0osf;
        if ((i & 1) != 0) {
            c0osf2 = c619990OTl.LL;
        }
        if ((i & 2) != 0) {
            c0owm2 = c619990OTl.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC620000OTm2 = c619990OTl.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c619990OTl.LLILZ;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            c0ovt2 = c619990OTl.LLILZIL;
        }
        c619990OTl.getClass();
        return new C619990OTl(c0osf2, c0owm2, enumC620000OTm2, z, c0ovt2);
    }
}
