package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11Xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19518411Xy implements InterfaceC19635111rx {
    public final VideoPublishEditModel LIZ;
    public final Function0<String> LIZIZ;

    @Override // X.InterfaceC19635111rx
    public final Map<String, String> LJIIIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("content_source", C1428470nHB.LJIILIIL(this.LIZ)), new Pair("content_type", C1428470nHB.LJIILL(this.LIZ)), new Pair("creation_id", this.LIZ.getCreationId()), new Pair("enter_from", "video_edit_page"), new Pair("enter_method", "click_main_panel"), new Pair("shoot_way", this.LIZ.mShootWay), new Pair("prop_id", this.LIZIZ.invoke()));
    }

    @Override // X.InterfaceC19635111rx
    public final void LJII() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("enter_method", "click_main_panel");
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0lab.LJ("prop_id", this.LIZIZ.invoke());
        C20684815ws.LJIILLIIL("livesdk_cd_sticker_cancel", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LIZIZ(boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("enter_method", "click_main_panel");
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0lab.LJ("edit_type", "title");
        c0lab.LJ("prop_id", this.LIZIZ.invoke());
        c0lab.LIZ(z ? 1 : 0, "is_first_edit");
        C20684815ws.LJIILLIIL("livesdk_cd_sticker_edit", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LJ(boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c0lab.LJ("promote_type", "sticker");
        if (z) {
            str = "auto";
        } else {
            str = "event_list";
        }
        c0lab.LJ("show_type", str);
        c0lab.LJ("create_method", "quick");
        c0lab.LJ("enter_from", "video_edit_page");
        C20684815ws.LJIILLIIL("livesdk_click_create_live_event", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LJFF(boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("prop_id", this.LIZIZ.invoke());
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        if (z) {
            str = "click";
        } else {
            str = "draw";
        }
        c0lab.LJ("action_type", str);
        if (this.LIZ.getDraftId() != 0) {
            c0lab.LIZ(this.LIZ.getDraftId(), "draft_id");
        }
        if (!TextUtils.isEmpty(this.LIZ.getNewDraftId())) {
            c0lab.LJ("new_draft_id", this.LIZ.getNewDraftId());
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("prop_delete", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LJIIJ(boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("enter_method", "click_main_panel");
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0lab.LJ("prop_id", this.LIZIZ.invoke());
        if (z) {
            str = "keep";
        } else {
            str = "discard";
        }
        c0lab.LJ("action_type", str);
        C20684815ws.LJIILLIIL("livesdk_cd_sticker_cancel_confirm", c0lab.LIZ);
    }

    public final void LJIIJJI(C0LAB c0lab) {
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("prop_id", this.LIZIZ.invoke());
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        c0lab.LJ("enter_method", "click_main_panel");
        c0lab.LIZ(1, "is_free");
        c0lab.LJ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
    }

    public C19518411Xy(VideoPublishEditModel videoPublishEditModel, AwS573S0100000_29 awS573S0100000_29) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = awS573S0100000_29;
    }

    @Override // X.InterfaceC19635111rx
    public final void LIZLLL(long j, boolean z) {
        long jCurrentTimeMillis = (j - System.currentTimeMillis()) / 1000;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = -1;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("enter_method", "click_main_panel");
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0lab.LJ("edit_type", "title");
        c0lab.LJ("prop_id", this.LIZIZ.invoke());
        c0lab.LIZ(z ? 1 : 0, "is_first_edit");
        c0lab.LIZIZ(jCurrentTimeMillis, "countdown_time");
        C20684815ws.LJIILLIIL("livesdk_cd_sticker_edit_complete", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LJIIIIZZ(int i, boolean z) {
        C0LAB c0lab = new C0LAB();
        LJIIJJI(c0lab);
        c0lab.LJ("promote_type", "sticker");
        c0lab.LIZ(z ? 1 : 0, "is_first_edit");
        c0lab.LIZ(i, "active_event_num");
        C20684815ws.LJIILLIIL("livesdk_live_event_quickcreate_list_show", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LIZ(long j, long j2, boolean z, boolean z2) {
        C0LAB c0lab = new C0LAB();
        LJIIJJI(c0lab);
        c0lab.LIZ(z ? 1 : 0, "is_complete_add");
        c0lab.LIZIZ(j2, "countdown_time");
        c0lab.LIZ(z2 ? 1 : 0, "is_first_edit");
        c0lab.LIZ(1, "is_free");
        c0lab.LJ("live_event_status", "upcoming");
        c0lab.LIZIZ(j, "live_event_id");
        C20684815ws.LJIILLIIL("livesdk_live_event_sticker_delete", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LIZJ(long j, String str, boolean z, boolean z2) {
        String str2;
        C0LAB c0lab = new C0LAB();
        LJIIJJI(c0lab);
        if (z) {
            str2 = "create";
        } else {
            str2 = "add";
        }
        c0lab.LJ("add_type", str2);
        c0lab.LIZIZ(j, "countdown_time");
        c0lab.LJ("live_event_id", str);
        c0lab.LIZ(z2 ? 1 : 0, "is_first_edit");
        c0lab.LIZ(1, "is_free");
        c0lab.LJ("live_event_status", "upcoming");
        C20684815ws.LJIILLIIL("livesdk_live_event_sticker_add_complete", c0lab.LIZ);
    }

    @Override // X.InterfaceC19635111rx
    public final void LJI(String str, String str2, boolean z, boolean z2) {
        C0LAB c0lab = new C0LAB();
        LJIIJJI(c0lab);
        c0lab.LJ("promote_type", "sticker");
        c0lab.LJ("live_event_id", str);
        c0lab.LJ("action_type", str2);
        c0lab.LIZ(z ? 1 : 0, "is_first_edit");
        c0lab.LIZ(z2 ? 1 : 0, "is_free");
        C20684815ws.LJIILLIIL("livesdk_live_event_quickcreate_list_click", c0lab.LIZ);
    }
}
