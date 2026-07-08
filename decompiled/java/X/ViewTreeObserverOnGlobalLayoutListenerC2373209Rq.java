package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09Rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2373209Rq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View LL;
    public final InterfaceC1631620sYq<Boolean, Integer, Boolean, Unit> LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final int LLILZIL = 148;
    public final Rect LLILZLL = new Rect();

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC2373209Rq.onGlobalLayout():void");
    }

    public ViewTreeObserverOnGlobalLayoutListenerC2373209Rq(Window window, View view, C1037190d65 c1037190d65) {
        this.LL = view;
        this.LLILLJJLI = c1037190d65;
        if (window != null) {
            window.setSoftInputMode(32);
        }
        C786410Ut5.x3(view.getViewTreeObserver(), this);
    }
}
