package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnTouchListenerC733730SqJ implements View.OnTouchListener {
    public boolean LL;
    public final RunnableC733720SqI LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        if (r0 != 3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC733730SqJ.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SqI] */
    public ViewOnTouchListenerC733730SqJ(C732940Sp2 c732940Sp2, C732930Sp1 c732930Sp1, final C733180SpQ c733180SpQ) {
        this.LLILLL = c732940Sp2;
        this.LLILZ = c732930Sp1;
        this.LLILLJJLI = new Runnable() { // from class: X.0SqI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("QuickCommentDialogManager@d616.getQuickCommentOnTouchDelegate$1$action$1");
                try {
                    this.LL.LL = true;
                    Function0<Unit> function0 = c733180SpQ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("QuickCommentDialogManager@d616.getQuickCommentOnTouchDelegate$1$action$1");
            }
        };
    }
}
