package X;

import android.content.Context;
import com.bytedance.hybrid.spark.roma.IRomaHostDepend;
import com.bytedance.hybrid.spark.roma.RomaGlobalConfig;
import com.bytedance.hybrid.spark.roma.internal.IDebugService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550300qRg implements IRomaHostDepend {
    public static final C1550300qRg LIZIZ = new C1550300qRg();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(279));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6302));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6301));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6300));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6303));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1811));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(278));
    public final /* synthetic */ C1550310qRh LIZ = C1550310qRh.LIZIZ;

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LIZ(Context context, String str) {
        this.LIZ.LIZ(context, str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Long LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LJII(String str, JSONObject jSONObject) {
        this.LIZ.LJII(str, jSONObject);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LJIIJ(IRomaHostDepend.ExposeType exposeType, String str) {
        this.LIZ.LJIIJ(exposeType, str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final C1550330qRj LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final EnumC1153760g86 LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Set<String> LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Set<String> LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Map<String, String> LJIILL(String str) {
        return this.LIZ.LJIILL(str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Object LJIILLIIL(Class cls) {
        return this.LIZ.LJIILLIIL(cls);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String getOpRegion() {
        return this.LIZ.getOpRegion();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean isLocalTest() {
        return this.LIZ.isLocalTest();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean ki(String str) {
        return this.LIZ.ki(str);
    }

    public static RomaGlobalConfig LIZIZ() {
        return (RomaGlobalConfig) LIZJ.getValue();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Object LJIIIIZZ(Class cls, String str) {
        IDebugService iDebugService;
        Object c098200Yq;
        Object obj = null;
        try {
            iDebugService = (IDebugService) ServiceManager.get().getService(IDebugService.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iDebugService = null;
        }
        if (iDebugService != null) {
            try {
                c098200Yq = iDebugService.LIZIZ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            if (obj != null) {
                return obj;
            }
        }
        return C1550310qRh.LIZIZ.LJIIIIZZ(cls, str);
    }
}
