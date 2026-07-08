package Y;

import X.C0L8M;
import X.C817403Hg;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS4S0200001_8 implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS4S0200001_8 aObjectS4S0200001_8, Object obj) {
        C817403Hg c817403Hg = (C817403Hg) aObjectS4S0200001_8.l0;
        float f = aObjectS4S0200001_8.f2;
        ((C0L8M) aObjectS4S0200001_8.l1).onProgress((int) (c817403Hg.element + (((Float) obj).floatValue() * f)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS4S0200001_8 aObjectS4S0200001_8, Object obj) {
        C0L8M c0l8m = (C0L8M) aObjectS4S0200001_8.l0;
        C817403Hg c817403Hg = (C817403Hg) aObjectS4S0200001_8.l1;
        float f = aObjectS4S0200001_8.f2;
        c0l8m.onProgress((int) (c817403Hg.element + (((Float) obj).floatValue() * f)));
        return Unit.LIZ;
    }

    public AObjectS4S0200001_8(float f, Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.f2 = f;
    }
}
