package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.AwS413S0200000_12;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0crr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028370crr extends AbstractC1028360crq implements InterfaceC1028390crt, InterfaceC1028400cru {
    public final AbstractC1028360crq LIZIZ;
    public final C1028380crs LIZJ;
    public InterfaceC1028390crt LIZLLL;
    public InterfaceC1028400cru LJ;
    public int LJFF;
    public EnumC1000680c9C LJI;

    @Override // X.AbstractC1028360crq
    public final void LJIILJJIL() {
        LJJIIZI(1, "", "");
        this.LIZIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC1028400cru
    public final void LIZIZ() {
        InterfaceC1028400cru interfaceC1028400cru = this.LJ;
        if (interfaceC1028400cru != null) {
            interfaceC1028400cru.LIZIZ();
        }
        LJJIJ(false);
    }

    @Override // X.AbstractC1028360crq
    public final void LJFF() {
        this.LIZIZ.LJFF();
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIIIZZ() {
        this.LIZIZ.LJIIIIZZ();
    }

    @Override // X.AbstractC1028360crq
    public final String LJIIIZ() {
        return this.LIZIZ.LJIIIZ();
    }

    @Override // X.AbstractC1028360crq
    public final C1015060cWO LJIIJ() {
        return this.LIZIZ.LJIIJ();
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIL() {
        this.LIZIZ.LJIIL();
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJJLI() {
        this.LIZIZ.LJIJJLI();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1028370crr(C1029710cu1 c1029710cu1) {
        C1028380crs c1028380crs = c1029710cu1.LIZ;
        super(c1028380crs);
        this.LIZIZ = c1029710cu1;
        this.LIZJ = c1028380crs;
        this.LJFF = 1;
        this.LJI = EnumC1000680c9C.ONLY_RENDER;
    }

    @Override // X.InterfaceC1028400cru
    public final void LIZJ(boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRealRenderSuccess isFromPre = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("AdHybridContainerEventImpl");
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.LJFF = i;
        InterfaceC1028400cru interfaceC1028400cru = this.LJ;
        if (interfaceC1028400cru != null) {
            interfaceC1028400cru.LIZJ(z);
        }
        LJJIIZ(1, "", "");
    }

    @Override // X.InterfaceC1028390crt
    public final void LIZLLL(C1014910cW9 c1014910cW9) {
        this.LJFF = 1;
        LJJIIJZLJL(1, "", "");
        InterfaceC1028390crt interfaceC1028390crt = this.LIZLLL;
        if (interfaceC1028390crt != null) {
            interfaceC1028390crt.LIZLLL(c1014910cW9);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIILLIIL(InterfaceC1029720cu2 interfaceC1029720cu2) {
        this.LIZIZ.LJIILLIIL(interfaceC1029720cu2);
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIZILJ(C1039230d9N c1039230d9N) {
        this.LIZIZ.LJIIZILJ(c1039230d9N);
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJ(C1039100d9A c1039100d9A) {
        this.LIZIZ.LJIJ(c1039100d9A);
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJI(InterfaceC1036150d4P interfaceC1036150d4P) {
        this.LIZIZ.LJIJI(interfaceC1036150d4P);
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJJ(C1039010d91 c1039010d91) {
        this.LIZIZ.LJIJJ(c1039010d91);
    }

    @Override // X.AbstractC1028360crq
    public final void LJIL(String str) {
        this.LIZIZ.LJIL(str);
    }

    @Override // X.AbstractC1028360crq
    public final void LJJI(C1051290dSp c1051290dSp) {
        C811103Ev.LIZIZ(this.LIZIZ.LIZ.LIZJ, "show fullscreen container");
        this.LIZIZ.LJJI(c1051290dSp);
    }

    @Override // X.AbstractC1028360crq
    public final void LJJIII(AwS413S0200000_12 awS413S0200000_12) {
        this.LIZIZ.LJJIII(awS413S0200000_12);
    }

    @Override // X.AbstractC1028360crq
    public final void LJJIIJ(Map<String, ? extends Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGlobalProps data = ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("AdHybridContainerEventImpl");
        this.LIZIZ.LJJIIJ(map);
    }

    public final void LJJIJ(boolean z) {
        String str;
        C1050680dRq c1050680dRq = new C1050680dRq(null, this.LIZJ.LIZ, null, null, null, 0, null, null, null, null, null, null, null, false, 32765);
        C1029740cu4 c1029740cu4 = this.LIZJ.LIZLLL;
        C1050670dRp c1050670dRp = new C1050670dRp();
        c1050670dRp.LJIIIIZZ(c1050680dRq);
        if (z) {
            str = "prerender";
        } else {
            str = "render";
        }
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("hybrid_ad", str, String.valueOf(c1029740cu4.LIZ), c1029740cu4.LIZIZ, c1029740cu4.LIZJ);
        c1022820ciuLJ.LIZ(c1050670dRp.LJFF(Scene.SCENE_SERVICE));
        c1022820ciuLJ.LJII();
        C811103Ev.LIZ("AdHybridEventManager");
    }

    @Override // X.InterfaceC1028390crt
    public final void LJ(String str, String str2) {
        this.LJFF = 1;
        LJJIIJZLJL(0, "data_load_fail", str);
        InterfaceC1028390crt interfaceC1028390crt = this.LIZLLL;
        if (interfaceC1028390crt != null) {
            interfaceC1028390crt.LJ(str, str2);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIJJI(String str, JSONObject jSONObject) {
        this.LIZIZ.LJIIJJI(str, jSONObject);
    }

    @Override // X.AbstractC1028360crq
    public final void LJIILIIL(String str, String str2) {
        LJJIIZI(0, str, str2);
        this.LIZIZ.LJIILIIL(str, str2);
    }

    @Override // X.AbstractC1028360crq
    public final void LJIILL(C1051290dSp c1051290dSp, InterfaceC1028390crt interfaceC1028390crt) {
        LJJIJ(true);
        C811103Ev.LIZ("AdHybridContainerEventImpl");
        this.LIZLLL = interfaceC1028390crt;
        this.LIZIZ.LJIILL(c1051290dSp, this);
    }

    @Override // X.AbstractC1028360crq
    public final void LJJIFFI(C1051290dSp c1051290dSp, InterfaceC1051480dT8 interfaceC1051480dT8) {
        this.LIZIZ.LJJIFFI(c1051290dSp, interfaceC1051480dT8);
    }

    @Override // X.AbstractC1028360crq
    public final void LJJII(Context context, String str) {
        this.LIZIZ.LJJII(context, str);
    }

    @Override // X.InterfaceC1028400cru
    public final void LIZ(String str, String str2, boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRealRenderFailed isFromPre = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("AdHybridContainerEventImpl");
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.LJFF = i;
        InterfaceC1028400cru interfaceC1028400cru = this.LJ;
        if (interfaceC1028400cru != null) {
            interfaceC1028400cru.LIZ(str, str2, z);
        }
        LJJIIZ(0, "data_load_fail", str);
    }

    @Override // X.AbstractC1028360crq
    public final InterfaceC1034470d1h LJI(C1051290dSp c1051290dSp, boolean z, C830490Whz<String, Object> c830490Whz) {
        C811103Ev.LIZIZ(this.LIZIZ.LIZ.LIZJ, "create fragment");
        return this.LIZIZ.LJI(c1051290dSp, z, c830490Whz);
    }

    @Override // X.AbstractC1028360crq
    public final void LJJ(C1051290dSp c1051290dSp, InterfaceC1051190dSf interfaceC1051190dSf, InterfaceC1028400cru interfaceC1028400cru) {
        this.LJ = interfaceC1028400cru;
        this.LJI = c1051290dSp.LIZ;
        this.LIZIZ.LJJ(c1051290dSp, interfaceC1051190dSf, this);
        C1050680dRq c1050680dRq = new C1050680dRq(null, this.LIZJ.LIZ, null, null, null, 0, null, null, null, null, null, null, null, false, 32765);
        C1029740cu4 c1029740cu4 = this.LIZJ.LIZLLL;
        C1050670dRp c1050670dRp = new C1050670dRp();
        c1050670dRp.LJIIIIZZ(c1050680dRq);
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("hybrid_ad", "fetch_view", String.valueOf(c1029740cu4.LIZ), c1029740cu4.LIZIZ, c1029740cu4.LIZJ);
        c1022820ciuLJ.LIZ(c1050670dRp.LJFF(Scene.SCENE_SERVICE));
        c1022820ciuLJ.LJII();
        C811103Ev.LIZ("AdHybridEventManager");
    }

    public final void LJJIIJZLJL(int i, String str, String str2) {
        C1050680dRq c1050680dRq = new C1050680dRq(null, this.LIZJ.LIZ, null, null, Integer.valueOf(i), 0, null, null, str, str2, null, null, null, false, 31197);
        C1029740cu4 c1029740cu4 = this.LIZJ.LIZLLL;
        C1050670dRp c1050670dRp = new C1050670dRp();
        c1050670dRp.LJIIIIZZ(c1050680dRq);
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("hybrid_ad", "prerender_status", String.valueOf(c1029740cu4.LIZ), c1029740cu4.LIZIZ, c1029740cu4.LIZJ);
        c1022820ciuLJ.LIZ(c1050670dRp.LJFF(Scene.SCENE_SERVICE, "fail_reason", "error_code"));
        c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("success"), "success");
        c1022820ciuLJ.LJII();
        C811103Ev.LIZ("AdHybridEventManager");
    }

    public final void LJJIIZ(int i, String str, String str2) {
        C1050680dRq c1050680dRq = new C1050680dRq(null, this.LIZJ.LIZ, null, null, Integer.valueOf(i), 0, this.LJI.name(), null, str, str2, null, null, null, false, 31069);
        C1029740cu4 c1029740cu4 = this.LIZJ.LIZLLL;
        C1050670dRp c1050670dRp = new C1050670dRp();
        c1050670dRp.LJIIIIZZ(c1050680dRq);
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("hybrid_ad", "render_status", String.valueOf(c1029740cu4.LIZ), c1029740cu4.LIZIZ, c1029740cu4.LIZJ);
        c1022820ciuLJ.LIZ(c1050670dRp.LJFF(Scene.SCENE_SERVICE, "fail_reason", "error_code"));
        c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("success"), "success");
        c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("strategy"), "strategy");
        c1022820ciuLJ.LJII();
        C811103Ev.LIZ("AdHybridEventManager");
    }

    public final void LJJIIZI(int i, String str, String str2) {
        C1028380crs c1028380crs = this.LIZJ;
        String str3 = c1028380crs.LIZ;
        String strName = c1028380crs.LIZIZ.name();
        C1050680dRq c1050680dRq = new C1050680dRq(null, str3, null, null, Integer.valueOf(i), this.LJFF, this.LJI.name(), strName, str, str2, null, null, null, false, 30749);
        C1029740cu4 c1029740cu4 = this.LIZJ.LIZLLL;
        C1050670dRp c1050670dRp = new C1050670dRp();
        c1050670dRp.LJIIIIZZ(c1050680dRq);
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("hybrid_ad", "show_status", String.valueOf(c1029740cu4.LIZ), c1029740cu4.LIZIZ, c1029740cu4.LIZJ);
        c1022820ciuLJ.LIZ(c1050670dRp.LJFF(Scene.SCENE_SERVICE, "fail_reason", "error_code", "show_type"));
        c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("success"), "success");
        c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("strategy"), "strategy");
        c1022820ciuLJ.LJII();
        C811103Ev.LIZ("AdHybridEventManager");
    }
}
