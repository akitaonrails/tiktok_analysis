package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IIMVoiceMessageService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Hye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458620Hye implements IIMVoiceMessageService {
    public static volatile IIMVoiceMessageService LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile long LJFF;
    public static final C458620Hye LIZ = new C458620Hye();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(356));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(355));

    public static IIMVoiceMessageService LJIIIIZZ() {
        Object c098200Yq;
        try {
            final Class<?> cls = Class.forName("com.ss.android.ugc.aweme.IMVoiceMessageServiceImpl");
            ServiceManager.get().bind(IIMVoiceMessageService.class, new ServiceProvider() { // from class: X.0Hyf
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return cls.newInstance();
                }
            }).asSingleton();
            c098200Yq = (IIMVoiceMessageService) PluggableExtentionKt.pluggableSpi$default(IIMVoiceMessageService.class, false, false, false, 14, null);
            if (c098200Yq == null || c098200Yq == LJIIJ()) {
                LJFF = SystemClock.elapsedRealtime();
                c098200Yq = LJIIJ();
            } else {
                LJFF = 0L;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LJFF = SystemClock.elapsedRealtime();
        }
        C458400HyI c458400HyILJIIJ = LJIIJ();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c458400HyILJIIJ;
        }
        return (IIMVoiceMessageService) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.IIMVoiceMessageService LJIIIZ() {
        /*
            com.ss.android.ugc.aweme.IIMVoiceMessageService r0 = X.C458620Hye.LIZJ
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class<com.ss.android.ugc.aweme.IIMVoiceMessageService> r0 = com.ss.android.ugc.aweme.IIMVoiceMessageService.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.IIMVoiceMessageService r1 = (com.ss.android.ugc.aweme.IIMVoiceMessageService) r1
            if (r1 != 0) goto L27
            boolean r0 = X.C458620Hye.LIZLLL
            r7 = 1
            if (r0 != 0) goto L32
            X.1E0m r2 = X.C2274381E0m.LIZIZ
            boolean r0 = X.C10UI.LIZ()
            r1 = r0 ^ 1
            r0 = 0
            boolean r0 = r2.LIZJ(r1, r0)
            if (r0 != 0) goto L30
            X.0HyI r1 = LJIIJ()
        L27:
            X.0HyI r0 = LJIIJ()
            if (r1 == r0) goto L2f
            X.C458620Hye.LIZJ = r1
        L2f:
            return r1
        L30:
            X.C458620Hye.LIZLLL = r7
        L32:
            long r5 = X.C458620Hye.LJFF
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r5
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4a
            X.0HyI r1 = LJIIJ()
            goto L27
        L4a:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L75
            boolean r0 = X.C458620Hye.LJ
            if (r0 != 0) goto L70
            X.C458620Hye.LJ = r7
            X.01GW r0 = X.C458620Hye.LJI
            java.lang.Object r3 = r0.getValue()
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.0Hyd r2 = new X.0Hyd
            r1 = 0
            r2.<init>(r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
        L70:
            X.0HyI r1 = LJIIJ()
            goto L27
        L75:
            com.ss.android.ugc.aweme.IIMVoiceMessageService r1 = LJIIIIZZ()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C458620Hye.LJIIIZ():com.ss.android.ugc.aweme.IIMVoiceMessageService");
    }

    public static C458400HyI LJIIJ() {
        return (C458400HyI) LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final boolean LIZ() {
        return LJIIIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final boolean LIZJ() {
        return LJIIIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final InterfaceC458220Hy0 LIZLLL() {
        return LJIIIZ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final InterfaceC458390HyH LJ() {
        return LJIIIZ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final boolean LJI() {
        return LJIIIZ().LJI();
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final InterfaceC458410HyJ LJII() {
        return LJIIIZ().LJII();
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final boolean LIZIZ(C869590Y9l c869590Y9l) {
        return LJIIIZ().LIZIZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final InterfaceC458280Hy6 LJFF(String str) {
        return LJIIIZ().LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.IIMVoiceMessageService
    public final Object transcribe(long j, long j2, InterfaceC1364105Vn<? super InterfaceC458490HyR> interfaceC1364105Vn) {
        return LJIIIZ().transcribe(j, j2, interfaceC1364105Vn);
    }
}
