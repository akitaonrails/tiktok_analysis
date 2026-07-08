package X;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0h3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ViewOnTouchListenerC1189420h3c implements View.OnTouchListener {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PageFinder LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    public ViewOnTouchListenerC1189420h3c(C238400w2 c238400w2, String str, PageFinder pageFinder, Function0<Unit> function0) {
        this.LL = c238400w2;
        this.LLILLJJLI = str;
        this.LLILLL = pageFinder;
        this.LLILZ = function0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                String str = this.LLILLJJLI;
                Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.LL.element);
                PageFinder pageFinder = this.LLILLL;
                c1191160h6Q.getClass();
                C1191160h6Q.LJIL(str, "up", lValueOf, pageFinder);
                return false;
            }
            return false;
        }
        this.LL.element = System.currentTimeMillis();
        C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
        String str2 = this.LLILLJJLI;
        PageFinder pageFinder2 = this.LLILLL;
        c1191160h6Q2.getClass();
        C1191160h6Q.LJIL(str2, "down", null, pageFinder2);
        Function0<Unit> function0 = this.LLILZ;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }
}
