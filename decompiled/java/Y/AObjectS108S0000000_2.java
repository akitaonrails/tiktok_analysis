package Y;

import X.C12831050j;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS108S0000000_2 implements Function1 {
    public final int $t;

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

    public AObjectS108S0000000_2(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS108S0000000_2 aObjectS108S0000000_2, Object obj) {
        return ((Iterable) obj).iterator();
    }

    public static final Object invoke$1(AObjectS108S0000000_2 aObjectS108S0000000_2, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        C12831050j c12831050j = (C12831050j) entry.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('=');
        sbLIZ.append(c12831050j.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
