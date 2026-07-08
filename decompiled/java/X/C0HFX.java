package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HFX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.emojislider.service.EmojiSliderReactionManager$initPowerList$1$onLoadMore$1", f = "EmojiSliderReactionManager.kt", l = {}, m = "invokeSuspend")
public final class C0HFX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Long>> LL;
    public final /* synthetic */ C437880HFa LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HFX(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn, C437880HFa c437880HFa, long j, InterfaceC1364105Vn<? super C0HFX> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = interfaceC1364105Vn;
        this.LLILLJJLI = c437880HFa;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HFX(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmojiSliderReactionManager@96b6.initPowerList$1$onLoadMore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1364105Vn<AbstractC316870CbV<Long>> interfaceC1364105Vn = this.LL;
        AbstractC316870CbV abstractC316870CbVLIZ = ((C1891900zKe) this.LLILLJJLI.LIZJ.getValue()).LIZ(C13BV.INSTANCE, this.LLILLL);
        C189200o6.m2constructorimpl(abstractC316870CbVLIZ);
        interfaceC1364105Vn.resumeWith(abstractC316870CbVLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmojiSliderReactionManager@96b6.initPowerList$1$onLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
