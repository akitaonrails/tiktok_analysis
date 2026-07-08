package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0mjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407790mjp extends C09AY implements Function2<TuxSheet, View, Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407790mjp(VideoPublishEditModel videoPublishEditModel, Context context, String str, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(TuxSheet tuxSheet, View view) {
        this.LL.creativeModel.editSaveLocalModel.forceSaveToVideo = false;
        C1413230msb c1413230msb = new C1413230msb(this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZ);
        C1408210mkV c1408210mkV = new C1408210mkV(view, c1413230msb);
        c1413230msb.LIZJ(new AwS388S0200000_22(tuxSheet, c1408210mkV, 143));
        c1408210mkV.LIZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LL.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", this.LL.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LL));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LL));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(this.LL));
        c0lab.LIZ(this.LL.creativeModel.commonMobModel.originVideoCount, "video_cnt");
        c0lab.LIZ(this.LL.creativeModel.commonMobModel.originPhotoCount, "pic_cnt");
        c0lab.LJ("entrance_type", this.LLILLL);
        c0lab.LIZ(this.LLILZIL, "is_save_format_option");
        c0lab.LIZ(this.LLILZLL, "is_choose_photo_option");
        c0lab.LJ("action_type", "click_entrance");
        c0lab.LIZ(C1428470nHB.LJJJZ(this.LL) ? 1 : 0, "is_draft");
        C572310McX.LJ(this.LL, c0lab);
        C20684815ws.LJIILLIIL("save_local_photo_selection", c0lab.LIZ);
        return Unit.LIZ;
    }
}
