package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GUO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUO extends ConstraintLayout {
    public Path LL;
    public final C01GW LLILLJJLI;

    private final float[] getRadiusArray() {
        return (float[]) this.LLILLJJLI.getValue();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean zLJI = MethodIDManager.LJI(202319);
        Path path = this.LL;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C0GUO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(30));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.LL;
        if (path != null) {
            path.reset();
            path.addRoundRect(0.0f, 0.0f, i, i2, getRadiusArray(), Path.Direction.CW);
            path.close();
        }
    }
}
