package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0FV6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FV6 extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C0FV5 LL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.LIZJ = false;
        C0FV5 c0fv5 = this.LL;
        c0fv5.LIZ.evictAll();
        ((ArrayList) c0fv5.LIZIZ).clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C786410Ut5.C3(getViewTreeObserver(), this);
    }

    public C0FV6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C0FV5();
        C786410Ut5.Sd(R.layout.d8q, C786410Ut5.ne(getContext()), this);
        findViewById(R.id.l6o).setOnTouchListener(new View.OnTouchListener() { // from class: X.0FV7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        findViewById(R.id.l7b).setOnTouchListener(new View.OnTouchListener() { // from class: X.0FV7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        boolean z = findViewById(R.id.l74).getLayoutParams() instanceof RelativeLayout.LayoutParams;
        C786410Ut5.x3(getViewTreeObserver(), this);
    }
}
