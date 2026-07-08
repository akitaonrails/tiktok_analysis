package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EG0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Pair<Integer, Integer> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EG0(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, long j, Pair<Integer, Integer> pair, String str, String str2, int i, int i2) {
        super(0);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c0e48;
        this.LLILLL = j;
        this.LLILZ = pair;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0E55 player;
        String strLIZIZ = C298260Bma.LIZ() ? C1412490mrP.LIZIZ(this.LL) : this.LL.getMusicOriginWithCheck();
        C0LAB c0labLJFF = C361680EFy.LJFF(this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ);
        c0labLJFF.LJ("tab_name", this.LLILZIL);
        c0labLJFF.LJ("enter_method", this.LLILZLL);
        c0labLJFF.LJ("enter_from", this.LL.getEnterFrom());
        c0labLJFF.LJ("shoot_way", this.LL.mShootWay);
        c0labLJFF.LJ("content_source", C1428470nHB.LJIILIIL(this.LL));
        c0labLJFF.LJ("content_type", C1428470nHB.LJIILL(this.LL));
        C0E48 c0e48 = this.LLILLJJLI;
        c0labLJFF.LIZIZ((c0e48 == null || (player = c0e48.getPlayer()) == null) ? 0L : player.qq(), "creation_duration");
        c0labLJFF.LJ("creation_id", this.LL.getCreationId());
        c0labLJFF.LJ("music_selected_from", strLIZIZ);
        c0labLJFF.LIZ(this.LLIZ + this.LLIZLLLIL > 1 ? 1 : 0, "is_multi_content");
        c0labLJFF.LIZ(this.LLIZ, "video_cnt");
        c0labLJFF.LIZ(this.LLIZLLLIL, "pic_cnt");
        c0labLJFF.LIZ(1, "is_editor_pro");
        c0labLJFF.LIZ(C1428470nHB.LJJLIIIJLJLI(this.LL) ? 1 : 0, "is_from_create_template");
        c0labLJFF.LJ("editorpro_click_from", this.LL.getEditorProModel().getClickFrom());
        VideoPublishEditModel videoPublishEditModel = this.LL;
        String str = this.LLILZIL;
        C0E48 c0e482 = this.LLILLJJLI;
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            c0labLJFF.LJ("draft_way", "general_draft_list");
        }
        if (Intrinsics.LJFF(str, "lyrics") && C1403850mdT.LJFF(videoPublishEditModel)) {
            c0labLJFF.LJ("music_lyrics_status", C1444810nhX.LIZJ(videoPublishEditModel.creativeModel.musicBuzModel) ? "1" : CardStruct.IStatusCode.DEFAULT);
            c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e482));
        }
        if (Intrinsics.LJFF(str, "copy") || Intrinsics.LJFF(str, "split")) {
            c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e482));
        }
        C20684815ws.LJIILLIIL("edit_panel_show", c0labLJFF.LIZ);
        return Unit.LIZ;
    }
}
