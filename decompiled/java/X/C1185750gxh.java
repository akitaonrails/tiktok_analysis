package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185750gxh extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185750gxh(boolean z, String str, long j) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        Map<String, String> map2 = map;
        map2.put("cache_hit", String.valueOf(this.LL));
        map2.put("source_type", this.LLILLJJLI);
        map2.put("cache_age_ms", String.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
