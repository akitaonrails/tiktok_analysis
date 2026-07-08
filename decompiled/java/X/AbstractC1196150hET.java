package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1196150hET {
    public String LIZ() {
        return null;
    }

    public abstract String LIZIZ();

    public final void LIZJ(String str, Function1<? super C1196140hES, Unit> function1) {
        Integer second;
        Integer second2;
        Integer second3;
        Integer second4;
        Integer second5;
        Integer second6;
        String second7;
        String second8;
        String second9;
        Integer second10;
        Integer second11;
        Integer second12;
        String second13;
        String second14;
        String second15;
        String strLIZ = LIZ();
        String second16 = null;
        if (strLIZ == null || strLIZ.length() <= 0) {
            strLIZ = "local_service_experience_track";
        }
        if (C1196170hEV.LIZIZ(strLIZ, str, LIZIZ())) {
            String strLIZIZ = LIZIZ();
            C1196140hES c1196140hES = new C1196140hES(strLIZIZ, str);
            if (function1 != null) {
                function1.invoke(c1196140hES);
            }
            if (!c1196140hES.LJIJ) {
                c1196140hES.LJIJ = true;
                C054G c054g = C1103850epb.LIZ;
                JSONObject jSONObject = new JSONObject();
                C1189060h32.LJIL(jSONObject, "tag", strLIZIZ);
                C1189060h32.LJIL(jSONObject, "key", str);
                C1189060h32.LJIL(jSONObject, "stay_time", c1196140hES.LIZ);
                C1189060h32.LJIL(jSONObject, "net_status_code", c1196140hES.LIZIZ);
                C1189060h32.LJIL(jSONObject, "page_status", null);
                Pair<String, Integer> pair = c1196140hES.LIZJ;
                if (pair != null) {
                    second = pair.getSecond();
                } else {
                    second = null;
                }
                C1189060h32.LJIL(jSONObject, "metric_extras_int1", second);
                Pair<String, Integer> pair2 = c1196140hES.LIZLLL;
                if (pair2 != null) {
                    second2 = pair2.getSecond();
                } else {
                    second2 = null;
                }
                C1189060h32.LJIL(jSONObject, "metric_extras_int2", second2);
                C1189060h32.LJIL(jSONObject, "metric_extras_int3", null);
                C1189060h32.LJIL(jSONObject, "metric_extras_int4", null);
                Pair<String, Integer> pair3 = c1196140hES.LJ;
                if (pair3 != null) {
                    second3 = pair3.getSecond();
                } else {
                    second3 = null;
                }
                C1189060h32.LJIL(jSONObject, "category_extras_int1", second3);
                Pair<String, Integer> pair4 = c1196140hES.LJFF;
                if (pair4 != null) {
                    second4 = pair4.getSecond();
                } else {
                    second4 = null;
                }
                C1189060h32.LJIL(jSONObject, "category_extras_int2", second4);
                Pair<String, Integer> pair5 = c1196140hES.LJI;
                if (pair5 != null) {
                    second5 = pair5.getSecond();
                } else {
                    second5 = null;
                }
                C1189060h32.LJIL(jSONObject, "category_extras_int3", second5);
                Pair<String, Integer> pair6 = c1196140hES.LJII;
                if (pair6 != null) {
                    second6 = pair6.getSecond();
                } else {
                    second6 = null;
                }
                C1189060h32.LJIL(jSONObject, "category_extras_int4", second6);
                Pair<String, String> pair7 = c1196140hES.LJIIIIZZ;
                if (pair7 != null) {
                    second7 = pair7.getSecond();
                } else {
                    second7 = null;
                }
                C1189060h32.LJIL(jSONObject, "extras_str1", second7);
                Pair<String, String> pair8 = c1196140hES.LJIIIZ;
                if (pair8 != null) {
                    second8 = pair8.getSecond();
                } else {
                    second8 = null;
                }
                C1189060h32.LJIL(jSONObject, "extras_str2", second8);
                Pair<String, String> pair9 = c1196140hES.LJIIJ;
                if (pair9 != null) {
                    second9 = pair9.getSecond();
                } else {
                    second9 = null;
                }
                C1189060h32.LJIL(jSONObject, "extras_str3", second9);
                C1189060h32.LJIL(jSONObject, "extras_str4", null);
                Pair<String, Integer> pair10 = c1196140hES.LJIIJJI;
                if (pair10 != null) {
                    second10 = pair10.getSecond();
                } else {
                    second10 = null;
                }
                C1189060h32.LJIL(jSONObject, "numerous_extra_int1", second10);
                Pair<String, Integer> pair11 = c1196140hES.LJIIL;
                if (pair11 != null) {
                    second11 = pair11.getSecond();
                } else {
                    second11 = null;
                }
                C1189060h32.LJIL(jSONObject, "numerous_extra_int2", second11);
                Pair<String, Integer> pair12 = c1196140hES.LJIILIIL;
                if (pair12 != null) {
                    second12 = pair12.getSecond();
                } else {
                    second12 = null;
                }
                C1189060h32.LJIL(jSONObject, "numerous_extra_int3", second12);
                C1189060h32.LJIL(jSONObject, "numerous_extra_int4", null);
                Pair<String, String> pair13 = c1196140hES.LJIILJJIL;
                if (pair13 != null) {
                    second13 = pair13.getSecond();
                } else {
                    second13 = null;
                }
                C1189060h32.LJIL(jSONObject, "numerous_extra_str1", second13);
                Pair<String, String> pair14 = c1196140hES.LJIILL;
                if (pair14 != null) {
                    second14 = pair14.getSecond();
                } else {
                    second14 = null;
                }
                C1189060h32.LJIL(jSONObject, "numerous_extra_str2", second14);
                Pair<String, String> pair15 = c1196140hES.LJIILLIIL;
                if (pair15 != null) {
                    second15 = pair15.getSecond();
                } else {
                    second15 = null;
                }
                C1189060h32.LJIL(jSONObject, "numerous_extra_str3", second15);
                Pair<String, String> pair16 = c1196140hES.LJIIZILJ;
                if (pair16 != null) {
                    second16 = pair16.getSecond();
                }
                C1189060h32.LJIL(jSONObject, "numerous_extra_str4", second16);
                C1103850epb.LIZ(strLIZ, jSONObject);
            }
        }
    }
}
