package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngineConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS145S1100000_31;
import kotlin.jvm.internal.AwS35S0200100_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS81S1000000_31;

/* JADX INFO: renamed from: X.14w9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20425514w9 {
    public static long LJ;
    public static final C01GW<C20425814wC> LJFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(433));
    public final Function0<Boolean> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(582));
    public SymphonyEngine LIZJ;
    public C20426214wG LIZLLL;

    public final void LIZIZ() {
        LJIILIIL(false, null, "destroy", new AwS610S0100000_31(this, 429));
    }

    public final void LIZJ() {
        LJIILIIL(true, null, "endEdit", new AwS610S0100000_31(this, 430));
    }

    public final C20426114wF LJ() {
        C20426214wG c20426214wG = this.LIZLLL;
        if (c20426214wG == null) {
            return null;
        }
        return new C20426114wF(c20426214wG);
    }

    public C20425514w9(Function0<Boolean> function0) {
        this.LIZ = function0;
        LJFF(true);
    }

    public final String LIZLLL(C20426114wF c20426114wF) {
        return (String) LJIILIIL(true, "", "exportFlow", new AwS610S0100000_31(c20426114wF, 428));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final void LJFF(boolean z) {
        C20441214yg.LIZIZ("SymphonyEngineInstance", "innerInit");
        SymphonyEngine symphonyEngine = 0;
        symphonyEngine = 0;
        try {
            if (this.LIZ.invoke().booleanValue()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SymphonyEngine symphonyEngineLIZJ = C2231651CWd.LIZJ((SymphonyEngineConfig) this.LIZIZ.getValue());
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                String strLIZ = C979410bat.LIZ(276, "SymphonyEngineInstance");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createSymphonyEngine result=");
                sbLIZ.append(symphonyEngineLIZJ);
                sbLIZ.append(", timeConsume=");
                sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                symphonyEngine = symphonyEngineLIZJ;
            } else {
                C1AZW.LJFF(C979410bat.LIZ(279, "SymphonyEngineInstance"), "createSymphonyEngine defaultResult=null", null, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String strLIZ2 = C979410bat.LIZ(283, "SymphonyEngineInstance");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createSymphonyEngine error=");
            sbLIZ2.append(th.getMessage());
            C1AZW.LJFF(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), symphonyEngine, symphonyEngine);
        }
        this.LIZJ = symphonyEngine;
        LJIIJ(z);
    }

    public final C20426114wF LJII(C20425114w5 c20425114w5) {
        C20426214wG c20426214wG = (C20426214wG) LJIILIIL(true, null, "modifyState", new AwS397S0200000_31(c20425114w5, this, 97));
        if (c20426214wG == null) {
            return null;
        }
        return new C20426114wF(c20426214wG);
    }

    public final long LJIIJ(boolean z) {
        return ((Number) LJIILIIL(z, 0L, "getVersionCode", AFwS276S0000000_31.get$arr$(308))).longValue();
    }

    public final C20426114wF LJIIJJI(String str) {
        C20426214wG c20426214wG = (C20426214wG) LJIILIIL(true, null, "recoverFlow", new AwS81S1000000_31(str, 10));
        if (c20426214wG == null) {
            return null;
        }
        return new C20426114wF(c20426214wG);
    }

    public final C20426114wF LJIIL(long j) {
        C20426214wG c20426214wG = (C20426214wG) LJIILIIL(true, null, "removeState", new C20426614wK(j, this));
        if (c20426214wG == null) {
            return null;
        }
        return new C20426114wF(c20426214wG);
    }

    public final C20426114wF LJIILJJIL(String str) {
        C20426214wG c20426214wG = (C20426214wG) LJIILIIL(true, null, "startEdit", new AwS145S1100000_31(str, this, 9));
        if (c20426214wG == null) {
            return null;
        }
        return new C20426114wF(c20426214wG);
    }

    public static C20425114w5 LJIIIIZZ(C20425514w9 c20425514w9, String str) {
        c20425514w9.getClass();
        C20425214w6 c20425214w6 = (C20425214w6) c20425514w9.LJIILIIL(true, null, "newParallelState", new C20425614wA(str, null, null, null));
        if (c20425214w6 == null) {
            return null;
        }
        return new C20425114w5(c20425214w6);
    }

    public final C20426114wF LIZ(long j, C20425114w5 c20425114w5) {
        C20426214wG c20426214wG = (C20426214wG) LJIILIIL(true, null, "appendState", new AwS35S0200100_31(j, C20424614w0.LIZ(c20425114w5), this, 0));
        if (c20426214wG == null) {
            return null;
        }
        return new C20426114wF(c20426214wG);
    }

    public final C20426114wF LJI(List<Long> list, long j, C20425114w5 c20425114w5) {
        C20426214wG c20426214wG = (C20426214wG) LJIILIIL(true, null, "insertState", new C20426514wJ(list, j, C20424614w0.LIZ(c20425114w5), this));
        if (c20426214wG == null) {
            return null;
        }
        return new C20426114wF(c20426214wG);
    }

    public final <T> T LJIILIIL(boolean z, T t, String str, Function1<? super SymphonyEngine, ? extends T> function1) {
        try {
            if (this.LIZJ == null && z) {
                LJFF(false);
            }
            SymphonyEngine symphonyEngine = this.LIZJ;
            boolean zBooleanValue = this.LIZ.invoke().booleanValue();
            if (zBooleanValue && symphonyEngine != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                T tInvoke = function1.invoke(symphonyEngine);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                String strLIZ = C979410bat.LIZ(256, "SymphonyEngineInstance");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("safeSymphonyEngineInvokeForReal function=");
                sbLIZ.append(str);
                sbLIZ.append(", result=");
                sbLIZ.append(tInvoke);
                sbLIZ.append(", timeConsume=");
                sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                return tInvoke;
            }
            String strLIZ2 = C979410bat.LIZ(259, "SymphonyEngineInstance");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("safeSymphonyEngineInvoke function=");
            sbLIZ2.append(str);
            sbLIZ2.append(", defaultResult=");
            sbLIZ2.append(t);
            sbLIZ2.append(", localInstance=");
            sbLIZ2.append(symphonyEngine);
            sbLIZ2.append(", isSymphonyEngineEnable=");
            sbLIZ2.append(zBooleanValue);
            C1AZW.LJFF(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String strLIZ3 = C979410bat.LIZ(263, "SymphonyEngineInstance");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("safeSymphonyEngineInvoke function=");
            sbLIZ3.append(str);
            sbLIZ3.append(", error=");
            sbLIZ3.append(th.getMessage());
            C1AZW.LJFF(strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
            return t;
        }
    }

    public final C20425114w5 LJIIIZ(long j, long j2, String str, String str2, String str3, String str4) {
        C20425214w6 c20425214w6 = (C20425214w6) LJIILIIL(true, null, "newTaskState", new C20425714wB(j, j2, str, str2, str3, str4));
        if (c20425214w6 == null) {
            return null;
        }
        return new C20425114w5(c20425214w6);
    }
}
