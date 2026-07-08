package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.goda.v2.model.dto.GodaV2Feature;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.google.gson.n;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FN extends C04FR implements InterfaceC1094304Pt {
    public final String LJIIIZ;
    public final C04FZ LJIIJ;
    public final Map<String, EventParam> LJIIJJI;
    public final List<Map<String, EventParam>> LJIIL;
    public final n LJIILIIL;
    public Object LJIILJJIL;
    public final C04FY LJIILL;
    public final GodaV2Style LJIILLIIL;
    public final GodaV2Feature LJIIZILJ;
    public final C04CV LJIJ;
    public Map<String, ? extends Object> LJIJI;
    public WeakReference<InterfaceC1066404Fa> LJIJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04FN)) {
            return false;
        }
        C04FN c04fn = (C04FN) obj;
        return Intrinsics.LJFF(this.LJIIIZ, c04fn.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c04fn.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c04fn.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c04fn.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c04fn.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c04fn.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c04fn.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c04fn.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c04fn.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c04fn.LJIJ) && Intrinsics.LJFF(this.LJIJI, c04fn.LJIJI);
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
        C04FY c04fy = this.LJIILL;
        int iHashCode7 = (iHashCode6 + (c04fy == null ? 0 : c04fy.hashCode())) * 31;
        GodaV2Style godaV2Style = this.LJIILLIIL;
        int iHashCode8 = (iHashCode7 + (godaV2Style == null ? 0 : godaV2Style.hashCode())) * 31;
        GodaV2Feature godaV2Feature = this.LJIIZILJ;
        int iHashCode9 = (((iHashCode8 + (godaV2Feature == null ? 0 : godaV2Feature.hashCode())) * 31) + this.LJIJ.hashCode()) * 31;
        Map<String, ? extends Object> map2 = this.LJIJI;
        return iHashCode9 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "ItemNode(nodeId=" + this.LJIIIZ + ", trackData=" + this.LJIIJ + ", trackTemplate=" + this.LJIIJJI + ", backupTrackTemplates=" + this.LJIIL + ", itemData=" + this.LJIILIIL + ", itemDataModel=" + this.LJIILJJIL + ", containerInfo=" + this.LJIILL + ", styleInfo=" + this.LJIILLIIL + ", feature=" + this.LJIIZILJ + ", dataContext=" + this.LJIJ + ", actionData=" + this.LJIJI + ')';
    }

    @Override // X.InterfaceC1094304Pt
    public final Map<String, Object> LIZ() {
        return this.LJIJI;
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

    @Override // X.InterfaceC1094304Pt
    public final void LIZIZ(Map<String, ? extends Object> map) {
        this.LJIJI = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C04FN(String str, C04FZ c04fz, Map<String, EventParam> map, List<? extends Map<String, EventParam>> list, n nVar, Object obj, C04FY c04fy, GodaV2Style godaV2Style, GodaV2Feature godaV2Feature, C04CV c04cv, Map<String, ? extends Object> map2) {
        super(str, nVar, c04fz, map, list, c04cv, obj);
        this.LJIIIZ = str;
        this.LJIIJ = c04fz;
        this.LJIIJJI = map;
        this.LJIIL = list;
        this.LJIILIIL = nVar;
        this.LJIILJJIL = obj;
        this.LJIILL = c04fy;
        this.LJIILLIIL = godaV2Style;
        this.LJIIZILJ = godaV2Feature;
        this.LJIJ = c04cv;
        this.LJIJI = map2;
    }
}
