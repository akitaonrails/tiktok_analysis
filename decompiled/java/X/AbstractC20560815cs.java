package X;

import X.C0RAA;
import X.InterfaceC1604490rr5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20560815cs<P extends InterfaceC1604490rr5, R extends C0RAA> extends AbstractC20561515cz<P, R> {
    public Float LLILZIL;

    public final void LJI(float f, Function1<? super AbstractC20560815cs<P, R>, Unit> function1) {
        Float f2 = this.LLILZIL;
        if (f2 != null && Math.abs(f - f2.floatValue()) < 1.0E-5f) {
            if (!C20039813b2.LIZIZ) {
                y5(null, null, null, new C1777780wMa(f));
            }
        } else {
            this.LLILZIL = Float.valueOf(f);
            function1.invoke(this);
        }
    }
}
