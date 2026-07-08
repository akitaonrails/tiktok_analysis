package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent$sendMessageWithBlock$1$onSuccess$1", f = "PigeonMessageSenderComponent.kt", l = {193, 197}, m = "invokeSuspend")
public final class C875540YWi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PigeonMessageSenderComponent LL;
    public C869590Y9l LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ Function2<C869590Y9l, InterfaceC1364105Vn<? super C869590Y9l>, Object> LLILZIL;
    public final /* synthetic */ C869590Y9l LLILZLL;
    public final /* synthetic */ C869590Y9l LLIZ;
    public final /* synthetic */ Function2<C869590Y9l, InterfaceC1364105Vn<? super C875650YWt>, Object> LLIZLLLIL;
    public final /* synthetic */ PigeonMessageSenderComponent LLJ;
    public final /* synthetic */ InterfaceC875640YWs LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C875540YWi(Function2<? super C869590Y9l, ? super InterfaceC1364105Vn<? super C869590Y9l>, ? extends Object> function2, C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2, Function2<? super C869590Y9l, ? super InterfaceC1364105Vn<? super C875650YWt>, ? extends Object> function22, PigeonMessageSenderComponent pigeonMessageSenderComponent, InterfaceC875640YWs interfaceC875640YWs, InterfaceC1364105Vn<? super C875540YWi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = function2;
        this.LLILZLL = c869590Y9l;
        this.LLIZ = c869590Y9l2;
        this.LLIZLLLIL = function22;
        this.LLJ = pigeonMessageSenderComponent;
        this.LLJI = interfaceC875640YWs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C875540YWi c875540YWi = new C875540YWi(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c875540YWi.LLILZ = obj;
        return c875540YWi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YWl] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875540YWi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
