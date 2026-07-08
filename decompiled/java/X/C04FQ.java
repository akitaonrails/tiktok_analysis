package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FQ extends C04FR implements InterfaceC1094304Pt {
    public final String LJIIIZ;
    public final C04FZ LJIIJ;
    public final Map<String, EventParam> LJIIJJI;
    public final List<Map<String, EventParam>> LJIIL;
    public final n LJIILIIL;
    public final Object LJIILJJIL;
    public final C04CV LJIILL;
    public Map<String, ? extends Object> LJIILLIIL;

    public C04FQ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04FQ)) {
            return false;
        }
        C04FQ c04fq = (C04FQ) obj;
        return Intrinsics.LJFF(this.LJIIIZ, c04fq.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c04fq.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c04fq.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c04fq.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c04fq.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c04fq.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c04fq.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c04fq.LJIILLIIL);
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
        int iHashCode6 = (((iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31) + this.LJIILL.hashCode()) * 31;
        Map<String, ? extends Object> map2 = this.LJIILLIIL;
        return iHashCode6 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceNode(nodeId=");
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
        sbLIZ.append(", dataContext=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", actionData=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1094304Pt
    public final Map<String, Object> LIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.C04FR
    public final List<Map<String, EventParam>> LIZJ() {
        return this.LJIIL;
    }

    @Override // X.C04FR
    public final C04CV LIZLLL() {
        return this.LJIILL;
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

    @Override // X.InterfaceC1094304Pt
    public final void LIZIZ(Map<String, ? extends Object> map) {
        this.LJIILLIIL = map;
    }

    public C04FQ(String str, C04FZ c04fz, Map map, n nVar, Object obj, C04CV c04cv, Map map2) {
        super(str, nVar, c04fz, map, null, c04cv, obj);
        this.LJIIIZ = str;
        this.LJIIJ = c04fz;
        this.LJIIJJI = map;
        this.LJIIL = null;
        this.LJIILIIL = nVar;
        this.LJIILJJIL = obj;
        this.LJIILL = c04cv;
        this.LJIILLIIL = map2;
    }
}
