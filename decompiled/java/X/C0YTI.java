package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.api.ext.SendMessageEventListenerAdaptersKt$toBatchSendMessageEventListener$2$2", f = "SendMessageEventListenerAdapters.kt", l = {}, m = "invokeSuspend")
public final class C0YTI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C0Y8T> LL;
    public final /* synthetic */ InterfaceC873750YPl LLILLJJLI;
    public final /* synthetic */ C0YTK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTI(C0YTK c0ytk, InterfaceC873750YPl interfaceC873750YPl, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = interfaceC873750YPl;
        this.LLILLL = c0ytk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C259800zU<C0Y8T> c259800zU = this.LL;
        return new C0YTI(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn, c259800zU);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0Y8T] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<C0Y8T> c259800zU = this.LL;
        InterfaceC873750YPl interfaceC873750YPl = this.LLILLJJLI;
        c259800zU.element = ((C0YPL) interfaceC873750YPl).LIZ;
        C0YTK c0ytk = this.LLILLL;
        if (c0ytk != null) {
            c0ytk.LJ(((C0YPL) interfaceC873750YPl).LIZ, ((C0YPL) interfaceC873750YPl).LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
