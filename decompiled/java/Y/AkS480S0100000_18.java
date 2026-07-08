package Y;

import X.C1161040gJq;
import X.C1180620gpQ;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.slash.data.SlashVm;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AkS480S0100000_18 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            default:
                return null;
        }
    }

    public AkS480S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        return new Pair((List) akS480S0100000_18.l0, obj);
    }

    public static final Object apply$1(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        return ((Function1) akS480S0100000_18.l0).invoke(obj);
    }

    public static final Object apply$2(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        return ((Function1) akS480S0100000_18.l0).invoke(obj);
    }

    public static final Object apply$3(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        return C1161040gJq.LIZLLL((C1161040gJq) ((Function1) akS480S0100000_18.l0).invoke(obj), null, true, null, false, null, null, 125);
    }

    public static final Object apply$4(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        return ((Function1) akS480S0100000_18.l0).invoke(obj);
    }

    public static final Object apply$5(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        return ((Function1) akS480S0100000_18.l0).invoke(obj);
    }

    public static final Object apply$6(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        return ((Function1) akS480S0100000_18.l0).invoke(obj);
    }

    public static final Object apply$7(AkS480S0100000_18 akS480S0100000_18, Object obj) {
        SlashVm slashVm = (SlashVm) akS480S0100000_18.l0;
        return slashVm.yQ2(slashVm.LLILLJJLI, (C1180620gpQ) obj);
    }
}
