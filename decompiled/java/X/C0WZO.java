package X;

import com.bytedance.pumbaa.aspect.apicalling.base.ProcessorConfig;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS414S0200000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WZO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WZO implements C0WZV {
    public final CopyOnWriteArrayList<C0WZU> LIZ;
    public final CopyOnWriteArrayList<C0WZU> LIZIZ;
    public final ThreadLocal<Boolean> LIZJ;

    public abstract void LIZ();

    public abstract ProcessorConfig LIZIZ();

    public abstract void LIZJ(List<C0WZU> list, List<C0WZU> list2);

    public abstract boolean LIZLLL();

    public C0WZO() {
        CopyOnWriteArrayList<C0WZU> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LIZ = copyOnWriteArrayList;
        CopyOnWriteArrayList<C0WZU> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        this.LIZIZ = copyOnWriteArrayList2;
        this.LIZJ = new ThreadLocal<>();
        LIZJ(copyOnWriteArrayList, copyOnWriteArrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0105: INVOKE (r1v1 ?? I:kotlin.jvm.internal.AwS414S0200000_13), (r5 I:X.0WZO), (r3 I:java.lang.Exception), (r0 I:int) DIRECT call: kotlin.jvm.internal.AwS414S0200000_13.<init>(X.0WZO, java.lang.Exception, int):void A[Catch: all -> 0x0119, MD:(X.0WZO, java.lang.Exception, int):void (m)] (LINE:16777477), block:B:63:0x00fa */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x011d: INVOKE (r5 I:X.0WZO) VIRTUAL call: X.0WZO.LIZ():void A[MD:():void (m)] (LINE:16777501), block:B:68:0x011d */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0WZO] */
    public final C0WSU LJ(C0WZJ c0wzj) {
        C0WZO c0wzoLIZ;
        ?? r5;
        C0WS7 c0ws7LJFF;
        T tValueOf;
        try {
            try {
                C0WS7 c0ws7 = c0wzj.LJFF.LJFF;
                if (c0ws7 != null) {
                    c0ws7LJFF = c0ws7.LJFF("pre_check");
                } else {
                    c0ws7LJFF = null;
                }
                if (!LIZLLL()) {
                    if (c0ws7 != null) {
                        c0ws7.LJ = "not_init";
                        if (c0ws7LJFF != null) {
                            c0ws7LJFF.stop();
                        }
                    }
                    LIZ();
                    this.LIZJ.set(Boolean.FALSE);
                    return null;
                }
                ProcessorConfig processorConfigLIZIZ = LIZIZ();
                if (processorConfigLIZIZ != null && processorConfigLIZIZ.enable) {
                    LIZ();
                    Boolean bool = this.LIZJ.get();
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.LJFF(bool, bool2)) {
                        if (c0ws7 != null) {
                            c0ws7.LJ = "reentry";
                            if (c0ws7LJFF != null) {
                                c0ws7LJFF.stop();
                            }
                        }
                        LIZ();
                        this.LIZJ.set(Boolean.FALSE);
                        return null;
                    }
                    this.LIZJ.set(bool2);
                    if (c0ws7LJFF != null) {
                        c0ws7LJFF.stop();
                    }
                    ProcessorConfig processorConfigLIZIZ2 = LIZIZ();
                    if (processorConfigLIZIZ2 == null) {
                        if (c0ws7 != null) {
                            c0ws7.LJ = "no_config";
                        }
                        LIZ();
                        this.LIZJ.set(Boolean.FALSE);
                        return null;
                    }
                    boolean zLIZIZ = processorConfigLIZIZ2.LIZIZ(c0wzj.LIZ);
                    C259800zU c259800zU = new C259800zU();
                    if (zLIZIZ) {
                        tValueOf = 0;
                    } else {
                        tValueOf = Boolean.valueOf(processorConfigLIZIZ2.LIZ(c0wzj.LIZ));
                    }
                    c259800zU.element = tValueOf;
                    if (!zLIZIZ) {
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.LJFF(tValueOf, bool3)) {
                            if (c0ws7 != null) {
                                c0ws7.LJ = "not_sampled";
                            }
                            LIZ();
                            this.LIZJ.set(bool3);
                            return null;
                        }
                    }
                    if (c0wzj.LJIIIIZZ == null) {
                        c0wzj.LJIIIIZZ = PumbaaPerformanceTrackManager.LIZJ(String.valueOf(c0wzj.LIZ));
                    }
                    C0WSU c0wsu = (C0WSU) C0WSP.LIZ(String.valueOf(c0wzj.LIZ), c0wzj.LJIIIIZZ, new C0WZN(this, processorConfigLIZIZ2, c0wzj, zLIZIZ, c259800zU));
                    LIZ();
                    this.LIZJ.set(Boolean.FALSE);
                    return c0wsu;
                }
                if (c0ws7 != null) {
                    c0ws7.LJ = "disable";
                    if (c0ws7LJFF != null) {
                        c0ws7LJFF.stop();
                    }
                }
                LIZ();
                this.LIZJ.set(Boolean.FALSE);
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("PB_API_CALLING", new AwS414S0200000_13((C0WZO) r5, e, 15), 6, e);
                C0WSU c0wsu2 = C0WSU.LIZLLL;
                r5.LIZ();
                r5.LIZJ.set(Boolean.FALSE);
                return c0wsu2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0wzoLIZ.LIZ();
            c0wzoLIZ.LIZJ.set(Boolean.FALSE);
            throw th;
        }
    }
}
