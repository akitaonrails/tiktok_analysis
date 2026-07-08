package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0949, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {221, 426}, m = "invokeSuspend")
public final class AnonymousClass0949 extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C238400w2 LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Function1<Object, Long> LLILZLL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0949(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, InterfaceC346201Wa interfaceC346201Wa) {
        super(3, interfaceC1364105Vn);
        this.LLILZLL = function1;
        this.LLIZ = interfaceC346201Wa;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009f -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0949.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AnonymousClass0949 anonymousClass0949 = new AnonymousClass0949(interfaceC1364105Vn, this.LLILZLL, this.LLIZ);
        anonymousClass0949.LLILZ = interfaceC497601wk;
        anonymousClass0949.LLILZIL = interfaceC346701Wf;
        return anonymousClass0949.invokeSuspend(Unit.LIZ);
    }
}
