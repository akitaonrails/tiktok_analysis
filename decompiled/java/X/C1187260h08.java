package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.Map;

/* JADX INFO: renamed from: X.0h08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187260h08 {
    public static final C1187260h08 LIZ = new C1187260h08();

    public static void LIZJ(String str, Aweme aweme, String str2, String str3, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String aid;
        String aid2;
        String authorUid;
        String string;
        Music music;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_method", "slide");
        String mid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "group_id", aid);
        if (aweme != null) {
            aid2 = aweme.getAid();
        } else {
            aid2 = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "aweme_id", aid2);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "author_id", authorUid);
        if (aweme != null) {
            string = Integer.valueOf(aweme.getAwemeType()).toString();
        } else {
            string = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "aweme_type", string);
        if (aweme != null && (music = aweme.getMusic()) != null) {
            mid = music.getMid();
        }
        C1189060h32.LJJIFFI(c2344009Gk, "music_id", mid);
        C1189060h32.LJIIIIZZ(c2344009Gk, str2);
        C1189060h32.LIZJ(c2344009Gk, str3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF(str, map, c1185050gwZ);
    }

    public static void LIZ(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "group_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "picture_id", str2);
        C1189060h32.LJJIFFI(c2344009Gk, "aweme_type", str3);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "order", string);
        C1189060h32.LJJIFFI(c2344009Gk, "pic_source", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "entity_type", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "topic", str6);
        C1189060h32.LJJIFFI(c2344009Gk, "review_id", str7);
        C1189060h32.LJJIFFI(c2344009Gk, "pic_size", str8);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_background_media_click", map, c1185050gwZ);
    }

    public static void LIZIZ(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "group_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "picture_id", str2);
        C1189060h32.LJJIFFI(c2344009Gk, "aweme_type", str3);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "order", string);
        C1189060h32.LJJIFFI(c2344009Gk, "pic_source", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "entity_type", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "topic", str6);
        C1189060h32.LJJIFFI(c2344009Gk, "review_id", str7);
        C1189060h32.LJJIFFI(c2344009Gk, "pic_size", str8);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_background_media_show", map, c1185050gwZ);
    }
}
