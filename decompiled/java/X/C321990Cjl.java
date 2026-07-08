package X;

import com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse;
import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$deleteSubConversation$1", f = "MessageOperatorHandler.kt", l = {3586}, m = "invokeSuspend")
public final class C321990Cjl extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ r2 LLILLJJLI;
    public final /* synthetic */ C1863280yaU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321990Cjl(r2 r2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C321990Cjl> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = r2Var;
        this.LLILLL = c1863280yaU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321990Cjl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.deleteSubConversation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            r2 r2Var = this.LLILLJJLI;
            String str = r2Var.LJIILLIIL.LJ;
            String str2 = r2Var.LJJIL;
            String str3 = r2Var.LJJIZ;
            boolean z = r2Var.LJJIJLIJ;
            this.LL = 1;
            obj = c1863980ybc.LIZ(str, str2, str3, c13bv, this, z);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageOperatorHandler@b589.deleteSubConversation$1");
                return objLJFF;
            }
        }
        if (!((BatchDeleteResponse) obj).getFailDeleteConversation()) {
            this.LLILLL.LJIILLIIL(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.deleteSubConversation$1");
        return unit;
    }
}
