package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$CarouselFactory$1$2$1", f = "FishEyeCarousel.kt", l = {}, m = "invokeSuspend")
public final class C1629770sVr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<String, UrlModel, C1320770kTT<C1331070kk5>, Unit> LL;
    public final /* synthetic */ InterfaceC1627890sSp LLILLJJLI;
    public final /* synthetic */ C1320770kTT<C1331070kk5> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1629770sVr(InterfaceC1631620sYq<? super String, ? super UrlModel, ? super C1320770kTT<C1331070kk5>, Unit> interfaceC1631620sYq, InterfaceC1627890sSp interfaceC1627890sSp, C1320770kTT<C1331070kk5> c1320770kTT, InterfaceC1364105Vn<? super C1629770sVr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = interfaceC1627890sSp;
        this.LLILLL = c1320770kTT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1629770sVr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FishEyeCarouselKt@275.CarouselFactory$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1631620sYq<String, UrlModel, C1320770kTT<C1331070kk5>, Unit> interfaceC1631620sYq = this.LL;
        InterfaceC1627890sSp interfaceC1627890sSp = this.LLILLJJLI;
        interfaceC1631620sYq.invoke(((C1628060sT6) interfaceC1627890sSp).LIZ, ((C1628060sT6) interfaceC1627890sSp).LIZLLL, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.CarouselFactory$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
