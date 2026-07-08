package X;

import android.view.MotionEvent;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899590zX3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ViewOnTouchListenerC1899510zWv LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899590zX3(ViewOnTouchListenerC1899510zWv viewOnTouchListenerC1899510zWv, MotionEvent motionEvent, long j, float f, float f2) {
        super(0);
        this.LL = viewOnTouchListenerC1899510zWv;
        this.LLILLJJLI = j;
        this.LLILLL = f;
        this.LLILZ = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewOnTouchListenerC1899510zWv viewOnTouchListenerC1899510zWv = this.LL;
        if (!viewOnTouchListenerC1899510zWv.LLJJIII) {
            viewOnTouchListenerC1899510zWv.LLJJIII = true;
            viewOnTouchListenerC1899510zWv.LIZJ();
            ViewOnTouchListenerC1899510zWv viewOnTouchListenerC1899510zWv2 = this.LL;
            viewOnTouchListenerC1899510zWv2.LLJILLL = this.LLILLJJLI;
            viewOnTouchListenerC1899510zWv2.LLJI = this.LLILLL;
            viewOnTouchListenerC1899510zWv2.LLJIJIL = this.LLILZ;
            viewOnTouchListenerC1899510zWv2.LLIZLLLIL = viewOnTouchListenerC1899510zWv2.getX() - this.LLILLL;
            ViewOnTouchListenerC1899510zWv viewOnTouchListenerC1899510zWv3 = this.LL;
            viewOnTouchListenerC1899510zWv3.LLJ = viewOnTouchListenerC1899510zWv3.getY() - this.LLILZ;
            ViewParent parent = this.LL.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return Unit.LIZ;
    }
}
