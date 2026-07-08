package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.goda.v2.model.dto.GodaV2Feature;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FM extends C04FR {
    public final String LJIIIZ;
    public final C04FZ LJIIJ;
    public final Map<String, EventParam> LJIIJJI;
    public final List<Map<String, EventParam>> LJIIL;
    public final n LJIILIIL;
    public final Object LJIILJJIL;
    public final List<C04FN> LJIILL;
    public final C04FY LJIILLIIL;
    public final GodaV2Feature LJIIZILJ;
    public final C04CV LJIJ;
    public Object LJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04FM)) {
            return false;
        }
        C04FM c04fm = (C04FM) obj;
        return Intrinsics.LJFF(this.LJIIIZ, c04fm.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c04fm.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c04fm.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c04fm.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c04fm.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c04fm.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c04fm.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c04fm.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c04fm.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c04fm.LJIJ);
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
        List<C04FN> list2 = this.LJIILL;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C04FY c04fy = this.LJIILLIIL;
        int iHashCode8 = (iHashCode7 + (c04fy == null ? 0 : c04fy.hashCode())) * 31;
        GodaV2Feature godaV2Feature = this.LJIIZILJ;
        return ((iHashCode8 + (godaV2Feature != null ? godaV2Feature.hashCode() : 0)) * 31) + this.LJIJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupNode(nodeId=");
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
        sbLIZ.append(", children=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", containerInfo=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", feature=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", dataContext=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04FR
    public final List<Map<String, EventParam>> LIZJ() {
        return this.LJIIL;
    }

    @Override // X.C04FR
    public final C04CV LIZLLL() {
        return this.LJIJ;
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

    /* JADX WARN: Multi-variable type inference failed */
    public C04FM(String str, C04FZ c04fz, Map<String, EventParam> map, List<? extends Map<String, EventParam>> list, n nVar, Object obj, List<C04FN> list2, C04FY c04fy, GodaV2Feature godaV2Feature, C04CV c04cv) {
        super(str, nVar, c04fz, map, list, c04cv, obj);
        this.LJIIIZ = str;
        this.LJIIJ = c04fz;
        this.LJIIJJI = map;
        this.LJIIL = list;
        this.LJIILIIL = nVar;
        this.LJIILJJIL = obj;
        this.LJIILL = list2;
        this.LJIILLIIL = c04fy;
        this.LJIIZILJ = godaV2Feature;
        this.LJIJ = c04cv;
    }
}
