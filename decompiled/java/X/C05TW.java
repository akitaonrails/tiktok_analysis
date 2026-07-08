package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.05TW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$FisheyeCarousel$5$3$1", f = "FishEyeCarousel.kt", l = {208, 213, 215}, m = "invokeSuspend")
public final class C05TW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1350305Qf LLILLL;
    public final /* synthetic */ InterfaceC1665500tRU<InterfaceC1627890sSp> LLILZ;
    public final /* synthetic */ C1690080u58 LLILZIL;
    public final /* synthetic */ C05P1<Integer> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05TW(C1350305Qf c1350305Qf, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, C1690080u58 c1690080u58, C05P1<Integer> c05p1, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05TW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1350305Qf;
        this.LLILZ = interfaceC1665500tRU;
        this.LLILZIL = c1690080u58;
        this.LLILZLL = c05p1;
        this.LLIZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TW(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                this.LLIZ.setValue(Boolean.FALSE);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
                return unit;
            }
            i = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            i = this.LLILLL.LIZ;
            if (i >= 0 && i < this.LLILZ.size()) {
                if (i == C1668500tWK.LIZ(this.LLILZLL)) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
                    return unit2;
                }
                AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(946);
                this.LL = i;
                this.LLILLJJLI = 1;
                if (C1838620xwi.LIZIZ(this, aFwS229S0000000_2) == objLJFF) {
                    C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
                    return objLJFF;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
                return unit3;
            }
        }
        this.LLIZ.setValue(Boolean.TRUE);
        int i3 = C05TX.LIZ[this.LLILLL.LIZIZ.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                C1690080u58 c1690080u58 = this.LLILZIL;
                this.LLILLJJLI = 3;
                C1687100u0K c1687100u0K = C1690080u58.LJIL;
                if (c1690080u58.LJIIJ(i, 0, this) == objLJFF) {
                    C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
                    return objLJFF;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            C1690080u58 c1690080u582 = this.LLILZIL;
            this.LLILLJJLI = 2;
            C1687100u0K c1687100u0K2 = C1690080u58.LJIL;
            if (c1690080u582.LJFF(i, 0, this) == objLJFF) {
                C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
                return objLJFF;
            }
        }
        this.LLIZ.setValue(Boolean.FALSE);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$3$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
