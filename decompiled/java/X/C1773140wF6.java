package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabBarCardItem;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.list.ECMixMallListDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.section.ECMixMallSectionDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.tab.ECMixMallMultiTabDTO;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773140wF6 {
    public C1771590wCb LIZ;
    public ECMixMallPageDTO LIZIZ;
    public final Map<String, InterfaceC1773660wFw<Object, AbstractC1773210wFD>> LIZJ;
    public final C1773240wFG LIZLLL;
    public final C1773260wFI LJ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0wFG] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0wFI] */
    public C1773140wF6(Map<String, ? extends InterfaceC1773660wFw<Object, AbstractC1773210wFD>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("feed_tab_bar", new InterfaceC1773660wFw<TabBarCardItem, C1774040wGY>() { // from class: X.0wG6
            public final Class<TabBarCardItem> LIZ = TabBarCardItem.class;

            @Override // X.InterfaceC1773660wFw
            public final String getType() {
                return "feed_tab_bar";
            }

            @Override // X.InterfaceC1773660wFw
            public final Class<TabBarCardItem> LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1773660wFw
            public final AbstractC1773210wFD LIZ(AbstractC1773210wFD abstractC1773210wFD) {
                return abstractC1773210wFD;
            }

            @Override // X.InterfaceC1773660wFw
            public final AbstractC1773210wFD LIZJ(TabBarCardItem tabBarCardItem, C1773140wF6 c1773140wF6) {
                return new C1774040wGY(tabBarCardItem);
            }
        });
        linkedHashMap.put("feed_tab_content", new InterfaceC1773660wFw<ECMixMallMultiTabDTO, C1773710wG1>() { // from class: X.0wFR
            public final Class<ECMixMallMultiTabDTO> LIZ = ECMixMallMultiTabDTO.class;

            @Override // X.InterfaceC1773660wFw
            public final String getType() {
                return "feed_tab_content";
            }

            @Override // X.InterfaceC1773660wFw
            public final Class<ECMixMallMultiTabDTO> LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1773660wFw
            public final AbstractC1773210wFD LIZ(AbstractC1773210wFD abstractC1773210wFD) {
                return abstractC1773210wFD;
            }

            @Override // X.InterfaceC1773660wFw
            public final AbstractC1773210wFD LIZJ(ECMixMallMultiTabDTO eCMixMallMultiTabDTO, C1773140wF6 c1773140wF6) {
                ECMixMallMultiTabDTO eCMixMallMultiTabDTO2 = eCMixMallMultiTabDTO;
                if (eCMixMallMultiTabDTO2 != null) {
                    List<C1774160wGk> list = eCMixMallMultiTabDTO2.tabLists;
                    int i = 0;
                    if (list != null && !list.isEmpty()) {
                        C1773710wG1 c1773710wG1 = new C1773710wG1();
                        c1773710wG1.LJJ = eCMixMallMultiTabDTO2.defaultIndex;
                        c1773710wG1.LJJIIJ = eCMixMallMultiTabDTO2.bgColor;
                        for (C1774160wGk c1774160wGk : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                C1772690wEN c1772690wENLJ = c1773140wF6.LJ(c1774160wGk);
                                if (c1772690wENLJ != null) {
                                    c1773710wG1.LJJIII.add(c1772690wENLJ);
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        return c1773710wG1;
                    }
                }
                return null;
            }
        });
        linkedHashMap.putAll(map);
        this.LIZJ = linkedHashMap;
        this.LIZLLL = new InterfaceC1773660wFw<Map<String, ? extends Object>, C1773330wFP>() { // from class: X.0wFG
            public final Class<Map<String, Object>> LIZ = Map.class;

            @Override // X.InterfaceC1773660wFw
            public final String getType() {
                return "lynx_item";
            }

            @Override // X.InterfaceC1773660wFw
            public final Class<Map<String, ? extends Object>> LIZIZ() {
                return this.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0072 -> B:30:0x006f). Please report as a decompilation issue!!! */
            @Override // X.InterfaceC1773660wFw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC1773210wFD LIZ(X.AbstractC1773210wFD r4) {
                /*
                    r3 = this;
                    X.0wFP r4 = (X.C1773330wFP) r4
                    com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO r0 = r4.LJIIIZ     // Catch: java.lang.Exception -> L63
                    if (r0 == 0) goto L5a
                    com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoLynxDTO r0 = r0.lynx     // Catch: java.lang.Exception -> L63
                    if (r0 == 0) goto L5a
                    java.lang.String r0 = r0.schema     // Catch: java.lang.Exception -> L63
                    if (r0 == 0) goto L5a
                    android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L63
                    java.lang.String r0 = "url"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L63
                    if (r0 != 0) goto L23
                    java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Exception -> L63
                    if (r0 == 0) goto L72
                    int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L63
                    goto L6f
                L23:
                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L63
                    java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> L63
                    if (r2 != 0) goto L36
                    java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Exception -> L63
                    if (r0 == 0) goto L72
                    int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L63
                    goto L6f
                L36:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L63
                    r0 = 91
                    r1.append(r0)     // Catch: java.lang.Exception -> L63
                    r1.append(r2)     // Catch: java.lang.Exception -> L63
                    java.lang.String r0 = "]_["
                    r1.append(r0)     // Catch: java.lang.Exception -> L63
                    java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Exception -> L63
                    r1.append(r0)     // Catch: java.lang.Exception -> L63
                    r0 = 93
                    r1.append(r0)     // Catch: java.lang.Exception -> L63
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L63
                    int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L63
                    goto L6f
                L5a:
                    java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Exception -> L63
                    if (r0 == 0) goto L72
                    int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L63
                    goto L6f
                L63:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.String r0 = r4.LIZJ
                    if (r0 == 0) goto L72
                    int r0 = r0.hashCode()
                L6f:
                    r4.LJJI = r0
                    return r4
                L72:
                    r0 = 0
                    goto L6f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1773240wFG.LIZ(X.0wFD):X.0wFD");
            }

            @Override // X.InterfaceC1773660wFw
            public final AbstractC1773210wFD LIZJ(Map<String, ? extends Object> map2, C1773140wF6 c1773140wF6) {
                Map<String, ? extends Object> mapLJ = map2;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                return new C1773330wFP(mapLJ);
            }
        };
        this.LJ = new InterfaceC1773660wFw<Map<String, ? extends Object>, C1773340wFQ>() { // from class: X.0wFI
            public final Class<Map<String, Object>> LIZ = Map.class;

            @Override // X.InterfaceC1773660wFw
            public final String getType() {
                return "feed_recommend_product_card";
            }

            @Override // X.InterfaceC1773660wFw
            public final Class<Map<String, ? extends Object>> LIZIZ() {
                return this.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:25:0x005a). Please report as a decompilation issue!!! */
            @Override // X.InterfaceC1773660wFw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC1773210wFD LIZ(X.AbstractC1773210wFD r4) {
                /*
                    r3 = this;
                    X.0wFQ r4 = (X.C1773340wFQ) r4
                    com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO r0 = r4.LJIIIZ     // Catch: java.lang.Exception -> L4e
                    if (r0 == 0) goto L45
                    com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoGecCardDTO r0 = r0.gecCard     // Catch: java.lang.Exception -> L4e
                    if (r0 == 0) goto L45
                    java.lang.String r0 = r0.schema     // Catch: java.lang.Exception -> L4e
                    if (r0 == 0) goto L45
                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L4e
                    java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> L4e
                    if (r2 != 0) goto L21
                    java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Exception -> L4e
                    if (r0 == 0) goto L5d
                    int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L4e
                    goto L5a
                L21:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L4e
                    r0 = 91
                    r1.append(r0)     // Catch: java.lang.Exception -> L4e
                    r1.append(r2)     // Catch: java.lang.Exception -> L4e
                    java.lang.String r0 = "]_["
                    r1.append(r0)     // Catch: java.lang.Exception -> L4e
                    java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Exception -> L4e
                    r1.append(r0)     // Catch: java.lang.Exception -> L4e
                    r0 = 93
                    r1.append(r0)     // Catch: java.lang.Exception -> L4e
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L4e
                    int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L4e
                    goto L5a
                L45:
                    java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Exception -> L4e
                    if (r0 == 0) goto L5d
                    int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L4e
                    goto L5a
                L4e:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.String r0 = r4.LIZJ
                    if (r0 == 0) goto L5d
                    int r0 = r0.hashCode()
                L5a:
                    r4.LJJI = r0
                    return r4
                L5d:
                    r0 = 0
                    goto L5a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1773260wFI.LIZ(X.0wFD):X.0wFD");
            }

            @Override // X.InterfaceC1773660wFw
            public final AbstractC1773210wFD LIZJ(Map<String, ? extends Object> map2, C1773140wF6 c1773140wF6) {
                Map<String, ? extends Object> mapLJ = map2;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                return new C1773340wFQ(mapLJ);
            }
        };
    }

    public static ECMixMallPageDTO LIZJ(Object obj) {
        if (obj instanceof ECMixMallPageDTO) {
            return (ECMixMallPageDTO) obj;
        }
        if ((obj instanceof String) && !TextUtils.isEmpty((CharSequence) obj)) {
            return (ECMixMallPageDTO) GsonProtectorUtils.fromJson(ECMixMallItemDTO.LIZIZ, (String) obj, ECMixMallPageDTO.class);
        }
        if (obj instanceof n) {
            return (ECMixMallPageDTO) GsonProtectorUtils.fromJson(ECMixMallItemDTO.LIZIZ, (k) obj, ECMixMallPageDTO.class);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1773210wFD LIZLLL(com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO r9) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773140wF6.LIZLLL(com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO):X.0wFD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.util.List<? extends X.0wG8>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    public final C1772690wEN LJ(ECMixMallListDTO eCMixMallListDTO) {
        ?? arrayList;
        String str;
        if (eCMixMallListDTO != null) {
            C1772690wEN c1772690wEN = new C1772690wEN();
            ECMixMallStyleDTO eCMixMallStyleDTO = eCMixMallListDTO.style;
            if (eCMixMallStyleDTO != null) {
                eCMixMallStyleDTO.LIZ();
            } else {
                eCMixMallStyleDTO = null;
            }
            c1772690wEN.LIZ = eCMixMallStyleDTO;
            List<ECMixMallSectionDTO> list = eCMixMallListDTO.sections;
            if (list == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                Iterator<ECMixMallSectionDTO> it2 = list.iterator();
                while (it2.hasNext()) {
                    C1773780wG8 c1773780wG8LJI = LJI(it2.next());
                    if (c1773780wG8LJI != null) {
                        arrayList.add(c1773780wG8LJI);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1773780wG8 c1773780wG8 : arrayList) {
                for (AbstractC1773210wFD abstractC1773210wFD : c1773780wG8.LIZLLL) {
                    C1775180wIO c1775180wIO = abstractC1773210wFD.LJII.LIZIZ;
                    c1775180wIO.LIZ = c1772690wEN;
                    c1775180wIO.LIZIZ = abstractC1773210wFD;
                    C1771590wCb c1771590wCb = this.LIZ;
                    if (c1771590wCb != null) {
                        str = c1771590wCb.LJFF;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "prefetch_cache")) {
                        abstractC1773210wFD.LJII.LIZIZ.LIZJ = "1";
                    }
                }
                C19719612Di.LJJI(c1773780wG8.LIZLLL, arrayList2);
            }
            c1772690wEN.LIZJ = arrayList2;
            c1772690wEN.LIZLLL = eCMixMallListDTO.id;
            c1772690wEN.LJ = eCMixMallListDTO.hasMore;
            c1772690wEN.LJFF = eCMixMallListDTO.cursor;
            c1772690wEN.LJIIIIZZ = eCMixMallListDTO.sessionId;
            c1772690wEN.LJIIIZ = eCMixMallListDTO.impressionInfo;
            c1772690wEN.LIZIZ = arrayList;
            return c1772690wEN;
        }
        throw new IllegalArgumentException() { // from class: X.0wGb
        };
    }

    public final C1773780wG8 LJI(ECMixMallSectionDTO eCMixMallSectionDTO) {
        ArrayList arrayList;
        int i;
        ECMixMallStyleDTO eCMixMallStyleDTO = null;
        if (eCMixMallSectionDTO != null && eCMixMallSectionDTO.id != null) {
            C1773780wG8 c1773780wG8 = new C1773780wG8();
            c1773780wG8.LIZ = eCMixMallSectionDTO.id;
            ECMixMallStyleDTO eCMixMallStyleDTO2 = eCMixMallSectionDTO.style;
            if (eCMixMallStyleDTO2 != null) {
                eCMixMallStyleDTO2.LIZ();
                eCMixMallStyleDTO = eCMixMallStyleDTO2;
            }
            c1773780wG8.LIZIZ = eCMixMallStyleDTO;
            c1773780wG8.LIZJ = eCMixMallSectionDTO.padStyles;
            ArrayList<ECMixMallItemDTO> arrayList2 = eCMixMallSectionDTO.items;
            if (arrayList2 == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) C13LP.LJJJJLI(arrayList2)).iterator();
                while (it2.hasNext()) {
                    AbstractC1773210wFD abstractC1773210wFDLIZLLL = LIZLLL((ECMixMallItemDTO) it2.next());
                    if (abstractC1773210wFDLIZLLL != null) {
                        abstractC1773210wFDLIZLLL.LJIILLIIL(eCMixMallSectionDTO.id);
                        ECMixMallStyleDTO eCMixMallStyleDTO3 = eCMixMallSectionDTO.style;
                        abstractC1773210wFDLIZLLL.LJFF = eCMixMallStyleDTO3;
                        boolean z = true;
                        if (eCMixMallStyleDTO3 != null) {
                            i = eCMixMallStyleDTO3.column;
                        } else {
                            i = 1;
                        }
                        abstractC1773210wFDLIZLLL.LJIILJJIL(i);
                        ECMixMallStyleDTO eCMixMallStyleDTO4 = eCMixMallSectionDTO.style;
                        if (eCMixMallStyleDTO4 == null || eCMixMallStyleDTO4.layout != EnumC039800Ce.STICKY.getCode()) {
                            z = false;
                        }
                        abstractC1773210wFDLIZLLL.LJIIJJI = z;
                        arrayList.add(abstractC1773210wFDLIZLLL);
                    }
                }
            }
            c1773780wG8.LIZLLL = arrayList;
            return c1773780wG8;
        }
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZIZ();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1772630wEH LJFF(com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO r8, X.EnumC1771830wCz r9) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773140wF6.LJFF(com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO, X.0wCz):X.0wEH");
    }

    public final synchronized AbstractC1771170wBv LIZ(Object obj, Response<n> response, C1771590wCb c1771590wCb, EnumC1771830wCz enumC1771830wCz) {
        Object c098200Yq;
        IECommerceHostService iECommerceHostService;
        List<? extends AbstractC1773210wFD> list;
        boolean z;
        String name;
        String message = "";
        if (obj != null) {
            try {
                this.LIZ = c1771590wCb;
                ECMixMallPageDTO eCMixMallPageDTOLIZJ = LIZJ(obj);
                this.LIZIZ = eCMixMallPageDTOLIZJ;
                if (eCMixMallPageDTOLIZJ != null) {
                    C1772630wEH c1772630wEHLJFF = LJFF(eCMixMallPageDTOLIZJ, enumC1771830wCz);
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                        IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                        if (iECommerceHostService2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService2 != null) {
                            name = iECommerceHostService2.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        iECommerceHostService = (IECommerceHostService) service;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                        c1772630wEHLJFF.LIZ();
                        C599820Nfo.LJ(c599820Nfo);
                    }
                    C1772690wEN c1772690wEN = c1772630wEHLJFF.LIZLLL;
                    if (c1772690wEN != null && (list = c1772690wEN.LIZJ) != null && !list.isEmpty()) {
                        return new C1771140wBs(c1772630wEHLJFF, response, this.LIZIZ);
                    }
                }
                message = "empty list";
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[FATAL] Mix parsePage error: ");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo2.getClass();
                C599820Nfo.LIZIZ();
                EnumC1771210wBz enumC1771210wBz = EnumC1771210wBz.DTO_TRANSFORM;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EcMixMallDTOTransform:parsePage:");
                sbLIZ2.append(message);
                C1768370w7P.LIZ(thM5exceptionOrNullimpl, enumC1771210wBz, C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            C189200o6.m1boximpl(c098200Yq);
        } else {
            message = "bff empty";
        }
        return new C1771480wCQ(message, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.AbstractC1771170wBv LIZIZ(X.C1515870pY9<com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO> r14, X.C1771590wCb r15, X.EnumC1771830wCz r16, X.EnumC1771620wCe r17) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773140wF6.LIZIZ(X.0pY9, X.0wCb, X.0wCz, X.0wCe):X.0wBv");
    }
}
