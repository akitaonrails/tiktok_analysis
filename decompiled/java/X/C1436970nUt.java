package X;

import Y.AObjectS365S0100000_22;
import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lth.o;

/* JADX INFO: renamed from: X.0nUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436970nUt implements InterfaceC540360LHe {
    public VideoPublishEditModel LIZ;
    public final /* synthetic */ CreativeLoadingDialog LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ VideoPublishContainerScene LIZLLL;

    @Override // X.InterfaceC540360LHe
    public final Function1<AwemeDraft, Unit> LIZ() {
        return new AObjectS365S0100000_22(this, 1);
    }

    @Override // X.InterfaceC540360LHe
    public final void LIZIZ(C540340LHc c540340LHc) {
        this.LIZIZ.dismiss();
        VideoPublishContainerScene videoPublishContainerScene = this.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        videoPublishContainerScene.getClass();
        VideoPublishContainerScene.m(jCurrentTimeMillis, "tool_performance_click_publish_save_draft_cost_time_failed");
        if (C1906580ziK.LJ() != null && this.LIZ != null) {
            C537710L6z c537710L6z = C537710L6z.LIZ;
            Activity activityLIZIZ = C1906580ziK.LJ().LIZIZ();
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            c537710L6z.getClass();
            C537710L6z.LIZJ(activityLIZIZ, videoPublishEditModel);
        }
        C560920LzG.LIZ(this.LIZLLL.LLLLIILL, false, false);
        if (!((Boolean) C280930Azj.LIZ.getValue()).booleanValue()) {
            this.LIZLLL.b0();
        }
    }

    @Override // X.InterfaceC540360LHe
    public final void LIZJ(C540340LHc c540340LHc) {
        Activity activityLIZIZ;
        this.LIZIZ.dismiss();
        VideoPublishContainerScene videoPublishContainerScene = this.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        videoPublishContainerScene.getClass();
        VideoPublishContainerScene.m(jCurrentTimeMillis, "tool_performance_click_publish_save_draft_cost_time_success");
        o.LJJ.LJIIIIZZ().LIZ().LJFF(c540340LHc.LIZIZ);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            new C1439160nYQ(activityLIZIZ, new C1421880n6Y(activityLIZIZ, this.LIZLLL.LLLLIILL)).LIZ(c540340LHc.LIZIZ);
        }
        if (C1906580ziK.LJ() != null && this.LIZ != null) {
            C537710L6z c537710L6z = C537710L6z.LIZ;
            Activity activityLIZIZ2 = C1906580ziK.LJ().LIZIZ();
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            c537710L6z.getClass();
            C537710L6z.LIZJ(activityLIZIZ2, videoPublishEditModel);
        }
        C560920LzG.LIZ(this.LIZLLL.LLLLIILL, false, true);
        if (!((Boolean) C280930Azj.LIZ.getValue()).booleanValue()) {
            this.LIZLLL.b0();
        }
    }

    public C1436970nUt(VideoPublishContainerScene videoPublishContainerScene, CreativeDialogWrapper creativeDialogWrapper, long j) {
        this.LIZLLL = videoPublishContainerScene;
        this.LIZIZ = creativeDialogWrapper;
        this.LIZJ = j;
    }
}
