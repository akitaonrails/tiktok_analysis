package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0sTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.et.FullWidthEffectCarouselMobComponent$initJobs$1$1$2", f = "FullWidthEffectCarouselMobComponent.kt", l = {}, m = "invokeSuspend")
public final class C1628460sTk extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArrayList<C1628500sTo> LL;
    public final /* synthetic */ C1628410sTf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628460sTk(C1628410sTf c1628410sTf, ArrayList arrayList, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = arrayList;
        this.LLILLJJLI = c1628410sTf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1628460sTk(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselMobComponent@588d.initJobs$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1628430sTh.LIZ(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselMobComponent@588d.initJobs$1$1$2");
        return unit;
    }
}
