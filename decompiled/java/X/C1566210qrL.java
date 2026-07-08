package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent$generateReachBottomEndEvent$1", f = "LoadMorePerfComponent.kt", l = {}, m = "invokeSuspend")
public final class C1566210qrL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ LoadMorePerfComponent LLILZ;
    public final /* synthetic */ C092O<JSONObject> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566210qrL(JSONObject jSONObject, String str, LoadMorePerfComponent loadMorePerfComponent, C092O<JSONObject> c092o, long j, int i, InterfaceC1364105Vn<? super C1566210qrL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
        this.LLILLL = str;
        this.LLILZ = loadMorePerfComponent;
        this.LLILZIL = c092o;
        this.LLILZLL = j;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1566210qrL c1566210qrL = new C1566210qrL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1566210qrL.LL = obj;
        return c1566210qrL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("LoadMorePerfComponent@d571.generateReachBottomEndEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = this.LLILLJJLI;
        String str = this.LLILLL;
        LoadMorePerfComponent loadMorePerfComponent = this.LLILZ;
        C092O<JSONObject> c092o = this.LLILZIL;
        long j = this.LLILZLL;
        int i = this.LLIZ;
        try {
            jSONObject.putOpt("enter_from", str);
            INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
            if (iNetworkStateService == null || (string = C2286608xc.LJ(iNetworkStateService.getEffectiveConnectionType()).toString()) == null) {
                string = "";
            }
            jSONObject.putOpt("net_status", string);
            jSONObject.putOpt("duration", C2286608xc.LJFF(j));
            jSONObject.putOpt("index", C2286608xc.LJ(i));
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                jSONObject.putOpt("prf_cnt", C2286608xc.LJ(loadMorePerfComponent.LLIZLLLIL));
                jSONObject.putOpt("duration_from_last", C2286608xc.LJFF(loadMorePerfComponent.LLJI));
            }
            C1601970rn1.LIZ.getClass();
            C1601970rn1.LIZ(jSONObject);
            c092o.accept(jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoadMorePerfComponent@d571.generateReachBottomEndEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
