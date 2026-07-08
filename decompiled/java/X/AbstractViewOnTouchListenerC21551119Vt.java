package X;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.19Vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractViewOnTouchListenerC21551119Vt implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final View LLILZ;
    public C19QQ LLILZIL;
    public RunnableC21536419Qc LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final int[] LLJ = new int[2];

    public abstract InterfaceC21551219Vu LIZIZ();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final void LIZ() {
        RunnableC21536419Qc runnableC21536419Qc = this.LLILZLL;
        if (runnableC21536419Qc != null) {
            this.LLILZ.removeCallbacks(runnableC21536419Qc);
        }
        C19QQ c19qq = this.LLILZIL;
        if (c19qq != null) {
            this.LLILZ.removeCallbacks(c19qq);
        }
    }

    public boolean LIZJ() {
        InterfaceC21551219Vu interfaceC21551219VuLIZIZ = LIZIZ();
        if (interfaceC21551219VuLIZIZ == null || interfaceC21551219VuLIZIZ.isShowing()) {
            return true;
        }
        interfaceC21551219VuLIZIZ.show();
        return true;
    }

    public boolean LIZLLL() {
        InterfaceC21551219Vu interfaceC21551219VuLIZIZ = LIZIZ();
        if (interfaceC21551219VuLIZIZ == null || !interfaceC21551219VuLIZIZ.isShowing()) {
            return true;
        }
        interfaceC21551219VuLIZIZ.dismiss();
        return true;
    }

    public AbstractViewOnTouchListenerC21551119Vt(View view) {
        this.LLILZ = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.LL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.LLILLJJLI = tapTimeout;
        this.LLILLL = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LLIZ = false;
        this.LLIZLLLIL = -1;
        C19QQ c19qq = this.LLILZIL;
        if (c19qq != null) {
            this.LLILZ.removeCallbacks(c19qq);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.19Qc] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.19QQ] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnTouchListenerC21551119Vt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
