package X;

import android.content.Context;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.spark.AdHybridSparkLoader;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029710cu1 extends AbstractC1028360crq {
    public IAdHybridCustomLoader LIZIZ;
    public Function0<Unit> LIZJ;

    @Override // X.AbstractC1028360crq
    public final void LJFF() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.close();
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIIIZZ() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.destroy();
        }
    }

    @Override // X.AbstractC1028360crq
    public final C1015060cWO LJIIJ() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            return iAdHybridCustomLoader.getPerfMetricsModel();
        }
        return null;
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIL() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.onHide();
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIILJJIL() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.onShowSuccess();
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJJLI() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.releaseCache();
        }
    }

    @Override // X.AbstractC1028360crq
    public final String LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("containerInstance is null ");
        sbLIZ.append(this.LIZIZ == null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1029710cu1(C1028380crs c1028380crs) {
        IAdHybridCustomLoader iAdHybridCustomLoader;
        Object obj;
        Class<?> cls;
        Class<? extends U> clsAsSubclass;
        super(c1028380crs);
        C1018890ccZ.LIZ.getClass();
        try {
            C1018900cca.LIZ.getClass();
            Map<?, ?> map = C1018900cca.LIZJ;
            if (map != null) {
                obj = map.get(c1028380crs.LIZIZ.name());
            } else {
                obj = null;
            }
            String str = (String) obj;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createContainer: containerClassName=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ(C1018890ccZ.LIZIZ);
            Map<String, Class<?>> map2 = C1018890ccZ.LIZJ;
            if (map2.containsKey(str)) {
                cls = (Class) ((LinkedHashMap) map2).get(str);
            } else {
                cls = Class.forName(str);
                map2.put(str, cls);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createContainer: Exception = ");
                sbLIZ2.append(thM5exceptionOrNullimpl);
                C2188811AlT.LIZIZ(sbLIZ2);
                C811103Ev.LIZ(C1018890ccZ.LIZIZ);
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
        if (cls != null && (clsAsSubclass = cls.asSubclass(IAdHybridCustomLoader.class)) != 0 && (iAdHybridCustomLoader = (IAdHybridCustomLoader) clsAsSubclass.newInstance()) != null) {
            iAdHybridCustomLoader.initialize(c1028380crs.LIZ, c1028380crs.LIZJ);
        } else {
            iAdHybridCustomLoader = null;
        }
        this.LIZIZ = iAdHybridCustomLoader;
        if (iAdHybridCustomLoader == null && c1028380crs.LIZIZ == C0WOV.SPARK) {
            if (!((Boolean) C135300fP.LIZ.getValue()).booleanValue()) {
                C301090Br9.LIZIZ(new AwS165S1100000_16(this, "containerInstance is null, try create spark loader, total switch closed", 17));
            } else {
                try {
                    C1029740cu4 c1029740cu4 = this.LIZ.LIZLLL;
                    Boolean boolValueOf = c1029740cu4 != null ? Boolean.valueOf(c1029740cu4.LJI) : null;
                    if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("containerInstance is null, try create spark loader, hasSparkLoaderNullReCreate == ");
                        sbLIZ3.append(boolValueOf);
                        C301090Br9.LIZIZ(new AwS165S1100000_16(this, C2188811AlT.LIZIZ(sbLIZ3), 17));
                    } else {
                        AdHybridSparkLoader adHybridSparkLoader = new AdHybridSparkLoader();
                        C1028380crs c1028380crs2 = this.LIZ;
                        adHybridSparkLoader.initialize(c1028380crs2.LIZ, c1028380crs2.LIZJ);
                        this.LIZIZ = adHybridSparkLoader;
                        C301090Br9.LIZIZ(new AwS165S1100000_16(this, "containerInstance is null, try create spark loader, success", 17));
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LIZJ("AdHybridContainerDefaultImpl tryCreateSparkLoaderWhenInstanceIsNull");
                    C301090Br9.LIZIZ(new AwS165S1100000_16(this, "containerInstance is null, try create spark loader, fail crashed", 17));
                }
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("createContainer: containerInstance=");
        sbLIZ4.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        C811103Ev.LIZ("AdHybridContainerDefaultImpl");
    }

    @Override // X.AbstractC1028360crq
    public final void LJIILLIIL(InterfaceC1029720cu2 interfaceC1029720cu2) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registAdWebFragmentViewProvider(interfaceC1029720cu2);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIZILJ(C1039230d9N c1039230d9N) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerActivityCallback(c1039230d9N);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJ(C1039100d9A c1039100d9A) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerActivityRootViewProvider(c1039100d9A);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJI(InterfaceC1036150d4P interfaceC1036150d4P) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerHybridRootContainer(interfaceC1036150d4P);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIJJ(C1039010d91 c1039010d91) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerTitleBarProvider(c1039010d91);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIL(String str) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.releaseCacheWithKey(str);
        }
        Function0<Unit> function0 = this.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LIZJ = null;
    }

    @Override // X.AbstractC1028360crq
    public final void LJJI(C1051290dSp c1051290dSp) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.renderFullScreen(c1051290dSp);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJJIII(AwS413S0200000_12 awS413S0200000_12) {
        this.LIZJ = awS413S0200000_12;
    }

    @Override // X.AbstractC1028360crq
    public final void LJJIIJ(Map<String, ? extends Object> map) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.updateGlobalProps(map);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIIJJI(String str, JSONObject jSONObject) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.notifyFE(str, jSONObject);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIILIIL(String str, String str2) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.onShowFailed(str, str2);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJIILL(C1051290dSp c1051290dSp, InterfaceC1028390crt interfaceC1028390crt) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.preRender(this.LIZ, c1051290dSp, interfaceC1028390crt);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJJIFFI(C1051290dSp c1051290dSp, InterfaceC1051480dT8 interfaceC1051480dT8) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.renderPopup(c1051290dSp, interfaceC1051480dT8);
        }
    }

    @Override // X.AbstractC1028360crq
    public final void LJJII(Context context, String str) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.router(context, str);
        }
    }

    @Override // X.AbstractC1028360crq
    public final InterfaceC1034470d1h LJI(C1051290dSp c1051290dSp, boolean z, C830490Whz<String, Object> c830490Whz) {
        String creativeIdStr;
        C1035880d3y c1035880d3y;
        AwemeRawAd awemeRawAd;
        if (this.LIZIZ == null) {
            HashMap map = new HashMap();
            C1035770d3n c1035770d3n = c1051290dSp.LJI;
            if (c1035770d3n == null || (c1035880d3y = c1035770d3n.LIZJ) == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
                creativeIdStr = "";
            }
            map.put("creative_id", creativeIdStr);
            map.put("containerInstance", "containerInstance is null");
            Npth.reportBizException("iab", new Throwable(map.toString()), map.toString(), (Map<String, String>) map, true);
        }
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            return iAdHybridCustomLoader.createHybridFragment(c1051290dSp, z, c830490Whz);
        }
        return null;
    }

    @Override // X.AbstractC1028360crq
    public final void LJJ(C1051290dSp c1051290dSp, InterfaceC1051190dSf interfaceC1051190dSf, InterfaceC1028400cru interfaceC1028400cru) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.render(this.LIZ, c1051290dSp, interfaceC1051190dSf, interfaceC1028400cru);
        }
        C301090Br9.LIZIZ(new AwS417S0200000_16(this, c1051290dSp, 12));
    }
}
