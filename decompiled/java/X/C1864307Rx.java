package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07Rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1864307Rx extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864307Rx(int i, int i2, int i3) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        Map<String, String> map2 = map;
        map2.put("active_cache_count", String.valueOf(this.LL));
        map2.put("inactivate_cache_count", String.valueOf(this.LLILLJJLI));
        map2.put("external_cache_count", String.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
