package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.157F, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C157F extends View {
    public static final C157G LLJJ = new RuntimeException() { // from class: X.157G
    };
    public View LL;
    public Bitmap LLILLJJLI;
    public Canvas LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int[] LLILZLL;
    public int[] LLIZ;
    public Boolean LLIZLLLIL;
    public int LLJ;
    public final Object LLJI;
    public C157D LLJIJIL;
    public final BPEAHandler LLJILJIL;
    public final ARunnableS131S0100000_31 LLJILJILJ;
    public final C16HL LLJILLL;

    public C157F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        ((ExecutorService) C157H.LIZ.getValue()).execute(new ARunnableS131S0100000_31(this, 41));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        if (!this.LLILZIL) {
            super.onDetachedFromWindow();
            return;
        }
        View view = this.LL;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            C16HL c16hl = this.LLJILLL;
            viewTreeObserver.removeOnPreDrawListener(c16hl);
            C2187701Ajg.LIZIZ(viewTreeObserver, c16hl, ViewTreeObserver.OnPreDrawListener.class);
        }
        Bitmap bitmap = this.LLILLJJLI;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLILLJJLI = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (this.LLILZIL) {
            View rootView = getRootView();
            this.LL = rootView;
            if (rootView != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C16HL c16hl = this.LLJILLL;
                    viewTreeObserver.addOnPreDrawListener(c16hl);
                    C2187701Ajg.LIZ(viewTreeObserver, c16hl, ViewTreeObserver.OnPreDrawListener.class);
                }
                if (!(!Intrinsics.LJFF(rootView, getRootView())) || (view = this.LL) == null) {
                    return;
                }
                view.postInvalidate();
            }
        }
    }

    public final C157D getAutoDarkListener() {
        return this.LLJIJIL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.LLILZ) {
            super.draw(canvas);
            return;
        }
        throw LLJJ;
    }

    public final void setAutoDarkListener(C157D c157d) {
        this.LLJIJIL = c157d;
    }

    public C157F(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZLL = new int[16];
        this.LLIZ = new int[16];
        this.LLJI = new Object();
        this.LLJILJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJILJ = new ARunnableS131S0100000_31(this, 42);
        this.LLJILLL = new C16HL(this, 0);
    }
}
