package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.api.ext.SendMessageEventListenerAdaptersKt$toSendMessageEventListener$2$1", f = "SendMessageEventListenerAdapters.kt", l = {}, m = "invokeSuspend")
public final class C0YTL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YTJ LL;
    public final /* synthetic */ C0YTK LLILLJJLI;
    public final /* synthetic */ InterfaceC873750YPl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTL(C0YTJ c0ytj, C0YTK c0ytk, InterfaceC873750YPl interfaceC873750YPl, InterfaceC1364105Vn<? super C0YTL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ytj;
        this.LLILLJJLI = c0ytk;
        this.LLILLL = interfaceC873750YPl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YTL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YTK c0ytk;
        C1C7U.LIZ("SendMessageEventListenerAdaptersKt@ae45.toSendMessageEventListener$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == C0YTJ.ADDED_AND_STARTED && (c0ytk = this.LLILLJJLI) != null) {
            InterfaceC873750YPl interfaceC873750YPl = this.LLILLL;
            c0ytk.LJI(((C0YQY) interfaceC873750YPl).LIZ, ((C0YQY) interfaceC873750YPl).LIZIZ);
        }
        C0YTK c0ytk2 = this.LLILLJJLI;
        if (c0ytk2 != null) {
            InterfaceC873750YPl interfaceC873750YPl2 = this.LLILLL;
            c0ytk2.LIZLLL(((C0YQY) interfaceC873750YPl2).LIZ, ((C0YQY) interfaceC873750YPl2).LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageEventListenerAdaptersKt@ae45.toSendMessageEventListener$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
