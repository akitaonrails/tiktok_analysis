package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.util.RepostBindTimeUitl$reportTime$1", f = "RepostBindTimeUitl.kt", l = {}, m = "invokeSuspend")
public final class C2286508xb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1360090lUt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2286508xb(long j, long j2, C1360090lUt c1360090lUt, InterfaceC1364105Vn<? super C2286508xb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = c1360090lUt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2286508xb(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostBindTimeUitl@de9d.reportTime$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIJI("repost_wb_bind_time", new Pair(this.LLILLL.LIZ, "enter_from"), new Pair(C2286608xc.LJFF(this.LL), "decision_time"), new Pair(C2286608xc.LJFF(this.LLILLJJLI), "bind_time"), new Pair(this.LLILLL.LIZIZ, "timing"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostBindTimeUitl@de9d.reportTime$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
