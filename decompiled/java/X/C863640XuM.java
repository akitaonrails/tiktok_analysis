package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0XuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$getMessagesByUser$2", f = "DefaultIMUseCaseCenter.kt", l = {285}, m = "invokeSuspend")
public final class C863640XuM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863640XuM(C863650XuN c863650XuN, int i, int i2, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C863640XuM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863640XuM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.getMessagesByUser$2");
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
            C0YGW c0ygwLJIJJLI = this.LLILLJJLI.LLILZIL.LJIJJLI();
            int i2 = this.LLILLL;
            int i3 = this.LLILZ;
            C863650XuN c863650XuN = this.LLILLJJLI;
            InterfaceC871300YGa interfaceC871300YGaLJIILLIIL = c863650XuN.LLILZIL.LJIILLIIL(i2, new C863800Xuc(c863650XuN));
            Map<String, ? extends Object> map = this.LLILZIL;
            AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(this.LLILLJJLI, 307);
            this.LL = 1;
            if (c0ygwLJIJJLI.LIZLLL(i2, i3, interfaceC871300YGaLJIILLIIL, map, awS593S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.getMessagesByUser$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.getMessagesByUser$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
