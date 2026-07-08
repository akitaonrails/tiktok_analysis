package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.api.DetailApiProxyImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05y4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.retag.PoiRequestAwemeInterceptor$onInterceptRoute$1", f = "PoiRequestAwemeInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C1525005y4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RouteIntent LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1525005y4(Context context, RouteIntent routeIntent, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = routeIntent;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1525005y4(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Intent extra;
        String string;
        Activity activityLIZ;
        C1C7U.LIZ("PoiRequestAwemeInterceptor@916.onInterceptRoute$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            RouteIntent routeIntent = this.LL;
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                try {
                    Bundle extras = extra.getExtras();
                    if (extras != null && (string = extras.getString("aweme_id")) != null) {
                        Context context = this.LLILLJJLI;
                        Aweme awemeLIZ = DetailApiProxyImpl.LIZIZ().LIZ(string);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aweme=");
                        sbLIZ.append(awemeLIZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                            C1443290nf5.LIZ().startEditPostPublishPage(activityLIZ, awemeLIZ, 1996, "", true);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error querying aweme error=");
            sbLIZ2.append(e2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiRequestAwemeInterceptor@916.onInterceptRoute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
