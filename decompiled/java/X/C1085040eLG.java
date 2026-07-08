package X;

import Y.ARunnableS117S0100000_17;
import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1085040eLG extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1085040eLG(C1085590eM9 c1085590eM9) {
        super(1, c1085590eM9, C1085590eM9.class, "handleScreenClearEvent", "handleScreenClearEvent(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C1085590eM9 c1085590eM9 = (C1085590eM9) this.receiver;
        if (zBooleanValue) {
            c1085590eM9.LJI = true;
            Animator animator = c1085590eM9.LJII;
            if (animator != null) {
                animator.cancel();
            }
        } else {
            c1085590eM9.getClass();
            C786410Ut5.LJLIIL(700L, C473410IhP.LIZ(), new ARunnableS117S0100000_17(c1085590eM9, 291));
        }
        return Unit.LIZ;
    }
}
