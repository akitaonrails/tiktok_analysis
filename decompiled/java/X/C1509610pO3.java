package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pO3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509610pO3 extends FeatureProducer {
    public static boolean LIZJ;
    public static JSONObject LJFF;
    public static ArrayList<AbstractC1509490pNr> LJI;
    public static final C1509610pO3 LIZIZ = new C1509610pO3();
    public static String LIZLLL = "f_play";
    public static final C1487590ooX<AbstractC1509490pNr> LJ = new C1487590ooX<>("f_play", 48);
    public static int LJII = -1;
    public static final Map<String, String> LJIIIIZZ = C2097608Jq.LJIIJ(new Pair("cur_finish", "finish"), new Pair("cur_like", "like"), new Pair("cur_follow", "follow"), new Pair("cur_favorite", "favorite"), new Pair("cur_comment", "comment"), new Pair("cur_pause", "pause"), new Pair("cur_head", "head"), new Pair("cur_playtime", "play_time"), new Pair("cur_music", "music"));
    public static final Map<String, String> LJIIIZ = C2097608Jq.LJIIJ(new Pair("finish_cnt", "finish"), new Pair("head_cnt", "head"), new Pair("comment_cnt", "comment"), new Pair("like_cnt", "like"), new Pair("dislike_cnt", "dislike"), new Pair("report_cnt", "report"), new Pair("follow_cnt", "follow"), new Pair("music_cnt", "music"), new Pair("share_cnt", "share"), new Pair("skip_cnt", "skip"), new Pair("click_pause_cnt", "pause"), new Pair("favourite_cnt", "favorite"), new Pair("enter_tag_cnt", "enter_tag"), new Pair("clk_poi_cnt", "clk_poi"));
    public static final HashMap<String, InterfaceC1509660pO8> LJIIJ = C2097608Jq.LJI(new Pair("play_time_min", C1509650pO7.LIZ), new Pair("play_time_max", C1509600pO2.LIZ), new Pair("play_time_avg", C1509590pO1.LIZ), new Pair("play_time_total", C1509570pNz.LIZ), new Pair("play_time_mid", C1509580pO0.LIZ));
    public static boolean LJIIJJI = true;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    public static final AbstractC1509490pNr LIZ(String str) {
        AbstractC1509490pNr abstractC1509490pNrLIZ;
        if (!LIZJ || (abstractC1509490pNrLIZ = LJ.LIZ(str)) == null) {
            return null;
        }
        return abstractC1509490pNrLIZ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        LIZJ = true;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0532, code lost:
    
        if (r35.equals("play_time_avg") == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0539, code lost:
    
        if (r35.equals("play_time_max") == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0540, code lost:
    
        if (r35.equals("play_time_min") == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0547, code lost:
    
        if (r35.equals("play_time_total") == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x054e, code lost:
    
        if (r35.equals("play_time_mid") != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0550, code lost:
    
        r1 = X.C1509610pO3.LJIIJ.get(r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0558, code lost:
    
        if (r1 == null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0562, code lost:
    
        return java.lang.Long.valueOf(r1.LIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0564, code lost:
    
        return null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x00bc A[SYNTHETIC] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r35, org.json.JSONObject r36, java.lang.String r37, com.ss.ugc.clientai.core.api.meta.ReturnCode r38) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509610pO3.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
