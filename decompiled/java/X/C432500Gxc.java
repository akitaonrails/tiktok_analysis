package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselManager$preloadMatchedToMemoryWithNeighboursToDisk$1", f = "PdpCarouselManager.kt", l = {}, m = "invokeSuspend")
public final class C432500Gxc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Image LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432500Gxc(Image image, InterfaceC1364105Vn<? super C432500Gxc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = image;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432500Gxc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpCarouselManager@5fbd.preloadMatchedToMemoryWithNeighboursToDisk$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Image image = this.LL;
        try {
            C1326790kdB.LIZ.getClass();
            C1326790kdB.LIZLLL(image).LJJII(null);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpCarouselManager@5fbd.preloadMatchedToMemoryWithNeighboursToDisk$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
