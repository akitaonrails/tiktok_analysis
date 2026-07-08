package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YK0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.combo.DefaultComboGetMsgByUserUseCase", f = "DefaultComboGetMsgByUserUseCase.kt", l = {183, 199}, m = "pullAndProcess")
public final class C0YK0 extends AbstractC23140094w {
    public Function1 LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C872170YJj LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK0(C872170YJj c872170YJj, InterfaceC1364105Vn<? super C0YK0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c872170YJj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultComboGetMsgByUserUseCase@23a3.pullAndProcess$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLIZLLLIL.LJIIIIZZ(null, this, null);
        C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.pullAndProcess$1");
        return objLJIIIIZZ;
    }
}
