package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509630pO5 extends FeatureProducer {
    public static boolean LJ;
    public static JSONObject LJI;
    public static ArrayList<AbstractC1509490pNr> LJII;
    public static final HashMap<String, InterfaceC1509660pO8> LJIIJ;
    public static final C1509630pO5 LIZIZ = new C1509630pO5();
    public static String LIZJ = "f_photo_mode";
    public static boolean LIZLLL = true;
    public static final C1487590ooX<AbstractC1509490pNr> LJFF = new C1487590ooX<>("f_photo_mode", 48);
    public static int LJIIIIZZ = -1;
    public static final HashMap<String, String> LJIIIZ = C2097608Jq.LJI(new Pair("fpm_like_cnt", "fpm_like"), new Pair("fpm_dislike_cnt", "fpm_dislike"), new Pair("fpm_comment_cnt", "fpm_comment"), new Pair("fpm_share_cnt", "fpm_share"), new Pair("fpm_favourite_cnt", "fpm_favourite"), new Pair("fpm_images_cnt", "fpm_images"), new Pair("fpm_image_black_screen_cnt", "fpm_image_black_screen"));

    static {
        C1509590pO1 c1509590pO1 = C1509590pO1.LIZ;
        LJIIJ = C2097608Jq.LJI(new Pair("fpm_playtime_min", C1509650pO7.LIZ), new Pair("fpm_playtime_max", C1509600pO2.LIZ), new Pair("fpm_playtime_avg", c1509590pO1), new Pair("fpm_playtime_total", C1509570pNz.LIZ), new Pair("fpm_playtime_mid", C1509580pO0.LIZ), new Pair("fpm_image_avg_load_duration", c1509590pO1));
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    public static final AbstractC1509490pNr LIZ(String str) {
        if (!LJ) {
            return null;
        }
        return LJFF.LIZ(str);
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (LIZLLL) {
            LIZLLL = false;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(C1509640pO6.LIZIZ);
            LJ = true;
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007a A[SYNTHETIC] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r8, org.json.JSONObject r9, java.lang.String r10, com.ss.ugc.clientai.core.api.meta.ReturnCode r11) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509630pO5.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
