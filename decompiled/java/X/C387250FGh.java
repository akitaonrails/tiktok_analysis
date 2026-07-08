package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.motion.TextMotionCategoryPagerComponent$fetchData$2$1$1", f = "TextMotionCategoryPagerComponent.kt", l = {}, m = "invokeSuspend")
public final class C387250FGh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C387270FGj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387250FGh(C387270FGj c387270FGj, InterfaceC1364105Vn<? super C387250FGh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c387270FGj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387250FGh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextMotionCategoryPagerComponent@fcb5.fetchData$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.r4();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextMotionCategoryPagerComponent@fcb5.fetchData$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
