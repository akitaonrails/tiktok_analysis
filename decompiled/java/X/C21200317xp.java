package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21200317xp {
    public static final /* synthetic */ int LJI = 0;
    public final C599380Nf6 LIZ;
    public final boolean LIZIZ;
    public final Map<C1776350wKH, InterfaceC21200617xs> LIZJ;
    public C1776350wKH LIZLLL;
    public boolean LJ;
    public final C01GW LJFF;

    public final void LIZLLL() {
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            LIZ((InterfaceC21200617xs) it2.next());
        }
        ((LinkedHashMap) this.LIZJ).clear();
        this.LIZLLL = null;
        this.LJ = false;
    }

    public C21200317xp(C599380Nf6 c599380Nf6) {
        this.LIZ = c599380Nf6;
        this.LIZIZ = C0C64.LJIILLIIL().LJIJ(31744, 1, "sea_live_lynx_pin_card_reuse_type", true) == 1;
        this.LIZJ = new LinkedHashMap();
        this.LJFF = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(197));
    }

    public static void LIZ(InterfaceC21200617xs interfaceC21200617xs) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "sea_live_lynx_destroy_switch", true, true)) {
            try {
                interfaceC21200617xs.LLD(true);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LIZJ(InterfaceC21200617xs interfaceC21200617xs) {
        if (interfaceC21200617xs != null && C0C64.LJIILLIIL().LJIIIZ(31744, "sea_live_lynx_destroy_switch", true, true) && !this.LIZIZ) {
            try {
                interfaceC21200617xs.LLD(true);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LIZIZ(Context context, final C1783920wWU c1783920wWU, String str, ISeaLiveContextAbility iSeaLiveContextAbility, final InterfaceC21200817xu interfaceC21200817xu) {
        final C1776350wKH c1776350wKH;
        InterfaceC21200617xs c1760360vuU;
        if (context == null) {
            interfaceC21200817xu.LIZIZ(false, "context is null", c1783920wWU, null);
            return;
        }
        if (c1783920wWU == null) {
            c1776350wKH = null;
        } else {
            c1776350wKH = new C1776350wKH(c1783920wWU.LIZ);
        }
        this.LIZLLL = c1776350wKH;
        if (c1776350wKH == null || (c1760360vuU = (InterfaceC21200617xs) ((LinkedHashMap) this.LIZJ).get(c1776350wKH)) == null || !this.LIZIZ) {
            c1760360vuU = new C1760360vuU(this.LIZ);
        }
        if (c1760360vuU.getStatus() == EnumC1760390vuX.LOAD_FAIL || c1760360vuU.getStatus() == EnumC1760390vuX.CREATED || c1760360vuU.getStatus() == EnumC1760390vuX.LOADING) {
            LIZ(c1760360vuU);
            c1760360vuU = new C1760360vuU(this.LIZ);
        }
        int i = C1760400vuY.LIZ[c1760360vuU.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LJ = false;
                if (c1760360vuU.LIZIZ(context, C1733370vCx.LIZ(c1783920wWU.LIZJ, str, new C1561410qjb("live_pop_card"), iSeaLiveContextAbility, c1783920wWU.LIZLLL), new AbstractC1760410vuZ() { // from class: X.17xr
                    @Override // X.AbstractC1760410vuZ
                    public final void LIZIZ() {
                        InterfaceC21200817xu interfaceC21200817xu2 = interfaceC21200817xu;
                        if (interfaceC21200817xu2 != null) {
                            interfaceC21200817xu2.LIZ();
                        }
                    }

                    @Override // X.AbstractC1760410vuZ
                    public final void LIZ(String str2, C1561410qjb c1561410qjb) {
                        InterfaceC21200817xu interfaceC21200817xu2 = interfaceC21200817xu;
                        if (interfaceC21200817xu2 != null) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            interfaceC21200817xu2.LIZIZ(false, str2, c1783920wWU, null);
                        }
                    }

                    @Override // X.AbstractC1760410vuZ
                    public final void LIZJ(C1561410qjb c1561410qjb, C1760360vuU c1760360vuU2) {
                        C1776350wKH c1776350wKH2 = c1776350wKH;
                        if (c1776350wKH2 != null) {
                            this.LIZJ.put(c1776350wKH2, c1760360vuU2);
                        }
                        InterfaceC21200817xu interfaceC21200817xu2 = interfaceC21200817xu;
                        if (interfaceC21200817xu2 != null) {
                            interfaceC21200817xu2.LIZIZ(true, "", c1783920wWU, c1760360vuU2);
                        }
                    }
                }) == null) {
                    interfaceC21200817xu.LIZIZ(false, "lynx view create failed", c1783920wWU, null);
                }
                c1760360vuU.load();
                return;
            }
            return;
        }
        this.LJ = true;
        if (c1776350wKH != null) {
            this.LIZJ.put(c1776350wKH, c1760360vuU);
        }
        interfaceC21200817xu.LIZIZ(true, "sea_live_lynx_reuse_card", c1783920wWU, c1760360vuU);
    }
}
