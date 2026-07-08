package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS260S0300000_16;

/* JADX INFO: renamed from: X.0cH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1005610cH9 {
    public final String LIZ;
    public final long LIZIZ;

    public C1005610cH9(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = str;
        this.LIZIZ = jCurrentTimeMillis;
    }

    public final void LIZ(AbstractC1623806Xk<String> abstractC1623806Xk) {
        if (abstractC1623806Xk instanceof C491001vg) {
            LIZIZ(this, new C989700brU(((C491001vg) abstractC1623806Xk).LIZ));
        } else if (abstractC1623806Xk instanceof C1623606Xi) {
            LIZIZ(this, new C989710brV(abstractC1623806Xk));
        } else {
            LIZIZ(this, new C989700brU(new RuntimeException() { // from class: X.0d2s
            }));
        }
    }

    public static void LIZIZ(C1005610cH9 c1005610cH9, AbstractC989720brW abstractC989720brW) {
        c1005610cH9.getClass();
        C07M6.LIZ(new AwS260S0300000_16(c1005610cH9, (C1005610cH9) abstractC989720brW, (AbstractC989720brW<?>) null, (List<Pair<String, String>>) 21));
    }
}
