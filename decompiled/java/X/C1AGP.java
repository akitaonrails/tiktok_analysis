package X;

import android.util.Pair;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import j27.s;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AGP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AGP {
    public static final C1AGP LIZ = new C1AGP();

    static {
        C1AGT.LIZ.getClass();
        if (C1AGT.LIZIZ()) {
            C1330620kjM.LIZ(new InterfaceC589610NAp() { // from class: X.1AGQ
                @Override // X.InterfaceC589610NAp
                public final Pair LIZ(C1325710kbR c1325710kbR, Object obj, JSONObject jSONObject, boolean z, boolean z2) {
                    String str;
                    Integer numLJIIJJI;
                    int iIntValue;
                    Integer numLJIIJJI2;
                    try {
                        if (c1325710kbR instanceof C1316290kMF) {
                            Map<String, String> map = ((C1316290kMF) c1325710kbR).LJJIIJZLJL;
                            if (map != null) {
                                str = map.get("__search_lynx_image_flag");
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str, "1")) {
                                C1AGT c1agt = C1AGT.LIZ;
                                String str2 = ((C1316290kMF) c1325710kbR).LJJIIJZLJL.get("search_scene_tag");
                                c1agt.getClass();
                                if (C1AGT.LIZJ(str2)) {
                                    if (!z) {
                                        C1AGP c1agp = C1AGP.LIZ;
                                        Map<String, String> map2 = ((C1316290kMF) c1325710kbR).LJJIIJZLJL;
                                        c1agp.getClass();
                                        C1AGP.LIZLLL(jSONObject, map2);
                                    } else {
                                        C1AGP c1agp2 = C1AGP.LIZ;
                                        Map<String, String> map3 = ((C1316290kMF) c1325710kbR).LJJIIJZLJL;
                                        c1agp2.getClass();
                                        C1AGP.LJ(jSONObject, map3);
                                    }
                                }
                                if (Intrinsics.LJFF(((C1316290kMF) c1325710kbR).LJJIIJZLJL.get("search_scene_tag"), "general_search")) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("SearchImageBSRMonitor.onSensibleCallback rank: ");
                                    String str3 = ((C1316290kMF) c1325710kbR).LJJIIJZLJL.get("rank");
                                    if (str3 != null) {
                                        numLJIIJJI = C2095008Iq.LJIIJJI(str3);
                                    } else {
                                        numLJIIJJI = null;
                                    }
                                    sbLIZ.append(numLJIIJJI);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    String str4 = ((C1316290kMF) c1325710kbR).LJJIIJZLJL.get("rank");
                                    if (str4 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str4)) != null) {
                                        iIntValue = numLJIIJJI2.intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                    C0Q50.LIZIZ(iIntValue, jSONObject, z);
                                    return null;
                                }
                            }
                        }
                        return null;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            });
        }
    }

    public static void LIZIZ(SparkContext sparkContext, final String str) {
        C1AGT.LIZ.getClass();
        if (!C1AGT.LIZIZ()) {
            return;
        }
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.1AGR
            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                C1AGP c1agp = C1AGP.LIZ;
                String str3 = str;
                c1agp.getClass();
                C1AGP.LIZ(interfaceC1541990qEH, str2, str3);
            }
        });
    }

    public static void LIZJ(C1537480q70 c1537480q70, final String str) {
        C1AGT.LIZ.getClass();
        if (!C1AGT.LIZIZ()) {
            return;
        }
        c1537480q70.LJJ(AbstractC1538740q92.class, new AbstractC1538740q92() { // from class: X.1AGS
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                C1AGP c1agp = C1AGP.LIZ;
                String str3 = str;
                c1agp.getClass();
                C1AGP.LIZ(interfaceC1541990qEH, str2, str3);
            }
        });
    }

    public static void LIZLLL(JSONObject jSONObject, Map map) throws JSONException {
        String str;
        jSONObject.put("is_lynx", 1);
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!Intrinsics.LJFF(str2, "__search_lynx_image_flag")) {
                jSONObject.put(str2, value);
            }
        }
        if (Intrinsics.LJFF(map.get("search_scene_tag"), "general_search")) {
            str = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        } else {
            str = "";
        }
        C1334280kpG.LIZ.getClass();
        C1334280kpG.LIZ(false, jSONObject, 0, "", 0, str, false, false, 0.0f, 1, "", "", null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(org.json.JSONObject r21, java.util.Map r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AGP.LJ(org.json.JSONObject, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        Map<String, String> map;
        if (interfaceC1541990qEH instanceof LynxView) {
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new kotlin.Pair("search_scene_tag", str2), new kotlin.Pair("search_page_tag", C649470Pdh.LJ(str)), new kotlin.Pair("__search_lynx_image_flag", "1"));
            LynxView lynxView = (LynxView) interfaceC1541990qEH;
            s lynxContext = lynxView.getLynxContext();
            if (lynxContext != null && (map = lynxContext.LLJLLIL) != null) {
                mapLJIIJ.putAll(map);
            }
            s lynxContext2 = lynxView.getLynxContext();
            if (lynxContext2 != null) {
                lynxContext2.LLJLLIL = mapLJIIJ;
            }
        }
    }

    public static void LJFF(s sVar, JSONObject jSONObject, boolean z, boolean z2) {
        Map<String, String> map;
        int iIntValue;
        Integer numLJIIJJI;
        String str;
        if (sVar != null && jSONObject != null && (map = sVar.LLJLLIL) != null) {
            if (Intrinsics.LJFF(map.get("__search_lynx_image_flag"), "1")) {
                C1AGT c1agt = C1AGT.LIZ;
                String str2 = map.get("search_scene_tag");
                c1agt.getClass();
                if (C1AGT.LIZJ(str2)) {
                    jSONObject.put("is_lynx", 1);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!Intrinsics.LJFF(key, "__search_lynx_image_flag")) {
                            jSONObject.put(key, value);
                        }
                    }
                    if (Intrinsics.LJFF(map.get("search_scene_tag"), "general_search")) {
                        str = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
                    } else {
                        str = "";
                    }
                    C1334280kpG.LIZ.getClass();
                    C1334280kpG.LIZ(z, jSONObject, 0, "", 0, str, z2, false, 0.0f, 1, "", "", null, false);
                }
            }
            if (Intrinsics.LJFF(map.get("search_scene_tag"), "general_search")) {
                String str3 = map.get("rank");
                if (str3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = -1;
                }
                C0Q50.LIZIZ(iIntValue, jSONObject, z);
            }
        }
    }
}
