package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$removeMembers$1", f = "DefaultIMUseCaseCenter.kt", l = {415}, m = "invokeSuspend")
public final class C862500XsW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<Long> LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ InterfaceC867020Xzo<List<C0YAE>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862500XsW(C863650XuN c863650XuN, String str, List<Long> list, Map<String, String> map, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo, InterfaceC1364105Vn<? super C862500XsW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = map;
        this.LLILZLL = interfaceC867020Xzo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862500XsW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.removeMembers$1");
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
            C0YMY c0ymyLJIIJJI = this.LLILLJJLI.LLILZIL.LJIIJJI();
            String str = this.LLILLL;
            List<Long> list = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo = this.LLILZLL;
            this.LL = 1;
            if (c0ymyLJIIJJI.LIZJ(str, list, map, interfaceC867020Xzo, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.removeMembers$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.removeMembers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
