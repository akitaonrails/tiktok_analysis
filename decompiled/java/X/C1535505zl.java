package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.performance.DMChatViewHolderPerformanceMonitor$markBindWhole$1", f = "DMChatViewHolderPerformanceMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1535505zl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ C886380Ypw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535505zl(Map<String, String> map, C886380Ypw c886380Ypw, InterfaceC1364105Vn<? super C1535505zl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = c886380Ypw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1535505zl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMChatViewHolderPerformanceMonitor@f093.markBindWhole$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((InterfaceC1493105sv) this.LLILLJJLI.LIZIZ.getValue()).sendEvent("dm_chat_view_holder_performance_bind_performance", this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMChatViewHolderPerformanceMonitor@f093.markBindWhole$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
