package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21330718dl extends C09AY implements Function2<Long, Boolean, Unit> {
    public final /* synthetic */ C21331018do LL;
    public final /* synthetic */ InterfaceC1547330qMt LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21330718dl(C21331018do c21331018do, InterfaceC1547330qMt interfaceC1547330qMt, int i, int i2) {
        super(2);
        this.LL = c21331018do;
        this.LLILLJJLI = interfaceC1547330qMt;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Boolean bool) {
        long jLongValue = l.longValue();
        boolean zBooleanValue = bool.booleanValue();
        C21331018do c21331018do = this.LL;
        c21331018do.LIZIZ().LJ(this.LLILLJJLI, c21331018do.getView(), c21331018do.LIZJ(), C2097608Jq.LJIIIIZZ(new Pair("scroll_offset_x", Integer.valueOf(this.LLILLL)), new Pair("scroll_offset_y", Integer.valueOf(this.LLILZ)), new Pair("scroll_throttle_time", Integer.valueOf(this.LL.LLIIIZ().LIZLLL)), new Pair("scroll_interval", Long.valueOf(jLongValue)), new Pair("scroll_grounding_threshold", Integer.valueOf(this.LL.LLIIIZ().LIZJ)), new Pair("is_scroll_grounding", Boolean.valueOf(zBooleanValue))));
        return Unit.LIZ;
    }
}
