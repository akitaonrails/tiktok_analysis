package X;

import com.bytedance.android.livesdk.model.DateFrequencyModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122630fJt {
    public final int LIZ;
    public final int LIZIZ;
    public final Function0<Boolean> LIZLLL;
    public int LJ;
    public long LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public final long LIZJ = 30000;
    public final Map<EnumC1122660fJw, Integer> LJFF = new LinkedHashMap();
    public String LJIIIZ = "";

    public static int LIZIZ() {
        DateFrequencyModel dateFrequencyModelLIZIZ = InterfaceC1106030et7.Y7.LIZIZ();
        if (dateFrequencyModelLIZIZ != null && C1387310mCn.LJII(dateFrequencyModelLIZIZ.timestamp)) {
            return dateFrequencyModelLIZIZ.frequencyCount;
        }
        return 0;
    }

    public final boolean LIZ(EnumC1122660fJw enumC1122660fJw) {
        int iIntValue;
        int iLIZIZ = LIZIZ();
        Integer num = (Integer) ((LinkedHashMap) this.LJFF).get(enumC1122660fJw);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (this.LIZLLL.invoke().booleanValue()) {
            C051E.LIZ("frequency.check", new Pair("sku", enumC1122660fJw), new Pair("pass", Boolean.TRUE), new Pair("reason", "test_bypass"), new Pair("session", Integer.valueOf(this.LJ)), new Pair("daily", Integer.valueOf(iLIZIZ)), new Pair("sku_count", Integer.valueOf(iIntValue)));
            return true;
        }
        if (this.LJIIIIZZ) {
            C051E.LIZ("frequency.check", new Pair("sku", enumC1122660fJw), new Pair("pass", Boolean.FALSE), new Pair("reason", "converted_in_session"), new Pair("session", Integer.valueOf(this.LJ)), new Pair("daily", Integer.valueOf(iLIZIZ)), new Pair("sku_count", Integer.valueOf(iIntValue)));
            return false;
        }
        if (this.LJ >= this.LIZ) {
            C051E.LIZ("frequency.check", new Pair("sku", enumC1122660fJw), new Pair("pass", Boolean.FALSE), new Pair("reason", "session_limit"), new Pair("session", Integer.valueOf(this.LJ)), new Pair("max_session", Integer.valueOf(this.LIZ)), new Pair("daily", Integer.valueOf(iLIZIZ)), new Pair("sku_count", Integer.valueOf(iIntValue)));
            return false;
        }
        if (iLIZIZ >= this.LIZIZ) {
            C051E.LIZ("frequency.check", new Pair("sku", enumC1122660fJw), new Pair("pass", Boolean.FALSE), new Pair("reason", "daily_limit"), new Pair("session", Integer.valueOf(this.LJ)), new Pair("daily", Integer.valueOf(iLIZIZ)), new Pair("max_daily", Integer.valueOf(this.LIZIZ)), new Pair("sku_count", Integer.valueOf(iIntValue)));
            return false;
        }
        C051E.LIZ("frequency.check", new Pair("sku", enumC1122660fJw), new Pair("pass", Boolean.TRUE), new Pair("session", Integer.valueOf(this.LJ)), new Pair("daily", Integer.valueOf(iLIZIZ)), new Pair("sku_count", Integer.valueOf(iIntValue)));
        return true;
    }

    public C1122630fJt(int i, int i2, C1083520eIo c1083520eIo) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = c1083520eIo;
    }
}
