package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS22S1100000_17;
import Y.AfS186S0100000_17;
import android.os.Message;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138940fkC extends AbstractC1140590fmr {
    public static final /* synthetic */ int LJI = 0;
    public final AssetsModel LIZ;
    public final C1135280feI LIZIZ;
    public final C1138600fje LIZJ;
    public long LIZLLL;
    public long LJ;
    public C1138950fkD LJFF;

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LIZ(EnumC1138990fkH enumC1138990fkH, boolean z) {
    }

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LJ(EnumC1138990fkH enumC1138990fkH, Message message) {
    }

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LIZIZ(EnumC1138990fkH enumC1138990fkH) {
        Map<Integer, String> map = C1138350fjF.LIZ;
        C1138350fjF.LJFF(this.LIZJ, "playEnd");
        C1138950fkD c1138950fkD = this.LJFF;
        if (c1138950fkD != null) {
            c1138950fkD.LIZIZ();
        }
        LJIIJ(enumC1138990fkH, false, null, new C1141050fnb(-29, "stopped", null), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0fkF] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0fkK] */
    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LIZJ(EnumC1138990fkH enumC1138990fkH) {
        InterfaceC1139030fkL interfaceC1139030fkLLIZIZ;
        Map<Integer, String> map = C1138350fjF.LIZ;
        C1138350fjF.LJFF(this.LIZJ, "playPrepare");
        final C1138950fkD c1138950fkD = new C1138950fkD();
        c1138950fkD.LIZJ.LJ();
        InterfaceC1139030fkL interfaceC1139030fkL = c1138950fkD.LIZ;
        if (interfaceC1139030fkL != null) {
            interfaceC1139030fkL.stop();
        }
        GiftReceiveFlowFluencyOptSetting giftReceiveFlowFluencyOptSetting = GiftReceiveFlowFluencyOptSetting.INSTANCE;
        if (!giftReceiveFlowFluencyOptSetting.getEnabled()) {
            synchronized (c1138950fkD.LIZLLL) {
                try {
                    c1138950fkD.LIZLLL.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c1138950fkD.LJ = 0L;
        }
        InterfaceC1139030fkL interfaceC1139030fkL2 = null;
        interfaceC1139030fkL2 = null;
        c1138950fkD.LJI = null;
        C1141290fnz.LIZ.removeCallbacks(c1138950fkD.LJIIIIZZ);
        if (!giftReceiveFlowFluencyOptSetting.getEnabled()) {
            c1138950fkD.LJ = System.currentTimeMillis();
            c1138950fkD.LIZJ.LIZ(C11NZ.LJJJJLI(1L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS186S0100000_17(c1138950fkD, 76)));
        }
        InterfaceC1139050fkN interfaceC1139050fkN = (InterfaceC1139050fkN) c1138950fkD.LJII.getValue();
        if (interfaceC1139050fkN != null && (interfaceC1139030fkLLIZIZ = interfaceC1139050fkN.LIZIZ()) != 0) {
            interfaceC1139030fkLLIZIZ.LIZ(new InterfaceC1139080fkQ() { // from class: X.0fkF
                @Override // X.InterfaceC1139080fkQ
                public final void LIZIZ(final double d) {
                    c1138950fkD.LIZIZ = Double.valueOf(d);
                    BPEAHandler bPEAHandler = C1141290fnz.LIZ;
                    final C1138950fkD c1138950fkD2 = c1138950fkD;
                    C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0fkE
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveStreamPerformance@c69b.start$2$1$1");
                            try {
                                C1138950fkD c1138950fkD3 = c1138950fkD2;
                                Double dValueOf = Double.valueOf(d);
                                c1138950fkD3.getClass();
                                if (dValueOf != null) {
                                    dValueOf.doubleValue();
                                    C1139000fkI c1139000fkI = c1138950fkD3.LJFF;
                                    if (c1139000fkI != null) {
                                        c1139000fkI.LJFF = dValueOf;
                                    }
                                    Function1<? super C1139000fkI, Unit> function1 = c1138950fkD3.LJI;
                                    if (function1 != null && c1139000fkI != null && c1139000fkI.LJFF != null) {
                                        function1.invoke(c1139000fkI);
                                        c1138950fkD3.LJI = null;
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveStreamPerformance@c69b.start$2$1$1");
                        }
                    });
                }
            });
            interfaceC1139030fkLLIZIZ.LIZIZ(new InterfaceC1139120fkU() { // from class: X.0fkK
                @Override // X.InterfaceC1139120fkU
                public final void LIZ() {
                    C786410Ut5.LJJZZIII(C1141290fnz.LIZ, new ARunnableS117S0100000_17(c1138950fkD, 145));
                }
            });
            interfaceC1139030fkLLIZIZ.start();
            interfaceC1139030fkL2 = interfaceC1139030fkLLIZIZ;
        }
        c1138950fkD.LIZ = interfaceC1139030fkL2;
        this.LJFF = c1138950fkD;
    }

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LIZLLL(EnumC1138990fkH enumC1138990fkH) {
        Map<Integer, String> map = C1138350fjF.LIZ;
        C1138350fjF.LJFF(this.LIZJ, "playFirstFrame");
        this.LJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LJFF(EnumC1138990fkH enumC1138990fkH) {
        Map<Integer, String> map = C1138350fjF.LIZ;
        C1138350fjF.LJFF(this.LIZJ, "playPrepared");
    }

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LJII(EnumC1138990fkH enumC1138990fkH) {
        boolean z;
        this.LIZLLL = System.currentTimeMillis();
        Map<Integer, String> map = C1138350fjF.LIZ;
        C1138350fjF.LJFF(this.LIZJ, "playLoad");
        C1138350fjF.LJFF(this.LIZJ, "playStart");
        C1138600fje c1138600fje = this.LIZJ;
        boolean z2 = false;
        if (c1138600fje != null && c1138600fje.LIZLLL) {
            z = true;
            C01WH.LIZ(new ARunnableS22S1100000_17(this, "_self", 6));
        } else {
            z = false;
            if (C2640010k.LIZIZ()) {
                C1140740fn6.LIZ().getClass();
                if (!C781880Ulm.LJ) {
                    C01WH.LIZ(new ARunnableS22S1100000_17(this, "_anchor", 6));
                }
            } else if (C1128450fTH.LJJIJ()) {
                C01WH.LIZ(new ARunnableS22S1100000_17(this, "_guest", 6));
            }
        }
        C1138600fje c1138600fje2 = this.LIZJ;
        if (c1138600fje2 != null && c1138600fje2.LJIILL) {
            z2 = true;
        }
        if (!GiftEventTrackSamplingSetting.shouldBlock(z2)) {
            if (GiftEventTrackSamplingSetting.enable() && (z || C2640010k.LIZIZ() || C1128450fTH.LJJIJ())) {
                return;
            }
            C01WH.LIZ(new ARunnableS22S1100000_17(this, "", 6));
        }
    }

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LJIIIIZZ(EnumC1138990fkH enumC1138990fkH) {
        Map<Integer, String> map = C1138350fjF.LIZ;
        C1138350fjF.LJFF(this.LIZJ, "playLoaded");
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJI(EnumC1138990fkH enumC1138990fkH, C1141050fnb c1141050fnb) {
        String str;
        Map<Integer, String> map = C1138350fjF.LIZ;
        C1138350fjF.LJFF(this.LIZJ, "playEnd");
        C1138950fkD c1138950fkD = this.LJFF;
        if (c1138950fkD != null) {
            c1138950fkD.LIZIZ();
        }
        C1138610fjf c1138610fjf = c1141050fnb.LIZLLL;
        if (c1138610fjf != null) {
            str = c1138610fjf.LIZLLL;
        } else {
            str = null;
        }
        LJIIJ(enumC1138990fkH, false, str, c1141050fnb, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.EnumC1138990fkH r19, X.C1138610fjf r20) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1138940fkC.LJIIIZ(X.0fkH, X.0fjf):void");
    }

    public C1138940fkC(AssetsModel assetsModel, C1135280feI c1135280feI, C1138600fje c1138600fje) {
        this.LIZ = assetsModel;
        this.LIZIZ = c1135280feI;
        this.LIZJ = c1138600fje;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[PHI: r7 r13
      0x0014: PHI (r7v4 int) = (r7v6 int), (r7v7 int) binds: [B:9:0x0012, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE]
      0x0014: PHI (r13v2 java.lang.String) = (r13v4 java.lang.String), (r13v5 java.lang.String) binds: [B:9:0x0012, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[PHI: r7 r13
      0x0018: PHI (r7v5 int) = (r7v4 int), (r7v6 int) binds: [B:11:0x0016, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0018: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v4 java.lang.String) binds: [B:11:0x0016, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.EnumC1138990fkH r37, boolean r38, java.lang.String r39, X.C1141050fnb r40, X.C1139000fkI r41, final X.C1138610fjf r42) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1138940fkC.LJIIJ(X.0fkH, boolean, java.lang.String, X.0fnb, X.0fkI, X.0fjf):void");
    }
}
