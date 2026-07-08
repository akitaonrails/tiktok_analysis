package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.PDPSeaHeaderPendantStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1068804Fy extends C04G0 {
    public final String LJIILIIL;
    public final C04FZ LJIILJJIL;
    public final Map<String, EventParam> LJIILL;
    public final List<Map<String, EventParam>> LJIILLIIL;
    public final n LJIIZILJ;
    public Map<String, ? extends Object> LJIJ;
    public final C04CV LJIJI;
    public Object LJIJJ;
    public final C04FY LJIJJLI;
    public final SeaPdpHeadFeatures LJIL;
    public final PDPSeaHeaderPendantStyle LJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1068804Fy)) {
            return false;
        }
        C1068804Fy c1068804Fy = (C1068804Fy) obj;
        return Intrinsics.LJFF(this.LJIILIIL, c1068804Fy.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1068804Fy.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1068804Fy.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1068804Fy.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1068804Fy.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c1068804Fy.LJIJ) && Intrinsics.LJFF(this.LJIJI, c1068804Fy.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c1068804Fy.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c1068804Fy.LJIJJLI) && Intrinsics.LJFF(this.LJIL, c1068804Fy.LJIL) && Intrinsics.LJFF(this.LJJ, c1068804Fy.LJJ);
    }

    public final int hashCode() {
        int iHashCode = this.LJIILIIL.hashCode() * 31;
        C04FZ c04fz = this.LJIILJJIL;
        int iHashCode2 = (iHashCode + (c04fz == null ? 0 : c04fz.hashCode())) * 31;
        Map<String, EventParam> map = this.LJIILL;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<Map<String, EventParam>> list = this.LJIILLIIL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        n nVar = this.LJIIZILJ;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Map<String, ? extends Object> map2 = this.LJIJ;
        int iHashCode6 = (((iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31) + this.LJIJI.hashCode()) * 31;
        Object obj = this.LJIJJ;
        int iHashCode7 = (((iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31) + this.LJIJJLI.hashCode()) * 31;
        SeaPdpHeadFeatures seaPdpHeadFeatures = this.LJIL;
        int iHashCode8 = (iHashCode7 + (seaPdpHeadFeatures == null ? 0 : seaPdpHeadFeatures.hashCode())) * 31;
        PDPSeaHeaderPendantStyle pDPSeaHeaderPendantStyle = this.LJJ;
        return iHashCode8 + (pDPSeaHeaderPendantStyle != null ? pDPSeaHeaderPendantStyle.hashCode() : 0);
    }

    public final String toString() {
        return "SeaHeadPendantNode(nodeId=" + this.LJIILIIL + ", trackData=" + this.LJIILJJIL + ", trackTemplate=" + this.LJIILL + ", backupTrackTemplates=" + this.LJIILLIIL + ", itemData=" + this.LJIIZILJ + ", actionData=" + this.LJIJ + ", dataContext=" + this.LJIJI + ", itemDataModel=" + this.LJIJJ + ", container=" + this.LJIJJLI + ", feature=" + this.LJIL + ", style=" + this.LJJ + ')';
    }

    @Override // X.InterfaceC1094304Pt
    public final Map<String, Object> LIZ() {
        return this.LJIJ;
    }

    @Override // X.C04FR
    public final List<Map<String, EventParam>> LIZJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C04FR
    public final C04CV LIZLLL() {
        return this.LJIJI;
    }

    @Override // X.C04G0, X.C04FR
    public final n LJ() {
        return this.LJIIZILJ;
    }

    @Override // X.C04G0, X.C04FR
    public final String LJFF() {
        return this.LJIILIIL;
    }

    @Override // X.C04FR
    public final C04FZ LJI() {
        return this.LJIILJJIL;
    }

    @Override // X.C04FR
    public final Map<String, EventParam> LJII() {
        return this.LJIILL;
    }

    @Override // X.C04G0
    public final C04FY LJIIIIZZ() {
        return this.LJIJJLI;
    }

    @Override // X.C04G0
    public final SeaPdpHeadFeatures LJIIIZ() {
        return this.LJIL;
    }

    @Override // X.C04G0
    public final Object LJIIJ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1094304Pt
    public final void LIZIZ(Map<String, ? extends Object> map) {
        this.LJIJ = map;
    }

    @Override // X.C04G0
    public final void LJIIL(Object obj) {
        this.LJIJJ = obj;
    }

    public C1068804Fy(String str, C04FZ c04fz, Map map, List list, n nVar, Map map2, C04CV c04cv, C04FY c04fy, SeaPdpHeadFeatures seaPdpHeadFeatures, PDPSeaHeaderPendantStyle pDPSeaHeaderPendantStyle) {
        super(str, c04fz, map, list, nVar, map2, c04cv, c04fy, seaPdpHeadFeatures);
        this.LJIILIIL = str;
        this.LJIILJJIL = c04fz;
        this.LJIILL = map;
        this.LJIILLIIL = list;
        this.LJIIZILJ = nVar;
        this.LJIJ = map2;
        this.LJIJI = c04cv;
        this.LJIJJ = null;
        this.LJIJJLI = c04fy;
        this.LJIL = seaPdpHeadFeatures;
        this.LJJ = pDPSeaHeaderPendantStyle;
    }
}
