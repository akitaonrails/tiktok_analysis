package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ow3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492250ow3 extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ DetectorParam LLILLJJLI;
    public final /* synthetic */ C1492280ow6 LLILLL;
    public final /* synthetic */ Function2<EnumC1492290ow7, HashMap<String, HashMap<String, Object>>, Unit> LLILZ;
    public final /* synthetic */ Function1<HashMap<String, Object>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1492250ow3(long j, DetectorParam detectorParam, C1492280ow6 c1492280ow6, Function2<? super EnumC1492290ow7, ? super HashMap<String, HashMap<String, Object>>, Unit> function2, Function1<? super HashMap<String, Object>, Unit> function1) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = detectorParam;
        this.LLILLL = c1492280ow6;
        this.LLILZ = function2;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        l.longValue();
        try {
            C1492260ow4.LIZ.remove(Long.valueOf(this.LL));
            C1492240ow2.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }
}
