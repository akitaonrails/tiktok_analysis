package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.09B5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09B5 implements InterfaceC21173617tW {
    public static volatile Method LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static volatile Field LJIIJJI;
    public static volatile boolean LJIIL;
    public final Set<C0WAR> LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public volatile Thread LJFF;
    public volatile boolean LJII;
    public static final Object LJIIJ = new Object();
    public static final Object LJIILIIL = new Object();
    public final int LJ = Process.myPid();
    public final AtomicLong LJI = new AtomicLong(0);

    @Override // X.InterfaceC21173617tW
    public final String getName() {
        return "main_stack";
    }

    @Override // X.InterfaceC21173617tW
    public final Map<String, Object> LJJLIIIJLJLI() {
        String string;
        if (this.LJII) {
            return C2097608Jq.LJ();
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/self/task/");
            sbLIZ.append(this.LJ);
            sbLIZ.append("/wchan");
            string = a0.LJLIIIL(C09BH.LJI(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)), Charsets.UTF_8)).toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (string.length() == 0) {
            string = null;
        } else if (Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
            string = null;
        }
        if (string == null) {
            return C2097608Jq.LJ();
        }
        C0WAR c0warLIZ = C0WAQ.LIZ(string);
        if (!this.LIZ.contains(c0warLIZ)) {
            return C2097608Jq.LJ();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LJI.get();
        if (j != 0 && jCurrentTimeMillis - j < this.LIZJ) {
            return C2097608Jq.LJ();
        }
        if (!this.LJI.compareAndSet(j, jCurrentTimeMillis)) {
            return C2097608Jq.LJ();
        }
        try {
            return LIZIZ(c0warLIZ, string);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJII = true;
            return C2097608Jq.LJ();
        }
    }

    @Override // X.InterfaceC21173617tW
    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJ();
    }

    public final JSONArray LIZJ(Thread thread) {
        StackTraceElement[] stackTrace;
        boolean z;
        try {
            stackTrace = ThreadMethodProxy.getStackTrace(thread);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            stackTrace = null;
        }
        JSONArray jSONArray = new JSONArray();
        if (stackTrace != null) {
            if (stackTrace.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int iMin = Math.min(stackTrace.length, this.LIZLLL);
                for (int i = 0; i < iMin; i++) {
                    jSONArray.put(stackTrace[i].toString());
                }
                if (stackTrace.length > iMin) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("... ");
                    sbLIZ.append(stackTrace.length - iMin);
                    sbLIZ.append(" more");
                    jSONArray.put(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map LIZIZ(X.C0WAR r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09B5.LIZIZ(X.0WAR, java.lang.String):java.util.Map");
    }

    public C09B5(boolean z, int i, long j, Set set) {
        this.LIZ = set;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = i;
    }
}
