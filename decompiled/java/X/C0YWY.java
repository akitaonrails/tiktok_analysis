package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YWY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWY extends C09AY implements Function1<Map<String, Object>, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YWY(long j, long j2, C869590Y9l c869590Y9l) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = c869590Y9l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        map2.put("duration", Long.valueOf(this.LL - this.LLILLJJLI));
        String str = this.LLILLL.getExt().get("monitor_send_message_platform");
        if (str == null) {
            str = "";
        }
        map2.put("send_platform", str);
        C875480YWc.LIZ(this.LLILLL, map2);
        return Unit.LIZ;
    }
}
