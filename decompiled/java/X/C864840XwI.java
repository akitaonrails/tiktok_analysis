package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.markconversationread.MarkConversationReadUseCase$markConversationRead$2", f = "MarkConversationReadUseCase.kt", l = {100}, m = "invokeSuspend")
public final class C864840XwI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C0Y8T>>, Object> {
    public int LL;
    public final /* synthetic */ C864350XvV LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864840XwI(C864350XvV c864350XvV, String str, Long l, InterfaceC1364105Vn<? super C864840XwI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c864350XvV;
        this.LLILLL = str;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864840XwI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0248, code lost:
    
        if (r8 == null) goto L49;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C864840XwI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
