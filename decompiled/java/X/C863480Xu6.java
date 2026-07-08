package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$batchMarkConversationReadById$1", f = "DefaultIMUseCaseCenter.kt", l = {790}, m = "invokeSuspend")
public final class C863480Xu6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ InterfaceC863600XuI<List<String>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863480Xu6(C863650XuN c863650XuN, List<String> list, InterfaceC863600XuI<List<String>> interfaceC863600XuI, InterfaceC1364105Vn<? super C863480Xu6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = list;
        this.LLILZ = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863480Xu6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.batchMarkConversationReadById$1");
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
            List<String> list = this.LLILLL;
            InterfaceC863600XuI<List<String>> interfaceC863600XuI = this.LLILZ;
            this.LL = 1;
            Object objLIZ = c864340XvULJIILL.LIZ(c864340XvULJIILL.LIZIZ.LJIIZILJ().LIZLLL().LIZ().LJIJJ(list), interfaceC863600XuI, this);
            if (objLIZ != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.batchMarkConversationReadById$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.batchMarkConversationReadById$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
