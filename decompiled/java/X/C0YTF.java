package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.api.ext.SendMessageEventListenerAdaptersKt$toBatchSendMessageEventListener$2$3", f = "SendMessageEventListenerAdapters.kt", l = {}, m = "invokeSuspend")
public final class C0YTF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC873750YPl LL;
    public final /* synthetic */ C0YTK LLILLJJLI;
    public final /* synthetic */ C259800zU<C0Y8T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTF(C0YTK c0ytk, InterfaceC873750YPl interfaceC873750YPl, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC873750YPl;
        this.LLILLJJLI = c0ytk;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YTF(this.LLILLJJLI, this.LL, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0Y8T] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC873750YPl interfaceC873750YPl = this.LL;
        ?? r1 = ((C0YQ0) interfaceC873750YPl).LIZ;
        if (r1 != 0) {
            this.LLILLL.element = r1;
        }
        C0YTK c0ytk = this.LLILLJJLI;
        if (c0ytk != null) {
            c0ytk.LJII(((C0YQ0) interfaceC873750YPl).LIZ, ((C0YQ0) interfaceC873750YPl).LIZIZ, ((C0YQ0) interfaceC873750YPl).LIZJ.toIMError());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
