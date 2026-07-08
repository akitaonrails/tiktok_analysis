package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OL8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OL8 extends C09AY implements Function1<C770770ULj, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OL8(String str, String str2, String str3, Map<String, String> map) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C770770ULj c770770ULj) {
        c770770ULj.LIZIZ = true;
        C0OPQ c0opq = C0OPQ.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        Map<String, String> map = this.LLILZ;
        c0opq.getClass();
        C0OPQ.LJJ(str, str2, str3, "click", "not_now", map);
        return Unit.LIZ;
    }
}
