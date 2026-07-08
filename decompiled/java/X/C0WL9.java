package X;

import android.os.SystemClock;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.google.gson.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WL9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WL9 {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(C0WL8 c0wl8, final C0WLA c0wla) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final C805400Vic c805400VicLIZIZ = C295401Cm.LIZIZ(c0wla.LJIIIIZZ);
        h hVar = C308490C7j.LIZ;
        h hVar2 = C308490C7j.LIZ;
        h hVar3 = (h) C308480C7i.LIZLLL(h.class, "rasp_lynxjsb_keyword_bypass_list", hVar2);
        if (hVar3 != null) {
            hVar2 = hVar3;
        }
        String str = c0wla.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        if (Intrinsics.LJFF(c0wla.LJIILLIIL, "LYNX")) {
            int size = hVar2.size();
            for (int i = 0; i < size; i++) {
                String strLJIL = hVar2.LJJIIJZLJL(i).LJIL();
                if (strLJIL.length() > 0 && a0.LJJIIZI(str, strLJIL, false)) {
                    return new Pair(Boolean.FALSE, null);
                }
            }
        }
        PrivacyEvent.Companion.getClass();
        PrivacyEvent privacyEventLIZ = C0WRC.LIZ("5000", "RASP");
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        privacyEventLIZ.addCallSiteInfo("source", new C0WQ8(enumC823400WRu, "rasp"));
        privacyEventLIZ.addCallSiteInfo("type", new C0WQ8(enumC823400WRu, "jsb"));
        privacyEventLIZ.addCallSiteInfo("relativeViewType", new C0WQ8(enumC823400WRu, c0wla.LJIILLIIL));
        if (c805400VicLIZIZ != null) {
            privacyEventLIZ.addCallSiteInfo("url", new C0WQ8(enumC823400WRu, c805400VicLIZIZ.LIZ));
            String str2 = c805400VicLIZIZ.LIZJ;
            if (str2 != null) {
                privacyEventLIZ.addCallSiteInfo("scheme", new C0WQ8(enumC823400WRu, str2));
            }
            String str3 = c805400VicLIZIZ.LIZLLL;
            if (str3 != null) {
                privacyEventLIZ.addCallSiteInfo("host", new C0WQ8(enumC823400WRu, str3));
            }
            String str4 = c805400VicLIZIZ.LJ;
            if (str4 != null) {
                privacyEventLIZ.addCallSiteInfo("sl_domain", new C0WQ8(enumC823400WRu, str4));
            }
            String str5 = c805400VicLIZIZ.LJFF;
            if (str5 != null) {
                privacyEventLIZ.addCallSiteInfo("path", new C0WQ8(enumC823400WRu, str5));
            }
            Map<String, String> map = c805400VicLIZIZ.LJI;
            if (map != null && (!map.isEmpty())) {
                privacyEventLIZ.addCallSiteInfo("querys", new C0WQ8(EnumC823400WRu.Any, map));
            }
            String str6 = c805400VicLIZIZ.LJII;
            if (str6 != null) {
                privacyEventLIZ.addCallSiteInfo("query_str", new C0WQ8(enumC823400WRu, str6));
            }
        }
        privacyEventLIZ.addCallSiteInfo("jsb_name", new C0WQ8(enumC823400WRu, c0wla.LIZIZ));
        privacyEventLIZ.addCallSiteInfo("jsb_namespace", new C0WQ8(enumC823400WRu, c0wla.LIZJ));
        JSONObject jSONObject = c0wla.LJFF;
        if (jSONObject != null && jSONObject.length() > 0) {
            privacyEventLIZ.addCallSiteInfo("parameters", new C0WQ8(EnumC823400WRu.Any, C2348209Ia.LJ(jSONObject)));
        }
        for (C0WRN c0wrn : EventPipeline.handleEvent(privacyEventLIZ, null)) {
            final String str7 = c0wrn.LIZIZ;
            String str8 = c0wrn.LIZ.LIZIZ;
            String str9 = "jsb_h5";
            if (Intrinsics.LJFF(str8, "fuse")) {
                if (c0wl8 != null) {
                    c0wl8.LIZ(new AwS127S1100000_13(c0wla, str8, 2));
                }
                if (!Intrinsics.LJFF(c0wla.LJIILLIIL, "H5")) {
                    str9 = "jsb_lynx";
                }
                C800860VbI.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, str9);
                return new Pair(Boolean.TRUE, str7);
            }
            if (Intrinsics.LJFF(str8, "report")) {
                C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0Vid
                    public final /* synthetic */ boolean LLILZ = true;

                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C0WLA c0wla2 = c0wla;
                        String str10 = str7;
                        C805400Vic c805400Vic = c805400VicLIZIZ;
                        boolean z = this.LLILZ;
                        C1C7U.LIZ("RaspBridgeChecker@d836.report$1L");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("jsb_name", c0wla2.LIZIZ);
                        if (str10 != null) {
                            jSONObject2.put("risk_id", str10);
                        }
                        if (c805400Vic != null) {
                            String str11 = c805400Vic.LIZ;
                            if (str11 != null) {
                                jSONObject2.put("url", str11);
                            }
                            String str12 = c805400Vic.LIZLLL;
                            if (str12 != null) {
                                jSONObject2.put("host", str12);
                            }
                            String str13 = c805400Vic.LIZJ;
                            if (str13 != null) {
                                jSONObject2.put("scheme", str13);
                            }
                            String str14 = c805400Vic.LJFF;
                            if (str14 != null) {
                                jSONObject2.put("path", str14);
                            }
                            Map<String, String> map2 = c805400Vic.LJI;
                            if (map2 != null && (!map2.isEmpty())) {
                                if (z) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Iterator<Map.Entry<String, String>> it2 = map2.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        linkedHashMap.put(it2.next().getKey(), "");
                                    }
                                    jSONObject2.put("querys", linkedHashMap);
                                } else {
                                    jSONObject2.put("querys", map2);
                                }
                            }
                        }
                        C0VZK.LIZJ("rasp_risk_jsb", jSONObject2);
                        C1C7U.LIZIZ("RaspBridgeChecker@d836.report$1L");
                    }
                });
                if (!Intrinsics.LJFF(c0wla.LJIILLIIL, "H5")) {
                    str9 = "jsb_lynx";
                }
                C800860VbI.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, str9);
            }
        }
        return new Pair(Boolean.FALSE, null);
    }
}
