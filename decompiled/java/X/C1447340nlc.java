package X;

import Y.AObjectS396S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import dmt.av.video.VEEditorAutoStartStopArbiter;

/* JADX INFO: renamed from: X.0nlc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1447340nlc extends AbstractC813200VvC {
    public final /* synthetic */ ChooseCoverActivity LL;

    public C1447340nlc(ChooseCoverActivity chooseCoverActivity) {
        this.LL = chooseCoverActivity;
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDetached(fragmentManager, fragment);
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        if (fragment instanceof VEChooseVideoCoverFragment) {
            VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) fragment;
            C1441830ncj c1441830ncj = this.LL.LLILLJJLI;
            if (c1441830ncj != null && (vEEditorAutoStartStopArbiter = c1441830ncj.LJIIIIZZ) != null) {
                vEEditorAutoStartStopArbiter.LIZJ(true, false, false);
            }
            View view = vEChooseVideoCoverFragment.getView();
            if (view != null) {
                C430110Gtl.LIZ(view, new AObjectS396S0100000_22(new ARunnableS91S0200000_22(this, vEChooseVideoCoverFragment, 35), 17));
            }
        }
    }
}
