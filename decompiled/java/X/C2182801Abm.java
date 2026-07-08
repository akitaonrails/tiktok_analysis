package X;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Abm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2182801Abm extends C2217421BqW implements Function1<Boolean, Unit> {
    public C2182801Abm(Object obj) {
        super(1, obj, C2182701Abc.class, "handleScreenClearEvent", "handleScreenClearEvent(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C2182701Abc c2182701Abc = (C2182701Abc) this.receiver;
        c2182701Abc.LJIIJ = zBooleanValue;
        if (zBooleanValue) {
            AnimatedDrawable2 animatedDrawable2 = c2182701Abc.LJIIIIZZ;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
            }
            AnimatedDrawable2 animatedDrawable22 = c2182701Abc.LJIIIZ;
            if (animatedDrawable22 != null) {
                animatedDrawable22.stop();
            }
        }
        return Unit.LIZ;
    }
}
