package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FUV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FUV extends C2217421BqW implements Function1<MotionEvent, Unit> {
    public C0FUV(C0FUL c0ful) {
        super(1, c0ful, C0FUL.class, "onTouchEventBegin", "onTouchEventBegin(Landroid/view/MotionEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        ((C0FUM) this.receiver).LJJIJIIJIL(motionEvent);
        return Unit.LIZ;
    }
}
