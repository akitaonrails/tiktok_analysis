package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lynx.tasm.LynxError;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546290qLD {
    public static final /* synthetic */ int LJFF = 0;
    public final ViewGroup LIZ;
    public final Function1<InterfaceC1541990qEH, Unit> LIZIZ;
    public InterfaceC1541990qEH LIZJ;
    public C1547370qMx LIZLLL;
    public String LJ = "";

    public final void LIZ() {
        InterfaceC1105930esx interfaceC1105930esx;
        ViewGroup viewGroup;
        View viewE1;
        int i = C1546490qLX.LIZ;
        String str = this.LJ;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZJ;
        if (str.length() != 0 && ((List) C1155800gBO.LIZLLL.getValue()).contains(str)) {
            if ((interfaceC1541990qEH instanceof InterfaceC1105930esx) && (interfaceC1105930esx = (InterfaceC1105930esx) interfaceC1541990qEH) != null) {
                ViewParent parent = (interfaceC1541990qEH == null || (viewE1 = interfaceC1541990qEH.e1()) == null) ? null : viewE1.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(interfaceC1541990qEH != null ? interfaceC1541990qEH.e1() : null, viewGroup);
                }
                C1546560qLe.LIZ.getClass();
                if (C1546500qLY.LIZ(str, "pdp_integrate_lynx_air", interfaceC1105930esx)) {
                    return;
                }
            }
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LIZJ;
        if (interfaceC1541990qEH2 != null) {
            interfaceC1541990qEH2.LLD(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1546290qLD(ViewGroup viewGroup, Function1<? super InterfaceC1541990qEH, Unit> function1) {
        this.LIZ = viewGroup;
        this.LIZIZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.lynx.tasm.LynxView LIZIZ(android.content.Context r24, final java.lang.String r25, com.lynx.tasm.LynxViewClient r26, android.view.ViewGroup r27, com.lynx.tasm.TemplateData r28, X.C1549130qPn r29) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546290qLD.LIZIZ(android.content.Context, java.lang.String, com.lynx.tasm.LynxViewClient, android.view.ViewGroup, com.lynx.tasm.TemplateData, X.0qPn):com.lynx.tasm.LynxView");
    }

    public static void LIZJ(C1546290qLD c1546290qLD, C1546340qLI c1546340qLI, String str, String str2, Map map, LynxError lynxError, int i) {
        int i2;
        String str3;
        Map map2;
        Map map3;
        long jLongValue;
        long jLongValue2;
        long j;
        long j2;
        Long l;
        Long l2;
        Long l3;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        long j3;
        long j4;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Map map4 = map;
        if ((i & 16) != 0) {
            map4 = null;
        }
        if ((i & 32) != 0) {
            lynxError = null;
        }
        c1546290qLD.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("result", 1), new Pair("schema", str));
        if (c1546340qLI != null && c1546340qLI.LIZIZ) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        mapLJIIJ.put("is_pre_decode", Integer.valueOf(i2));
        if (c1546340qLI == null || (str3 = c1546340qLI.LIZ) == null) {
            str3 = str2;
        }
        mapLJIIJ.put("gecko_from", str3);
        if (lynxError != null) {
            mapLJIIJ.put("error_code", Integer.valueOf(lynxError.LIZIZ()));
            mapLJIIJ.put("error_msg", lynxError.LIZJ());
        }
        if (map4 != null) {
            Object obj = map4.get("extra_timing");
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                map2 = null;
            }
            long jLongValue7 = 0;
            if (map2 != null) {
                Object obj2 = map2.get("container_init_start");
                if ((obj2 instanceof Long) && (l7 = (Long) obj2) != null) {
                    jLongValue3 = l7.longValue();
                } else {
                    jLongValue3 = 0;
                }
                Object obj3 = map2.get("container_init_end");
                if ((obj3 instanceof Long) && (l6 = (Long) obj3) != null) {
                    jLongValue4 = l6.longValue();
                } else {
                    jLongValue4 = 0;
                }
                Object obj4 = map2.get("prepare_template_start");
                if ((obj4 instanceof Long) && (l5 = (Long) obj4) != null) {
                    jLongValue5 = l5.longValue();
                } else {
                    jLongValue5 = 0;
                }
                Object obj5 = map2.get("prepare_template_end");
                if ((obj5 instanceof Long) && (l4 = (Long) obj5) != null) {
                    jLongValue6 = l4.longValue();
                } else {
                    jLongValue6 = 0;
                }
                if (1 <= jLongValue3 && jLongValue3 <= jLongValue4) {
                    j3 = jLongValue4 - jLongValue3;
                } else {
                    j3 = -1;
                }
                mapLJIIJ.put("container_init", Long.valueOf(j3));
                if (i2 != 0) {
                    j4 = 0;
                } else if (1 <= jLongValue5 && jLongValue5 <= jLongValue6) {
                    j4 = jLongValue6 - jLongValue5;
                } else {
                    j4 = -1;
                }
                mapLJIIJ.put("prepare_template", Long.valueOf(j4));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onTimingSetup, containerInit =");
                sbLIZ.append(jLongValue4 - jLongValue3);
                sbLIZ.append(", prepareTemplate=");
                sbLIZ.append(jLongValue6 - jLongValue5);
                C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ));
            }
            Object obj6 = map4.get("setup_timing");
            if ((obj6 instanceof Map) && (map3 = (Map) obj6) != null) {
                Object obj7 = map3.get("load_template_start");
                if ((obj7 instanceof Long) && (l3 = (Long) obj7) != null) {
                    jLongValue = l3.longValue();
                } else {
                    jLongValue = 0;
                }
                Object obj8 = map3.get("load_template_end");
                if ((obj8 instanceof Long) && (l2 = (Long) obj8) != null) {
                    jLongValue2 = l2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                Object obj9 = map3.get("draw_end");
                if ((obj9 instanceof Long) && (l = (Long) obj9) != null) {
                    jLongValue7 = l.longValue();
                }
                if (jLongValue2 > jLongValue) {
                    j = jLongValue2 - jLongValue;
                } else {
                    j = -1;
                }
                mapLJIIJ.put("load_template", Long.valueOf(j));
                if (jLongValue7 > jLongValue) {
                    j2 = jLongValue7 - jLongValue;
                } else {
                    j2 = -1;
                }
                mapLJIIJ.put("lynx_fcp", Long.valueOf(j2));
            }
            mapLJIIJ.put("render_detail", C2097608Jq.LJIIIIZZ(new Pair("extra_timing", map4.get("extra_timing")), new Pair("setup_timing", map4.get("setup_timing"))).toString());
        }
        C1018703yb.LJ("rd_tiktokec_product_detail_lynx_render", mapLJIIJ);
    }
}
