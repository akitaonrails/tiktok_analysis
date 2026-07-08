package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0heT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212270heT extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212270heT(long j, int i) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        Map<String, String> map2 = map;
        map2.put("duration", String.valueOf(this.LL));
        map2.put("error_code", String.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
