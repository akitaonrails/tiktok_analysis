package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIAPRedirectionUrlSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ISandboxService;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlinx.coroutines.flow.b;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789260wf6 implements InterfaceC1788520wdu {
    public final InterfaceC1788970wed LIZ;
    public final C0OBN LIZIZ;
    public final InterfaceC1788340wdc LIZJ;
    public final InterfaceC1789090wep LIZLLL;
    public final InterfaceC1788280wdW LJ;
    public final InterfaceC1788630we5 LJFF;
    public final InterfaceC1786480wac LJI;

    @Override // X.InterfaceC1788520wdu
    public final long currentTimeMillis() {
        return C158B.LIZ();
    }

    @Override // X.InterfaceC1788520wdu
    public final InterfaceC1789090wep LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1788520wdu
    public final InterfaceC1788280wdW LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1788520wdu
    public final InterfaceC1788340wdc LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1788520wdu
    public final C0OBN LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1788520wdu
    public final InterfaceC1786480wac LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1788520wdu
    public final InterfaceC1788970wed LJJIIJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1788520wdu
    public final InterfaceC1788630we5 getCache() {
        return this.LJFF;
    }

    public C1789260wf6(InterfaceC1786480wac interfaceC1786480wac) {
        C2184808hC c2184808hC = new C2184808hC();
        C0OBM c0obm = new C0OBM();
        InterfaceC1788340wdc interfaceC1788340wdc = new InterfaceC1788340wdc() { // from class: X.0dpQ
            @Override // X.InterfaceC1788340wdc
            public final void LIZ(Activity activity, String str) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(str));
                ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                if (iSandboxServiceLIZ != null) {
                    iSandboxServiceLIZ.appendDataFlowId(intent, 1207965953);
                }
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyNZ7DBFH+OBgVa/YtmBJvlVLLUyswb8b9ASPg5g6DJJXNwWJ6tGA==", null));
            }

            @Override // X.InterfaceC1788340wdc
            public final b LIZIZ(Context context, String str) {
                return C09IC.LJ(new C0L08(str, context, null));
            }
        };
        InterfaceC1789090wep interfaceC1789090wep = new InterfaceC1789090wep() { // from class: X.0wgp
            public final ConcurrentHashMap<Class<?>, Object> LIZ = new ConcurrentHashMap<>();
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(331));

            @Override // X.InterfaceC1789090wep
            public final Object LIZ(Class cls, String str) {
                Object objPutIfAbsent;
                ConcurrentHashMap<Class<?>, Object> concurrentHashMap = this.LIZ;
                Object objLIZ = concurrentHashMap.get(cls);
                if (objLIZ == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objLIZ = ((InterfaceC1790340wgq) this.LIZIZ.getValue()).LIZ(cls, str)))) != null) {
                    return objPutIfAbsent;
                }
                return objLIZ;
            }
        };
        InterfaceC1788280wdW interfaceC1788280wdW = new InterfaceC1788280wdW() { // from class: X.0g6H
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(335));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(336));
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(337));
            public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(339));
            public final C01GW LJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(338));
            public final C01GW LJFF = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(797));
            public final C01GW LJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(795));
            public final C01GW LJII = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(798));
            public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(796));

            @Override // X.InterfaceC1788280wdW
            public final Map<String, Map<String, Map<String, Integer>>> LIZ() {
                return (Map) this.LIZJ.getValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final boolean LIZIZ() {
                return ((Boolean) this.LJI.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final boolean LIZJ() {
                return ((Boolean) this.LJFF.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final long LIZLLL() {
                return ((Number) this.LIZIZ.getValue()).longValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final boolean LJ() {
                return ((Boolean) this.LJIIIIZZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final Map<String, String> LJFF() {
                return (Map) this.LJII.getValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final Set<String> LJI() {
                return (Set) this.LIZLLL.getValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final Map<String, Boolean> LJII() {
                return (Map) this.LJ.getValue();
            }

            @Override // X.InterfaceC1788280wdW
            public final Map<String, Map<String, String>> LJIIIIZZ() {
                Map<String, Map<String, String>> value = LiveIAPRedirectionUrlSetting.INSTANCE.getValue();
                return value == null ? C2097608Jq.LJ() : value;
            }

            @Override // X.InterfaceC1788280wdW
            public final String getApiHost() {
                return (String) this.LIZ.getValue();
            }
        };
        InterfaceC1788630we5 interfaceC1788630we5 = new InterfaceC1788630we5() { // from class: X.0weh
            public Map<String, String> LIZ = C2097608Jq.LJ();

            @Override // X.InterfaceC1788630we5
            public final Map<String, String> LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1788630we5
            public final void LIZ(Map<String, String> map) {
                this.LIZ = map;
            }
        };
        this.LIZ = c2184808hC;
        this.LIZIZ = c0obm;
        this.LIZJ = interfaceC1788340wdc;
        this.LIZLLL = interfaceC1789090wep;
        this.LJ = interfaceC1788280wdW;
        this.LJFF = interfaceC1788630we5;
        this.LJI = interfaceC1786480wac == null ? new InterfaceC1786480wac() { // from class: X.0wgh
            @Override // X.InterfaceC1786480wac
            public final void LIZ(C1786590wan c1786590wan) {
                Object c098200Yq;
                try {
                    c098200Yq = new JSONObject(C2097608Jq.LJIILIIL(c1786590wan.LIZIZ, new Pair("iap_new_sdk", "1")));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
                EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
                String str = c1786590wan.LIZ;
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = new JSONObject();
                }
                C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
                c1794310wnF.getClass();
                c1794310wnF.LIZ(enumC1794330wnH, str, (JSONObject) c098200Yq, null, null);
            }
        } : interfaceC1786480wac;
    }
}
