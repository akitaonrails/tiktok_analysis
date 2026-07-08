package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.utils.AdUtmParamsManager$preParseUtmParamsAsync$1", f = "AdUtmParamsManager.kt", l = {}, m = "invokeSuspend")
public final class C2217708mV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1035880d3y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217708mV(C1035880d3y c1035880d3y, InterfaceC1364105Vn<? super C2217708mV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1035880d3y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2217708mV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdUtmParamsManager@a818.preParseUtmParamsAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1035880d3y c1035880d3y = this.LL;
            if (c1035880d3y.getUtmParams() == null) {
                String url = c1035880d3y.getUrl();
                if (url != null && url.length() != 0) {
                    c1035880d3y.setUtmParams(C1037200d66.LJI(UriProtector.parse(url)));
                } else {
                    c1035880d3y.setUtmParams(C2097608Jq.LJ());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdUtmParamsManager@a818.preParseUtmParamsAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
