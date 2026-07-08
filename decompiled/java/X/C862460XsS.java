package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$batchMarkConversationRead$1", f = "DefaultIMUseCaseCenter.kt", l = {784}, m = "invokeSuspend")
public final class C862460XsS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ List<C0Y8T> LLILLL;
    public final /* synthetic */ InterfaceC863600XuI<List<String>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862460XsS(C863650XuN c863650XuN, List<C0Y8T> list, InterfaceC863600XuI<List<String>> interfaceC863600XuI, InterfaceC1364105Vn<? super C862460XsS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = list;
        this.LLILZ = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862460XsS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.batchMarkConversationRead$1");
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
            C864340XvU c864340XvULJIILL = this.LLILLJJLI.LLILZIL.LJIILL();
            List<C0Y8T> list = this.LLILLL;
            InterfaceC863600XuI<List<String>> interfaceC863600XuI = this.LLILZ;
            this.LL = 1;
            if (c864340XvULJIILL.LIZ(list, interfaceC863600XuI, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.batchMarkConversationRead$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.batchMarkConversationRead$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
