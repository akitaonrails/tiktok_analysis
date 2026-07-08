package X;

import Y.ARunnableS126S0100000_26;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.dependency.homepage.HomepageTabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigGlobalData;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0wES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772740wES implements InterfaceC1774020wGW {
    public final InterfaceC1773310wFN LIZ;
    public final C1772750wET LIZIZ;
    public InterfaceC1773090wF1 LIZJ;
    public C1772730wER LIZLLL;
    public boolean LJIIIIZZ;
    public boolean LJIIL;
    public final Set<AbstractC1773210wFD> LJ = new LinkedHashSet();
    public final Set<AbstractC1773210wFD> LJFF = new LinkedHashSet();
    public final Set<AbstractC1773210wFD> LJI = new LinkedHashSet();
    public final C1774110wGf LJII = new AbstractC1773210wFD() { // from class: X.0wGf
    };
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1007));
    public final C1772790wEX LJIIJ = new C18Z7() { // from class: X.0wEX
        @Override // X.C18Z7
        public final void LIZ() {
            EnumC1772960wEo enumC1772960wEo;
            C1772730wER c1772730wER = this.LIZ.LIZLLL;
            if (c1772730wER == null || (enumC1772960wEo = c1772730wER.LIZ) == null) {
                return;
            }
            int i = C1773000wEs.LIZ[enumC1772960wEo.ordinal()];
            if (i == 1) {
                this.LIZ.LIZIZ.LJIL = System.currentTimeMillis();
            } else if (i == 2) {
                this.LIZ.LIZIZ.LJIJJLI = System.currentTimeMillis();
            }
        }

        @Override // X.C18Z7
        public final void LIZIZ() throws JSONException {
            C1772650wEJ c1772650wEJLIZLLL;
            AbstractC1772270wDh abstractC1772270wDh;
            C18Z6 bodyList;
            InterfaceC1773310wFN interfaceC1773310wFN = this.LIZ.LIZ;
            if (interfaceC1773310wFN != null && (c1772650wEJLIZLLL = interfaceC1773310wFN.LIZLLL()) != null && (abstractC1772270wDh = c1772650wEJLIZLLL.LJ) != null && (bodyList = abstractC1772270wDh.getBodyList()) != null) {
                bodyList.setOnBodyDrawListener(null);
            }
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1772730wER c1772730wER = this.LIZ.LIZLLL;
            sbLIZ.append(c1772730wER != null ? c1772730wER.LIZ : null);
            sbLIZ.append(" do onDraw");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("ECMMKPageTrace", strLIZIZ);
            C1772740wES c1772740wES = this.LIZ;
            c1772740wES.LJ.remove(c1772740wES.LJII);
            C1772740wES c1772740wES2 = this.LIZ;
            c1772740wES2.LJFF.remove(c1772740wES2.LJII);
            this.LIZ.LJFF(true);
        }
    };
    public final BPEAHandler LJIIJJI = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS126S0100000_26 LJIILIIL = new ARunnableS126S0100000_26(this, 74);

    @Override // X.InterfaceC1774020wGW
    public final void LIZ() {
    }

    @Override // X.InterfaceC1774020wGW
    public final void LIZIZ(AbstractC1773210wFD abstractC1773210wFD) {
        EnumC1772960wEo enumC1772960wEo;
        C1772650wEJ c1772650wEJLIZLLL;
        AbstractC1772270wDh abstractC1772270wDh;
        C18Z6 bodyList;
        if (!C13LP.LJJJJ(abstractC1773210wFD, this.LJI)) {
            return;
        }
        InterfaceC1773310wFN interfaceC1773310wFN = this.LIZ;
        if (interfaceC1773310wFN != null && (c1772650wEJLIZLLL = interfaceC1773310wFN.LIZLLL()) != null && (abstractC1772270wDh = c1772650wEJLIZLLL.LJ) != null && (bodyList = abstractC1772270wDh.getBodyList()) != null) {
            bodyList.setOnBodyDrawListener(this.LJIIJ);
        }
        if (abstractC1773210wFD != null) {
            if ((!abstractC1773210wFD.LJIILIIL() && !abstractC1773210wFD.LJIIL()) || abstractC1773210wFD.LJIILIIL) {
                this.LJ.add(abstractC1773210wFD);
            }
            this.LJFF.add(abstractC1773210wFD);
            LJ(abstractC1773210wFD, EnumC1773010wEt.LL);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1772730wER c1772730wER = this.LIZLLL;
            if (c1772730wER != null) {
                enumC1772960wEo = c1772730wER.LIZ;
            } else {
                enumC1772960wEo = null;
            }
            sbLIZ.append(enumC1772960wEo);
            sbLIZ.append(" afterAddPendingItem: ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(", pagePendingRenderList: ");
            sbLIZ.append(this.LJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("ECMMKPageTrace", strLIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(boolean r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772740wES.LJFF(boolean):void");
    }

    public final boolean LJI(EnumC1772960wEo enumC1772960wEo) {
        Integer num = (Integer) this.LJIIIZ.getValue();
        if (num != null && num.intValue() == 1 && enumC1772960wEo == EnumC1772960wEo.CACHE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(boolean z) throws JSONException {
        EnumC1772960wEo enumC1772960wEo;
        EnumC1772960wEo enumC1772960wEo2;
        Object obj;
        Object obj2;
        Long l;
        String str;
        String str2;
        int i;
        AnonymousClass0317 anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin;
        boolean z2;
        C1772650wEJ c1772650wEJLIZLLL;
        boolean z3;
        String str3;
        AnonymousClass0317 anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin2;
        boolean z4;
        C1772650wEJ c1772650wEJLIZLLL2;
        boolean z5;
        C1508220pLo c1508220pLoLJIIJ;
        List<String> list;
        String str4;
        EnumC1772960wEo enumC1772960wEo3;
        this.LJIIJJI.removeCallbacks(this.LJIILIIL);
        if (this.LJIIIIZZ) {
            return;
        }
        C1772750wET c1772750wET = this.LIZIZ;
        c1772750wET.LJLZ = this.LJIIL;
        C1772730wER c1772730wER = this.LIZLLL;
        if (c1772730wER == null || (enumC1772960wEo = c1772730wER.LIZ) == null) {
            enumC1772960wEo = EnumC1772960wEo.OTHER;
        }
        int i2 = C1772980wEq.LIZ[enumC1772960wEo.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                c1772750wET.LJIIZILJ = System.currentTimeMillis();
            }
        } else {
            c1772750wET.LJIILIIL = System.currentTimeMillis();
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page render over!!!, type=");
        C1772730wER c1772730wER2 = this.LIZLLL;
        String str5 = null;
        if (c1772730wER2 != null) {
            enumC1772960wEo2 = c1772730wER2.LIZ;
        } else {
            enumC1772960wEo2 = null;
        }
        sbLIZ.append(enumC1772960wEo2);
        sbLIZ.append(", page render over, is success=");
        sbLIZ.append(z);
        sbLIZ.append(',');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("ECMMKPageTrace", strLIZIZ);
        if (z) {
            C1772730wER c1772730wER3 = this.LIZLLL;
            if (c1772730wER3 != null && (enumC1772960wEo3 = c1772730wER3.LIZ) != null) {
                i = C1772970wEp.LIZ[enumC1772960wEo3.ordinal()];
            } else {
                i = -1;
            }
            if (i != 1) {
                if (i == 2) {
                    C1772750wET c1772750wET2 = this.LIZIZ;
                    if (!c1772750wET2.LJLLJ) {
                        C1772760wEU.LIZLLL(C1772760wEU.LIZ, "rd_tiktokec_meaningful_rendered", EnumC1772960wEo.FETCH, c1772750wET2, null, null, 24);
                        this.LIZIZ.LJLLJ = true;
                    }
                    C1772760wEU c1772760wEU = C1772760wEU.LIZ;
                    EnumC1772960wEo enumC1772960wEo4 = EnumC1772960wEo.FETCH;
                    C1772750wET c1772750wET3 = this.LIZIZ;
                    String name = null;
                    C1772730wER c1772730wER4 = this.LIZLLL;
                    if (c1772730wER4 != null) {
                        str3 = c1772730wER4.LIZLLL;
                    } else {
                        str3 = null;
                    }
                    C1772760wEU.LIZLLL(c1772760wEU, "rd_tiktokec_page_update", enumC1772960wEo4, c1772750wET3, null, str3, 8);
                    InterfaceC1773310wFN interfaceC1773310wFN = this.LIZ;
                    if (interfaceC1773310wFN != null && (c1508220pLoLJIIJ = interfaceC1773310wFN.LJIIJ()) != null) {
                        C1508220pLo.LIZJ();
                        c1508220pLoLJIIJ.LIZJ = true;
                        EcomLoadRetreatConfigGlobalData ecomLoadRetreatConfigGlobalData = C1507840pLC.LIZ;
                        if (ecomLoadRetreatConfigGlobalData.enable && ecomLoadRetreatConfigGlobalData.debug && (list = ecomLoadRetreatConfigGlobalData.debugPageName) != null && list.contains("mall") && (str4 = C1507840pLC.LIZIZ().debugScene.get("mall")) != null) {
                            C2232408os c2232408os = C1507830pLB.LIZ;
                            C1507830pLB.LIZ(str4);
                        }
                    }
                    C08L6.LIZ.getClass();
                    C08L6.LIZIZ("mall");
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin2 = HomepageTabDependencyService.createIHomepageTabDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin2 != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        String name2 = IHomepageTabDependencyService.class.getName();
                        if (anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin2 != null) {
                            name = anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin2.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z5);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHomepageTabDependencyService.class);
                    }
                    IHomepageTabDependencyService iHomepageTabDependencyService = (IHomepageTabDependencyService) anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin2;
                    InterfaceC1773310wFN interfaceC1773310wFN2 = this.LIZ;
                    if (interfaceC1773310wFN2 != null && (c1772650wEJLIZLLL2 = interfaceC1773310wFN2.LIZLLL()) != null && c1772650wEJLIZLLL2.LIZ) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    iHomepageTabDependencyService.onFetchRefreshTrigger(z4);
                }
            } else {
                String name3 = null;
                str5 = null;
                C1772760wEU.LIZLLL(C1772760wEU.LIZ, "rd_tiktokec_meaningful_rendered", EnumC1772960wEo.CACHE, this.LIZIZ, null, null, 24);
                this.LIZIZ.LJLLJ = true;
                C08L6.LIZ.getClass();
                C08L6.LIZ("mall", "render_cache");
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin = HomepageTabDependencyService.createIHomepageTabDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name4 = IHomepageTabDependencyService.class.getName();
                    if (anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name3, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHomepageTabDependencyService.class);
                }
                IHomepageTabDependencyService iHomepageTabDependencyService2 = (IHomepageTabDependencyService) anonymousClass0317CreateIHomepageTabDependencyServicebyMonsterPlugin;
                InterfaceC1773310wFN interfaceC1773310wFN3 = this.LIZ;
                if (interfaceC1773310wFN3 != null && (c1772650wEJLIZLLL = interfaceC1773310wFN3.LIZLLL()) != null && c1772650wEJLIZLLL.LIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iHomepageTabDependencyService2.onCacheRefreshTrigger(z2);
            }
        }
        C1772730wER c1772730wER5 = this.LIZLLL;
        if (c1772730wER5 != null) {
            obj = c1772730wER5.LIZ;
        } else {
            obj = str5;
        }
        if (obj == EnumC1772960wEo.FETCH) {
            C1772750wET c1772750wET4 = this.LIZIZ;
            if (c1772730wER5 != null) {
                str2 = c1772730wER5.LIZLLL;
            } else {
                str2 = str5;
            }
            c1772750wET4.LIZIZ(str2, true, false);
        } else {
            if (c1772730wER5 != null) {
                obj2 = c1772730wER5.LIZ;
            } else {
                obj2 = str5;
            }
            if (obj2 == EnumC1772960wEo.CACHE) {
                this.LIZIZ.LIZIZ(str5, false, true);
            }
        }
        C1772730wER c1772730wER6 = this.LIZLLL;
        if (c1772730wER6 != null) {
            Long l2 = c1772730wER6.LJ;
            str = c1772730wER6.LIZLLL;
            l = l2;
        } else {
            l = str5;
            str = str5;
        }
        C1515950pYH c1515950pYHLIZIZ = C1515940pYG.LIZIZ(l, str);
        if (c1515950pYHLIZIZ != null) {
            c1515950pYHLIZIZ.LJIIIIZZ = System.currentTimeMillis();
            c1515950pYHLIZIZ.LJIIJJI = true;
            C1515940pYG.LIZJ(Long.valueOf(c1515950pYHLIZIZ.LIZ), str5);
        }
        this.LJIIIIZZ = true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0wGf] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0wEX] */
    public C1772740wES(ECMMKContainerController eCMMKContainerController, C1772750wET c1772750wET) {
        this.LIZ = eCMMKContainerController;
        this.LIZIZ = c1772750wET;
    }

    public static void LJII(Function0 function0, boolean z) {
        if (z) {
            if (((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIL()) {
                C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(function0, (Function0<Unit>) 111));
                return;
            } else {
                C1091940eWO.LIZIZ(0L, new RunnableC514801zW(function0, (Function0<Unit>) 112));
                return;
            }
        }
        function0.invoke();
    }

    @Override // X.InterfaceC1774020wGW
    public final void LIZJ(AbstractC1773210wFD abstractC1773210wFD, C1772820wEa c1772820wEa) throws JSONException {
        EnumC1772960wEo enumC1772960wEo;
        if (C13LP.LJJJJ(abstractC1773210wFD, this.LJI)) {
            if (!C13LP.LJJJJ(abstractC1773210wFD, this.LJ) && !C13LP.LJJJJ(abstractC1773210wFD, this.LJFF)) {
                return;
            }
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1772730wER c1772730wER = this.LIZLLL;
            EnumC1772960wEo enumC1772960wEo2 = null;
            if (c1772730wER != null) {
                enumC1772960wEo = c1772730wER.LIZ;
            } else {
                enumC1772960wEo = null;
            }
            sbLIZ.append(enumC1772960wEo);
            sbLIZ.append(" onItemRenderEnd: ");
            sbLIZ.append(abstractC1773210wFD);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("ECMMKPageTrace", strLIZIZ);
            C1772730wER c1772730wER2 = this.LIZLLL;
            if (c1772730wER2 != null) {
                enumC1772960wEo2 = c1772730wER2.LIZ;
            }
            if (enumC1772960wEo2 == EnumC1772960wEo.FETCH && c1772820wEa != null) {
                c1772820wEa.LJJIIZI = true;
            }
            if (abstractC1773210wFD == null) {
                return;
            }
            this.LJ.remove(abstractC1773210wFD);
            this.LJFF.remove(abstractC1773210wFD);
            LJ(abstractC1773210wFD, EnumC1773010wEt.LLILLJJLI);
            LJFF(false);
        }
    }

    @Override // X.InterfaceC1774020wGW
    public final void LIZLLL(AbstractC1773210wFD abstractC1773210wFD, String str) throws JSONException {
        EnumC1772960wEo enumC1772960wEo;
        EnumC1772960wEo enumC1772960wEo2;
        EnumC1772960wEo enumC1772960wEo3;
        List<InterfaceC1774020wGW> listLJI;
        EnumC1772960wEo enumC1772960wEo4;
        InterfaceC1773090wF1 interfaceC1773090wF1;
        if (C13LP.LJJJJ(abstractC1773210wFD, this.LJI)) {
            if (!C13LP.LJJJJ(abstractC1773210wFD, this.LJ) && !C13LP.LJJJJ(abstractC1773210wFD, this.LJFF)) {
                return;
            }
            this.LJFF.remove(abstractC1773210wFD);
            LJ(abstractC1773210wFD, EnumC1773010wEt.LLILLL);
            if (abstractC1773210wFD.LJIILIIL) {
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C1772730wER c1772730wER = this.LIZLLL;
                if (c1772730wER != null) {
                    enumC1772960wEo = c1772730wER.LIZ;
                } else {
                    enumC1772960wEo = null;
                }
                sbLIZ.append(enumC1772960wEo);
                sbLIZ.append(" onItemRenderError: ");
                sbLIZ.append(abstractC1773210wFD);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo.getClass();
                C599820Nfo.LIZ("ECMMKPageTrace", strLIZIZ);
                C1772730wER c1772730wER2 = this.LIZLLL;
                if (c1772730wER2 != null && (interfaceC1773090wF1 = this.LIZJ) != null) {
                    interfaceC1773090wF1.LIZIZ(c1772730wER2);
                }
                C1772750wET c1772750wET = this.LIZIZ;
                C1772730wER c1772730wER3 = this.LIZLLL;
                if (c1772730wER3 == null || (enumC1772960wEo2 = c1772730wER3.LIZ) == null) {
                    enumC1772960wEo2 = EnumC1772960wEo.OTHER;
                }
                c1772750wET.LIZ(enumC1772960wEo2);
                LJIIIIZZ(false);
                c599820Nfo.getClass();
                C599820Nfo.LIZ("requestChunk", "notifyPageLoadOver");
                InterfaceC1773090wF1 interfaceC1773090wF12 = this.LIZJ;
                if (interfaceC1773090wF12 != null) {
                    C1772730wER c1772730wER4 = this.LIZLLL;
                    if (c1772730wER4 == null || (enumC1772960wEo4 = c1772730wER4.LIZ) == null) {
                        enumC1772960wEo4 = EnumC1772960wEo.OTHER;
                    }
                    interfaceC1773090wF12.LIZJ(enumC1772960wEo4);
                }
                c599820Nfo.getClass();
                C599820Nfo.LIZ("ECMMKPageTrace", "unregister");
                InterfaceC1773310wFN interfaceC1773310wFN = this.LIZ;
                if (interfaceC1773310wFN != null && (listLJI = interfaceC1773310wFN.LJI()) != null) {
                    listLJI.remove(this);
                }
                InterfaceC1773090wF1 interfaceC1773090wF13 = this.LIZJ;
                if (interfaceC1773090wF13 != null) {
                    C1772730wER c1772730wER5 = this.LIZLLL;
                    if (c1772730wER5 == null || (enumC1772960wEo3 = c1772730wER5.LIZ) == null) {
                        enumC1772960wEo3 = EnumC1772960wEo.OTHER;
                    }
                    interfaceC1773090wF13.LIZLLL(enumC1772960wEo3, false);
                    return;
                }
                return;
            }
            LJFF(false);
        }
    }

    public final void LJ(AbstractC1773210wFD abstractC1773210wFD, EnumC1773010wEt enumC1773010wEt) {
        EnumC1772960wEo enumC1772960wEo;
        EnumC1772960wEo enumC1772960wEo2;
        EnumC1772960wEo enumC1772960wEo3;
        EnumC1772960wEo enumC1772960wEo4;
        EnumC1772960wEo enumC1772960wEo5;
        EnumC1772960wEo enumC1772960wEo6;
        EnumC1772960wEo enumC1772960wEo7;
        EnumC1772960wEo enumC1772960wEo8;
        EnumC1772960wEo enumC1772960wEo9;
        int iOrdinal = enumC1773010wEt.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (abstractC1773210wFD.LJIILIIL()) {
                        C1772730wER c1772730wER = this.LIZLLL;
                        if (c1772730wER != null && (enumC1772960wEo9 = c1772730wER.LIZ) != null) {
                            int i = C1772970wEp.LIZ[enumC1772960wEo9.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    this.LIZIZ.LJJLL++;
                                    return;
                                }
                                return;
                            }
                            this.LIZIZ.LJJLIIIJJI++;
                            return;
                        }
                        return;
                    }
                    if (abstractC1773210wFD.LJIIL()) {
                        C1772730wER c1772730wER2 = this.LIZLLL;
                        if (c1772730wER2 == null || (enumC1772960wEo8 = c1772730wER2.LIZ) == null) {
                            return;
                        }
                        int i2 = C1772970wEp.LIZ[enumC1772960wEo8.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return;
                            }
                            this.LIZIZ.LJJZZIII++;
                            return;
                        }
                        this.LIZIZ.LJJLIIIJLJLI++;
                        return;
                    }
                    C1772730wER c1772730wER3 = this.LIZLLL;
                    if (c1772730wER3 == null || (enumC1772960wEo7 = c1772730wER3.LIZ) == null) {
                        return;
                    }
                    int i3 = C1772970wEp.LIZ[enumC1772960wEo7.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            return;
                        }
                        this.LIZIZ.LJJLIL++;
                        return;
                    }
                    this.LIZIZ.LJJLIIIIJ++;
                    return;
                }
                throw new C1954807lC();
            }
            if (abstractC1773210wFD.LJIILIIL()) {
                C1772730wER c1772730wER4 = this.LIZLLL;
                if (c1772730wER4 == null || (enumC1772960wEo6 = c1772730wER4.LIZ) == null) {
                    return;
                }
                int i4 = C1772970wEp.LIZ[enumC1772960wEo6.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    }
                    this.LIZIZ.LJJLJLI++;
                    return;
                }
                this.LIZIZ.LJJLIIIJILLIZJL++;
                return;
            }
            if (abstractC1773210wFD.LJIIL()) {
                C1772730wER c1772730wER5 = this.LIZLLL;
                if (c1772730wER5 == null || (enumC1772960wEo5 = c1772730wER5.LIZ) == null) {
                    return;
                }
                int i5 = C1772970wEp.LIZ[enumC1772960wEo5.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        return;
                    }
                    this.LIZIZ.LJJZZI++;
                    return;
                }
                this.LIZIZ.LJJLIIIJL++;
                return;
            }
            C1772730wER c1772730wER6 = this.LIZLLL;
            if (c1772730wER6 == null || (enumC1772960wEo4 = c1772730wER6.LIZ) == null) {
                return;
            }
            int i6 = C1772970wEp.LIZ[enumC1772960wEo4.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    return;
                }
                this.LIZIZ.LJJLIIJ++;
                return;
            }
            this.LIZIZ.LJJLI++;
            return;
        }
        if (abstractC1773210wFD.LJIILIIL()) {
            C1772730wER c1772730wER7 = this.LIZLLL;
            if (c1772730wER7 == null || (enumC1772960wEo3 = c1772730wER7.LIZ) == null) {
                return;
            }
            int i7 = C1772970wEp.LIZ[enumC1772960wEo3.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                this.LIZIZ.LJJLJ++;
                return;
            }
            this.LIZIZ.LJJLIIIJ++;
            return;
        }
        if (abstractC1773210wFD.LJIIL()) {
            C1772730wER c1772730wER8 = this.LIZLLL;
            if (c1772730wER8 == null || (enumC1772960wEo2 = c1772730wER8.LIZ) == null) {
                return;
            }
            int i8 = C1772970wEp.LIZ[enumC1772960wEo2.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    return;
                }
                this.LIZIZ.LJJZ++;
                return;
            }
            this.LIZIZ.LJJLIIIJJIZ++;
            return;
        }
        C1772730wER c1772730wER9 = this.LIZLLL;
        if (c1772730wER9 == null || (enumC1772960wEo = c1772730wER9.LIZ) == null) {
            return;
        }
        int i9 = C1772970wEp.LIZ[enumC1772960wEo.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                return;
            }
            this.LIZIZ.LJJLIIIJLLLLLLLZ++;
            return;
        }
        this.LIZIZ.LJJL++;
    }
}
