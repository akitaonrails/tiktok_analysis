package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xI6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813440xI6 implements InterfaceC775640Ubi {
    public final C1813430xI5<List<C1808830xAf>> LIZ;
    public final C1813430xI5<List<C1808830xAf>> LIZIZ;
    public final C1813430xI5<Boolean> LIZJ;
    public final EnumC1813400xI2 LIZLLL;
    public final EnumC1813400xI2 LJ;
    public final EnumC1813400xI2 LJFF;

    public C1813440xI6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1813440xI6)) {
            return false;
        }
        C1813440xI6 c1813440xI6 = (C1813440xI6) obj;
        return Intrinsics.LJFF(this.LIZ, c1813440xI6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1813440xI6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1813440xI6.LIZJ) && this.LIZLLL == c1813440xI6.LIZLLL && this.LJ == c1813440xI6.LJ && this.LJFF == c1813440xI6.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPostLivingState(postedItemList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", unPostItemList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSwitchOpen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", postHighListState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", deleteVideoState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", loadingDataState=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1813440xI6(int i) {
        C1813430xI5 c1813430xI5 = new C1813430xI5((EnumC1813400xI2) null, 3);
        C1813430xI5 c1813430xI52 = new C1813430xI5((EnumC1813400xI2) null, 3);
        C1813430xI5 c1813430xI53 = new C1813430xI5((EnumC1813400xI2) null, 3);
        EnumC1813400xI2 enumC1813400xI2 = EnumC1813400xI2.UNKNOWN;
        this(c1813430xI5, c1813430xI52, c1813430xI53, enumC1813400xI2, enumC1813400xI2, enumC1813400xI2);
    }

    public C1813440xI6(C1813430xI5<List<C1808830xAf>> c1813430xI5, C1813430xI5<List<C1808830xAf>> c1813430xI52, C1813430xI5<Boolean> c1813430xI53, EnumC1813400xI2 enumC1813400xI2, EnumC1813400xI2 enumC1813400xI22, EnumC1813400xI2 enumC1813400xI23) {
        this.LIZ = c1813430xI5;
        this.LIZIZ = c1813430xI52;
        this.LIZJ = c1813430xI53;
        this.LIZLLL = enumC1813400xI2;
        this.LJ = enumC1813400xI22;
        this.LJFF = enumC1813400xI23;
    }

    public static C1813440xI6 LIZ(C1813440xI6 c1813440xI6, C1813430xI5 c1813430xI5, C1813430xI5 c1813430xI52, C1813430xI5 c1813430xI53, EnumC1813400xI2 enumC1813400xI2, EnumC1813400xI2 enumC1813400xI22, int i) {
        EnumC1813400xI2 enumC1813400xI23;
        EnumC1813400xI2 enumC1813400xI24 = enumC1813400xI22;
        EnumC1813400xI2 enumC1813400xI25 = enumC1813400xI2;
        C1813430xI5 c1813430xI54 = c1813430xI53;
        C1813430xI5 c1813430xI55 = c1813430xI52;
        C1813430xI5 c1813430xI56 = c1813430xI5;
        if ((i & 1) != 0) {
            c1813430xI56 = c1813440xI6.LIZ;
        }
        if ((i & 2) != 0) {
            c1813430xI55 = c1813440xI6.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1813430xI54 = c1813440xI6.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC1813400xI23 = c1813440xI6.LIZLLL;
        } else {
            enumC1813400xI23 = null;
        }
        if ((i & 16) != 0) {
            enumC1813400xI25 = c1813440xI6.LJ;
        }
        if ((i & 32) != 0) {
            enumC1813400xI24 = c1813440xI6.LJFF;
        }
        c1813440xI6.getClass();
        return new C1813440xI6(c1813430xI56, c1813430xI55, c1813430xI54, enumC1813400xI23, enumC1813400xI25, enumC1813400xI24);
    }
}
