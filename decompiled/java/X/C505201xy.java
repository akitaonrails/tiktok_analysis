package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C505201xy {
    public static final C505201xy LIZ = new C505201xy();

    public static void LIZIZ(Long l, String str, String str2, String str3, String str4) {
        Integer numValueOf;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("stage", String.valueOf(l));
        if (str3 != null) {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str3));
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "theme");
        c2344009Gk.LJIIIIZZ("task_id", str4);
        c2344009Gk.LJIIIIZZ("option_index", str2);
        c2344009Gk.LJIIIIZZ("event_type", str);
        C20684815ws.LJIILLIIL("livesdk_live_center_other_reason_panel", c2344009Gk.LIZ);
    }

    public static void LIZ(Long l, String str, String str2, String str3, String str4, boolean z) {
        String string;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() < 4) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("enter_from", (String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
        c2344009Gk.LJIIIIZZ("event_page", (String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        c2344009Gk.LJIIIIZZ("request_page", (String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
        c2344009Gk.LJIIIIZZ("click_position", (String) ListProtector.get(listLJJLIIIJILLIZJL, 3));
        Integer numValueOf = null;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        c2344009Gk.LJIIIIZZ("stage", string);
        if (str3 != null) {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str3));
        }
        c2344009Gk.LJ(numValueOf, "theme");
        c2344009Gk.LJIIIIZZ("task_id", str4);
        c2344009Gk.LJIIIIZZ("show_type", str);
        if (z) {
            c2344009Gk.LJIIIIZZ("event_type", "show");
            C20684815ws.LJIILLIIL("livesdk_live_center_video_feedback", c2344009Gk.LIZ);
        } else {
            c2344009Gk.LJIIIIZZ("event_type", "click");
            C20684815ws.LJIILLIIL("livesdk_live_center_video_feedback", c2344009Gk.LIZ);
        }
    }

    public static void LIZJ(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7) {
        String string;
        String str8;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        Integer numValueOf = null;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        c2344009Gk.LJIIIIZZ("stage", string);
        if (str6 != null) {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str6));
        }
        c2344009Gk.LJ(numValueOf, "theme");
        c2344009Gk.LJIIIIZZ("task_id", str7);
        c2344009Gk.LJIIIIZZ("option_index", str2);
        if (z) {
            c2344009Gk.LJIIIIZZ("event_type", "show");
            C20684815ws.LJIILLIIL("livesdk_live_center_feedback_question", c2344009Gk.LIZ);
            return;
        }
        if (z2) {
            if (z3) {
                str8 = "1";
            } else {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_succeed", str8);
            c2344009Gk.LJIIIIZZ("submit_option", str4);
            c2344009Gk.LJFF("platform", str5);
            if (!z3) {
                c2344009Gk.LJFF("fail_reason", str);
            }
        }
        c2344009Gk.LJIIIIZZ("event_type", "click");
        c2344009Gk.LJIIIIZZ("icon_type", str3);
        C20684815ws.LJIILLIIL("livesdk_live_center_feedback_question", c2344009Gk.LIZ);
    }
}
