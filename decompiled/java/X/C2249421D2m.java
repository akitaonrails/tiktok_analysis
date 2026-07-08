package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallDynamicBackgroundDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallDynamicBarStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallDynamicColorDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS149S1200000_35;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249421D2m extends AbstractC1771870wD3 {
    public ShopMallMixViewModel LLILLL;
    public InterfaceC21155217qY LLJIJIL;
    public C2249411D2l LLJILJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 210));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 211));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(359));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 457));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 213));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 208));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 209));
    public final C2249381D2i LLJILJILJ = new InterfaceC1773770wG7() { // from class: X.1D2i
        @Override // X.InterfaceC1773770wG7
        public final ECMixMallStyleDTO LIZ() {
            C2249371D2h c2249371D2h;
            C2249411D2l c2249411D2l = this.LIZ.LLJILJIL;
            return LJII((c2249411D2l == null || (c2249371D2h = c2249411D2l.LIZIZ) == null) ? null : c2249371D2h.LIZ);
        }

        @Override // X.InterfaceC1773770wG7
        public final ECMixMallStyleDTO LIZIZ() {
            C2249371D2h c2249371D2h;
            C2249411D2l c2249411D2l = this.LIZ.LLJILJIL;
            return LJII((c2249411D2l == null || (c2249371D2h = c2249411D2l.LIZIZ) == null) ? null : c2249371D2h.LIZJ);
        }

        @Override // X.InterfaceC1773770wG7
        public final ECMixMallStyleDTO LJFF() {
            C2249371D2h c2249371D2h;
            C2249411D2l c2249411D2l = this.LIZ.LLJILJIL;
            return LJII((c2249411D2l == null || (c2249371D2h = c2249411D2l.LIZIZ) == null) ? null : c2249371D2h.LIZIZ);
        }

        @Override // X.InterfaceC1773770wG7
        public final String LJI() {
            C2249411D2l c2249411D2l;
            if (this.LIZ.LJIJI().LIZ() && (c2249411D2l = this.LIZ.LLJILJIL) != null) {
                return c2249411D2l.LJ;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig>] */
        /* JADX WARN: Type inference failed for: r10v2, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v15, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v3, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig>] */
        @Override // X.InterfaceC1773770wG7
        public final void LIZLLL(C1772630wEH c1772630wEH) {
            boolean zLIZ;
            ECMixMallDynamicBackgroundDTO eCMixMallDynamicBackgroundDTO;
            boolean z;
            ?? arrayList;
            ?? arrayList2;
            AbstractC1777660wMO c1777640wMM;
            String string;
            String string2;
            ECMixMallDynamicBackgroundDTO eCMixMallDynamicBackgroundDTO2;
            List<ECMixMallDynamicBarStyleDTO> list;
            List<ECMixMallDynamicColorDTO> list2;
            ECMixMallDynamicBackgroundDTO eCMixMallDynamicBackgroundDTO3;
            C2249421D2m c2249421D2m = this.LIZ;
            c2249421D2m.getClass();
            C2249421D2m.LJIJJ(new AwS579S0100000_35(c1772630wEH, 206));
            C2249401D2k c2249401D2kLJIJI = c2249421D2m.LJIJI();
            Boolean bool = c2249401D2kLJIJI.LJI;
            if (c1772630wEH != null && (eCMixMallDynamicBackgroundDTO3 = c1772630wEH.LJIIJJI) != null) {
                zLIZ = eCMixMallDynamicBackgroundDTO3.LIZ();
            } else {
                zLIZ = false;
            }
            c2249401D2kLJIJI.LJI = Boolean.valueOf(zLIZ);
            c2249401D2kLJIJI.LIZ.getClass();
            if (c1772630wEH != null) {
                eCMixMallDynamicBackgroundDTO = c1772630wEH.LJIIJJI;
            } else {
                eCMixMallDynamicBackgroundDTO = null;
            }
            if (eCMixMallDynamicBackgroundDTO != null && eCMixMallDynamicBackgroundDTO.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (z && (list2 = eCMixMallDynamicBackgroundDTO.defaultColors) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (ECMixMallDynamicColorDTO eCMixMallDynamicColorDTO : list2) {
                    DynamicColorConfig dynamicColorConfig = new DynamicColorConfig();
                    dynamicColorConfig.type = eCMixMallDynamicColorDTO.type;
                    String str = eCMixMallDynamicColorDTO.activeType;
                    if (str == null) {
                        str = "always";
                    }
                    dynamicColorConfig.activeType = str;
                    dynamicColorConfig.color = eCMixMallDynamicColorDTO.color;
                    dynamicColorConfig.sectionId = eCMixMallDynamicColorDTO.sectionId;
                    dynamicColorConfig.itemId = eCMixMallDynamicColorDTO.itemId;
                    arrayList.add(dynamicColorConfig);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c2249401D2kLJIJI.LIZ.getClass();
            String strLIZIZ = C2249331D2d.LIZIZ(arrayList);
            if (strLIZIZ != null) {
                Function1<String, Unit> function1 = c2249401D2kLJIJI.LIZIZ;
                if (function1 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateDefaultDynamicColorConfigs ignored invalid config: ");
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(", currentDefaultSize=");
                    sbLIZ.append(c2249401D2kLJIJI.LIZJ.size());
                    function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                c2249401D2kLJIJI.LIZJ = arrayList;
            }
            c2249401D2kLJIJI.LIZ.getClass();
            if (c1772630wEH != null && (eCMixMallDynamicBackgroundDTO2 = c1772630wEH.LJIIJJI) != null && eCMixMallDynamicBackgroundDTO2.LIZ() && (list = eCMixMallDynamicBackgroundDTO2.defaultBarStyles) != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (ECMixMallDynamicBarStyleDTO eCMixMallDynamicBarStyleDTO : list) {
                    DynamicBarStyleConfig dynamicBarStyleConfig = new DynamicBarStyleConfig();
                    dynamicBarStyleConfig.target = eCMixMallDynamicBarStyleDTO.target;
                    String str2 = eCMixMallDynamicBarStyleDTO.activeType;
                    if (str2 == null) {
                        str2 = "always";
                    }
                    dynamicBarStyleConfig.activeType = str2;
                    dynamicBarStyleConfig.style = eCMixMallDynamicBarStyleDTO.style;
                    arrayList2.add(dynamicBarStyleConfig);
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            c2249401D2kLJIJI.LIZ.getClass();
            String strLIZ = C2249331D2d.LIZ(arrayList2);
            if (strLIZ != null) {
                Function1<String, Unit> function12 = c2249401D2kLJIJI.LIZIZ;
                if (function12 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateDefaultDynamicBarStyleConfigs ignored invalid config: ");
                    sbLIZ2.append(strLIZ);
                    sbLIZ2.append(", currentDefaultSize=");
                    sbLIZ2.append(c2249401D2kLJIJI.LIZLLL.size());
                    function12.invoke(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                c2249401D2kLJIJI.LIZLLL = arrayList2;
            }
            if (zLIZ) {
                c1777640wMM = new C1777630wML();
            } else if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                C13BV c13bv = C13BV.INSTANCE;
                c2249401D2kLJIJI.LIZJ = c13bv;
                c2249401D2kLJIJI.LIZLLL = c13bv;
                c2249401D2kLJIJI.LJ = null;
                c2249401D2kLJIJI.LJFF = null;
                Function1<String, Unit> function13 = c2249401D2kLJIJI.LIZIZ;
                if (function13 != null) {
                    function13.invoke("clearDynamicConfigs success");
                }
                c1777640wMM = new C1777650wMN();
            } else {
                c1777640wMM = new C1777640wMM("pageDataUpdateDisabled skipped: previous switch is not enabled");
            }
            Function1<String, Unit> function14 = c2249401D2kLJIJI.LIZIZ;
            if (function14 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateFromPage, previousEnabled=");
                sbLIZ3.append(bool);
                sbLIZ3.append(", currentEnabled=");
                sbLIZ3.append(zLIZ);
                sbLIZ3.append(", defaultColorSize=");
                sbLIZ3.append(c2249401D2kLJIJI.LIZJ.size());
                sbLIZ3.append(", dynamicColorSize=");
                List<DynamicColorConfig> list3 = c2249401D2kLJIJI.LJ;
                String str3 = "null";
                if (list3 == null || (string = Integer.valueOf(list3.size()).toString()) == null) {
                    string = "null";
                }
                sbLIZ3.append(string);
                sbLIZ3.append(", effectiveColorSize=");
                List<DynamicColorConfig> list4 = c2249401D2kLJIJI.LJ;
                if (list4 == null) {
                    list4 = c2249401D2kLJIJI.LIZJ;
                }
                sbLIZ3.append(list4.size());
                sbLIZ3.append(", defaultBarSize=");
                sbLIZ3.append(c2249401D2kLJIJI.LIZLLL.size());
                sbLIZ3.append(", dynamicBarSize=");
                List<DynamicBarStyleConfig> list5 = c2249401D2kLJIJI.LJFF;
                if (list5 != null && (string2 = Integer.valueOf(list5.size()).toString()) != null) {
                    str3 = string2;
                }
                sbLIZ3.append(str3);
                sbLIZ3.append(", effectiveBarSize=");
                List<DynamicBarStyleConfig> list6 = c2249401D2kLJIJI.LJFF;
                if (list6 == null) {
                    list6 = c2249401D2kLJIJI.LIZLLL;
                }
                sbLIZ3.append(list6.size());
                function14.invoke(C2188811AlT.LIZIZ(sbLIZ3));
            }
            c2249421D2m.LJIILIIL(c1777640wMM);
        }

        public final ECMixMallStyleDTO LJII(DynamicColorConfig dynamicColorConfig) {
            if (!this.LIZ.LJIJI().LIZ() || dynamicColorConfig == null) {
                return null;
            }
            return new ECMixMallStyleDTO(0, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, dynamicColorConfig.color, null, null);
        }

        @Override // X.InterfaceC1773770wG7
        public final void LIZJ(AbstractC1773210wFD abstractC1773210wFD, View view) {
            C2249371D2h c2249371D2h;
            Map<String, DynamicColorConfig> map;
            DynamicColorConfig dynamicColorConfig;
            if (!this.LIZ.LJIJI().LIZ()) {
                this.LIZ.LJIILLIIL().LIZLLL.getClass();
                C2249441D2o.LJFF(view);
                return;
            }
            C2249411D2l c2249411D2l = this.LIZ.LLJILJIL;
            if (c2249411D2l != null && (c2249371D2h = c2249411D2l.LIZIZ) != null && (map = c2249371D2h.LIZLLL) != null && (dynamicColorConfig = map.get(abstractC1773210wFD.LJIIIZ())) != null) {
                this.LIZ.LJIILLIIL().LIZLLL.LIZLLL(view, dynamicColorConfig);
            } else {
                this.LIZ.LJIILLIIL().LIZLLL.getClass();
                C2249441D2o.LJFF(view);
            }
        }

        @Override // X.InterfaceC1773770wG7
        public final Map LJ(C1773330wFP c1773330wFP, Map map) {
            Map mapLIZJ;
            if (Intrinsics.LJFF(c1773330wFP.LIZ, "header") || Intrinsics.LJFF(c1773330wFP.LIZ, "search_bar")) {
                if (!this.LIZ.LJIJI().LIZ()) {
                    this.LIZ.LJIJ().getClass();
                    mapLIZJ = C2249431D2n.LIZJ("", "");
                } else {
                    C2249421D2m c2249421D2m = this.LIZ;
                    C2249411D2l c2249411D2l = c2249421D2m.LLJILJIL;
                    if (c2249411D2l == null) {
                        C2249421D2m.LJIJJ(new AwS433S0200000_32(c1773330wFP, c2249421D2m, 42));
                        return map;
                    }
                    C2249431D2n c2249431D2nLJIJ = c2249421D2m.LJIJ();
                    String str = c2249411D2l.LJFF;
                    String str2 = c2249411D2l.LJI;
                    c2249431D2nLJIJ.getClass();
                    mapLIZJ = C2249431D2n.LIZJ(str, str2);
                }
                if (mapLIZJ != null) {
                    if (map != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.putAll(mapLIZJ);
                        return linkedHashMap;
                    }
                    return mapLIZJ;
                }
            }
            return map;
        }
    };
    public final C2249391D2j LLJILLL = new InterfaceC1768080w6w() { // from class: X.1D2j
        @Override // X.InterfaceC1768080w6w
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1768080w6w
        public final void LJ(int i) {
        }

        @Override // X.InterfaceC1768080w6w
        public final void LJI() {
        }

        @Override // X.InterfaceC1768080w6w
        public final void LJIIJ(boolean z) {
        }

        @Override // X.InterfaceC1768080w6w
        public final void LIZ(boolean z) {
            C2249421D2m c2249421D2m;
            C2249411D2l c2249411D2l;
            if (z && !C1767800w6U.LJ() && this.LL.LJIJI().LIZ() && (c2249411D2l = (c2249421D2m = this.LL).LLJILJIL) != null) {
                C2249431D2n c2249431D2nLJIJ = c2249421D2m.LJIJ();
                c2249431D2nLJIJ.getClass();
                String str = c2249411D2l.LJ;
                if (str == null) {
                    c2249431D2nLJIJ.LIZLLL(c2249431D2nLJIJ.LIZJ.invoke());
                } else {
                    c2249431D2nLJIJ.LIZLLL(str);
                }
            }
        }

        @Override // X.InterfaceC1768080w6w
        public final void LJIIIIZZ(int i, boolean z) {
            AbstractC1777660wMO c1777640wMM;
            C2249421D2m c2249421D2m = this.LL;
            C020T c020t = new C020T(z, 0);
            c2249421D2m.getClass();
            C2249421D2m.LJIJJ(c020t);
            C2249421D2m c2249421D2m2 = this.LL;
            C2249401D2k c2249401D2kLJIJI = c2249421D2m2.LJIJI();
            c2249401D2kLJIJI.LJII = z;
            if (c2249401D2kLJIJI.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stickyChanged(isSticky=");
                sbLIZ.append(z);
                sbLIZ.append(')');
                c1777640wMM = new C1777670wMP(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                c1777640wMM = new C1777640wMM("stickyChanged skipped: dynamic_background is disabled");
            }
            c2249421D2m2.LJIILIIL(c1777640wMM);
        }
    };

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LJIJJ(AFwS226S0000000_35.get$arr$(358));
        Object obj = LIZIZ().LIZLLL().LJIIIZ.get("shop_mix_mall_vm");
        this.LLILLL = obj instanceof ShopMallMixViewModel ? (ShopMallMixViewModel) obj : null;
        LIZIZ().LJIIJJI(this.LLJILJILJ);
        InterfaceC606320NqI eventCenter = LIZIZ().getEventCenter();
        final C212390189s c212390189s = (C212390189s) this.LLIZ.getValue();
        final AwS614S0100000_35 awS614S0100000_35 = new AwS614S0100000_35(this, 128);
        c212390189s.getClass();
        eventCenter.LJFF("ecMixMallUpdateDynamicColor", new InterfaceC1775150wIL() { // from class: X.189r
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                List list;
                Object c098200Yq;
                Function1<String, Unit> function1;
                Object c098200Yq2;
                Function1<String, Unit> function12;
                boolean zContainsKey = map.containsKey("dynamic_colors");
                boolean zContainsKey2 = map.containsKey("dynamic_bar_styles");
                List list2 = null;
                if (!zContainsKey && !zContainsKey2) {
                    c21175917tt.LIZ(0, "dynamic_colors or dynamic_bar_styles is required", null);
                    return;
                }
                if (!c212390189s.LIZIZ.invoke().booleanValue()) {
                    Function1<String, Unit> function13 = c212390189s.LIZJ;
                    if (function13 != null) {
                        function13.invoke("ecMixMallUpdateDynamicColor but dynamic_background is disable");
                    }
                    c21175917tt.LIZ(0, "dynamic_background is disabled", null);
                    return;
                }
                if (zContainsKey) {
                    C2249331D2d c2249331D2d = c212390189s.LIZ;
                    Object obj2 = map.get("dynamic_colors");
                    c2249331D2d.getClass();
                    if (obj2 != null) {
                        try {
                            if (obj2 instanceof String) {
                                c098200Yq2 = (List) ECMixMallItemDTO.LIZIZ.LJIIIIZZ((String) obj2, c2249331D2d.LIZIZ);
                            } else {
                                Gson gson = ECMixMallItemDTO.LIZIZ;
                                c098200Yq2 = (List) gson.LIZLLL(gson.LJIJJLI(obj2), c2249331D2d.LIZIZ);
                            }
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                        if (thM5exceptionOrNullimpl != null && (function12 = c2249331D2d.LIZ) != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("parseDynamicColorConfigs failed, error=");
                            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                            function12.invoke(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        list = (List) c098200Yq2;
                        if (list != null) {
                            c212390189s.LIZ.getClass();
                            String strLIZIZ = C2249331D2d.LIZIZ(list);
                            if (strLIZIZ != null) {
                                c21175917tt.LIZ(0, strLIZIZ, null);
                                return;
                            }
                        }
                    }
                    c21175917tt.LIZ(0, "dynamic_colors is invalid", null);
                    return;
                }
                list = null;
                if (zContainsKey2) {
                    C2249331D2d c2249331D2d2 = c212390189s.LIZ;
                    Object obj3 = map.get("dynamic_bar_styles");
                    c2249331D2d2.getClass();
                    if (obj3 != null) {
                        try {
                            if (obj3 instanceof String) {
                                c098200Yq = (List) ECMixMallItemDTO.LIZIZ.LJIIIIZZ((String) obj3, c2249331D2d2.LIZJ);
                            } else {
                                Gson gson2 = ECMixMallItemDTO.LIZIZ;
                                c098200Yq = (List) gson2.LIZLLL(gson2.LJIJJLI(obj3), c2249331D2d2.LIZJ);
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl2 != null && (function1 = c2249331D2d2.LIZ) != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("parseDynamicBarStyleConfigs failed, error=");
                            sbLIZ2.append(thM5exceptionOrNullimpl2.getMessage());
                            function1.invoke(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        List list3 = (List) c098200Yq;
                        if (list3 != null) {
                            c212390189s.LIZ.getClass();
                            String strLIZ = C2249331D2d.LIZ(list3);
                            if (strLIZ != null) {
                                c21175917tt.LIZ(0, strLIZ, null);
                                return;
                            }
                            list2 = list3;
                        }
                    }
                    c21175917tt.LIZ(0, "dynamic_bar_styles is invalid", null);
                    return;
                }
                awS614S0100000_35.invoke(new C1154160g8k(list, list2));
                c21175917tt.LIZ(1, "success", null);
            }
        });
        C2252408s6.LJIIIIZZ(new AwS579S0100000_35(this, 212));
    }

    public final C2249451D2p LJIILLIIL() {
        return (C2249451D2p) this.LLJ.getValue();
    }

    public final C2249431D2n LJIJ() {
        return (C2249431D2n) this.LLJI.getValue();
    }

    public final C2249401D2k LJIJI() {
        return (C2249401D2k) this.LLILZIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2249411D2l LJIJJLI() {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2249421D2m.LJIJJLI():X.1D2l");
    }

    public final void LJJ() {
        InterfaceC21155217qY interfaceC21155217qY;
        if (this.LLJIJIL != null) {
            return;
        }
        InterfaceC1768150w73 service = LIZIZ().LIZJ().getService(InterfaceC1774150wGj.class);
        if (!(service instanceof InterfaceC21155217qY) || (interfaceC21155217qY = (InterfaceC21155217qY) service) == null) {
            LJIJJ(AFwS223S0000000_32.get$arr$(139));
            return;
        }
        this.LLJIJIL = interfaceC21155217qY;
        interfaceC21155217qY.L4(this.LLJILLL);
        LJIJJ(new AwS576S0100000_32(this, 459));
    }

    @Override // X.AbstractC1771860wD2
    public final void LJI() {
        C2249461D2q c2249461D2q = LJIILLIIL().LJ;
        ValueAnimator valueAnimator = c2249461D2q.LJFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c2249461D2q.LJFF = null;
        InterfaceC21155217qY interfaceC21155217qY = this.LLJIJIL;
        if (interfaceC21155217qY != null) {
            interfaceC21155217qY.M4(this.LLJILLL);
        }
        this.LLJIJIL = null;
        C2249401D2k c2249401D2kLJIJI = LJIJI();
        c2249401D2kLJIJI.LJI = null;
        c2249401D2kLJIJI.LJII = false;
        this.LLJILJIL = null;
        C2249431D2n c2249431D2nLJIJ = LJIJ();
        c2249431D2nLJIJ.LIZLLL(c2249431D2nLJIJ.LIZJ.invoke());
        LJIJ().LIZIZ("", "");
        if (LIZIZ().LJ() == this.LLJILJILJ) {
            LIZIZ().LJIIJJI(null);
        }
    }

    @Override // X.AbstractC1771860wD2
    public final void LJIIJJI() {
        LJJ();
    }

    public static void LJIJJ(Function0 function0) {
        new AwS576S0100000_32(function0, 458);
        C034X.LIZIZ();
    }

    public final void LJIILIIL(AbstractC1777660wMO abstractC1777660wMO) {
        if (abstractC1777660wMO instanceof C1777630wML) {
            C2249411D2l c2249411D2lLJIJJLI = LJIJJLI();
            C1777630wML c1777630wML = (C1777630wML) abstractC1777660wMO;
            LJIJJ(new AwS149S1200000_35(c1777630wML.LIZ, this, c2249411D2lLJIJJLI, 0));
            LJIILLIIL().LJFF = c2249411D2lLJIJJLI.LIZIZ;
            LJIJ().LIZ(c2249411D2lLJIJJLI, c1777630wML.LIZ);
            return;
        }
        if (abstractC1777660wMO instanceof C1777670wMP) {
            C1777670wMP c1777670wMP = (C1777670wMP) abstractC1777660wMO;
            LJIL(LJIJJLI(), c1777670wMP.LIZ, c1777670wMP.LIZIZ);
            return;
        }
        if (abstractC1777660wMO instanceof C1777650wMN) {
            C2249411D2l c2249411D2lLJIJJLI2 = LJIJJLI();
            C2249461D2q c2249461D2q = LJIILLIIL().LJ;
            ValueAnimator valueAnimator = c2249461D2q.LJFF;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c2249461D2q.LJFF = null;
            C1777650wMN c1777650wMN = (C1777650wMN) abstractC1777660wMO;
            LJIL(c2249411D2lLJIJJLI2, c1777650wMN.LIZ, c1777650wMN.LIZIZ);
            this.LLJILJIL = null;
            return;
        }
        if (abstractC1777660wMO instanceof C1777640wMM) {
            LJIJJ(new AwS579S0100000_35(abstractC1777660wMO, 207));
            return;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0498 A[LOOP:3: B:165:0x0491->B:167:0x0498, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x050f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.C2249411D2l r33, boolean r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 1528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2249421D2m.LJIL(X.1D2l, boolean, java.lang.String):void");
    }
}
