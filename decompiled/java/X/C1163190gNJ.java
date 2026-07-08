package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.lynx.tasm.base.TraceEvent;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0gNJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163190gNJ extends FrameLayout {
    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenTracing", AFwS200S0000000_13.get$arr$(27));
        TraceEvent.LJIIJ(1L, "dispatch_draw");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    public C1163190gNJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
