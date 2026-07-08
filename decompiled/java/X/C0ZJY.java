package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZJY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.ActivityStatusIntegrationMgr$initActivityStatusPhase2$1", f = "ActivityStatusIntegrationMgr.kt", l = {}, m = "invokeSuspend")
public final class C0ZJY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0ZJY(InterfaceC1364105Vn<? super C0ZJY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZJY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C0NY2 c0ny2LJIIJJI;
        C15511065l c15511065lLJFF;
        C1C7U.LIZ("ActivityStatusIntegrationMgr@1ff3.initActivityStatusPhase2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null && (c15511065lLJFF = iMHostApiLIZ.LJFF()) != null) {
            Boolean.valueOf(arrayList.add(c15511065lLJFF));
        }
        IMHostApi iMHostApiLIZ2 = C1419705h5.LIZ();
        if (iMHostApiLIZ2 != null && (c0ny2LJIIJJI = iMHostApiLIZ2.LJIIJJI()) != null) {
            Boolean.valueOf(arrayList.add(c0ny2LJIIJJI));
        }
        ((ActivityStatusService) C0ZJX.LIZIZ.getValue()).LJIIJ(arrayList);
        C897570ZJb c897570ZJb = (C897570ZJb) C0ZJX.LIZLLL.getValue();
        if (c897570ZJb.LIZIZ()) {
            c897570ZJb.LIZIZ.LIZIZ();
            c897570ZJb.LJI.set(true);
            c897570ZJb.LIZJ.LJ("app_launch", EnumC595840NYo.ALL);
        }
        if (C1689706jX.LIZ()) {
            c897570ZJb.LIZJ.LJ("app_launch", EnumC595840NYo.FETCH);
        }
        C191862104e c191862104eLJ = C191871104n.LJ();
        C891920Yys c891920Yys = c897570ZJb.LJII;
        c191862104eLJ.getClass();
        C191862104e.LIZJ(c891920Yys);
        C0ZK4.LIZIZ.getValue().LIZ(new C897590ZJd(c897570ZJb));
        Object value = C0ZJX.LJIIIIZZ.getValue();
        value.getClass();
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(value);
        long jCurrentTimeMillis = System.currentTimeMillis() - C0ZJX.LJI;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tt_im_enable_activity_status_init_mob", true, false) || System.currentTimeMillis() % ((long) 100) < 10) {
            if (C2485509ob.LIZ()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("activity_status_sdk_init", C2097608Jq.LJIIJ(new Pair("enable_refactor", "1"), new Pair("is_main_thread", str), new Pair("phase_1_duration", String.valueOf(C0ZJX.LJFF)), new Pair("phase_2_duration", String.valueOf(jCurrentTimeMillis))));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusIntegrationMgr@1ff3.initActivityStatusPhase2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0ZJY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
