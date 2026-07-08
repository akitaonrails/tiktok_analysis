package X;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Abl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2182791Abl extends C2217421BqW implements Function1<Boolean, Unit> {
    public C2182791Abl(Object obj) {
        super(1, obj, C2182691Abb.class, "handleScreenClearEvent", "handleScreenClearEvent(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C2182691Abb c2182691Abb = (C2182691Abb) this.receiver;
        c2182691Abb.LJIILL = zBooleanValue;
        if (zBooleanValue) {
            AnimatedDrawable2 animatedDrawable2 = c2182691Abb.LJIILIIL;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
            }
            AnimatedDrawable2 animatedDrawable22 = c2182691Abb.LJIILJJIL;
            if (animatedDrawable22 != null) {
                animatedDrawable22.stop();
            }
        }
        return Unit.LIZ;
    }
}
