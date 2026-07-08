package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185710gxd extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185710gxd(int i, long j, String str, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        Map<String, String> map2 = map;
        map2.put("success", String.valueOf(this.LL));
        map2.put("duration_ms", String.valueOf(this.LLILLJJLI));
        map2.put("response_code", String.valueOf(this.LLILLL));
        map2.put("error_msg", this.LLILZ);
        return Unit.LIZ;
    }
}
