package X;

import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent$reportReachBottom$3", f = "LoadMorePerfComponent.kt", l = {203}, m = "invokeSuspend")
public final class C804870Vhl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LoadMorePerfComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C804870Vhl(LoadMorePerfComponent loadMorePerfComponent, InterfaceC1364105Vn<? super C804870Vhl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loadMorePerfComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C804870Vhl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC805430Vif enumC805430Vif;
        C1C7U.LIZ("LoadMorePerfComponent@d571.reportReachBottom$3");
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
            long jLongValue = ((Number) C1DS1.LJ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("LoadMorePerfComponent@d571.reportReachBottom$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getClass();
        boolean z = C0VW0.LIZ;
        if (C584360Mvy.LIZIZ()) {
            enumC805430Vif = EnumC805430Vif.FEED_FORYOU_5VV;
        } else {
            enumC805430Vif = EnumC805430Vif.FEED_FORYOU;
        }
        C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.FEED_FORYOU_EXHAUSTION, null, 0L, 28));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoadMorePerfComponent@d571.reportReachBottom$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
