package X;

import Y.AgS200S0200000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.BulletinDataCenter$derived$1", f = "BulletinDataCenter.kt", l = {94}, m = "invokeSuspend")
public final class C605850NpX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<Object> LLILLL;
    public final /* synthetic */ C0OIH<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605850NpX(InterfaceC346201Wa<Object> interfaceC346201Wa, InterfaceC332260D0u<Object> interfaceC332260D0u, C0OIH<Object> c0oih, InterfaceC1364105Vn<? super C605850NpX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = interfaceC332260D0u;
        this.LLILZ = c0oih;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605850NpX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinDataCenter@f17c.derived$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346201Wa<Object> interfaceC346201Wa = this.LLILLJJLI;
            AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLILLL, this.LLILZ, 0);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS200S0200000_9, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinDataCenter@f17c.derived$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinDataCenter@f17c.derived$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
