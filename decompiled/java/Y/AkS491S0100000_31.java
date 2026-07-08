package Y;

import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public class AkS491S0100000_31 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

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

    public AkS491S0100000_31(KidsAwemeGridViewModel kidsAwemeGridViewModel, int i) {
        this.$t = i;
        this.l0 = kidsAwemeGridViewModel;
    }

    public static final Object apply$0(AkS491S0100000_31 akS491S0100000_31, Object obj) {
        return ((KidsAwemeGridViewModel) akS491S0100000_31.l0).vQ2((Pair) obj);
    }

    public static final Object apply$1(AkS491S0100000_31 akS491S0100000_31, Object obj) {
        return ((KidsAwemeGridViewModel) akS491S0100000_31.l0).vQ2((Pair) obj);
    }
}
