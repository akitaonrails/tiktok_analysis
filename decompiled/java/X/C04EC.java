package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.04EC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04EC extends C1338750kwT {
    public final Integer LLILLJJLI;
    public final Paint LLILLL;
    public Map<String, ? extends View> LLILZ;
    public Function2<? super View, ? super C1063004Ds, Unit> LLILZIL;
    public Function2<? super View, ? super C1063004Ds, Unit> LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.04EC, android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.04EW, android.view.View, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C04C0 r12) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04EC.LIZIZ(X.04C0):void");
    }

    @Override // X.C1338750kwT, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.LLILLJJLI != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), C0H9H.LIZ(0.5f), this.LLILLL);
        }
    }

    public final void setOnButtonClickListener(Function2<? super View, ? super C1063004Ds, Unit> function2) {
        this.LLILZIL = function2;
    }

    public final void setOnButtonTouchDownListener(Function2<? super View, ? super C1063004Ds, Unit> function2) {
        this.LLILZLL = function2;
    }

    public C04EC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        this.LLILLJJLI = numLIZJ;
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        setOrientation(0);
        setGravity(16);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zq, context);
        if (numLIZJ2 != null) {
            setBackground(new ColorDrawable(numLIZJ2.intValue()));
        }
        if (numLIZJ != null) {
            paint.setColor(numLIZJ.intValue());
        }
        setClipChildren(false);
        setClipToPadding(false);
    }
}
