package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.api.ext.SendMessageEventListenerAdaptersKt$toBatchSendMessageEventListener$2$1", f = "SendMessageEventListenerAdapters.kt", l = {}, m = "invokeSuspend")
public final class C0YTH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C0Y8T> LL;
    public final /* synthetic */ InterfaceC873750YPl LLILLJJLI;
    public final /* synthetic */ C0YTJ LLILLL;
    public final /* synthetic */ C0YTK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTH(C259800zU<C0Y8T> c259800zU, InterfaceC873750YPl interfaceC873750YPl, C0YTJ c0ytj, C0YTK c0ytk, InterfaceC1364105Vn<? super C0YTH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = interfaceC873750YPl;
        this.LLILLL = c0ytj;
        this.LLILZ = c0ytk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YTH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0Y8T] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YTK c0ytk;
        C1C7U.LIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<C0Y8T> c259800zU = this.LL;
        InterfaceC873750YPl interfaceC873750YPl = this.LLILLJJLI;
        c259800zU.element = ((C0YQY) interfaceC873750YPl).LIZ;
        if (this.LLILLL == C0YTJ.ADDED_AND_STARTED && (c0ytk = this.LLILZ) != null) {
            c0ytk.LJI(((C0YQY) interfaceC873750YPl).LIZ, ((C0YQY) interfaceC873750YPl).LIZIZ);
        }
        C0YTK c0ytk2 = this.LLILZ;
        if (c0ytk2 != null) {
            InterfaceC873750YPl interfaceC873750YPl2 = this.LLILLJJLI;
            c0ytk2.LIZLLL(((C0YQY) interfaceC873750YPl2).LIZ, ((C0YQY) interfaceC873750YPl2).LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
