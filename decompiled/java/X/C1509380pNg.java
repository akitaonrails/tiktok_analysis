package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509380pNg extends FeatureProducer {
    public static boolean LIZLLL;
    public static JSONObject LJII;
    public static ArrayList<AbstractC1509490pNr> LJIIIIZZ;
    public static final C1509380pNg LIZIZ = new C1509380pNg();
    public static boolean LIZJ = true;
    public static final C1487590ooX<AbstractC1509490pNr> LJ = new C1487590ooX<>("f_comment", 48);
    public static String LJFF = "f_comment";
    public static final Map<String, String> LJI = C2097608Jq.LJIIJ(new Pair("post_comment_cnt", "post_comment"), new Pair("like_comment_cnt", "like_comment"), new Pair("post_reply_comment_cnt", "post_reply_comment"), new Pair("total_comment_duration", "comment_duration"), new Pair("favorite_comment_cnt", "favorite_comment"), new Pair("comment_trending_words_show_cnt", "comment_trending_words_show"), new Pair("comment_trending_words_click_cnt", "comment_trending_words_click"));
    public static int LJIIIZ = -1;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LJFF;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (LIZJ) {
            LIZJ = false;
            C1487540ooS.LIZ.getClass();
            C1487540ooS.LIZIZ = true;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(new InterfaceC1510030pOj() { // from class: X.0pNf
                public static final Map<String, Pair<String, String>> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("post_comment", new Pair("post_comment", "g_post_comment")), new Pair("like_comment", new Pair("like_comment", "g_like_comment")), new Pair("post_reply_comment", new Pair("post_reply_comment", "g_post_reply_comment")), new Pair("close_comment", new Pair("comment_duration", "g_comment_duration")), new Pair("favorite_comment", new Pair("favorite_comment", "g_favorite_comment")), new Pair("trending_words_show", new Pair("comment_trending_words_show", "g_comment_trending_words_show")), new Pair("trending_words_click", new Pair("comment_trending_words_click", "g_comment_trending_words_click")));

                @Override // X.InterfaceC1510030pOj
                public final Set<String> events() {
                    return LIZJ.keySet();
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // X.InterfaceC1510030pOj
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void handleAppLogEvent(java.lang.String r9, X.C1510130pOt r10) {
                    /*
                        Method dump skipped, instruction units count: 324
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1509370pNf.handleAppLogEvent(java.lang.String, X.0pOt):void");
                }
            });
            LIZLLL = true;
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LJFF = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0058 A[SYNTHETIC] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r9, org.json.JSONObject r10, java.lang.String r11, com.ss.ugc.clientai.core.api.meta.ReturnCode r12) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509380pNg.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
