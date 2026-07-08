package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06R2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.service.AiChatGenerateService$postMessageAction$deferredResult$1$deferred$1", f = "AiChatGenerateService.kt", l = {274}, m = "invokeSuspend")
public final class C06R2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ C06R4 LLILLL;
    public final /* synthetic */ C21289618Te LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06R2(C869590Y9l c869590Y9l, C06R4 c06r4, C21289618Te c21289618Te, InterfaceC1364105Vn<? super C06R2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = c06r4;
        this.LLILZ = c21289618Te;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06R2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x00f8, TryCatch #0 {all -> 0x00f8, blocks: (B:15:0x0063, B:16:0x0066, B:20:0x006d, B:25:0x0075, B:27:0x0079, B:28:0x00ad, B:32:0x00bb, B:33:0x00c1, B:37:0x00ce, B:38:0x00d0, B:9:0x001f, B:11:0x0057), top: B:51:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06R2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
