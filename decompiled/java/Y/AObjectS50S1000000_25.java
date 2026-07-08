package Y;

import X.C1696490uFT;
import X.InterfaceC1692460u8y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS50S1000000_25 implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS50S1000000_25(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AObjectS50S1000000_25 aObjectS50S1000000_25, Object obj) {
        C1696490uFT.LJ((InterfaceC1692460u8y) obj, aObjectS50S1000000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS50S1000000_25 aObjectS50S1000000_25, Object obj) {
        C1696490uFT.LJ((InterfaceC1692460u8y) obj, aObjectS50S1000000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS50S1000000_25 aObjectS50S1000000_25, Object obj) {
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        C1696490uFT.LJ(interfaceC1692460u8y, aObjectS50S1000000_25.s0);
        C1696490uFT.LJI(interfaceC1692460u8y, 5);
        return Unit.LIZ;
    }
}
