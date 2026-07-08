package X;

import android.view.ScaleGestureDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390850FUd extends C1696260uF6 implements Function1<ScaleGestureDetector, Unit> {
    public C390850FUd(C0FUL c0ful) {
        super(1, c0ful, C0FUL.class, "onScaleBegin", "onScaleBegin(Landroid/view/ScaleGestureDetector;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScaleGestureDetector scaleGestureDetector) {
        ((C0FUM) this.receiver).onScaleBegin(scaleGestureDetector);
        return Unit.LIZ;
    }
}
