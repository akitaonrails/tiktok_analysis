package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEvent;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.logicslice.track.ECMMKTrackReporter$init$1", f = "ECMMKTrackReporter.kt", l = {}, m = "invokeSuspend")
public final class C1774900wHw extends C09AX implements Function2<AbstractC1774980wI4, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1774890wHv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1774900wHw(C1774890wHv c1774890wHv, InterfaceC1364105Vn<? super C1774900wHw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1774890wHv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1774900wHw c1774900wHw = new C1774900wHw(this.LLILLJJLI, interfaceC1364105Vn);
        c1774900wHw.LL = obj;
        return c1774900wHw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1774840wHq c1774840wHq;
        C1C7U.LIZ("ECMMKTrackReporter@1e09.init$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1774980wI4 abstractC1774980wI4 = (AbstractC1774980wI4) this.LL;
        if (abstractC1774980wI4 instanceof C1774920wHy) {
            C1774890wHv c1774890wHv = this.LLILLJJLI;
            C1774920wHy c1774920wHy = (C1774920wHy) abstractC1774980wI4;
            c1774890wHv.getClass();
            String str = c1774920wHy.LIZ;
            InterfaceC1773310wFN interfaceC1773310wFN = c1774920wHy.LIZIZ;
            C1775190wIP c1775190wIP = c1774920wHy.LIZJ;
            Map<String, Object> map = c1774920wHy.LIZLLL;
            int i = c1774920wHy.LJ;
            C1774840wHq c1774840wHq2 = c1774920wHy.LJFF;
            List<String> list = c1774920wHy.LJI;
            if (i != 2) {
                c1774840wHq = c1774840wHq2;
                C1774890wHv.LIZIZ(c1774890wHv.LIZ, str, interfaceC1773310wFN, c1775190wIP, map, c1774840wHq, list);
                if (i != 1) {
                }
            } else {
                c1774840wHq = c1774840wHq2;
            }
            C1774890wHv.LIZIZ(c1774890wHv.LIZIZ, str, interfaceC1773310wFN, c1775190wIP, map, c1774840wHq, list);
        } else if (abstractC1774980wI4 instanceof C1774960wI2) {
            C1774890wHv c1774890wHv2 = this.LLILLJJLI;
            C1774960wI2 c1774960wI2 = (C1774960wI2) abstractC1774980wI4;
            c1774890wHv2.getClass();
            InterfaceC1773310wFN interfaceC1773310wFN2 = c1774960wI2.LIZ;
            ECMixMallTrackEvent eCMixMallTrackEvent = c1774960wI2.LIZIZ;
            String str2 = eCMixMallTrackEvent.eventName;
            C1775190wIP c1775190wIP2 = c1774960wI2.LIZJ;
            ECMixMallTrackEventParams eCMixMallTrackEventParams = eCMixMallTrackEvent.data;
            if (eCMixMallTrackEventParams != null) {
                c1774890wHv2.LIZ.LJ(interfaceC1773310wFN2, str2, C1774890wHv.LIZ(c1774890wHv2.LIZ, eCMixMallTrackEventParams, null, interfaceC1773310wFN2, c1775190wIP2, null, null), eCMixMallTrackEvent.data, null);
            }
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKTrackReporter@1e09.init$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1774980wI4 abstractC1774980wI4, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1774980wI4, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
