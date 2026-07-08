package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1445305lD {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC1450305m1 LIZJ;
    public final Integer LIZLLL;
    public final List<String> LJ;
    public final boolean LJFF;
    public final InterfaceC1443505kv LJI;
    public final boolean LJII;
    public final InterfaceC12836050o LJIIIIZZ;
    public final Function1<InterfaceC1444205l2, Map<String, Object>> LJIIIZ;
    public final Map<String, Object> LJIIJ;
    public final Function1<Boolean, Unit> LJIIJJI;
    public final Function0<Unit> LJIIL;

    public C1445305lD() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445305lD)) {
            return false;
        }
        C1445305lD c1445305lD = (C1445305lD) obj;
        return Intrinsics.LJFF(this.LIZ, c1445305lD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1445305lD.LIZIZ) && this.LIZJ == c1445305lD.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1445305lD.LIZLLL) && Intrinsics.LJFF(this.LJ, c1445305lD.LJ) && this.LJFF == c1445305lD.LJFF && Intrinsics.LJFF(this.LJI, c1445305lD.LJI) && this.LJII == c1445305lD.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1445305lD.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1445305lD.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1445305lD.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1445305lD.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1445305lD.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        InterfaceC1443505kv interfaceC1443505kv = this.LJI;
        int iHashCode4 = (((((iHashCode3 + (interfaceC1443505kv == null ? 0 : interfaceC1443505kv.hashCode())) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        Function1<InterfaceC1444205l2, Map<String, Object>> function1 = this.LJIIIZ;
        int iHashCode5 = (((iHashCode4 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31;
        Function1<Boolean, Unit> function12 = this.LJIIJJI;
        int iHashCode6 = (iHashCode5 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function0<Unit> function0 = this.LJIIL;
        return iHashCode6 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        return "FcpNodeBuildInfo(identifier=" + this.LIZ + ", parentKey=" + this.LIZIZ + ", nodeType=" + this.LIZJ + ", priorityIndex=" + this.LIZLLL + ", signalTimingKeys=" + this.LJ + ", isStandard=" + this.LJFF + ", rule=" + this.LJI + ", keepLastCompetitionRes=" + this.LJII + ", checker=" + this.LJIIIIZZ + ", decisionInfoProvider=" + this.LJIIIZ + ", extraInfo=" + this.LJIIJ + ", applyToComponentCallback=" + this.LJIIJJI + ", resetToComponentCallback=" + this.LJIIL + ')';
    }

    public C1445305lD(String str, String str2, EnumC1450305m1 enumC1450305m1, Integer num, List list, boolean z, InterfaceC1443505kv interfaceC1443505kv, InterfaceC12836050o interfaceC12836050o, Function1 function1, Function0 function0) {
        Map<String, Object> mapLJ = C2097608Jq.LJ();
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC1450305m1;
        this.LIZLLL = num;
        this.LJ = list;
        this.LJFF = z;
        this.LJI = interfaceC1443505kv;
        this.LJII = true;
        this.LJIIIIZZ = interfaceC12836050o;
        this.LJIIIZ = null;
        this.LJIIJ = mapLJ;
        this.LJIIJJI = function1;
        this.LJIIL = function0;
    }
}
