package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420600n4U implements InterfaceC19763612Ug {
    public final C19EG LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function1<Float, Long> LIZJ;
    public final InterfaceC1685420txc<Boolean, Float, Float, Integer, Float, Float> LIZLLL;
    public boolean LJ = true;

    @Override // X.InterfaceC19763612Ug
    public final C1420610n4V LIZ() {
        Float fValueOf = Float.valueOf(0.0f);
        return new C1420610n4V(new Pair(fValueOf, fValueOf), 2);
    }

    @Override // X.InterfaceC19763612Ug
    public final String getName() {
        return C1420600n4U.class.getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1420600n4U(C19EG c19eg, Function0<Boolean> function0, Function1<? super Float, Long> function1, InterfaceC1685420txc<? super Boolean, ? super Float, ? super Float, ? super Integer, ? super Float, Float> interfaceC1685420txc) {
        this.LIZ = c19eg;
        this.LIZIZ = function0;
        this.LIZJ = function1;
        this.LIZLLL = interfaceC1685420txc;
    }

    @Override // X.InterfaceC19763612Ug
    public final C1420610n4V LIZIZ(float f, float f2, float f3, int i) {
        return LIZLLL(f, f2, f3, i, true);
    }

    @Override // X.InterfaceC19763612Ug
    public final C1420610n4V LIZJ(float f, float f2, float f3, int i) {
        return LIZLLL(f2, f, f3, i, false);
    }

    public final C1420610n4V LIZLLL(float f, float f2, float f3, int i, boolean z) {
        Pair pair;
        boolean zBooleanValue = this.LIZIZ.invoke().booleanValue();
        Float fValueOf = Float.valueOf(0.0f);
        if (zBooleanValue) {
            if (!C19558011fW.LJ(this.LIZJ.invoke(Float.valueOf(Math.abs((f2 - f) - i) * f3)).longValue())) {
                pair = new Pair(Boolean.FALSE, fValueOf);
            } else {
                pair = new Pair(Boolean.TRUE, Float.valueOf(this.LIZLLL.invoke(Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3)).floatValue()));
            }
        } else {
            pair = new Pair(Boolean.FALSE, fValueOf);
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (this.LJ) {
                C19EG c19eg = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131833535);
                C1390380mHk.LIZ(c19eg, 3063, creativeToastBuilder);
                this.LJ = false;
            }
        } else {
            this.LJ = true;
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            return new C1420610n4V(pair.getSecond(), 1);
        }
        return new C1420610n4V(fValueOf, 2);
    }
}
