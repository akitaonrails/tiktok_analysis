package Y;

import X.C1018070cbF;
import X.C1023640ckE;
import X.C1030680cva;
import X.C1030820cvo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS11S0001000_16 implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f274i0;

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

    public AObjectS11S0001000_16(int i, int i2) {
        this.$t = i2;
        this.f274i0 = i;
    }

    public static final Object invoke$0(AObjectS11S0001000_16 aObjectS11S0001000_16, Object obj) {
        int i = aObjectS11S0001000_16.f274i0;
        C1018070cbF.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1018070cbF.LIZIZ, Integer.valueOf(i));
        return null;
    }

    public static final Object invoke$1(AObjectS11S0001000_16 aObjectS11S0001000_16, Object obj) {
        int i = aObjectS11S0001000_16.f274i0;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1030820cvo.LIZ.getClass();
        c1023640ckE.withParam(C1030820cvo.LIZJ, Integer.valueOf(C1030680cva.LJ ? 1 : 0));
        c1023640ckE.withParam(C1030820cvo.LIZIZ, Integer.valueOf(i));
        return null;
    }
}
