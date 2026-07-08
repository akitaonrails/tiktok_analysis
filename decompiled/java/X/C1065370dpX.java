package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Map;

/* JADX INFO: renamed from: X.0dpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065370dpX {
    public static C1065100dp6 LIZ(InterfaceC1066840dru interfaceC1066840dru) {
        String logExtra;
        AnchorCommonStruct anchorCommonStructLJI = interfaceC1066840dru.LJI();
        if (anchorCommonStructLJI != null) {
            logExtra = anchorCommonStructLJI.getLogExtra();
        } else {
            logExtra = null;
        }
        return new C1065100dp6(logExtra);
    }

    public static void LIZIZ(InterfaceC1066840dru interfaceC1066840dru, String str, Aweme aweme, C2344009Gk c2344009Gk) {
        String authorUid;
        String requestId;
        String aid;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "title_panel_video_anchor");
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("main_anchor_id", interfaceC1066840dru.LJIIIIZZ().LIZ());
        c2344009Gk.LJIIIIZZ("main_anchor_name", interfaceC1066840dru.LJIIIIZZ().LIZIZ());
        c2344009Gk.LJIIIIZZ("main_anchor_type", interfaceC1066840dru.LJIIIIZZ().LJ());
        c2344009Gk.LJIIIIZZ("anchor_id", interfaceC1066840dru.LJIIIIZZ().LIZ());
        c2344009Gk.LJIIIIZZ("anchor_name", interfaceC1066840dru.LJIIIIZZ().LIZIZ());
        c2344009Gk.LJIIIIZZ("anchor_type", interfaceC1066840dru.LJIIIIZZ().LJ());
        if (aweme != null) {
            requestId = aweme.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LJIIIIZZ("click_method", "click_anchor");
        Map<String, String> map = c2344009Gk.LIZ;
        C698670Rar.LIZ.getClass();
        C698670Rar.LIZIZ(aweme, map);
        C20684815ws.LJIILLIIL("multi_anchor_entrance_click", map);
        C20684815ws.LJIILLIIL("enter_multi_anchor_detail", map);
    }

    public static void LIZJ(InterfaceC1066840dru interfaceC1066840dru, String str, Aweme aweme, C2344009Gk c2344009Gk) {
        String authorUid;
        String requestId;
        String aid;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "title_panel_video_anchor");
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("main_anchor_id", interfaceC1066840dru.LJIIIIZZ().LIZ());
        c2344009Gk.LJIIIIZZ("main_anchor_name", interfaceC1066840dru.LJIIIIZZ().LIZIZ());
        c2344009Gk.LJIIIIZZ("main_anchor_type", interfaceC1066840dru.LJIIIIZZ().LJ());
        c2344009Gk.LJIIIIZZ("anchor_id", interfaceC1066840dru.LJIIIIZZ().LIZ());
        c2344009Gk.LJIIIIZZ("anchor_name", interfaceC1066840dru.LJIIIIZZ().LIZIZ());
        c2344009Gk.LJIIIIZZ("anchor_type", interfaceC1066840dru.LJIIIIZZ().LJ());
        if (aweme != null) {
            requestId = aweme.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LJIIIIZZ("click_method", "click_anchor");
        Map<String, String> map = c2344009Gk.LIZ;
        C698670Rar.LIZ.getClass();
        C698670Rar.LIZIZ(aweme, map);
        C20684815ws.LJIILLIIL("multi_anchor_entrance_show", map);
    }
}
