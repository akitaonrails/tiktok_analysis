package X;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0So9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732390So9 extends C09AY implements Function2<VideoShareAssem, C291001Au<? extends Boolean>, Unit> {
    public C732390So9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C291001Au<? extends Boolean> c291001Au) {
        Boolean boolLIZ;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator duration;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        Context context = videoShareAssem2.getContext();
        if (context == null || !C0SXF.LJIL(context)) {
            if (c291001Au2 != null) {
                boolLIZ = c291001Au2.LIZ();
            } else {
                boolLIZ = null;
            }
            if (Intrinsics.LJFF(boolLIZ, Boolean.FALSE)) {
                videoShareAssem2.Xp();
                C2041907zF.LIZJ(videoShareAssem2.getContentView().findViewById(R.id.uz4));
                videoShareAssem2.getContentView().findViewById(R.id.uz4).clearAnimation();
                View viewFindViewById = videoShareAssem2.getContentView().findViewById(R.id.uz4);
                if (viewFindViewById != null) {
                    C2180521AVm.LIZ(viewFindViewById, EnumC2180541AVo.V_ANIMATE, (C1AV2) C1AVH.LJIJJLI.getValue());
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = viewFindViewById.animate();
                    if (viewPropertyAnimatorAnimate != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(1.0f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.0f)) != null && (duration = viewPropertyAnimatorScaleY.setDuration(150L)) != null) {
                        duration.start();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
