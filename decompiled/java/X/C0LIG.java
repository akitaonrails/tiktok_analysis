package X;

import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LIG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LIG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0LIL LL;
    public final /* synthetic */ boolean LLILLJJLI = true;
    public final /* synthetic */ boolean LLILLL = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LIG(C0LIL c0lil) {
        super(0);
        this.LL = c0lil;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0LIL c0lil = this.LL;
        boolean z = this.LLILLJJLI;
        if (this.LLILLL) {
            c0lil.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0LIF(c0lil, z, null), 3);
        } else {
            VideoPublishEditModel videoPublishEditModel = c0lil.LIZIZ;
            DraftInfoModel draftInfoModel = videoPublishEditModel.creativeModel.draftInfoModel;
            draftInfoModel.fromDraftPopup = z;
            draftInfoModel.saveDraftScene = "saveTextVideoFromEdit";
            C1402520mbK.LIZLLL(videoPublishEditModel, "video_edit_page", null, false, Boolean.FALSE, "", null, null, null);
            C1428470nHB.LIZJ(c0lil.LIZIZ.creativeModel.draftInfoModel);
            new C1438570nXT("");
            C1438570nXT.LJ(c0lil.LIZIZ, "save_draft").lastEditTime = System.currentTimeMillis();
            C1428520nHG.LJLI(c0lil.LIZIZ);
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0LIH(c0lil, z, null), 3);
        }
        return Unit.LIZ;
    }
}
