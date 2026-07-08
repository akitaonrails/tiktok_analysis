package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.general.SearchDetailPlayComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664360Q4c {
    public static final C664360Q4c LIZ = new C664360Q4c();
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static Map<String, ? extends Object> LJFF;
    public static int LJI;
    public static C11JF LJII;

    public static void LIZLLL() {
        LJI = 0;
        LIZIZ = 0L;
        LIZJ = 0L;
        LIZLLL = 0L;
        LJ = 0L;
        LJFF = null;
        C11JF c11jf = LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public static void LIZIZ(Map map) {
        LIZLLL();
        LJI = 1;
        LIZIZ = System.currentTimeMillis();
        LJFF = map;
        LJII = (C11JF) C1906580ziK.LIZJ().LJIIIZ().LJJLJLI(new C09JN() { // from class: X.0PLx
            @Override // X.C09JN
            public final void accept(Object obj) {
                Object obj2;
                AbstractC1387200mCc abstractC1387200mCc;
                AbstractC1387200mCc abstractC1387200mCc2;
                C1C7U.LIZ("SearchEnterDetailMonitor@4dab.openDetailPageNew$1");
                C813430VvZ c813430VvZ = (C813430VvZ) obj;
                Object obj3 = null;
                if (c813430VvZ != null && (abstractC1387200mCc2 = c813430VvZ.LIZ) != null) {
                    obj2 = abstractC1387200mCc2.LIZ;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof InterfaceC1058480deQ) {
                    C664360Q4c.LIZ.getClass();
                    int i = C664360Q4c.LJI;
                    if (i == 1 || i == 3) {
                        C664360Q4c.LIZJ = System.currentTimeMillis();
                        C664360Q4c.LJI = 2;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive create event, source:");
                if (c813430VvZ != null && (abstractC1387200mCc = c813430VvZ.LIZ) != null) {
                    obj3 = abstractC1387200mCc.LIZ;
                }
                sbLIZ.append(obj3);
                C2188811AlT.LIZIZ(sbLIZ);
                C1C7U.LIZIZ("SearchEnterDetailMonitor@4dab.openDetailPageNew$1");
            }
        });
    }

    public static C664380Q4e LIZ(String str, String str2) {
        long j;
        long j2;
        int i = LJI;
        if (i != 3 && i != 2) {
            return null;
        }
        LJI = 4;
        LJ = System.currentTimeMillis();
        if (C643410PLn.LIZ() && Intrinsics.LJFF(str2, "resumePlay")) {
            j = LJ;
            j2 = LIZLLL;
        } else {
            j = LJ;
            j2 = LIZIZ;
        }
        long j3 = j - j2;
        C664380Q4e c664380Q4e = new C664380Q4e();
        c664380Q4e.LIZIZ = j3;
        c664380Q4e.LIZ = str;
        c664380Q4e.LJII = "general_search";
        c664380Q4e.LJIIIIZZ = "search_inner";
        c664380Q4e.LIZIZ(LJ - LIZIZ, "click_card_to_first_frame");
        c664380Q4e.LIZIZ(LIZJ - LIZIZ, "click_card_to_page_create");
        c664380Q4e.LIZIZ(LIZLLL - LIZJ, "page_create_to_begin_play");
        c664380Q4e.LIZIZ(LJ - LIZLLL, "begin_play_to_first_frame");
        c664380Q4e.LIZJ("play_source", "enter_detail");
        c664380Q4e.LIZJ("render_source", str2);
        int i2 = SearchDetailPlayComponent.LLJ;
        int i3 = C664470Q4n.LIZ().videoPlayDuration;
        if (j3 > i3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("from search click to first frame duration is more than ");
            sbLIZ.append(i3);
            sbLIZ.append(" ms");
            C666110QAv c666110QAv = new C666110QAv(303, C2188811AlT.LIZIZ(sbLIZ));
            c666110QAv.LJ = "general_search";
            c666110QAv.LIZIZ(Long.valueOf(j3), "duration");
            c666110QAv.LIZ(Scene.SCENE_SERVICE, "search_inner");
            c666110QAv.LIZ("play_source", "enter_detail");
            c666110QAv.LIZ("render_source", str2);
            c666110QAv.LIZ("duration", String.valueOf(j3));
            C0QO8.LIZ.LJII(c666110QAv);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click_2_create", LIZJ - LIZIZ);
        jSONObject.put("create_2_play", LJ - LIZJ);
        jSONObject.put("click_2_play", j3);
        Map<String, ? extends Object> map = LJFF;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        C20684815ws.LJIJ("search_detail_video_play", jSONObject);
        LIZLLL();
        return c664380Q4e;
    }
}
