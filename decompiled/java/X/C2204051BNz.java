package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1BNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2204051BNz extends C1BOC {
    public static Context LJIIZILJ;
    public final Config LIZLLL;
    public final Uri LJ;
    public final String LJFF;
    public final C2204311BOz LJI = new C2204311BOz();
    public final C1287750jcD LJII;
    public final InterfaceC1535500q3o LJIIIIZZ;
    public final InterfaceC1503700pEW LJIIIZ;
    public final String LJIIJ;
    public final Object LJIIJJI;
    public final Map<String, ?> LJIIL;
    public final C20520915Rn LJIILIIL;
    public final C2204021BNw LJIILJJIL;
    public final Tracing LJIILL;
    public final long LJIILLIIL;

    public final void LIZLLL(C1542500qF6 c1542500qF6) {
        if (c1542500qF6 != null) {
            try {
                Set<C1BP1> set = (Set) c1542500qF6.create();
                if (set != null) {
                    for (final C1BP1 c1bp1 : set) {
                        final C2204311BOz c2204311BOz = this.LJI;
                        c2204311BOz.getClass();
                        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BO7
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2204311BOz c2204311BOz2 = c2204311BOz;
                                C1BP1 c1bp12 = c1bp1;
                                c2204311BOz2.getClass();
                                C1C7U.LIZ("BridgeRegistry@e128.register$1L");
                                if (!TextUtils.isEmpty(c1bp12.LIZ)) {
                                    ((HashMap) c2204311BOz2.LIZ).put(c1bp12.LIZ, c1bp12);
                                }
                                C1C7U.LIZIZ("BridgeRegistry@e128.register$1L");
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1BPP.LIZJ(4, "[Runtime] create bridge method error:", th);
            }
        }
    }

    public final void LJ(List<InterfaceC1537230q6b<InterfaceC1287060jb6>> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1537230q6b<InterfaceC1287060jb6>> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                final InterfaceC1287060jb6 interfaceC1287060jb6LIZ = it2.next().LIZ(this.LJIIJJI);
                if (interfaceC1287060jb6LIZ != null) {
                    final C1287750jcD c1287750jcD = this.LJII;
                    c1287750jcD.getClass();
                    C1287700jc8.LIZJ(new Runnable() { // from class: X.0jc5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1287750jcD c1287750jcD2 = c1287750jcD;
                            InterfaceC1287060jb6 interfaceC1287060jb6 = interfaceC1287060jb6LIZ;
                            c1287750jcD2.getClass();
                            C1C7U.LIZ("PiaMetrics@8663.addObserver$1L");
                            ((HashSet) c1287750jcD2.LIZJ).add(interfaceC1287060jb6);
                            C1C7U.LIZIZ("PiaMetrics@8663.addObserver$1L");
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1BPP.LIZIZ("[Runtime] create MetricsObserver error:", th);
            }
        }
    }

    public C2204051BNz(Uri uri, String str, final String str2, Object obj, DefaultResourceLoader defaultResourceLoader, InterfaceC1503700pEW interfaceC1503700pEW, String str3, Config config, Map map, C1BOI c1boi) {
        Tracing tracing = new Tracing();
        this.LJIILL = tracing;
        this.LJIILLIIL = System.currentTimeMillis();
        Tracing.Event eventLIZ = tracing.LIZ(EventName.NavigateStart);
        eventLIZ.args.put("url", uri.toString());
        eventLIZ.LIZ();
        this.LIZLLL = config;
        if (UriProtector.getQueryParameterNames(uri).contains("_pia_")) {
            this.LJ = uri;
        } else {
            this.LJ = C1953107kv.LIZ(uri);
        }
        this.LJFF = C1953107kv.LIZJ(uri, null);
        this.LJIIJJI = obj;
        this.LJIIIIZZ = defaultResourceLoader;
        this.LJIIIZ = interfaceC1503700pEW;
        C1287750jcD c1287750jcD = new C1287750jcD(uri.toString());
        this.LJII = c1287750jcD;
        LIZJ(c1287750jcD);
        this.LJIIL = map;
        this.LJIILIIL = new C20520915Rn(str);
        this.LJIILJJIL = new C2204021BNw(c1boi);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2211708lX.LIZ);
        sbLIZ.append(" ");
        sbLIZ.append(str3);
        this.LJIIJ = C2188811AlT.LIZIZ(sbLIZ);
        final C2204041BNy c2204041BNy = (C2204041BNy) this;
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BO5
            @Override // java.lang.Runnable
            public final void run() {
                C2204051BNz c2204051BNz = c2204041BNy;
                String str4 = str2;
                c2204051BNz.getClass();
                C1C7U.LIZ("PiaContext@f094.<init>$1L");
                c2204051BNz.LIZLLL(null);
                C1BO2 c1bo2 = C1BOL.LIZ;
                C1542500qF6 c1542500qF6 = c1bo2.LIZIZ(str4).LJFF;
                if (c1542500qF6 != null) {
                    c2204051BNz.LIZLLL(c1542500qF6);
                }
                List<InterfaceC1537230q6b<InterfaceC1287060jb6>> list = C1542560qFC.LJI;
                c2204051BNz.LJ(list);
                List<InterfaceC1537230q6b<InterfaceC1287060jb6>> list2 = c1bo2.LIZIZ(str4).LIZLLL;
                if (list2 != list) {
                    c2204051BNz.LJ(list2);
                }
                C1C7U.LIZIZ("PiaContext@f094.<init>$1L");
            }
        });
    }
}
