package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0y7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845320y7W {
    public long LIZIZ;
    public Long LIZJ;
    public String LIZ = "";
    public Map<String, String> LIZLLL = C2097608Jq.LJ();

    public final C1845340y7Y LIZ() {
        String str;
        Map<String, String> map = this.LIZLLL;
        String str2 = map.get("enter_from");
        if (str2 == null || (str = map.get("enter_method")) == null) {
            return null;
        }
        String str3 = map.get("process_id");
        String str4 = map.get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = map.get("message_id");
        String str6 = map.get("template_id");
        String str7 = map.get("source");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = map.get("tako_chat_id");
        return new C1845340y7Y(str2, str, str3, str4, str8 != null ? str8 : "", str5, str6, str7);
    }

    public final void LIZIZ() {
        C1845340y7Y c1845340y7YLIZ;
        if (this.LIZJ == null || (c1845340y7YLIZ = LIZ()) == null) {
            return;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = c1845340y7YLIZ.LIZ;
        String str2 = c1845340y7YLIZ.LIZIZ;
        String str3 = c1845340y7YLIZ.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c1845340y7YLIZ.LIZLLL;
        String str5 = c1845340y7YLIZ.LJFF;
        String str6 = c1845340y7YLIZ.LJI;
        String str7 = this.LIZ;
        long j = this.LIZIZ;
        String str8 = c1845340y7YLIZ.LJ;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_video_finish", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str8), new Pair("message_id", str5), new Pair("template_id", str6), new Pair("source", str7), new Pair("total_duration", String.valueOf(j))));
    }

    public final void LIZJ() {
        C1845340y7Y c1845340y7YLIZ;
        if (this.LIZJ == null || (c1845340y7YLIZ = LIZ()) == null) {
            return;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = c1845340y7YLIZ.LIZ;
        String str2 = c1845340y7YLIZ.LIZIZ;
        String str3 = c1845340y7YLIZ.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c1845340y7YLIZ.LIZLLL;
        String str5 = c1845340y7YLIZ.LJFF;
        String str6 = c1845340y7YLIZ.LJI;
        String str7 = this.LIZ;
        long j = this.LIZIZ;
        Long l = this.LIZJ;
        long j2 = 0;
        if (l != null) {
            long jLongValue = l.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LIZJ = null;
            long j3 = jCurrentTimeMillis - jLongValue;
            if (j3 >= 0) {
                j2 = j3;
            }
        }
        String str8 = c1845340y7YLIZ.LJ;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_play_time", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str8), new Pair("message_id", str5), new Pair("template_id", str6), new Pair("source", str7), new Pair("duration", String.valueOf(j2)), new Pair("total_duration", String.valueOf(j))));
    }

    public final void LIZLLL() {
        this.LIZJ = Long.valueOf(System.currentTimeMillis());
        C1845340y7Y c1845340y7YLIZ = LIZ();
        if (c1845340y7YLIZ == null) {
            return;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = c1845340y7YLIZ.LIZ;
        String str2 = c1845340y7YLIZ.LIZIZ;
        String str3 = c1845340y7YLIZ.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c1845340y7YLIZ.LIZLLL;
        String str5 = c1845340y7YLIZ.LJFF;
        String str6 = c1845340y7YLIZ.LJI;
        String str7 = this.LIZ;
        long j = this.LIZIZ;
        String str8 = c1845340y7YLIZ.LJ;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_video_play", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str8), new Pair("message_id", str5), new Pair("template_id", str6), new Pair("source", str7), new Pair("total_duration", String.valueOf(j))));
    }
}
