package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390910FUj extends C1696260uF6 implements Function1<MotionEvent, Unit> {
    public C390910FUj(C0FUL c0ful) {
        super(1, c0ful, C0FUL.class, "onSingleTapUp", "onSingleTapUp(Landroid/view/MotionEvent;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        ((C0FUM) this.receiver).onSingleTapUp(motionEvent);
        return Unit.LIZ;
    }
}
