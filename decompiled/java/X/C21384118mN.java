package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18mN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21384118mN {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public int LJ = -1;

    public static void LIZJ(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("language_selected", (String) C746760TRa.LIZ().LJIIIIZZ().getValue());
    }

    public final void LIZ(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZJ);
        c2344009Gk.LJIIIIZZ("group_id", this.LIZ);
        c2344009Gk.LJIIIIZZ("user_id", this.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LIZLLL);
    }

    public final void LIZLLL(EnumC21384218mO enumC21384218mO) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", this.LIZ);
        c2344009Gk.LJIIIIZZ("button_type", enumC21384218mO.getLoggingName());
        C20684815ws.LJIILLIIL("click_edit_language", c2344009Gk.LIZ);
    }

    public final void LJI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk);
        c2344009Gk.LIZJ(this.LJ, "previous_save_edit_cnt");
        LIZJ(c2344009Gk);
        c2344009Gk.LJIIIIZZ("subtitle_status", str);
        C20684815ws.LJIILLIIL("edit_saved_in_edit_captions", c2344009Gk.LIZ);
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, EnumC21383518mH enumC21383518mH) {
        String loggingName;
        if (enumC21383518mH != null) {
            loggingName = enumC21383518mH.getLoggingName();
        } else {
            loggingName = null;
        }
        c2344009Gk.LJIIIIZZ("clicked", loggingName);
    }

    public final void LJII(boolean z, Boolean bool) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk);
        c2344009Gk.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "with_edit_hint");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("get_captions_failed", str);
        C20684815ws.LJIILLIIL("enter_edit_captions", c2344009Gk.LIZ);
    }

    public final void LJIIIIZZ(EnumC21383518mH enumC21383518mH, String str) {
        String loggingName;
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk);
        if (enumC21383518mH != null) {
            loggingName = enumC21383518mH.getLoggingName();
        } else {
            loggingName = null;
        }
        c2344009Gk.LJIIIIZZ("enter_type", loggingName);
        LIZJ(c2344009Gk);
        c2344009Gk.LJIIIIZZ("subtitle_status", str);
        C20684815ws.LJIILLIIL("enter_secondary_edit_captions", c2344009Gk.LIZ);
    }

    public C21384118mN(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }

    public final void LJ(EnumC21383518mH enumC21383518mH, String str, boolean z, boolean z2) {
        String str2;
        if (z2) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            LIZ(c2344009Gk);
            LIZIZ(c2344009Gk, enumC21383518mH);
            LIZJ(c2344009Gk);
            c2344009Gk.LJIIIIZZ("subtitle_status", str);
            C20684815ws.LJIILLIIL("click_in_secondary_edit_captions", c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        LIZ(c2344009Gk2);
        LIZIZ(c2344009Gk2, enumC21383518mH);
        if (z) {
            str2 = "enabled";
        } else {
            str2 = "disabled";
        }
        c2344009Gk2.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c2344009Gk2.LIZJ(this.LJ, "previous_save_edit_cnt");
        LIZJ(c2344009Gk2);
        c2344009Gk2.LJIIIIZZ("subtitle_status", str);
        C20684815ws.LJIILLIIL("click_in_edit_captions", c2344009Gk2.LIZ);
    }

    public final void LJFF(EnumC21383518mH enumC21383518mH, String str, boolean z, boolean z2) {
        if (z2) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            LIZ(c2344009Gk);
            c2344009Gk.LIZJ(z ? 1 : 0, "confirmed");
            LIZIZ(c2344009Gk, enumC21383518mH);
            LIZJ(c2344009Gk);
            c2344009Gk.LJIIIIZZ("subtitle_status", str);
            C20684815ws.LJIILLIIL("confirm_cancel_in_secondary_edit_captions", c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        LIZ(c2344009Gk2);
        c2344009Gk2.LIZJ(z ? 1 : 0, "confirmed");
        LIZIZ(c2344009Gk2, enumC21383518mH);
        c2344009Gk2.LIZJ(this.LJ, "previous_save_edit_cnt");
        LIZJ(c2344009Gk2);
        c2344009Gk2.LJIIIIZZ("subtitle_status", str);
        C20684815ws.LJIILLIIL("confirm_click_in_edit_captions", c2344009Gk2.LIZ);
    }
}
