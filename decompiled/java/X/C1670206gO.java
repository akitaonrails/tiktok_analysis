package X;

import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06gO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.B2CDynamicLoadAssemAnalytics$reportDynamicLoadBusinessAssem$1", f = "B2CDynamicLoadAssemAnalytics.kt", l = {28}, m = "invokeSuspend")
public final class C1670206gO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C909290Zln LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670206gO(C909290Zln c909290Zln, InterfaceC1364105Vn<? super C1670206gO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c909290Zln;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1670206gO(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        C1C7U.LIZ("B2CDynamicLoadAssemAnalytics@34d5.reportDynamicLoadBusinessAssem$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Map map2 = (Map) this.LL;
                C155000ia.LIZIZ(obj);
                map = map2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C909290Zln c909290Zln = this.LLILLL;
            linkedHashMap.put("enter_from", c909290Zln.getEnterFromForMob());
            linkedHashMap.put("enter_method", c909290Zln.getEnterMethod());
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            map = linkedHashMap;
            if (iIMChatAnalyticsLIZ != null) {
                String singleChatFromUserId = this.LLILLL.getSingleChatFromUserId();
                if (singleChatFromUserId == null) {
                    singleChatFromUserId = "";
                }
                this.LL = linkedHashMap;
                this.LLILLJJLI = 1;
                Object objLJI = iIMChatAnalyticsLIZ.LJI(singleChatFromUserId, linkedHashMap, this);
                map = linkedHashMap;
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("B2CDynamicLoadAssemAnalytics@34d5.reportDynamicLoadBusinessAssem$1");
                    return objLJFF;
                }
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_dynamic_load_b2c_perf", map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("B2CDynamicLoadAssemAnalytics@34d5.reportDynamicLoadBusinessAssem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
