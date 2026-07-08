package X;

import Y.ARunnableS1S1000000_3;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;

/* JADX INFO: renamed from: X.0nfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443560nfW {
    public static String LIZ = null;
    public static String LIZIZ = null;
    public static String LIZJ = null;
    public static String LIZLLL = null;
    public static String LJ = null;
    public static String LJFF = null;
    public static String LJI = null;
    public static String LJII = null;
    public static int LJIIIIZZ = 0;
    public static boolean LJIIIZ = false;
    public static String LJIIJ = "";
    public static String LJIIJJI;
    public static String LJIIL;

    public static String LJII() {
        String str = LJIIL;
        return (str == null || str.isEmpty()) ? KevaImpl.getRepo("keva_publish_finish_from_group_id", 1).getString("key_publish_finish_from_group_id", "") : LJIIL;
    }

    public static String LJIIIIZZ() {
        String string = LIZ;
        if (C2105908Mv.LIZ(string)) {
            string = KevaImpl.getRepo("start_record_feed_param", 1).getString("video_id", "");
        }
        if (string != null) {
            for (char c : string.toCharArray()) {
                if (Character.isDigit(c)) {
                }
            }
            return string;
        }
        return "";
    }

    public static String LIZ() {
        return LJI;
    }

    public static String LIZIZ() {
        return LJII;
    }

    public static String LIZJ() {
        return LJIIJJI;
    }

    public static int LIZLLL() {
        return LJIIIIZZ;
    }

    public static String LJ() {
        return LIZLLL;
    }

    public static String LJFF() {
        return LIZIZ;
    }

    public static String LJI() {
        return LIZJ;
    }

    public static void LJIIIZ(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str2 : str.split(",", 8)) {
            i++;
            if (i == 1) {
                sb.append(str2);
            } else {
                if (i > 7) {
                    break;
                }
                sb.append(",");
                sb.append(str2);
            }
        }
        LJII = sb.toString();
    }

    public static void LJIIJ(String str) {
        LJIIL = str;
        KevaImpl.getRepo("keva_publish_finish_from_group_id", 1).storeString("key_publish_finish_from_group_id", str);
    }

    public static void LJIIJJI(String str) {
        LJ = str;
    }

    public static void LJIIL(Aweme aweme) {
        if (aweme != null && !AwemeExtKt.isCard(aweme) && !AwemeSaaSExtKt.isLive(aweme)) {
            String aid = aweme.getAid();
            LIZ = aid;
            C823050WQl.LIZLLL().submit(new ARunnableS1S1000000_3(aid, 1));
        }
    }
}
