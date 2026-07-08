package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$resolveMessagesGapsAndCheckMissing$1", f = "DefaultIMUseCaseCenter.kt", l = {716}, m = "invokeSuspend")
public final class C862600Xsg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ C0YL9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862600Xsg(C863650XuN c863650XuN, C0YL9 c0yl9, InterfaceC1364105Vn<? super C862600Xsg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = c0yl9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862600Xsg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.resolveMessagesGapsAndCheckMissing$1");
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
            C0VS9 c0vs9LJIIIIZZ = this.LLILLJJLI.LLILZIL.LJIIIIZZ();
            C0YL9 c0yl9 = this.LLILLL;
            String str = c0yl9.LIZ;
            List<C869590Y9l> list = c0yl9.LIZJ;
            this.LL = 1;
            if (c0vs9LJIIIIZZ.LIZ(str, list, null, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.resolveMessagesGapsAndCheckMissing$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.resolveMessagesGapsAndCheckMissing$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
