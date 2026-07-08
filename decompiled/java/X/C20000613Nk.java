package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.ConvertOidToUrlResponse;
import com.ss.ugc.effectplatform.model.net.ResourceUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import w1p.a;

/* JADX INFO: renamed from: X.13Nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20000613Nk {
    public final C13RD LIZ;
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final C20000713Nl LIZJ;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.13Nl] */
    public C20000613Nk(final C13RD c13rd) {
        this.LIZ = c13rd;
        final C20309214dO c20309214dO = new C20309214dO(this, 1);
        this.LIZJ = new InterfaceC20000813Nm(c13rd, c20309214dO) { // from class: X.13Nl
            public final C13RD LIZ;
            public final InterfaceC1631630sYr<String, String, Map<String, Effect>, InterfaceC20000513Nj, Unit> LIZIZ;

            {
                this.LIZ = c13rd;
                this.LIZIZ = c20309214dO;
            }

            @Override // X.InterfaceC20000813Nm
            public final void LIZ(List<? extends Effect> list, InterfaceC20000513Nj interfaceC20000513Nj) {
                String str;
                List<String> url_prefix;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Effect effect : (ArrayList) list) {
                    Integer url_sub_type = effect.getIcon_url().getUrl_sub_type();
                    if (url_sub_type != null && url_sub_type.intValue() == 1 && ((url_prefix = effect.getIcon_url().getUrl_prefix()) == null || url_prefix.isEmpty())) {
                        String uri = effect.getIcon_url().getUri();
                        if (uri != null) {
                            linkedHashMap.put(uri, effect);
                        }
                    }
                }
                C20000913Nn c20000913Nn = this.LIZ.LJIILJJIL;
                if (c20000913Nn != null && (str = c20000913Nn.LIZ) != null && (!linkedHashMap.isEmpty())) {
                    this.LIZIZ.invoke(str, "mobile_effect", linkedHashMap, interfaceC20000513Nj);
                } else {
                    interfaceC20000513Nj.onSuccess();
                }
            }
        };
    }

    public final void LJIIIZ(Effect effect) {
        String strLJI;
        InterfaceC20004513Ox interfaceC20004513Ox;
        if (this.LIZ.LJJIFFI != null && !a0.LJJJIL(effect.getUnzipPath()) && (strLJI = C13SB.LJI(effect.getUnzipPath())) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
            Regex regex = C13SG.LJJ;
            interfaceC20004513Ox.LIZLLL(C13SJ.LIZJ(strLJI), effect.getPanel());
        }
    }

    public final void LIZJ(ProviderEffect providerEffect, InterfaceC1634240sd4 interfaceC1634240sd4) {
        String strLIZ = C1528550psb.LIZ();
        if (interfaceC1634240sd4 != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, interfaceC1634240sd4);
        }
        C13PO c13po = new C13PO(this.LIZ, providerEffect, strLIZ);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13po);
        }
    }

    public final void LJI(List list, Map map, C13MA c13ma) {
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C13RD c13rd = this.LIZ;
        C20001113Np c20001113Np = c13rd.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C20001813Nw(c13rd, list, strLIZ, map, this.LIZJ));
        }
    }

    public final void LIZIZ(final String str, final String str2, final List list, C13MA c13ma) {
        final String strLIZ = C1528550psb.LIZ();
        this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            final C13RD c13rd = this.LIZ;
            c20001113Np.LIZIZ(new C13OD<ConvertOidToUrlResponse, ConvertOidToUrlResponse>(c13rd, str, str2, list, strLIZ) { // from class: X.13Nu
                public final C13RD LIZ;
                public final String LIZIZ;
                public final String LIZJ;
                public final List<String> LIZLLL;
                public final Map<String, String> LJ;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10002;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() {
                    HashMap map = new HashMap();
                    map.put(Scene.SCENE_SERVICE, this.LIZJ);
                    C13R7 c13r7 = this.LIZ.LJIJI;
                    if (c13r7 != null) {
                        String strConvertObjToJson = c13r7.LIZ.convertObjToJson(this.LIZLLL);
                        if (strConvertObjToJson != null) {
                            map.put("object_ids", strConvertObjToJson);
                        }
                    }
                    Map<String, String> map2 = this.LJ;
                    if (map2 != null) {
                        map.putAll(map2);
                    }
                    return new C0XSU(C1535105zh.LIZ(map, this.LIZIZ), null, C0XSV.GET, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final int getRetryCount() {
                    return this.LIZ.LJIILL;
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str3) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str3, ConvertOidToUrlResponse.class);
                }

                @Override // X.C13OD
                public final void onFailure(String str3, String str4, C1662010tLr c1662010tLr) {
                    c1662010tLr.LIZ(str3, this.LIZ.LJJIIJZLJL, str4);
                    super.onFailure(str3, str4, c1662010tLr);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                    this.LIZIZ = str;
                    this.LIZJ = str2;
                    this.LIZLLL = list;
                    this.LJ = null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF(final java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r12, final com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra r13, final X.C13MA<java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>> r14, final boolean r15) {
        /*
            r11 = this;
            java.lang.String r8 = X.C1528550psb.LIZ()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r12
            java.util.Iterator r5 = r6.iterator()
        Le:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r3 = r5.next()
            r2 = r3
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r2.getFile_url()
            java.lang.Integer r0 = r0.getUrl_sub_type()
            if (r0 == 0) goto Le
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto Le
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r2.getFile_url()
            java.lang.String r0 = r0.getUri()
            if (r0 == 0) goto Le
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto Le
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r2.getFile_url()
            java.util.List r0 = r0.getUrl_prefix()
            if (r0 == 0) goto L4c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
        L4c:
            boolean r0 = com.ss.android.ugc.effectmanager.effect.model.EffectKt.containDiffInfo(r2)
            if (r0 != 0) goto Le
            r4.add(r3)
            goto Le
        L56:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r4.iterator()
        L5f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r0.getFile_url()
            java.lang.String r0 = r0.getUri()
            if (r0 == 0) goto L5f
            r3.add(r0)
            goto L5f
        L79:
            r7 = r11
            X.13RD r0 = r7.LIZ
            X.13Nn r0 = r0.LJIILJJIL
            r10 = r15
            r5 = r14
            r9 = r13
            if (r0 == 0) goto L9a
            java.lang.String r2 = "mobile_effect"
            java.lang.String r1 = r0.LIZ
            if (r2 == 0) goto L9a
            if (r1 == 0) goto L9a
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L9a
            X.13Nh r4 = new X.13Nh
            r4.<init>()
            r7.LIZIZ(r1, r2, r3, r4)
        L99:
            return r8
        L9a:
            if (r5 == 0) goto La3
            X.13RD r0 = r7.LIZ
            X.13Lr r0 = r0.LJJJIL
            r0.LIZIZ(r8, r5)
        La3:
            X.13RD r0 = r7.LIZ
            X.13Np r0 = r0.LJJIIJ
            if (r0 == 0) goto L99
            X.13PS r1 = new X.13PS
            X.13RD r2 = r7.LIZ
            r3 = r6
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0.LIZIZ(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20000613Nk.LJFF(java.util.List, com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra, X.13MA, boolean):java.lang.String");
    }

    public final String LJII(C13MA c13ma, List list, Map map, boolean z) {
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C13RD c13rd = this.LIZ;
        C20001113Np c20001113Np = c13rd.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C20001913Nx(c13rd, list, strLIZ, map, false, this.LIZJ, z));
        }
        return strLIZ;
    }

    public final void LJIIIIZZ(String str, String str2, Map map, boolean z, C13MA c13ma) {
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C13PL c13pl = new C13PL(this.LIZ, strLIZ, str, str2, map, z);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13pl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:59:0x00de->B:43:0x00a6 BREAK  A[LOOP:1: B:53:0x00c4->B:97:0x00c4], EDGE_INSN: B:42:0x00a4->B:43:0x00a6 BREAK  A[LOOP:0: B:36:0x008a->B:91:0x008a], PHI: r1
      0x00a6: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v10 java.lang.String), (r1v14 java.lang.String) binds: [B:61:0x00e3, B:59:0x00de, B:42:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:59:0x00de->B:43:0x00a6 BREAK  A[LOOP:1: B:53:0x00c4->B:97:0x00c4], PHI: r1
      0x00a6: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v10 java.lang.String), (r1v14 java.lang.String) binds: [B:61:0x00e3, B:59:0x00de, B:42:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r7, final java.lang.String r8, X.C13NV r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20000613Nk.LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, X.13NV, boolean, boolean, boolean):void");
    }

    public final String LIZLLL(final Effect effect, boolean z, final boolean z2, final boolean z3, final boolean z4, final C13NY c13ny, final boolean z5) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1528550psb.LIZ());
        sbLIZ.append(" - ");
        sbLIZ.append(effect.getName());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (a0.LJJJIL(effect.getId())) {
            if (c13ny != null) {
                c13ny.onFail(effect, new C1662010tLr(10014));
            }
            return strLIZIZ;
        }
        if (c13ny != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZIZ, c13ny);
        }
        if (z) {
            C13RD c13rd = this.LIZ;
            C20001113Np c20001113Np = c13rd.LJJIIJ;
            if (c20001113Np != null) {
                c20001113Np.LIZIZ(new C13R3(c13rd, effect, strLIZIZ));
            }
            return strLIZIZ;
        }
        C20000913Nn c20000913Nn = this.LIZ.LJIILJJIL;
        String str2 = null;
        if (c20000913Nn != null) {
            str = "mobile_effect";
            str2 = c20000913Nn.LIZ;
        } else {
            str = null;
        }
        final String uri = effect.getFile_url().getUri();
        boolean zContainDiffInfo = EffectKt.containDiffInfo(effect);
        Integer url_sub_type = effect.getFile_url().getUrl_sub_type();
        if (url_sub_type != null && url_sub_type.intValue() == 1 && uri != null && !a0.LJJJIL(uri) && str != null && str2 != null && !zContainDiffInfo) {
            LIZIZ(str2, str, Collections.singletonList(uri), new C13MA<ConvertOidToUrlResponse>() { // from class: X.13Ng
                @Override // X.C13MA
                public final void onSuccess(ConvertOidToUrlResponse convertOidToUrlResponse) {
                    List<ResourceUrl> url_list;
                    ConvertOidToUrlResponse convertOidToUrlResponse2 = convertOidToUrlResponse;
                    if (convertOidToUrlResponse2 != null && (url_list = convertOidToUrlResponse2.getUrl_list()) != null) {
                        String str3 = uri;
                        Effect effect2 = effect;
                        for (ResourceUrl resourceUrl : url_list) {
                            if (Intrinsics.LJFF(str3, resourceUrl.getOid())) {
                                effect2.getFile_url().setUrlList(C13LQ.LJIJI(new String[]{resourceUrl.getMain_url(), resourceUrl.getBackup_url()}));
                            }
                        }
                    }
                    String id = effect.getId();
                    Effect effect3 = effect;
                    effect3.setId(u.LJJIFFI(u.LJJIFFI(effect3.getId(), "\"", "_", false), "/", "_", false));
                    if (a0.LJJIIZI(id, "\"", false) || a0.LJJIIZI(id, "/", false)) {
                        Effect effect4 = effect;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.LIZ.LJII);
                        String str4 = C13SB.LIZ;
                        sbLIZ2.append(str4);
                        sbLIZ2.append(effect.getId());
                        sbLIZ2.append(".zip");
                        effect4.setZipPath(C2188811AlT.LIZIZ(sbLIZ2));
                        Effect effect5 = effect;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(this.LIZ.LJII);
                        sbLIZ3.append(str4);
                        sbLIZ3.append(effect.getId());
                        effect5.setUnzipPath(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    C13NV c13nv = new C13NV(effect, this.LIZ, strLIZIZ, null, z5);
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "ep_support_effect_extra_zstd_decompression", true, false)) {
                        c13nv.LIZIZ();
                    }
                    c13nv.LJIIIZ = z4;
                    if (!C0C0O.LIZ() && !a.LIZ().taskManagerQueueOptBugfixEnabled) {
                        this.LIZ(effect, strLIZIZ, c13nv, z2, z3, false);
                    } else {
                        this.LIZ(effect, strLIZIZ, c13nv, z2, z3, z4);
                    }
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(ConvertOidToUrlResponse convertOidToUrlResponse) {
                }

                @Override // X.C13MA
                public final void onFail(ConvertOidToUrlResponse convertOidToUrlResponse, C1662010tLr c1662010tLr) {
                    C13NY c13ny2 = c13ny;
                    if (c13ny2 != null) {
                        c13ny2.onFail(effect, c1662010tLr);
                    }
                }
            });
            return strLIZIZ;
        }
        effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
        C13NV c13nv = new C13NV(effect, this.LIZ, strLIZIZ, null, z5);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ep_support_effect_extra_zstd_decompression", true, false)) {
            c13nv.LIZIZ();
        }
        c13nv.LJIIIZ = z4;
        if (!C0C0O.LIZ() && !a.LIZ().taskManagerQueueOptBugfixEnabled) {
            LIZ(effect, strLIZIZ, c13nv, z2, z3, false);
            return strLIZIZ;
        }
        LIZ(effect, strLIZIZ, c13nv, z2, z3, z4);
        return strLIZIZ;
    }

    public final String LJIIJ(final int i, final int i2, final int i3, C13MA c13ma, final String str, final String str2, final String str3, final Map map) {
        final String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        final C13RD c13rd = this.LIZ;
        C20001113Np c20001113Np = c13rd.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C13OD<SearchEffectResponseV2, SearchEffectResponseV2>(i, i2, i3, c13rd, str, str2, strLIZ, str3, map) { // from class: X.13O3
                public final C13RD LIZ;
                public final String LIZIZ;
                public final String LIZJ;
                public final int LIZLLL;
                public final int LJ;
                public final Map<String, String> LJFF;
                public final String LJI;
                public final int LJII;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10014;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
                @Override // X.C13OD
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C0XSU buildRequest() throws java.lang.Throwable {
                    /*
                        r11 = this;
                        X.13RD r0 = r11.LIZ
                        r5 = 1
                        java.util.HashMap r3 = X.C13RE.LIZ(r0, r5)
                        java.lang.String r1 = r11.LIZIZ
                        if (r1 == 0) goto L10
                        java.lang.String r0 = "search_id"
                        r3.put(r0, r1)
                    L10:
                        java.lang.String r1 = "keyword"
                        java.lang.String r0 = r11.LIZJ
                        r3.put(r1, r0)
                        int r0 = r11.LJ
                        java.lang.String r1 = java.lang.String.valueOf(r0)
                        java.lang.String r0 = "cursor"
                        r3.put(r0, r1)
                        int r0 = r11.LIZLLL
                        java.lang.String r1 = java.lang.String.valueOf(r0)
                        java.lang.String r0 = "count"
                        r3.put(r0, r1)
                        java.util.Map<java.lang.String, java.lang.String> r0 = r11.LJFF
                        if (r0 == 0) goto L34
                        r3.putAll(r0)
                    L34:
                        int r1 = r11.LJII
                        r4 = 0
                        if (r1 == r5) goto L98
                        r0 = 2
                        if (r1 == r0) goto L95
                        r0 = 4
                        if (r1 != r0) goto L46
                        java.lang.String r1 = "duet_greenscreen"
                    L41:
                        java.lang.String r0 = "allow_list_scene"
                        r3.put(r0, r1)
                    L46:
                        java.lang.String r0 = r11.LJI
                        if (r0 == 0) goto L76
                        boolean r0 = kotlin.text.a0.LJJJIL(r0)
                        if (r0 != 0) goto L76
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = r11.LJI
                        r1.append(r0)
                        java.lang.String r0 = "/aweme/v1/search/effect/"
                        r1.append(r0)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    L62:
                        X.0XSU r1 = new X.0XSU
                        java.lang.String r2 = X.C1535105zh.LIZ(r3, r0)
                        r3 = 0
                        X.0XSV r4 = X.C0XSV.GET
                        r7 = 0
                        r10 = 1018(0x3fa, float:1.427E-42)
                        r5 = r3
                        r6 = r3
                        r8 = r3
                        r9 = r3
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                        return r1
                    L76:
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        X.13RD r0 = r11.LIZ
                        java.lang.String r0 = r0.LJJIIJZLJL
                        r1.append(r0)
                        X.13RD r0 = r11.LIZ
                        r0.getClass()
                        java.lang.String r0 = "/effect/api"
                        r1.append(r0)
                        java.lang.String r0 = "/search/effects"
                        r1.append(r0)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        goto L62
                    L95:
                        java.lang.String r1 = "duet"
                        goto L41
                    L98:
                        X.0C64 r2 = X.C0C64.LJIILLIIL()
                        java.lang.String r1 = "layout_effect_allowlist_v2"
                        r0 = 31744(0x7c00, float:4.4483E-41)
                        boolean r0 = r2.LJIIIZ(r0, r1, r5, r4)
                        if (r0 == 0) goto La9
                        java.lang.String r1 = "layout_v2"
                        goto L41
                    La9:
                        java.lang.String r1 = "layout"
                        goto L41
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C13O3.buildRequest():X.0XSU");
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str4) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str4, SearchEffectResponseV2.class);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                    this.LIZIZ = str;
                    this.LIZJ = str2;
                    this.LIZLLL = i;
                    this.LJ = i2;
                    this.LJFF = map;
                    this.LJI = str3;
                    this.LJII = i3;
                }
            });
        }
        return strLIZ;
    }
}
