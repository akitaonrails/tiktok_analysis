package X;

import Y.AfS48S1100000_15;
import Y.AfS4S1210000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C920010a35 extends AbstractC919970a31 {
    public final String LIZJ;
    public final C919940a2y LIZLLL;
    public final C920000a34 LJ;

    @Override // X.InterfaceC927510aFB
    public final List<PosIdentity> LIZIZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void destroy() {
        super.destroy();
        this.LIZLLL.LIZ();
    }

    public C920010a35(C919710a2b c919710a2b) {
        C920000a34 c920000a34;
        super(c919710a2b);
        this.LIZJ = "Zoom/ZoomGuestPresent";
        this.LIZLLL = new C919940a2y(this, c919710a2b);
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(zLIZJ)) {
            c920000a34 = new C920070a3B(c919710a2b);
        } else {
            c920000a34 = new C920000a34(c919710a2b);
        }
        this.LJ = c920000a34;
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public EnumC920250a3T LJIL(String str) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJIIIZ()) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            String str2 = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("moderatorGetZoomStatus: linkMicId=");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI(str2, strLIZIZ);
            return this.LJ.LJIL(str);
        }
        C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
        String str3 = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("guestGetZoomStatus: linkMicId=");
        sbLIZ2.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c1143300frELJIIJJI2.getClass();
        AbstractC1143290frD.LJI(str3, strLIZIZ2);
        return super.LJIL(str);
    }

    public boolean LJJI(String str) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        String str2 = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guestCanZoom: linkMicId=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI(str2, strLIZIZ);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL() && Intrinsics.LJFF(str, LJIILL())) {
            int iLJIILLIIL = this.LIZ.LJIILLIIL(C920280a3W.LIZ(), str);
            AbstractC919790a2j.LJIIJJI.getClass();
            if (iLJIILLIIL != AbstractC919790a2j.LJIILIIL && C500260Jjc.LJJIIZ(this.LIZ.LJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
        this.LJ.LJIIJJI(interfaceC920110a3F, str);
    }

    @Override // X.InterfaceC927510aFB
    public final AbstractC19486711Lt LJIILLIIL(int i, boolean z) {
        return C11QJ.LL;
    }

    @Override // X.InterfaceC927510aFB
    public final void LJ(int i, Function1 function1, boolean z, boolean z2) {
        function1.invoke(C11QJ.LL);
    }

    public void LJJIFFI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, EnumC919910a2v enumC919910a2v) {
        boolean zLJJI;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        String str2 = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guestZoom: linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", noMoreZoom=");
        sbLIZ.append(z);
        sbLIZ.append(", zoomFromAnchor=");
        sbLIZ.append(z2);
        sbLIZ.append(", zoomSource=");
        sbLIZ.append(enumC919910a2v.name());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI(str2, strLIZIZ);
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJIIIZ()) {
            C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
            String str3 = this.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("moderatorCanZoom: linkMicId=");
            sbLIZ2.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1143300frELJIIJJI2.getClass();
            AbstractC1143290frD.LJI(str3, strLIZIZ2);
            zLJJI = this.LJ.LJJI(str);
        } else {
            zLJJI = LJJI(str);
        }
        if (!zLJJI) {
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZ(EnumC919060a1Y.E_C_GUEST_REJECT_ZOOM.ordinal(), str, "", null);
                return;
            }
            return;
        }
        int iLIZ = this.LIZ.LIZ(str, z2);
        this.LIZ.getClass();
        Map<String, String> mapLJFF = AbstractC919790a2j.LJFF(iLIZ, 0L, str, z);
        C1143300frE c1143300frELJIIJJI3 = C1143300frE.LJIIJJI();
        String str4 = this.LIZJ;
        Map<String, ?> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action", "tryZoomToMin"), new Pair("linkMicId", str), new Pair("noMoreZoom", Boolean.valueOf(z)), new Pair(Scene.SCENE_SERVICE, Integer.valueOf(iLIZ)));
        mapLJIIJ.putAll(mapLJFF);
        c1143300frELJIIJJI3.LJII(str4, mapLJIIJ);
        C11NJ c11nj = this.LIZIZ;
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(mapLJFF).LJIILIIL(new C0UO0()).LJJLL(new AfS4S1210000_15(interfaceC920110a3F, str, this, z, 2), new AfS48S1100000_15(interfaceC920110a3F, str, 7)));
    }

    @Override // X.InterfaceC927510aFB
    public final void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJIIIZ() && this.LIZ.LIZ(str, z3) != 4) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            String str2 = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("moderatorZoom: linkMicId=");
            sbLIZ.append(str);
            sbLIZ.append(", noMoreZoom=");
            sbLIZ.append(z2);
            sbLIZ.append(", zoomFromAnchor=");
            sbLIZ.append(z3);
            sbLIZ.append(", zoomSource=");
            sbLIZ.append(enumC919910a2v.name());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI(str2, strLIZIZ);
            this.LJ.LJI(str, interfaceC920110a3F, z, z2, z3, z4, enumC919910a2v, null);
            return;
        }
        LJJIFFI(str, interfaceC920110a3F, z2, z3, enumC919910a2v);
    }
}
