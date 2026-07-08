package Y;

import X.C0VSF;
import X.C1C7U;
import X.C20088613iu;
import X.C20124113od;
import X.C20124213oe;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.common.jato.memory.MemoryTrimmer;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS6S0110100_30 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void run$0(ARunnableS6S0110100_30 aRunnableS6S0110100_30) {
        boolean zLIZ;
        C1C7U.LIZ("ComposeExposureFrequencyHelper@12b8.timerFlushRunnable$1");
        try {
            C20088613iu c20088613iu = (C20088613iu) aRunnableS6S0110100_30.l0;
            T t = c20088613iu.LIZJ;
            if (t != 0) {
                c20088613iu.LIZIZ.invoke(t);
            }
            aRunnableS6S0110100_30.j2 = System.currentTimeMillis();
            aRunnableS6S0110100_30.z1 = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComposeExposureFrequencyHelper@12b8.timerFlushRunnable$1");
    }

    public static final void run$1(ARunnableS6S0110100_30 aRunnableS6S0110100_30) {
        long j;
        BufferedReader bufferedReader;
        String line;
        C20124113od c20124113od = (C20124113od) aRunnableS6S0110100_30.l0;
        boolean z = aRunnableS6S0110100_30.z1;
        long j2 = aRunnableS6S0110100_30.j2;
        c20124113od.getClass();
        C1C7U.LIZ("PhysicalMemoryMonitor@1942.checkAndTrimMemory$1L");
        try {
            bufferedReader = new BufferedReader(new C0VSF("/proc/meminfo"));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        do {
            try {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    j = -1;
                    break;
                }
                j = -1;
                break;
            } finally {
            }
            TryCatchGuardChecker.doCheck(e);
        } while (!line.startsWith("MemAvailable:"));
        j = CastLongProtector.parseLong(line.split("\\s+")[1]);
        bufferedReader.close();
        long j3 = j * 1024;
        long j4 = (j3 / 1024) / 1024;
        C786410Ut5.j4("Memory check - Available: %d MB, Threshold: %d MB", new Object[]{Long.valueOf(j4), Long.valueOf((c20124113od.LIZ.LIZLLL / 1024) / 1024)});
        if (z && (j3 > c20124113od.LIZ.LIZLLL || j3 < 0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" Memory is enough, availMem = ");
            sbLIZ.append(j4);
            C2188811AlT.LIZIZ(sbLIZ);
            C1C7U.LIZIZ("PhysicalMemoryMonitor@1942.checkAndTrimMemory$1L");
            return;
        }
        Context context = c20124113od.LIZIZ;
        C20124213oe c20124213oe = c20124113od.LIZ;
        MemoryTrimmer.LIZ(context, c20124213oe.LJII, c20124213oe.LJIIIIZZ, c20124213oe.LJIIIZ, c20124213oe.LJIIJ, c20124213oe.LJIIJJI);
        c20124113od.LJIIIIZZ = j2;
        c20124113od.LJII.incrementAndGet();
        C1C7U.LIZIZ("PhysicalMemoryMonitor@1942.checkAndTrimMemory$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS6S0110100_30(C20088613iu c20088613iu, C20088613iu<Object> c20088613iu2) {
        this.$t = c20088613iu2;
        this.l0 = c20088613iu;
    }

    public ARunnableS6S0110100_30(C20124113od c20124113od, boolean z, long j, int i) {
        this.$t = i;
        this.l0 = c20124113od;
        this.z1 = z;
        this.j2 = j;
    }
}
