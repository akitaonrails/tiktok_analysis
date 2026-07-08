package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CTT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nuj.HomeTabNujLaunchHelper$reportOnTabRefresh$2$1", f = "HomeTabNujLaunchHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CTT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C0CTS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTT(C19EG c19eg, boolean z, C0CTS c0cts, InterfaceC1364105Vn<? super C0CTT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = z;
        this.LLILLL = c0cts;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        Pair<List<String>, List<String>> pair;
        C1C7U.LIZ("HomeTabNujLaunchHelper@afd.reportOnTabRefresh$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CUI c0cui = C0CUI.LIZ;
        C19EG c19eg = this.LL;
        boolean z = this.LLILLJJLI;
        C0CTS c0cts = this.LLILLL;
        if (c0cts != null) {
            str = c0cts.LL;
        } else {
            str = null;
        }
        c0cui.getClass();
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "enable_track_show_homepage_tab_after_launch", false, false)) {
            JSONObject jSONObject = new JSONObject();
            ITabStrip iTabStrip = (ITabStrip) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ITabStrip.class, null);
            if (iTabStrip == null || (pair = iTabStrip.Tg1()) == null) {
                C13BV c13bv = C13BV.INSTANCE;
                pair = new Pair<>(c13bv, c13bv);
            }
            C0CUI.LIZ(jSONObject, c19eg, pair.getFirst(), pair.getSecond());
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, z ? 1 : 0);
            if (str != null) {
                jSONObject.put("error_msg", str);
            }
            C20684815ws.LJIJ("rd_nuj_refresh_finish", jSONObject);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.reportOnTabRefresh$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
