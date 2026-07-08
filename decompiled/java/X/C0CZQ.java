package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.util.MentionNetworkRequestHelperKt$trackMonitorMentionListCost$1", f = "MentionNetworkRequestHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CZQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZQ(long j, long j2, boolean z, InterfaceC1364105Vn<? super C0CZQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZQ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionNetworkRequestHelperKt@c7aa.trackMonitorMentionListCost$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(this.LL, "cost");
        c0lab.LIZIZ(this.LLILLJJLI, "mention_type");
        c0lab.LJFF("hit_cache", this.LLILLL);
        C20684815ws.LJIILLIIL("mention_list_cost_event", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionNetworkRequestHelperKt@c7aa.trackMonitorMentionListCost$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
