package Y;

import X.C118300cf;
import X.C11NZ;
import X.C259800zU;
import X.InterfaceC1487280oo2;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager;

/* JADX INFO: loaded from: classes13.dex */
public class AkS198S0300000_12 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS198S0300000_12 akS198S0300000_12, Object obj) {
        return ((C11NZ) obj).LJJJ(new AkS198S0300000_12((RankEntranceManager) akS198S0300000_12.l1, (C118300cf) akS198S0300000_12.l0, (C259800zU) akS198S0300000_12.l2, 1), false);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.lang.Throwable] */
    public static final Object apply$1(AkS198S0300000_12 akS198S0300000_12, Object obj) {
        ?? r4 = (Throwable) obj;
        C118300cf c118300cf = (C118300cf) akS198S0300000_12.l0;
        int i = c118300cf.element;
        if (i <= ((RankEntranceManager) akS198S0300000_12.l1).LLJJIII) {
            c118300cf.element = i + 1;
            ((C259800zU) akS198S0300000_12.l2).element = r4;
            return C11NZ.LJJJJZ(r4);
        }
        return C11NZ.LJJIJLIJ(r4);
    }

    public AkS198S0300000_12(RankEntranceManager rankEntranceManager, C118300cf c118300cf, C259800zU c259800zU, int i) {
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = rankEntranceManager;
        this.l2 = c259800zU;
    }
}
