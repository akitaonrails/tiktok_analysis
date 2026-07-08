package X;

import android.view.ScaleGestureDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390860FUe extends C1696260uF6 implements Function1<ScaleGestureDetector, Unit> {
    public C390860FUe(C0FUL c0ful) {
        super(1, c0ful, C0FUL.class, "onScale", "onScale(Landroid/view/ScaleGestureDetector;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScaleGestureDetector scaleGestureDetector) {
        ((C0FUM) this.receiver).onScale(scaleGestureDetector);
        return Unit.LIZ;
    }
}
