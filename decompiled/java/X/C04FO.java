package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FO extends C04FR {
    public final String LJIIIZ;
    public final C04FZ LJIIJ;
    public final Map<String, EventParam> LJIIJJI;
    public final List<Map<String, EventParam>> LJIIL;
    public final n LJIILIIL;
    public final C04CV LJIILJJIL;
    public final Object LJIILL;
    public final GodaV2Style LJIILLIIL;
    public final C04FM LJIIZILJ;
    public final C04FP LJIJ;
    public final C04FM LJIJI;

    public C04FO() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04FO)) {
            return false;
        }
        C04FO c04fo = (C04FO) obj;
        return Intrinsics.LJFF(this.LJIIIZ, c04fo.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c04fo.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c04fo.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c04fo.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c04fo.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c04fo.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c04fo.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c04fo.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c04fo.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c04fo.LJIJ) && Intrinsics.LJFF(this.LJIJI, c04fo.LJIJI);
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
        int iHashCode5 = (((iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.LJIILJJIL.hashCode()) * 31;
        Object obj = this.LJIILL;
        int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        GodaV2Style godaV2Style = this.LJIILLIIL;
        int iHashCode7 = (iHashCode6 + (godaV2Style == null ? 0 : godaV2Style.hashCode())) * 31;
        C04FM c04fm = this.LJIIZILJ;
        int iHashCode8 = (iHashCode7 + (c04fm == null ? 0 : c04fm.hashCode())) * 31;
        C04FP c04fp = this.LJIJ;
        int iHashCode9 = (iHashCode8 + (c04fp == null ? 0 : c04fp.hashCode())) * 31;
        C04FM c04fm2 = this.LJIJI;
        return iHashCode9 + (c04fm2 != null ? c04fm2.hashCode() : 0);
    }

    public final String toString() {
        return "PageNode(nodeId=" + this.LJIIIZ + ", trackData=" + this.LJIIJ + ", trackTemplate=" + this.LJIIJJI + ", backupTrackTemplates=" + this.LJIIL + ", itemData=" + this.LJIILIIL + ", dataContext=" + this.LJIILJJIL + ", itemDataModel=" + this.LJIILL + ", styleInfo=" + this.LJIILLIIL + ", header=" + this.LJIIZILJ + ", body=" + this.LJIJ + ", footer=" + this.LJIJI + ')';
    }

    @Override // X.C04FR
    public final List<Map<String, EventParam>> LIZJ() {
        return this.LJIIL;
    }

    @Override // X.C04FR
    public final C04CV LIZLLL() {
        return this.LJIILJJIL;
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

    public C04FO(C04FZ c04fz, Map map, n nVar, C04CV c04cv, Object obj, GodaV2Style godaV2Style, C04FM c04fm, C04FP c04fp, C04FM c04fm2) {
        super("page", nVar, c04fz, map, null, c04cv, obj);
        this.LJIIIZ = "page";
        this.LJIIJ = c04fz;
        this.LJIIJJI = map;
        this.LJIIL = null;
        this.LJIILIIL = nVar;
        this.LJIILJJIL = c04cv;
        this.LJIILL = obj;
        this.LJIILLIIL = godaV2Style;
        this.LJIIZILJ = c04fm;
        this.LJIJ = c04fp;
        this.LJIJI = c04fm2;
    }
}
