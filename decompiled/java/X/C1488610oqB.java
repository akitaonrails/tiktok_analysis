package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488610oqB extends C09AY implements Function1<Map<String, Object>, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1488610oqB(long j, long j2, long j3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        map2.put("is_downgrade", 1);
        map2.put("data_duration", Long.valueOf(this.LL));
        map2.put("real_duration", Long.valueOf(this.LLILLJJLI));
        map2.put("start_time", Long.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
