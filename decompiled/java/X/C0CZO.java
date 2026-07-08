package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.util.MentionNetworkRequestHelperKt$trackMonitorMentionListCount$1", f = "MentionNetworkRequestHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CZO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZO(int i, int i2, int i3, long j, InterfaceC1364105Vn<? super C0CZO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionNetworkRequestHelperKt@c7aa.trackMonitorMentionListCount$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(this.LL, "recent_size");
        c0lab.LIZ(this.LLILLJJLI, "follow_size");
        c0lab.LIZ(this.LLILLL, "all_count");
        c0lab.LIZIZ(this.LLILZ, "mention_type");
        C20684815ws.LJIILLIIL("mention_list_event", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionNetworkRequestHelperKt@c7aa.trackMonitorMentionListCount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
