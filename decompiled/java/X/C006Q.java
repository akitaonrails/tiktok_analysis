package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.006Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006Q extends C09AY implements Function1<Map<String, Object>, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C006Q(int i, String str, String str2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        map2.put("state", Integer.valueOf(this.LL));
        map2.put("error", this.LLILLJJLI);
        map2.put("message", this.LLILLL);
        return Unit.LIZ;
    }
}
