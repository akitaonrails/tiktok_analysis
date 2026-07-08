package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ViewOnLayoutChangeListenerC20298614bg implements View.OnLayoutChangeListener, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnWindowFocusChangeListener {
    public Function1<? super View, ? extends List<Rect>> LL;
    public final WeakReference<View> LLILLJJLI;
    public boolean LLILLL;
    public ViewTreeObserver LLILZIL;
    public List<Rect> LLILZ = C13BV.INSTANCE;
    public final C20298914bj LLILZLL = new InterfaceC359760E8o() { // from class: X.14bj
        @Override // X.InterfaceC359760E8o
        public final void LIZ() {
            this.LIZ.LIZLLL(false);
        }

        @Override // X.InterfaceC359760E8o
        public final void LIZIZ() {
            this.LIZ.LIZLLL(true);
        }

        @Override // X.InterfaceC359760E8o
        public final void dispose() {
            this.LIZ.LIZ();
        }
    };

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        LIZLLL(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            boolean r0 = r4.LLILLL
            if (r0 == 0) goto L5
            return
        L5:
            r3 = 1
            r4.LLILLL = r3
            java.lang.ref.WeakReference<android.view.View> r0 = r4.LLILLJJLI
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L27
            X.13BV r0 = X.C13BV.INSTANCE
            r1.setSystemGestureExclusionRects(r0)
            r4.LLILZ = r0
            r1.removeOnLayoutChangeListener(r4)
            r1.removeOnAttachStateChangeListener(r4)
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<X.14bg>> r0 = X.C20298814bi.LIZ
            java.lang.Object r0 = r0.remove(r1)
            if (r0 != 0) goto L37
        L27:
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<X.14bg>> r0 = X.C20298814bi.LIZ
            java.util.Set r2 = r0.entrySet()
            kotlin.jvm.internal.AwS609S0100000_30 r1 = new kotlin.jvm.internal.AwS609S0100000_30
            r0 = 289(0x121, float:4.05E-43)
            r1.<init>(r4, r0)
            X.C19719612Di.LJJIII(r2, r1, r3)
        L37:
            r4.LIZJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC20298614bg.LIZ():void");
    }

    public final void LIZJ() {
        ViewTreeObserver viewTreeObserver = this.LLILZIL;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnGlobalLayoutListener.class);
            viewTreeObserver.removeOnWindowFocusChangeListener(this);
        }
        this.LLILZIL = null;
    }

    public final void LIZIZ(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || this.LLILZIL == viewTreeObserver) {
            return;
        }
        LIZJ();
        viewTreeObserver.addOnGlobalLayoutListener(this);
        C2187701Ajg.LIZ(viewTreeObserver, this, ViewTreeObserver.OnGlobalLayoutListener.class);
        viewTreeObserver.addOnWindowFocusChangeListener(this);
        this.LLILZIL = viewTreeObserver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List, java.util.List<android.graphics.Rect>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, java.lang.Object] */
    public final void LIZLLL(boolean z) {
        ?? arrayList;
        if (this.LLILLL) {
            return;
        }
        View view = this.LLILLJJLI.get();
        if (view == 0) {
            LIZ();
            return;
        }
        if (view.isAttachedToWindow() && view.isShown() && view.getWidth() > 0 && view.getHeight() > 0) {
            List<Rect> listInvoke = this.LL.invoke(view);
            arrayList = new ArrayList();
            for (Rect rect : listInvoke) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect2 = new Rect(C13LZ.LJ(rect.left, 0, width), C13LZ.LJ(rect.top, 0, height), C13LZ.LJ(rect.right, 0, width), C13LZ.LJ(rect.bottom, 0, height));
                if (rect2.width() > 0 && rect2.height() > 0) {
                    arrayList.add(rect2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (!z && Intrinsics.LJFF(arrayList, this.LLILZ)) {
            return;
        }
        this.LLILZ = arrayList;
        view.setSystemGestureExclusionRects(arrayList);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LIZIZ(view);
        LIZLLL(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C13BV c13bv = C13BV.INSTANCE;
        view.setSystemGestureExclusionRects(c13bv);
        this.LLILZ = c13bv;
        LIZJ();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            LIZLLL(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.14bj] */
    public ViewOnLayoutChangeListenerC20298614bg(View view, Function1<? super View, ? extends List<Rect>> function1) {
        this.LL = function1;
        this.LLILLJJLI = new WeakReference<>(view);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LIZLLL(false);
    }
}
