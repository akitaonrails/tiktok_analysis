package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.SparkRavenUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizAnswerCardAssem;
import com.ss.android.ugc.aweme.poi.search.assem.PoiSearchCreatorBannerAssem;
import com.ss.android.ugc.aweme.slash.component.lynx.icon.BaseLynxComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208690hYh extends LynxViewClient {
    public final int $t;
    public Object l0;

    public static final void LJFF$0(C1208690hYh c1208690hYh, LynxError lynxError) {
    }

    public static final void LJFF$2(C1208690hYh c1208690hYh, LynxError lynxError) {
    }

    public static final void LJFF$3(C1208690hYh c1208690hYh, LynxError lynxError) {
    }

    public static final void LJFF$5(C1208690hYh c1208690hYh, LynxError lynxError) {
    }

    public static final void LJFF$7(C1208690hYh c1208690hYh, LynxError lynxError) {
    }

    public static final void LJIILJJIL$5(C1208690hYh c1208690hYh) {
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJFF(LynxError lynxError) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, lynxError);
                break;
            case 1:
                LJFF$1(this, lynxError);
                break;
            case 2:
                LJFF$2(this, lynxError);
                break;
            case 3:
                LJFF$3(this, lynxError);
                break;
            case 4:
                LJFF$4(this, lynxError);
                break;
            case 5:
                LJFF$5(this, lynxError);
                break;
            case 6:
                LJFF$6(this, lynxError);
                break;
            case 7:
                LJFF$7(this, lynxError);
                break;
            default:
                super.LJFF(lynxError);
                break;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this);
                break;
            case 1:
                LJIILJJIL$1(this);
                break;
            case 2:
                LJIILJJIL$2(this);
                break;
            case 3:
                LJIILJJIL$3(this);
                break;
            case 4:
                LJIILJJIL$4(this);
                break;
            case 5:
                LJIILJJIL$5(this);
                break;
            case 6:
                LJIILJJIL$6(this);
                break;
            case 7:
                LJIILJJIL$7(this);
                break;
            default:
                super.LJIILJJIL();
                break;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(Map<String, Object> map) {
        switch (this.$t) {
            case 0:
                onTimingSetup$0(this, map);
                break;
            case 1:
                onTimingSetup$1(this, map);
                break;
            case 2:
            default:
                super.onTimingSetup(map);
                break;
            case 3:
                onTimingSetup$2(this, map);
                break;
            case 4:
                onTimingSetup$3(this, map);
                break;
            case 5:
                onTimingSetup$4(this, map);
                break;
            case 6:
                onTimingSetup$5(this, map);
                break;
            case 7:
                super.onTimingSetup(map);
                break;
        }
    }

    public static final void LJIILJJIL$0(C1208690hYh c1208690hYh) {
        ((PoiSearchCreatorBannerAssem) c1208690hYh.l0).LLJJJ = true;
    }

    public static final void LJIILJJIL$1(C1208690hYh c1208690hYh) {
        C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(590));
        ((BaseLynxComponent) c1208690hYh.l0).LLJJIJI = true;
    }

    public static final void LJIILJJIL$2(C1208690hYh c1208690hYh) {
        SparkRavenUIAssem sparkRavenUIAssem = (SparkRavenUIAssem) c1208690hYh.l0;
        sparkRavenUIAssem.LLJJIJI = true;
        sparkRavenUIAssem.so();
    }

    public static final void LJIILJJIL$3(C1208690hYh c1208690hYh) {
        ((PoiQuizAnswerCardAssem) c1208690hYh.l0).LLJILJIL = true;
    }

    public static final void LJIILJJIL$4(C1208690hYh c1208690hYh) {
        ViewGroup viewGroup;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lynx onLoadSuccess time: ");
        sbLIZ.append(System.currentTimeMillis());
        C2188811AlT.LIZIZ(sbLIZ);
        ((PoiDetailLynxAssem) c1208690hYh.l0).LLJLIL = true;
        if (C298370Bml.LIZ()) {
            ((PoiDetailLynxAssem) c1208690hYh.l0).Ap(true);
        }
        ((PoiDetailLynxAssem) c1208690hYh.l0).getClass();
        if (!PoiDetailLynxAssem.Wp()) {
            ((PoiDetailLynxAssem) c1208690hYh.l0).Bp(true);
        }
        ((PoiDetailLynxAssem) c1208690hYh.l0).getClass();
        if (PoiDetailLynxAssem.Wp()) {
            PoiDetailLynxAssem poiDetailLynxAssem = (PoiDetailLynxAssem) c1208690hYh.l0;
            View view = poiDetailLynxAssem.LLJJJJJIL;
            ViewParent parent = null;
            if (view != null) {
                parent = view.getParent();
            }
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(poiDetailLynxAssem.LLJJJJJIL, viewGroup);
            }
        }
    }

    public static final void LJIILJJIL$6(C1208690hYh c1208690hYh) {
        C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(774));
        ((C1187730h0t) c1208690hYh.l0).LLILZIL = true;
    }

    public static final void LJIILJJIL$7(C1208690hYh c1208690hYh) {
        ((C1189570h3r) c1208690hYh.l0).LLILZ = true;
    }

    public C1208690hYh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJFF$1(C1208690hYh c1208690hYh, LynxError lynxError) {
        C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(591));
    }

    public static final void LJFF$4(C1208690hYh c1208690hYh, LynxError lynxError) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lynx onReceivedError time: ");
        sbLIZ.append(System.currentTimeMillis());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJFF$6(C1208690hYh c1208690hYh, LynxError lynxError) {
        C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(775));
    }

    public static final void onTimingSetup$0(C1208690hYh c1208690hYh, Map map) {
        Map map2;
        Object obj;
        super.onTimingSetup(map);
        Object obj2 = null;
        if (map != null) {
            obj2 = map.get("setup_timing");
        }
        if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null && (obj = map2.get("draw_end")) != null) {
            C1192290h8F.LIZJ((PoiSearchCreatorBannerAssem) c1208690hYh.l0, new AwS597S0100000_18(obj, 521));
        }
        C1192290h8F.LIZJ((PoiSearchCreatorBannerAssem) c1208690hYh.l0, AFwS256S0000000_18.get$arr$(685));
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onTimingSetup$1(X.C1208690hYh r34, java.util.Map r35) {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208690hYh.onTimingSetup$1(X.0hYh, java.util.Map):void");
    }

    public static final void onTimingSetup$2(C1208690hYh c1208690hYh, Map map) {
        Map map2;
        Object obj;
        super.onTimingSetup(map);
        Object obj2 = null;
        if (map != null) {
            obj2 = map.get("setup_timing");
        }
        if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null && (obj = map2.get("draw_end")) != null) {
            C1192290h8F.LIZJ((PoiQuizAnswerCardAssem) c1208690hYh.l0, new AwS597S0100000_18(obj, 778));
        }
        C1192290h8F.LIZJ((PoiQuizAnswerCardAssem) c1208690hYh.l0, AFwS256S0000000_18.get$arr$(888));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0477 A[PHI: r4
      0x0477: PHI (r4v2 java.lang.Long) = (r4v3 java.lang.Long), (r4v9 java.lang.Long) binds: [B:223:0x0439, B:234:0x0476] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onTimingSetup$3(X.C1208690hYh r31, java.util.Map r32) {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208690hYh.onTimingSetup$3(X.0hYh, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onTimingSetup$4(X.C1208690hYh r9, java.util.Map r10) {
        /*
            super.onTimingSetup(r10)
            r1 = 0
            if (r10 == 0) goto L81
            java.lang.String r0 = "setup_timing"
            java.lang.Object r7 = r10.get(r0)
        Lc:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L7e
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L7f
            java.lang.String r0 = "draw_end"
            java.lang.Object r4 = r7.get(r0)
        L1a:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L7c
            java.lang.Long r4 = (java.lang.Long) r4
        L20:
            r2 = 0
            if (r4 == 0) goto L79
            long r5 = r4.longValue()
        L28:
            if (r7 == 0) goto L30
            java.lang.String r0 = "decode_end"
            java.lang.Object r1 = r7.get(r0)
        L30:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L76
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L76
            long r7 = r1.longValue()
        L3c:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r1 = -1
            if (r0 == 0) goto L73
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.poi.claim.view.PoiClaimLynxAssem r0 = (com.ss.android.ugc.aweme.poi.claim.view.PoiClaimLynxAssem) r0
            long r0 = r0.LLJILJIL
            long r5 = r5 - r0
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.poi.claim.view.PoiClaimLynxAssem r0 = (com.ss.android.ugc.aweme.poi.claim.view.PoiClaimLynxAssem) r0
            long r3 = r0.LLJILJIL
            long r1 = r7 - r3
        L51:
            X.0hLv r7 = X.C1200770hLv.LIZ
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.poi.claim.view.PoiClaimLynxAssem r0 = (com.ss.android.ugc.aweme.poi.claim.view.PoiClaimLynxAssem) r0
            java.lang.String r4 = r0.LLJIJIL
            int r0 = (int) r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.getClass()
            kotlin.jvm.internal.AwS102S1200000_18 r1 = new kotlin.jvm.internal.AwS102S1200000_18
            r0 = 13
            r1.<init>(r3, r2, r4, r0)
            java.lang.String r0 = "load_content_success"
            r7.LIZJ(r0, r1)
            return
        L73:
            r5 = -1
            goto L51
        L76:
            r7 = 0
            goto L3c
        L79:
            r5 = 0
            goto L28
        L7c:
            r4 = r1
            goto L20
        L7e:
            r7 = r1
        L7f:
            r4 = r1
            goto L1a
        L81:
            r7 = r1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208690hYh.onTimingSetup$4(X.0hYh, java.util.Map):void");
    }

    public static final void onTimingSetup$5(C1208690hYh c1208690hYh, Map map) {
        Object obj;
        Map map2;
        Long l;
        long jLongValue;
        long jLongValue2;
        C1187710h0r c1187710h0rLIZ;
        String str;
        String str2;
        String str3;
        String str4;
        int iHi;
        String str5;
        Map<String, Object> mapLIZ;
        InterfaceC1187750h0v interfaceC1187750h0vQz;
        InterfaceC1187750h0v interfaceC1187750h0vQz2;
        Map<String, Object> mapLJFF;
        Map map3;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Map map4;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Map map5;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        super.onTimingSetup(map);
        if (map != null) {
            obj = map.get("setup_timing");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            l = (Long) map2.get("draw_end");
        } else {
            l = null;
        }
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(l, 2691));
        C1187730h0t c1187730h0t = (C1187730h0t) c1208690hYh.l0;
        C1187810h11 c1187810h11 = c1187730h0t.LLJILJIL;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Long l22 = c1187810h11.LIZ;
            long jLongValue3 = -1;
            if (l22 != null) {
                jLongValue = l22.longValue();
            } else {
                jLongValue = -1;
            }
            linkedHashMap.put("data_update_ts", Long.valueOf(jLongValue));
            Long l23 = c1187810h11.LIZIZ;
            if (l23 != null) {
                jLongValue2 = l23.longValue();
            } else {
                jLongValue2 = -1;
            }
            linkedHashMap.put("prepare_create_sparkview_ts", Long.valueOf(jLongValue2));
            Long l24 = c1187810h11.LIZJ;
            if (l24 != null) {
                jLongValue3 = l24.longValue();
            }
            linkedHashMap.put("prepare_load_url_ts", Long.valueOf(jLongValue3));
            if (map != null) {
                Object obj2 = map.get("extra_timing");
                if ((obj2 instanceof Map) && (map5 = (Map) obj2) != null) {
                    Object obj3 = map5.get("open_time");
                    if ((obj3 instanceof Long) && (l21 = (Long) obj3) != null) {
                        linkedHashMap.put("open_time", Long.valueOf(l21.longValue()));
                    }
                    Object obj4 = map5.get("container_init_start");
                    if ((obj4 instanceof Long) && (l20 = (Long) obj4) != null) {
                        linkedHashMap.put("container_init_start", Long.valueOf(l20.longValue()));
                    }
                    Object obj5 = map5.get("container_init_end");
                    if ((obj5 instanceof Long) && (l19 = (Long) obj5) != null) {
                        linkedHashMap.put("container_init_end", Long.valueOf(l19.longValue()));
                    }
                    Object obj6 = map5.get("prepare_template_start");
                    if ((obj6 instanceof Long) && (l18 = (Long) obj6) != null) {
                        linkedHashMap.put("prepare_template_start", Long.valueOf(l18.longValue()));
                    }
                    Object obj7 = map5.get("prepare_template_end");
                    if ((obj7 instanceof Long) && (l17 = (Long) obj7) != null) {
                        linkedHashMap.put("prepare_template_end", Long.valueOf(l17.longValue()));
                    }
                }
                Object obj8 = map.get("setup_timing");
                if ((obj8 instanceof Map) && (map4 = (Map) obj8) != null) {
                    Object obj9 = map4.get("create_lynx_start");
                    if ((obj9 instanceof Long) && (l16 = (Long) obj9) != null) {
                        linkedHashMap.put("create_lynx_start", Long.valueOf(l16.longValue()));
                    }
                    Object obj10 = map4.get("create_lynx_end");
                    if ((obj10 instanceof Long) && (l15 = (Long) obj10) != null) {
                        linkedHashMap.put("create_lynx_end", Long.valueOf(l15.longValue()));
                    }
                    Object obj11 = map4.get("load_template_start");
                    if ((obj11 instanceof Long) && (l14 = (Long) obj11) != null) {
                        linkedHashMap.put("load_template_start", Long.valueOf(l14.longValue()));
                    }
                    Object obj12 = map4.get("load_template_end");
                    if ((obj12 instanceof Long) && (l13 = (Long) obj12) != null) {
                        linkedHashMap.put("load_template_end", Long.valueOf(l13.longValue()));
                    }
                    Object obj13 = map4.get("draw_end");
                    if ((obj13 instanceof Long) && (l12 = (Long) obj13) != null) {
                        linkedHashMap.put("draw_end", Long.valueOf(l12.longValue()));
                    }
                    Object obj14 = map4.get("load_core_start");
                    if ((obj14 instanceof Long) && (l11 = (Long) obj14) != null) {
                        linkedHashMap.put("load_core_start", Long.valueOf(l11.longValue()));
                    }
                    Object obj15 = map4.get("load_core_end");
                    if ((obj15 instanceof Long) && (l10 = (Long) obj15) != null) {
                        linkedHashMap.put("load_core_end", Long.valueOf(l10.longValue()));
                    }
                    Object obj16 = map4.get("load_app_start");
                    if ((obj16 instanceof Long) && (l9 = (Long) obj16) != null) {
                        linkedHashMap.put("load_app_start", Long.valueOf(l9.longValue()));
                    }
                    Object obj17 = map4.get("load_app_end");
                    if ((obj17 instanceof Long) && (l8 = (Long) obj17) != null) {
                        linkedHashMap.put("load_app_end", Long.valueOf(l8.longValue()));
                    }
                }
                Object obj18 = map.get("metrics");
                if ((obj18 instanceof Map) && (map3 = (Map) obj18) != null) {
                    Object obj19 = map3.get("lynx_fcp");
                    if ((obj19 instanceof Long) && (l7 = (Long) obj19) != null) {
                        linkedHashMap.put("lynx_fcp", Long.valueOf(l7.longValue()));
                    }
                    Object obj20 = map3.get("lynx_tti");
                    if ((obj20 instanceof Long) && (l6 = (Long) obj20) != null) {
                        linkedHashMap.put("lynx_tti", Long.valueOf(l6.longValue()));
                    }
                    Object obj21 = map3.get("total_fcp");
                    if ((obj21 instanceof Long) && (l5 = (Long) obj21) != null) {
                        linkedHashMap.put("total_fcp", Long.valueOf(l5.longValue()));
                    }
                    Object obj22 = map3.get("tti");
                    if ((obj22 instanceof Long) && (l4 = (Long) obj22) != null) {
                        linkedHashMap.put("tti", Long.valueOf(l4.longValue()));
                    }
                    Object obj23 = map3.get("fcp");
                    if ((obj23 instanceof Long) && (l3 = (Long) obj23) != null) {
                        linkedHashMap.put("fcp", Long.valueOf(l3.longValue()));
                    }
                    Object obj24 = map3.get("total_tti");
                    if ((obj24 instanceof Long) && (l2 = (Long) obj24) != null) {
                        linkedHashMap.put("total_tti", Long.valueOf(l2.longValue()));
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String str6 = c1187730h0t.LLILZLL;
                if (str6 != null) {
                    C1195980hEC.LIZ.getClass();
                    c1187710h0rLIZ = C1195980hEC.LIZ(str6);
                } else {
                    c1187710h0rLIZ = null;
                }
                C1189060h32.LJIJI(linkedHashMap2, "url", c1187730h0t.LLJIJIL);
                C1189060h32.LJIJI(linkedHashMap2, "gecko_bundle", c1187730h0t.LLIZ);
                if (c1187710h0rLIZ != null) {
                    str = c1187710h0rLIZ.LIZIZ;
                } else {
                    str = null;
                }
                C1189060h32.LJIJI(linkedHashMap2, "spark_version", str);
                if (c1187710h0rLIZ != null) {
                    str2 = c1187710h0rLIZ.LIZJ;
                } else {
                    str2 = null;
                }
                C1189060h32.LJIJI(linkedHashMap2, "lynx_version", str2);
                if (Intrinsics.LJFF(c1187730h0t.LLIZLLLIL, Boolean.TRUE)) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                C1189060h32.LJIJI(linkedHashMap2, "is_offline_gecko", str3);
                if (c1187710h0rLIZ != null) {
                    str4 = c1187710h0rLIZ.LIZ;
                } else {
                    str4 = null;
                }
                C1189060h32.LJIJI(linkedHashMap2, "gecko_version_id", str4);
                C1189060h32.LJIJI(linkedHashMap2, "gecko_channel", c1187730h0t.LLILZLL);
                InterfaceC1181010gq3 interfaceC1181010gq3 = c1187730h0t.LLILLJJLI;
                int iLg = 0;
                if (interfaceC1181010gq3 != null) {
                    iHi = interfaceC1181010gq3.hi(c1187730h0t.LL);
                } else {
                    iHi = 0;
                }
                InterfaceC1181010gq3 interfaceC1181010gq32 = c1187730h0t.LLILLJJLI;
                if (interfaceC1181010gq32 != null) {
                    iLg = interfaceC1181010gq32.Lg();
                }
                if (iHi <= 0 && iLg <= 0) {
                    str5 = "first";
                } else {
                    str5 = "act";
                }
                C1189060h32.LJIJI(linkedHashMap2, "refresh_code", str5);
                InterfaceC1181010gq3 interfaceC1181010gq33 = c1187730h0t.LLILLJJLI;
                if (interfaceC1181010gq33 != null && (interfaceC1187750h0vQz2 = interfaceC1181010gq33.Qz()) != null && (mapLJFF = interfaceC1187750h0vQz2.LJFF()) != null) {
                    linkedHashMap2.putAll(mapLJFF);
                }
                InterfaceC1181010gq3 interfaceC1181010gq34 = c1187730h0t.LLILLJJLI;
                if (interfaceC1181010gq34 != null && (interfaceC1187750h0vQz = interfaceC1181010gq34.Qz()) != null) {
                    mapLIZ = interfaceC1187750h0vQz.LIZ();
                } else {
                    mapLIZ = null;
                }
                C1192290h8F.LIZJ(c1187730h0t, new AwS227S0300000_18(mapLIZ, (Map<String, ? extends Object>) linkedHashMap2, (Map<String, Object>) linkedHashMap, (Map<String, Long>) 68));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            EnumC1205520hTa enumC1205520hTa = EnumC1205520hTa.LYNX_TIMING_INFO_PARSE_ERROR;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(enumC1205520hTa, "lynx_timing_info", null, e);
        }
        if (l != null) {
            C1187730h0t c1187730h0t2 = (C1187730h0t) c1208690hYh.l0;
            l.longValue();
            C1192290h8F.LIZJ(c1187730h0t2, new AwS597S0100000_18(l, 985));
        }
        C1192290h8F.LIZJ((C1187730h0t) c1208690hYh.l0, AFwS256S0000000_18.get$arr$(998));
    }
}
