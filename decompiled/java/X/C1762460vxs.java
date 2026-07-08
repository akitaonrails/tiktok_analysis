package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.VideoConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoReusedAssem$bindPlayerController$1", f = "PdpCarouselVideoReusedAssem.kt", l = {301}, m = "invokeSuspend")
public final class C1762460vxs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpCarouselVideoReusedAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1762460vxs(PdpCarouselVideoReusedAssem pdpCarouselVideoReusedAssem, InterfaceC1364105Vn<? super C1762460vxs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpCarouselVideoReusedAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1762460vxs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jFloatValue;
        Float f;
        C1765580w2u c1765580w2u;
        C1C7U.LIZ("PdpCarouselVideoReusedAssem@2eae.bindPlayerController$1");
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
            VideoConfig videoConfig = ((C1761890vwx) C631370Opb.LIZ(this.LLILLJJLI)).LLILZLL;
            if (videoConfig != null && (f = videoConfig.autoplayDelay) != null) {
                jFloatValue = (long) (f.floatValue() * 1000);
            } else {
                jFloatValue = 500;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jFloatValue, this) == objLJFF) {
                C1C7U.LIZIZ("PdpCarouselVideoReusedAssem@2eae.bindPlayerController$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.Bp().mute();
        if (this.LLILLJJLI.yp().getCurrentPosition() == ((C1761890vwx) C631370Opb.LIZ(this.LLILLJJLI)).LLILLJJLI && (c1765580w2u = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ) != null) {
            c1765580w2u.LIZLLL(0.0f);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpCarouselVideoReusedAssem@2eae.bindPlayerController$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
