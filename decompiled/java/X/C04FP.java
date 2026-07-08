package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FP extends C04FR {
    public final String LJIIIZ;
    public final C04FZ LJIIJ;
    public final Map<String, EventParam> LJIIJJI;
    public final List<Map<String, EventParam>> LJIIL;
    public final n LJIILIIL;
    public final Object LJIILJJIL;
    public final List<C04FM> LJIILL;
    public final GodaV2Style LJIILLIIL;
    public final C04CV LJIIZILJ;

    public C04FP() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04FP)) {
            return false;
        }
        C04FP c04fp = (C04FP) obj;
        return Intrinsics.LJFF(this.LJIIIZ, c04fp.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c04fp.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c04fp.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c04fp.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c04fp.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c04fp.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c04fp.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c04fp.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c04fp.LJIIZILJ);
    }

    public final int hashCode() {
        int iHashCode = this.LJIIIZ.hashCode() * 31;
        C04FZ c04fz = this.LJIIJ;
        int iHashCode2 = (iHashCode + (c04fz == null ? 0 : c04fz.hashCode())) * 31;
        Map<String, EventParam> map = this.LJIIJJI;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<Map<String, EventParam>> list = this.LJIIL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        n nVar = this.LJIILIIL;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj = this.LJIILJJIL;
        int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        List<C04FM> list2 = this.LJIILL;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GodaV2Style godaV2Style = this.LJIILLIIL;
        return ((iHashCode7 + (godaV2Style != null ? godaV2Style.hashCode() : 0)) * 31) + this.LJIIZILJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BodyNode(nodeId=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", trackData=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", trackTemplate=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", backupTrackTemplates=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", itemData=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", itemDataModel=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", groups=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", styleInfo=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", dataContext=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04FR
    public final List<Map<String, EventParam>> LIZJ() {
        return this.LJIIL;
    }

    @Override // X.C04FR
    public final C04CV LIZLLL() {
        return this.LJIIZILJ;
    }

    @Override // X.C04FR
    public final n LJ() {
        return this.LJIILIIL;
    }

    @Override // X.C04FR
    public final String LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.C04FR
    public final C04FZ LJI() {
        return this.LJIIJ;
    }

    @Override // X.C04FR
    public final Map<String, EventParam> LJII() {
        return this.LJIIJJI;
    }

    public C04FP(C04FZ c04fz, Map map, n nVar, Object obj, List list, GodaV2Style godaV2Style, C04CV c04cv) {
        super("body", nVar, c04fz, map, null, c04cv, obj);
        this.LJIIIZ = "body";
        this.LJIIJ = c04fz;
        this.LJIIJJI = map;
        this.LJIIL = null;
        this.LJIILIIL = nVar;
        this.LJIILJJIL = obj;
        this.LJIILL = list;
        this.LJIILLIIL = godaV2Style;
        this.LJIIZILJ = c04cv;
    }
}
