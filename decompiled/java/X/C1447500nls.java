package X;

import Y.ARunnableS91S0200000_22;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447500nls extends AbstractC813200VvC {
    public final C19EG LL;
    public final FTCChooseCoverFragment LLILLJJLI;
    public final VideoPublishEditModel LLILLL;
    public final C1441840nck LLILZ;
    public final Function0<ImageView> LLILZIL;
    public final Function0<SurfaceView> LLILZLL;

    @Override // X.AbstractC813200VvC
    public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) throws Throwable {
        super.onFragmentDetached(fragmentManager, fragment);
        if (fragment instanceof FTCChooseCoverFragment) {
            Intent intent = new Intent();
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) videoPublishEditModel);
            C0MUK.LJIIIZ(intent, videoPublishEditModel.creativeModel);
            C2204961BRm.LLJJIJIL(-1, intent, this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJAAuoI9fqs5eQLUxB+eHyAJNZaLD2Ya4H0bP941xSFBA3vsChzR0Mcpxw=", null));
            this.LL.finish();
        }
    }

    public final void LIZ(int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLILZIL.invoke().getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.width = i2;
        layoutParams.height = i3;
        C786410Ut5.c6(this.LLILZIL.invoke(), layoutParams);
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        if (fragment instanceof FTCChooseCoverFragment) {
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LLILZ.LJIIIIZZ;
            if (vEEditorAutoStartStopArbiter != null) {
                vEEditorAutoStartStopArbiter.LIZJ(true, false, false);
            }
            View view = fragment.getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS91S0200000_22(fragment, this, 36), 300L);
            }
        }
    }

    public C1447500nls(C19EG c19eg, FTCChooseCoverFragment fTCChooseCoverFragment, VideoPublishEditModel videoPublishEditModel, C1441830ncj c1441830ncj, AwS566S0100000_22 awS566S0100000_22, AwS566S0100000_22 awS566S0100000_222) {
        this.LL = c19eg;
        this.LLILLJJLI = fTCChooseCoverFragment;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = c1441830ncj;
        this.LLILZIL = awS566S0100000_22;
        this.LLILZLL = awS566S0100000_222;
    }
}
