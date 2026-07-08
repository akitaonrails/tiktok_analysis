package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C653740Pka extends C650460PfI<C653740Pka> {
    public C653740Pka(String str) {
        super(str);
    }

    public final void LJJIJL(Object obj) {
        if (obj != null) {
            LJ("is_from_video", obj.toString());
        }
    }

    public final void LJJIJLIJ(Map map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                LJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public final void LJJIL(SearchBaseFragment searchBaseFragment) {
        C653760Pkc c653760Pkc;
        C0PYB c0pyb = (C0PYB) C0Q3E.LIZIZ(searchBaseFragment).FF2().LIZJ();
        String str = "";
        if (c0pyb.LL.size() <= 1) {
            C0Q2M.LIZ.getClass();
            String strLJIIL = C0Q2M.LJIIL();
            if (strLJIIL != null) {
                str = strLJIIL;
            }
            c653760Pkc = new C653760Pkc(str, EnumC308860C8u.FIRST_SEARCH_IN_SESSION.getTag());
        } else {
            C0PY7 c0py7 = c0pyb.LL.get(0);
            if (c0py7.LIZIZ.length() > 0) {
                c653760Pkc = new C653760Pkc(c0py7.LIZIZ, EnumC308860C8u.INNER_FLOW_VIDEO.getTag());
            } else if (c0py7.LIZJ.length() > 0) {
                c653760Pkc = new C653760Pkc(c0py7.LIZJ, EnumC308860C8u.OUTER_FLOW_VIDEO.getTag());
            } else {
                C0Q2M.LIZ.getClass();
                String strLJIIL2 = C0Q2M.LJIIL();
                if (strLJIIL2 != null) {
                    str = strLJIIL2;
                }
                c653760Pkc = new C653760Pkc(str, EnumC308860C8u.NO_VIDEO.getTag());
            }
        }
        LJ("latest_group_id", c653760Pkc.LIZ);
        LJ("latest_group_id_tag", c653760Pkc.LIZIZ);
    }

    public final void LJJIZ(String str) {
        LJIIZILJ("blankpage_id", str);
    }

    public final void LJJJ(String str) {
        if (Intrinsics.LJFF(str, "general_search")) {
            str = "general";
        }
        LJIIZILJ("from_search_subtab", str);
    }

    public final void LJJJI(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIZILJ("has_coin_task", str);
    }

    public final void LJJJIL(String str) {
        LJIIZILJ("is_login", str);
    }

    public final void LJJJJ(String str) {
        JSONObject jSONObject = new JSONObject(str);
        LJ("last_from_music_id", jSONObject.optString("last_from_music_id"));
        LJ("music_chart_type", jSONObject.optString("type"));
        LIZLLL(jSONObject.optInt("rank"), "music_chart_ranking");
    }

    public final void LJJJJI(String str) {
        try {
            C1227904rF.LIZ.getClass();
            C653750Pkb c653750Pkb = (C653750Pkb) C1227904rF.LIZIZ(str, C653750Pkb.class);
            LJ("words_type", c653750Pkb.wordsType);
            LJ("is_inner", c653750Pkb.isInner());
            LJ("is_play_music", c653750Pkb.isPlayMusic());
            LJ("group_position", c653750Pkb.groupPosition);
            LJ("words_position", c653750Pkb.wordsPosition);
            LJ("inner_rs_doc_rank", c653750Pkb.innerRsDocRank);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
    }

    public final void LJJJJIZL(String str) {
        if (str == null || str.length() == 0) {
            str = "";
        }
        LJ("pre_search_id", str);
    }
}
