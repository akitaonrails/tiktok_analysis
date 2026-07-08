package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.als.ui.ComposeGroupComponent$RenderUI$2", f = "ComposeGroupComponent.kt", l = {}, m = "invokeSuspend")
public final class C1664870tQT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1664840tQQ<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1664870tQT(AbstractC1664840tQQ<T> abstractC1664840tQQ, InterfaceC1364105Vn<? super C1664870tQT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1664840tQQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1664870tQT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComposeGroupComponent@4283.RenderUI$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1664840tQQ<T> abstractC1664840tQQ = this.LL;
        if (!abstractC1664840tQQ.LLIZLLLIL) {
            abstractC1664840tQQ.LLILLJJLI.registerChildSceneLifecycleCallbacks(abstractC1664840tQQ.LLJ, false);
            this.LL.LLIZLLLIL = true;
        }
        AbstractC1664840tQQ<T> abstractC1664840tQQ2 = this.LL;
        abstractC1664840tQQ2.LLILLJJLI.add(abstractC1664840tQQ2.LL, abstractC1664840tQQ2.W2(), this.LL.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposeGroupComponent@4283.RenderUI$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
