package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732510SoL extends C09AY implements Function2<VideoShareAssem, C732590SoT, Unit> {
    public C732510SoL() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C732590SoT c732590SoT) {
        TuxIconView tuxIconView;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C732590SoT c732590SoT2 = c732590SoT;
        videoShareAssem2.getClass();
        if (c732590SoT2 != null) {
            C1D0F c1d0f = C1D0F.LIZ;
            Drawable drawable = c732590SoT2.LIZ;
            if (drawable != null) {
                ((C1322090kVb) videoShareAssem2.getContentView().findViewById(R.id.uzq)).setImageDrawable(drawable);
            }
            Drawable drawable2 = c732590SoT2.LIZIZ;
            if (drawable2 != null) {
                TuxIconView tuxIconView2 = (TuxIconView) videoShareAssem2.LJJIJL().findViewById(R.id.qvq);
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                }
                TuxIconView tuxIconView3 = (TuxIconView) videoShareAssem2.LJJIJL().findViewById(R.id.qvq);
                if (tuxIconView3 != null) {
                    tuxIconView3.setImageDrawable(drawable2);
                }
                View viewFindViewById = videoShareAssem2.getContentView().findViewById(R.id.uzq);
                if (viewFindViewById != null) {
                    float fLIZIZ = C418440Gaw.LIZIZ(-3);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
                    viewFindViewById.setTranslationY(fLIZIZ);
                }
                TuxIconView tuxIconView4 = (TuxIconView) videoShareAssem2.LJJIJL().findViewById(R.id.qvq);
                if (tuxIconView4 != null) {
                    C786410Ut5.vd(tuxIconView4, 0.0f);
                }
            } else {
                TuxIconView tuxIconView5 = (TuxIconView) videoShareAssem2.LJJIJL().findViewById(R.id.qvq);
                if (tuxIconView5 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
                }
                View viewFindViewById2 = videoShareAssem2.getContentView().findViewById(R.id.uzq);
                if (viewFindViewById2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
                    viewFindViewById2.setTranslationY(0.0f);
                }
            }
            ViewGroup.LayoutParams layoutParams = c732590SoT2.LIZJ;
            if (layoutParams != null) {
                ViewGroup.LayoutParams layoutParams2 = videoShareAssem2.getContentView().findViewById(R.id.uzq).getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                C786410Ut5.f7((RemoteImageView) videoShareAssem2.getContentView().findViewById(R.id.uzq), layoutParams2);
            }
            View viewFindViewById3 = videoShareAssem2.LJJIJL().findViewById(R.id.g1p);
            if (viewFindViewById3 != null && viewFindViewById3.getVisibility() == 0 && (tuxIconView = (TuxIconView) videoShareAssem2.LJJIJL().findViewById(R.id.g1p)) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        }
        return Unit.LIZ;
    }
}
