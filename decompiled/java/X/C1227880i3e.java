package X;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227880i3e extends C1226750i1p {
    public final boolean LJFF;
    public final Map<String, String> LJI;
    public final Map<String, ? extends Object> LJII;
    public final Function2<? super Context, ? super C0Y8T, Unit> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final EnumC1226770i1r LJIIJJI;
    public final C0N0C LJIIL;

    public C1227880i3e() {
        this(null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227880i3e)) {
            return false;
        }
        C1227880i3e c1227880i3e = (C1227880i3e) obj;
        return this.LJFF == c1227880i3e.LJFF && Intrinsics.LJFF(this.LJI, c1227880i3e.LJI) && Intrinsics.LJFF(this.LJII, c1227880i3e.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1227880i3e.LJIIIIZZ) && this.LJIIIZ == c1227880i3e.LJIIIZ && this.LJIIJ == c1227880i3e.LJIIJ && this.LJIIJJI == c1227880i3e.LJIIJJI && this.LJIIL == c1227880i3e.LJIIL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LJFF) * 31;
        Map<String, String> map = this.LJI;
        int iHashCode = (iZ2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ? extends Object> map2 = this.LJII;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Function2<? super Context, ? super C0Y8T, Unit> function2 = this.LJIIIIZZ;
        int iHashCode3 = (((((iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        EnumC1226770i1r enumC1226770i1r = this.LJIIJJI;
        int iHashCode4 = (iHashCode3 + (enumC1226770i1r == null ? 0 : enumC1226770i1r.hashCode())) * 31;
        C0N0C c0n0c = this.LJIIL;
        return iHashCode4 + (c0n0c != null ? c0n0c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateQRGroupHeaderProtocolConfig(needShowGuide=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extraMobMap=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", bizExtMap=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", createGroupCallback=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", defaultEnable=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", defaultVisible=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", dynamicBehavior=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", dynamicCondition=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1226750i1p
    public final boolean LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.C1226750i1p
    public final boolean LIZIZ() {
        return this.LJIIJ;
    }

    @Override // X.C1226750i1p
    public final EnumC1226770i1r LIZJ() {
        return this.LJIIJJI;
    }

    @Override // X.C1226750i1p
    public final C0N0C LIZLLL() {
        return this.LJIIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1227880i3e(Map map, Function2 function2, EnumC1226770i1r enumC1226770i1r, C0N0C c0n0c, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C0N0C c0n0c2 = c0n0c;
        EnumC1226770i1r enumC1226770i1r2 = enumC1226770i1r;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        map = (i & 4) != 0 ? null : map;
        function2 = (i & 8) != 0 ? null : function2;
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        enumC1226770i1r2 = (i & 64) != 0 ? null : enumC1226770i1r2;
        c0n0c2 = (i & 128) != 0 ? null : c0n0c2;
        super("id_header_create_qr_group", z2, z3, enumC1226770i1r2, c0n0c2);
        this.LJFF = z;
        this.LJI = null;
        this.LJII = map;
        this.LJIIIIZZ = function2;
        this.LJIIIZ = z2;
        this.LJIIJ = z3;
        this.LJIIJJI = enumC1226770i1r2;
        this.LJIIL = c0n0c2;
    }
}
