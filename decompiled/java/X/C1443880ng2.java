package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ng2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443880ng2 {
    public final Activity LIZ;
    public final VideoPublishEditModel LIZIZ;
    public CreativeDialogWrapper LIZJ;

    public final void LIZ(boolean z) {
        if (z) {
            if (this.LIZJ == null) {
                C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                Activity activity = this.LIZ;
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                creativeLoadingDialogBuilder.backCanCancel(false);
                creativeLoadingDialogBuilder.showProgress(false);
                creativeLoadingDialogBuilder.loadingMessage(C20642515q3.LJI(R.string.rdr));
                this.LIZJ = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, 1118, creativeLoadingDialogBuilder);
            }
            CreativeDialogWrapper creativeDialogWrapper = this.LIZJ;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.delayShow(C19576911iZ.LIZ());
                return;
            }
            return;
        }
        CreativeDialogWrapper creativeDialogWrapper2 = this.LIZJ;
        if (creativeDialogWrapper2 != null) {
            creativeDialogWrapper2.dismiss();
        }
        this.LIZJ = null;
    }

    public C1443880ng2(Activity activity, LifecycleCoroutineScope lifecycleCoroutineScope, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = activity;
        this.LIZIZ = videoPublishEditModel;
    }
}
