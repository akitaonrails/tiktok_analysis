package X;

import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LIN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LIN implements InterfaceC540360LHe {
    public final /* synthetic */ C0LIL LIZ;

    @Override // X.InterfaceC540360LHe
    public final Function1<AwemeDraft, Unit> LIZ() {
        return null;
    }

    public C0LIN(C0LIL c0lil) {
        this.LIZ = c0lil;
    }

    @Override // X.InterfaceC540360LHe
    public final void LIZIZ(C540340LHc c540340LHc) {
        C19GS c19gs = this.LIZ.LJII;
        if (c19gs != null && !c19gs.isFinishing()) {
            C19GS c19gs2 = this.LIZ.LJII;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(this.LIZ.LJII.getString(2131829844));
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(c19gs2, 1008, creativeToastBuilder);
            C1402520mbK.LJI(C1402520mbK.LIZ, this.LIZ.LIZIZ, "video_edit_page", 0, true, 16);
            C0LIL c0lil = this.LIZ;
            if (c0lil.LIZIZ.creativeModel.draftInfoModel.isDraft) {
                c0lil.LJFF(true);
            } else {
                c0lil.LJI();
            }
        }
    }

    @Override // X.InterfaceC540360LHe
    public final void LIZJ(C540340LHc c540340LHc) {
        C19GS c19gs;
        int i;
        TextImageTaskInfo textImageTaskInfoLIZJ;
        String uri;
        C19GS c19gs2 = this.LIZ.LJII;
        if (c19gs2 != null && !c19gs2.isFinishing()) {
            C0CHQ.LIZ().LJIIJ().LJFF();
            this.LIZ.LJII();
            C0LIL c0lil = this.LIZ;
            C19GS c19gs3 = c0lil.LJII;
            if (c19gs3 != null) {
                TextImageTaskInfo textImageTaskInfoLIZJ2 = C572250McR.LIZJ(c0lil.LIZIZ.creativeModel.text2ImageModel);
                String type = null;
                if (textImageTaskInfoLIZJ2 != null) {
                    type = textImageTaskInfoLIZJ2.getType();
                }
                if (Intrinsics.LJFF(type, C0LIV.AI.getType()) && ((textImageTaskInfoLIZJ = C572250McR.LIZJ(c0lil.LIZIZ.creativeModel.text2ImageModel)) == null || (uri = textImageTaskInfoLIZJ.getUri()) == null || uri.length() == 0)) {
                    c19gs = c0lil.LJII;
                    i = 2131821529;
                } else {
                    c19gs = c0lil.LJII;
                    i = 2131829845;
                }
                String string = c19gs.getString(i);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(string);
                creativeToastBuilder.acrossActivities(true);
                C1390380mHk.LIZ(c19gs3, 1007, creativeToastBuilder);
            }
            C1402520mbK.LJI(C1402520mbK.LIZ, this.LIZ.LIZIZ, "video_edit_page", 1, true, 16);
            C0LIL c0lil2 = this.LIZ;
            if (c0lil2.LIZIZ.creativeModel.draftInfoModel.isDraft) {
                c0lil2.LJFF(true);
                return;
            }
            if (C301590Brx.LIZ()) {
                C0LIL c0lil3 = this.LIZ;
                c0lil3.getClass();
                C0CHQ.LIZ().LJIIJ().LJFF();
                C1402610mbT.LJJIJIIJIL(c0lil3.LIZIZ);
                C1440005kM.LIZ(new C0LIQ());
                c0lil3.LIZ.finish();
                return;
            }
            this.LIZ.LJI();
        }
    }
}
