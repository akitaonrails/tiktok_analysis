package X;

import android.app.Application;
import android.os.Build;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537970q7n extends C09AY implements Function0<Map<String, Object>> {
    public final /* synthetic */ C1539210q9n LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537970q7n(C1539210q9n c1539210q9n) {
        super(0);
        this.LL = c1539210q9n;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, Object> invoke() {
        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        Application applicationLIZJ = C1161970gLL.LIZIZ().LIZJ();
        this.LL.getClass();
        c1546210qL5.getClass();
        Application applicationLIZJ2 = C1161970gLL.LIZIZ().LIZJ();
        this.LL.getClass();
        return C2097608Jq.LJIIJ(new Pair("screenWidth", Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJI(applicationLIZJ, false), C1161970gLL.LIZIZ().LIZJ()))), new Pair("screenHeight", Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LIZLLL(applicationLIZJ2, false), C1161970gLL.LIZIZ().LIZJ()))), new Pair("statusBarHeight", Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJII(C1161970gLL.LIZIZ().LIZJ()), C1161970gLL.LIZIZ().LIZJ()))), new Pair("deviceModel", Build.MODEL), new Pair("os", "android"), new Pair("osVersion", Build.VERSION.RELEASE), new Pair("language", C1546210qL5.LIZIZ()), new Pair("isLowPowerMode", Integer.valueOf(C1546210qL5.LJIIIIZZ(C1161970gLL.LIZIZ().LIZJ()) ? 1 : 0)), new Pair("accessibleMode", Integer.valueOf(C1546210qL5.LJIIJJI(C1161970gLL.LIZIZ().LIZJ()) ? 1 : 0)), new Pair("env", "sdui"));
    }
}
