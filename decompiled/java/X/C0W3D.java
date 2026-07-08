package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.resourcemanage.lego.DMDowngradeRejectionExecutionTaskConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W3D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0W3D implements C0PEO, InterfaceC800110Va5 {
    public static final C01GW<C823170WQx<String>> LJIIJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(289));
    public final String LIZ;
    public final boolean LIZIZ;
    public final Set<String> LIZJ;
    public final Set<String> LIZLLL;
    public final Set<String> LJ;
    public volatile C800150Va9 LJI;
    public final Object LJFF = new Object();
    public final C823170WQx<String> LJII = new C823170WQx<>();
    public final C823170WQx<String> LJIIIIZZ = new C823170WQx<>();
    public final ConcurrentHashMap<String, Integer> LJIIIZ = new ConcurrentHashMap<>();

    @Override // X.C0PEO
    public final void LIZ() {
        C800150Va9 c800150Va9;
        if (this.LIZIZ) {
            synchronized (this.LJFF) {
                try {
                    c800150Va9 = this.LJI;
                    if (c800150Va9 == null) {
                        c800150Va9 = null;
                    } else {
                        LJIIJ.getValue().removeAll(this.LJII);
                        this.LJII.clear();
                        this.LJI = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c800150Va9 == null) {
                return;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C473920IiE(this, c800150Va9, null), 3);
        }
    }

    @Override // X.C0PEO
    public final void LIZJ() {
        if (this.LIZIZ) {
            synchronized (this.LJFF) {
                try {
                    if (this.LJI == null) {
                        C799900VZk.LIZ.getClass();
                        this.LJI = C799900VZk.LIZ(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> it2 = this.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                jSONObject2.put(it2.next(), 1);
            }
            for (Map.Entry<String, Integer> entry : this.LJIIIZ.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue().intValue());
            }
            jSONObject.put("metric", jSONObject2);
            C793770VBv.LJFF("dm_reject_tasks", null, jSONObject);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LJIIIIZZ.clear();
        this.LJIIIZ.clear();
    }

    @Override // X.InterfaceC800110Va5
    public final String scene() {
        return this.LIZ;
    }

    @Override // X.InterfaceC800110Va5
    public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (interfaceC800080Va2 != null) {
            try {
                if (this.LIZIZ) {
                    if (this.LIZLLL.contains(interfaceC800080Va2.key())) {
                        C823170WQx<String> c823170WQx = this.LJIIIIZZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Discard_");
                        sbLIZ.append(interfaceC800080Va2.key());
                        c823170WQx.add(C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Discard_");
                        sbLIZ2.append(interfaceC800080Va2.triggerType().name());
                        LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                        return EnumC800210VaF.Discard;
                    }
                    if (this.LIZJ.contains(interfaceC800080Va2.key())) {
                        return EnumC800210VaF.Normal;
                    }
                    if (this.LJ.contains(interfaceC800080Va2.triggerType().name())) {
                        String strKey = interfaceC800080Va2.key();
                        if (strKey != null) {
                            C823170WQx<String> c823170WQx2 = this.LJIIIIZZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Suspend_");
                            sbLIZ3.append(interfaceC800080Va2.key());
                            c823170WQx2.add(C2188811AlT.LIZIZ(sbLIZ3));
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Suspend_");
                            sbLIZ4.append(interfaceC800080Va2.triggerType().name());
                            LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
                            C01GW<C823170WQx<String>> c01gw = LJIIJ;
                            if (!c01gw.getValue().contains(strKey) && !this.LJII.contains(strKey)) {
                                this.LJII.add(strKey);
                                c01gw.getValue().add(strKey);
                            } else {
                                return EnumC800210VaF.Normal;
                            }
                        }
                        return EnumC800210VaF.Suspend;
                    }
                    return EnumC800210VaF.Normal;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Object obj = (Void) c098200Yq;
                if (obj != null) {
                    return (EnumC800210VaF) obj;
                }
                return EnumC800210VaF.Normal;
            }
        }
        return EnumC800210VaF.Normal;
    }

    public final void LIZLLL(String str) {
        try {
            if (this.LJIIIZ.containsKey(str)) {
                ConcurrentHashMap<String, Integer> concurrentHashMap = this.LJIIIZ;
                concurrentHashMap.put(str, Integer.valueOf(concurrentHashMap.get(str).intValue() + 1));
            } else {
                this.LJIIIZ.put(str, 1);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C0W3D(String str, DMDowngradeRejectionExecutionTaskConfig dMDowngradeRejectionExecutionTaskConfig) {
        this.LIZ = str;
        this.LIZIZ = dMDowngradeRejectionExecutionTaskConfig.isEnable;
        this.LIZJ = C13LP.LLIIJI(dMDowngradeRejectionExecutionTaskConfig.needRunKeyList);
        this.LIZLLL = C13LP.LLIIJI(dMDowngradeRejectionExecutionTaskConfig.needDiscardKeyList);
        this.LJ = C13LP.LLIIJI(dMDowngradeRejectionExecutionTaskConfig.suspendTypeList);
    }
}
