package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.performance.PerfFluencyOptimizeSetting;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1Adi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184001Adi extends C1ADU {
    public static final /* synthetic */ int LJI = 0;
    public final Set<String> LIZ;
    public final InterfaceC2184031Adl LIZIZ;
    public volatile boolean LIZJ;
    public final C01GW LIZLLL;
    public final Set<Function1<Float, Unit>> LJ;
    public long LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2184001Adi() {
        String[] strArr = new String[5];
        strArr[0] = "com.ss.android.ugc.aweme.live.LivePlayActivity";
        strArr[1] = "com.ss.android.ugc.aweme.live.LiveBroadcastActivity";
        strArr[2] = "com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity";
        strArr[3] = C504210Jpz.LIZ ? "com.ss.android.ugc.aweme.adaptation.saa.SAAActivity" : "com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity";
        strArr[4] = C464660IKa.LIZ() ? "com.ss.android.ugc.aweme.main.MainActivity" : "com.ss.android.ugc.aweme.live.LivePlayActivity";
        this(C093Y.LJ(strArr));
    }

    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final synchronized void LJI() {
        if (this.LJ.isEmpty() || !this.LIZJ) {
            return;
        }
        float fLIZJ = LIZJ(15);
        Iterator<Function1<Float, Unit>> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(fLIZJ));
        }
    }

    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final synchronized void destroy() {
        stop();
        this.LJ.clear();
    }

    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final void stop() {
        this.LIZJ = false;
        this.LJFF = SystemClock.elapsedRealtime();
        this.LIZIZ.stop();
    }

    public final C2184021Adk LJIIJ() {
        return (C2184021Adk) this.LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Adj] */
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
    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final void start() {
        if (this.LIZJ) {
            return;
        }
        this.LIZIZ.LIZJ(new C0VVH() { // from class: X.1Adj
            @Override // X.C0VVH
            public final void LIZ(long j, String str) {
                if (this.LIZ.LIZ.contains(str) && this.LIZ.LIZJ) {
                    C2184021Adk c2184021AdkLJIIJ = this.LIZ.LJIIJ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c2184021AdkLJIIJ.getClass();
                    long j2 = jElapsedRealtime / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    int i = ((int) j) / ((int) (c2184021AdkLJIIJ.LIZ * 100));
                    if (j2 > c2184021AdkLJIIJ.LJFF) {
                        c2184021AdkLJIIJ.LJ = (c2184021AdkLJIIJ.LJ + 1) % 60;
                    }
                    C2184041Adm[] c2184041AdmArr = c2184021AdkLJIIJ.LIZJ;
                    int i2 = c2184021AdkLJIIJ.LIZIZ;
                    if (i <= i2) {
                        i2 = i;
                    }
                    c2184021AdkLJIIJ.LIZJ(c2184041AdmArr, j2, i2);
                    if (PerfFluencyOptimizeSetting.INSTANCE.getEnable()) {
                        c2184021AdkLJIIJ.LIZJ((C2184041Adm[]) c2184021AdkLJIIJ.LIZLLL.getValue(), j2, i);
                    }
                    c2184021AdkLJIIJ.LJFF = j2;
                }
            }
        });
        C2184021Adk c2184021AdkLJIIJ = LJIIJ();
        for (C2184041Adm c2184041Adm : c2184021AdkLJIIJ.LIZJ) {
            c2184041Adm.LIZ = 0L;
            c2184041Adm.LIZJ = 0;
            c2184041Adm.LIZIZ = 0;
            c2184021AdkLJIIJ.LJ = 0;
            c2184021AdkLJIIJ.LJFF = 0L;
        }
        if (PerfFluencyOptimizeSetting.INSTANCE.getEnable()) {
            for (C2184041Adm c2184041Adm2 : (C2184041Adm[]) c2184021AdkLJIIJ.LIZLLL.getValue()) {
                c2184041Adm2.LIZ = 0L;
                c2184041Adm2.LIZJ = 0;
                c2184041Adm2.LIZIZ = 0;
                c2184021AdkLJIIJ.LJ = 0;
                c2184021AdkLJIIJ.LJFF = 0L;
            }
        }
        this.LIZIZ.start();
        this.LIZJ = true;
    }

    public C2184001Adi(Set<String> set) {
        this.LIZ = set;
        this.LIZIZ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).q81();
        this.LIZLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 8));
        this.LJ = new LinkedHashSet();
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final synchronized void LIZ(C1090240eTe c1090240eTe) {
        this.LJ.add(c1090240eTe);
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LIZIZ(int i) {
        if (!this.LIZJ) {
            return 60.0f;
        }
        C2184021Adk c2184021AdkLJIIJ = LJIIJ();
        return C13LZ.LIZLLL(c2184021AdkLJIIJ.LIZIZ((C2184041Adm[]) c2184021AdkLJIIJ.LIZLLL.getValue(), i), 0.0f, c2184021AdkLJIIJ.LIZIZ);
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LIZJ(int i) {
        if (!this.LIZJ) {
            return 60.0f;
        }
        C2184021Adk c2184021AdkLJIIJ = LJIIJ();
        return c2184021AdkLJIIJ.LIZIZ(c2184021AdkLJIIJ.LIZJ, i);
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LIZLLL(int i) {
        if (!this.LIZJ) {
            return 0.0f;
        }
        C2184021Adk c2184021AdkLJIIJ = LJIIJ();
        return C13LZ.LIZLLL(c2184021AdkLJIIJ.LIZ((C2184041Adm[]) c2184021AdkLJIIJ.LIZLLL.getValue(), i), 0.0f, 1.0f);
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LJFF(int i) {
        if (!this.LIZJ) {
            if (SystemClock.elapsedRealtime() - this.LJFF > Mp4ScreenVideoLoadTimeout.CONTROL) {
                C2184021Adk c2184021AdkLJIIJ = LJIIJ();
                return c2184021AdkLJIIJ.LIZIZ(c2184021AdkLJIIJ.LIZJ, i);
            }
            return 60.0f;
        }
        C2184021Adk c2184021AdkLJIIJ2 = LJIIJ();
        return c2184021AdkLJIIJ2.LIZIZ(c2184021AdkLJIIJ2.LIZJ, i);
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LJII(int i) {
        if (!this.LIZJ) {
            return 0.0f;
        }
        C2184021Adk c2184021AdkLJIIJ = LJIIJ();
        return C13LZ.LIZLLL(c2184021AdkLJIIJ.LIZ(c2184021AdkLJIIJ.LIZJ, i), 0.0f, 1.0f);
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LJIIIIZZ(int i) {
        if (!this.LIZJ) {
            if (SystemClock.elapsedRealtime() - this.LJFF <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                return 0.0f;
            }
            C2184021Adk c2184021AdkLJIIJ = LJIIJ();
            return C13LZ.LIZLLL(c2184021AdkLJIIJ.LIZ(c2184021AdkLJIIJ.LIZJ, i), 0.0f, 1.0f);
        }
        C2184021Adk c2184021AdkLJIIJ2 = LJIIJ();
        return C13LZ.LIZLLL(c2184021AdkLJIIJ2.LIZ(c2184021AdkLJIIJ2.LIZJ, i), 0.0f, 1.0f);
    }
}
