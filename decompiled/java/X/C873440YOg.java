package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.BizScopedMessageManager$sendMessages$2", f = "BizScopedMessageManager.kt", l = {157}, m = "invokeSuspend")
public final class C873440YOg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C873390YOb LLILLJJLI;
    public final /* synthetic */ C873520YOo LLILLL;
    public final /* synthetic */ C0YP8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873440YOg(C873390YOb c873390YOb, C873520YOo c873520YOo, C0YP8 c0yp8, InterfaceC1364105Vn<? super C873440YOg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c873390YOb;
        this.LLILLL = c873520YOo;
        this.LLILZ = c0yp8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C873440YOg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BizScopedMessageManager@ca98.sendMessages$2");
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
            InterfaceC873460YOi interfaceC873460YOiLJII = this.LLILLJJLI.LJII();
            C873520YOo c873520YOo = this.LLILLL;
            C0YP8 c0yp8 = this.LLILZ;
            this.LL = 1;
            if (interfaceC873460YOiLJII.LIZ(c873520YOo, c0yp8, this) == objLJFF) {
                C1C7U.LIZIZ("BizScopedMessageManager@ca98.sendMessages$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BizScopedMessageManager@ca98.sendMessages$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
