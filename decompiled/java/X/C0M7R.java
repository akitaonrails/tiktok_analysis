package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0M7R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7R implements InterfaceC540360LHe {
    public final /* synthetic */ ImageEditRootScene LIZ;

    @Override // X.InterfaceC540360LHe
    public final Function1<AwemeDraft, Unit> LIZ() {
        return null;
    }

    public C0M7R(ImageEditRootScene imageEditRootScene) {
        this.LIZ = imageEditRootScene;
    }

    @Override // X.InterfaceC540360LHe
    public final void LIZIZ(C540340LHc c540340LHc) {
        ImageEditRootScene imageEditRootScene = this.LIZ;
        if (imageEditRootScene.mActivity != null && !imageEditRootScene.requireActivity().isFinishing()) {
            Activity activityRequireActivity = this.LIZ.requireActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(this.LIZ.getString(2131829844));
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(activityRequireActivity, 1008, creativeToastBuilder);
            C1402520mbK c1402520mbK = C1402520mbK.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LIZ.LLJL;
            VideoPublishEditModel videoPublishEditModel2 = null;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            C1402520mbK.LJI(c1402520mbK, videoPublishEditModel, "video_edit_page", 0, true, 16);
            ImageEditRootScene imageEditRootScene2 = this.LIZ;
            VideoPublishEditModel videoPublishEditModel3 = imageEditRootScene2.LLJL;
            if (videoPublishEditModel3 != null) {
                videoPublishEditModel2 = videoPublishEditModel3;
            }
            if (videoPublishEditModel2.creativeModel.draftInfoModel.isDraft) {
                imageEditRootScene2.LLLLLL(true);
            } else {
                imageEditRootScene2.LLLLLLIL(false);
            }
            this.LIZ.LLLLLZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    @Override // X.InterfaceC540360LHe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C540340LHc r21) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M7R.LIZJ(X.0LHc):void");
    }
}
