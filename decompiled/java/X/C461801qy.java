package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthCarouselBottomComponent$observeEffectSelectStateToShowBottomWidget$2", f = "FullWidthCarouselBottomComponent.kt", l = {96}, m = "invokeSuspend")
public final class C461801qy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ g LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461801qy(g gVar, InterfaceC1364105Vn<? super C461801qy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C461801qy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthCarouselBottomComponent@d6b5.observeEffectSelectStateToShowBottomWidget$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01S9<InterfaceC461401qu> c01s9LJLJL = this.LLILLJJLI.LLJJL.LJLJL();
            C517001zs c517001zs = new C517001zs(this.LLILLJJLI, 8);
            this.LL = 1;
            if (c01s9LJLJL.collect(c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.observeEffectSelectStateToShowBottomWidget$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
