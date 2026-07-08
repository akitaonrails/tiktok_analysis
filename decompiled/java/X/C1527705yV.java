package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05yV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMConvLoadAnalytics$tryReportInboxPerf$1", f = "IMConvLoadAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1527705yV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1527705yV(InterfaceC1364105Vn<? super C1527705yV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1527705yV(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("IMConvLoadAnalytics@9541.tryReportInboxPerf$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            Map<InterfaceC879010Ye3, InterfaceC884020Ym8> mapLJIIZILJ = abstractC883730YlfLJ.LJIIZILJ();
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<InterfaceC879010Ye3, InterfaceC884020Ym8>> it2 = mapLJIIZILJ.entrySet().iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getValue().LIZIZ(false), arrayList);
            }
            numLJ = C2286608xc.LJ(arrayList.size());
        } else {
            numLJ = null;
        }
        C885830Yp3.LJFF(C885830Yp3.LL, "im_inbox_perf", C2097608Jq.LJIIIIZZ(new Pair("session_count_in_mem", String.valueOf(numLJ)), new Pair("conv_count_in_mem", String.valueOf(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZIZ().size())), new Pair("total_conv_size", String.valueOf(C885830Yp3.LLJI))), null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMConvLoadAnalytics@9541.tryReportInboxPerf$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1527705yV(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
