package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.compose.AIPortraitCarouselKt$autoScroll$4", f = "AIPortraitCarousel.kt", l = {133, 141}, m = "invokeSuspend")
public final class C1361905Ur extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1690640u62 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361905Ur(AbstractC1690640u62 abstractC1690640u62, InterfaceC1364105Vn<? super C1361905Ur> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1690640u62;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1361905Ur(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitCarouselKt@d91a.autoScroll$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.LJIIIZ() < this.LLILLJJLI.LJIILIIL() - 1) {
                AbstractC1690640u62 abstractC1690640u62 = this.LLILLJJLI;
                int iLJIIIZ = abstractC1690640u62.LJIIIZ() + 1;
                C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(500, 0, C05Y0.LIZ, 2);
                this.LL = 1;
                if (abstractC1690640u62.LJFF(iLJIIIZ, 0.0f, c1677050tk7LIZLLL, this) == objLJFF) {
                    C1C7U.LIZIZ("AIPortraitCarouselKt@d91a.autoScroll$4");
                    return objLJFF;
                }
            } else {
                AbstractC1690640u62 abstractC1690640u622 = this.LLILLJJLI;
                this.LL = 2;
                if (AbstractC1690640u62.LJIJJLI(abstractC1690640u622, 0, this) == objLJFF) {
                    C1C7U.LIZIZ("AIPortraitCarouselKt@d91a.autoScroll$4");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitCarouselKt@d91a.autoScroll$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
