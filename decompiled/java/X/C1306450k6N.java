package X;

import com.bytedance.android.starship.strategy.repository.Extra;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306450k6N extends C09AY implements Function1<C0NOP, Unit> {
    public final /* synthetic */ Pair<StrategiesData, StrategiesData> LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306450k6N(long j, Pair pair) {
        super(1);
        this.LL = pair;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0NOP c0nop) {
        String str;
        C0NOP c0nop2 = c0nop;
        c0nop2.LIZ.put("error_code", Integer.valueOf(this.LL.getSecond().status_code));
        C1306520k6U.LJFF(c0nop2.LIZ, "error_msg", this.LL.getSecond().status_msg);
        Map<String, Object> map = c0nop2.LIZ;
        Extra extra = this.LL.getSecond().extra;
        if (extra != null) {
            str = extra.logid;
        } else {
            str = null;
        }
        C1306520k6U.LJFF(map, "logid", str);
        c0nop2.LIZ.put("total_time", Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI));
        return Unit.LIZ;
    }
}
