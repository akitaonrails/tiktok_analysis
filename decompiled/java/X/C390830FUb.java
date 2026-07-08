package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390830FUb extends C2217421BqW implements Function1<MotionEvent, Unit> {
    public C390830FUb(C0FUL c0ful) {
        super(1, c0ful, C0FUL.class, "onTouchEvent", "onTouchEvent(Landroid/view/MotionEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        ((C0FUM) this.receiver).onTouchEvent(motionEvent);
        return Unit.LIZ;
    }
}
