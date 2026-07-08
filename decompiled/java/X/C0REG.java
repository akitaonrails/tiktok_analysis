package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0REG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REG extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ CellGradualComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REG(CellGradualComponent cellGradualComponent) {
        super(1);
        this.LL = cellGradualComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        float f;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        View view = this.LL.LLJJJJLIIL;
        if (view != null && (viewPropertyAnimatorAnimate2 = view.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(200L)) != null) {
            duration2.start();
        }
        View view2 = this.LL.LLJJLIIIJLLLLLLLZ;
        if (view2 != null && (viewPropertyAnimatorAnimate = view2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null) {
            duration.start();
        }
        return Unit.LIZ;
    }
}
