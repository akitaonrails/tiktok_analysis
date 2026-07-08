package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226730i1n extends C1226750i1p {
    public final boolean LJFF;
    public final boolean LJI;
    public final EnumC1226770i1r LJII;
    public final C0N0C LJIIIIZZ;
    public final Function0<Boolean> LJIIIZ;

    public C1226730i1n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226730i1n)) {
            return false;
        }
        C1226730i1n c1226730i1n = (C1226730i1n) obj;
        return this.LJFF == c1226730i1n.LJFF && this.LJI == c1226730i1n.LJI && this.LJII == c1226730i1n.LJII && this.LJIIIIZZ == c1226730i1n.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1226730i1n.LJIIIZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        EnumC1226770i1r enumC1226770i1r = this.LJII;
        int iHashCode = (iZ2 + (enumC1226770i1r == null ? 0 : enumC1226770i1r.hashCode())) * 31;
        C0N0C c0n0c = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (c0n0c == null ? 0 : c0n0c.hashCode())) * 31;
        Function0<Boolean> function0 = this.LJIIIZ;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorGroupHeaderProtocolConfig(defaultEnable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", defaultVisible=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", dynamicBehavior=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dynamicCondition=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", customClickAction=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1226750i1p
    public final boolean LIZ() {
        return this.LJFF;
    }

    @Override // X.C1226750i1p
    public final boolean LIZIZ() {
        return this.LJI;
    }

    @Override // X.C1226750i1p
    public final EnumC1226770i1r LIZJ() {
        return this.LJII;
    }

    @Override // X.C1226750i1p
    public final C0N0C LIZLLL() {
        return this.LJIIIIZZ;
    }

    public /* synthetic */ C1226730i1n(int i) {
        this(true, true, null, null, null);
    }

    public static C1226730i1n LJ(C1226730i1n c1226730i1n, AwS563S0100000_19 awS563S0100000_19, int i) {
        boolean z;
        EnumC1226770i1r enumC1226770i1r;
        Function0<Boolean> function0 = awS563S0100000_19;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = c1226730i1n.LJFF;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = c1226730i1n.LJI;
        }
        C0N0C c0n0c = null;
        if ((i & 4) != 0) {
            enumC1226770i1r = c1226730i1n.LJII;
        } else {
            enumC1226770i1r = null;
        }
        if ((i & 8) != 0) {
            c0n0c = c1226730i1n.LJIIIIZZ;
        }
        if ((i & 16) != 0) {
            function0 = c1226730i1n.LJIIIZ;
        }
        return new C1226730i1n(z, z2, enumC1226770i1r, c0n0c, function0);
    }

    public C1226730i1n(boolean z, boolean z2, EnumC1226770i1r enumC1226770i1r, C0N0C c0n0c, Function0<Boolean> function0) {
        super("id_header_creator_group", z, z2, enumC1226770i1r, c0n0c);
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = enumC1226770i1r;
        this.LJIIIIZZ = c0n0c;
        this.LJIIIZ = function0;
    }
}
