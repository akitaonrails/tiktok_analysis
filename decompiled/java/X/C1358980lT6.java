package X;

import com.ss.android.ugc.aweme.upvote.experiment.RepostPublicInteractExp;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358980lT6 extends C09AY implements Function0<String> {
    public C1358980lT6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C1358950lT3.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("batch_list_opt", C08JS.LIZLLL(Integer.valueOf(((Number) C1359070lTF.LIZ.getValue()).intValue())));
        linkedHashMap.put("tt_repost_add_text", C08JS.LIZLLL(Integer.valueOf(((Number) C263730AVf.LIZ.getValue()).intValue())));
        linkedHashMap.put("repost_dm_ai_emoji", C08JS.LIZLLL(Integer.valueOf(((Number) C424430Gkb.LIZJ.getValue()).intValue())));
        linkedHashMap.put("repost_panel_show_count", C08JS.LIZLLL(Integer.valueOf(((Number) C1359060lTE.LIZ.getValue()).intValue())));
        linkedHashMap.put("repost_add_recommend_maf", C08JS.LIZLLL(Integer.valueOf(C1358690lSd.LIZIZ())));
        linkedHashMap.put("repost_tab_data_merge", C08JS.LIZLLL(Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "repost_tab_data_merge", true, false))));
        linkedHashMap.put("repost_support_reply", C08JS.LIZLLL(Integer.valueOf(((Number) C1359110lTJ.LIZ.getValue()).intValue())));
        linkedHashMap.put("repost_support_digg", C08JS.LIZLLL(Integer.valueOf(((Number) C1359050lTD.LIZ.getValue()).intValue())));
        RepostPublicInteractExp.LIZ.getClass();
        linkedHashMap.put("tt_repost_with_note", C08JS.LIZLLL(Boolean.valueOf(RepostPublicInteractExp.LIZ())));
        return C08JS.LIZLLL(linkedHashMap);
    }
}
