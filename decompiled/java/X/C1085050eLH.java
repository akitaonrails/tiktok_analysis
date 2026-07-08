package X;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1085050eLH extends C2217421BqW implements Function1<Long, Unit> {
    public C1085050eLH(C1085590eM9 c1085590eM9) {
        super(1, c1085590eM9, C1085590eM9.class, "handleStopFlyMicGiftEvent", "handleStopFlyMicGiftEvent(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        C1085590eM9 c1085590eM9 = (C1085590eM9) this.receiver;
        if (jLongValue == -1 || jLongValue == c1085590eM9.LJIIIIZZ) {
            Animator animator = c1085590eM9.LJII;
            if (animator != null) {
                animator.cancel();
            }
            c1085590eM9.LJII = null;
        }
        return Unit.LIZ;
    }
}
