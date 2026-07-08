package X;

import Y.AObjectS245S0100000_22;
import androidx.lifecycle.LiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.StoryPublishNetworkInfo;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411220mpM extends AbstractC2255721DQs<InterfaceC1439570nZ5> implements InterfaceC1439570nZ5, InterfaceC379610EuV {
    public static final C1411230mpN LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final AtomicBoolean LLILZ = new AtomicBoolean(false);
    public volatile long LLILZIL = -1;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 391));
    public C09AE LLIZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0mpN] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1411220mpM.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1411220mpM.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};
        LLIZLLLIL = new Object() { // from class: X.0mpN
        };
    }

    public InterfaceC1439570nZ5 X1() {
        return this;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLL.getValue(this, LLJ[1]);
    }

    private final boolean Z1() {
        return ((Boolean) this.LLILZLL.getValue()).booleanValue();
    }

    private final boolean w2() {
        int iIntValue = ((Number) C259190ADt.LIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? C1428470nHB.LJJLJLI(LJJJLIIL()) : Z1() || Intrinsics.LJFF(LJJJLIIL().mShootWay, "direct_shoot") : Z1();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        Unit unit;
        LiveData<Void> liveDataWw2;
        super.onCreate();
        if (w2()) {
            try {
                InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
                if (interfaceC1446740nkeJY0 == null || (liveDataWw2 = interfaceC1446740nkeJY0.ww2()) == null) {
                    unit = null;
                } else {
                    liveDataWw2.observe(this, new AObjectS245S0100000_22(this, 97));
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Object c098200Yq;
        super.onDestroy();
        if (w2()) {
            try {
                C09AE c09ae = this.LLIZ;
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            this.LLIZ = null;
            try {
                C0CHQ.LIZ().getPublishService().LJJIJIIJI().LIZ().LIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1411220mpM(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C2164308dt W1(com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r25) {
        /*
            r24 = this;
            r3 = r24
            long r1 = r3.LLILZIL
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r12 = -1
            if (r0 <= 0) goto L43
            long r16 = android.os.SystemClock.elapsedRealtime()
            long r0 = r3.LLILZIL
            long r16 = r16 - r0
        L14:
            X.01GW r4 = X.C2164108dr.LIZIZ
            java.lang.Object r0 = r4.getValue()
            com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig r0 = (com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig) r0
            boolean r0 = r0.enable
            r3 = 1
            if (r0 == 0) goto L41
            java.lang.Object r0 = r4.getValue()
            com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig r0 = (com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig) r0
            long r1 = r0.speedTestTimeoutMs
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 <= 0) goto L41
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 < 0) goto L41
            r9 = 1
        L32:
            java.lang.Object r0 = r4.getValue()
            com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig r0 = (com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig) r0
            int r0 = r0.ttnetControl
            if (r0 != r3) goto L64
            r11 = -1
            if (r3 == 0) goto L64
            r2 = 0
            goto L46
        L41:
            r9 = 0
            goto L32
        L43:
            r16 = -1
            goto L14
        L46:
            java.lang.Class<com.ss.android.ugc.aweme.network.spi.INetworkLevelService> r18 = com.ss.android.ugc.aweme.network.spi.INetworkLevelService.class
            r19 = 0
            r22 = 14
            r23 = 0
            r20 = r19
            r21 = r19
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L67
            com.ss.android.ugc.aweme.network.spi.INetworkLevelService r0 = (com.ss.android.ugc.aweme.network.spi.INetworkLevelService) r0     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L62
            X.0mpO r1 = r0.getNqeNetworkLevel()     // Catch: java.lang.Throwable -> L67
        L5e:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L67
            goto L73
        L62:
            r1 = r2
            goto L5e
        L64:
            r11 = -1
            r10 = 0
            goto L87
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L73:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L7a
            r1 = r2
        L7a:
            X.0mpO r1 = (X.C1411240mpO) r1
            if (r1 == 0) goto L82
            int r11 = r1.LIZIZ
            X.0tKk r2 = r1.LIZ
        L82:
            X.0tKk r0 = X.EnumC1661320tKk.SLOW
            if (r2 != r0) goto Lb7
            r10 = 1
        L87:
            if (r25 == 0) goto L8d
            long r12 = r25.getSpeed()
        L8d:
            X.01GW r0 = X.C2164108dr.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig r0 = (com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig) r0
            long r14 = r0.weakNetSpeed
            if (r9 != 0) goto La3
            if (r10 != 0) goto La3
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto Lb5
        La3:
            r8 = 1
        La4:
            X.08dt r7 = new X.08dt
            if (r8 == 0) goto Lb3
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 > 0) goto Lb3
            r0 = 1
            long r14 = r14 - r0
        Laf:
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)
            return r7
        Lb3:
            r14 = r12
            goto Laf
        Lb5:
            r8 = 0
            goto La4
        Lb7:
            r10 = 0
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1411220mpM.W1(com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo):X.08dt");
    }

    @Override // X.InterfaceC1439570nZ5
    public void fY0(String str) {
        if (!w2()) {
            return;
        }
        boolean z = true;
        if (!this.LLILZ.compareAndSet(false, true)) {
            return;
        }
        C2164308dt c2164308dtW1 = W1(C0CHQ.LIZ().getPublishService().LJJIJIIJI().LIZ().LIZIZ());
        CreativeModel creativeModel = LJJJLIIL().creativeModel;
        c2164308dtW1.getClass();
        creativeModel.storyPublishNetworkInfo = new StoryPublishNetworkInfo(c2164308dtW1.LIZ, c2164308dtW1.LJ, c2164308dtW1.LJFF, false);
        boolean z2 = !C1428470nHB.LJJZZI(LJJJLIIL());
        if (this.LLILZIL <= 0) {
            z = false;
        }
        o2(str, z, z2, ((StoryPublishWeakNetworkConfig) C2164108dr.LIZIZ.getValue()).enable, c2164308dtW1);
    }

    private final void o2(String str, boolean z, boolean z2, boolean z3, C2164308dt c2164308dt) {
        long speed;
        UploadSpeedInfo uploadSpeedInfo = LJJJLIIL().getUploadSpeedInfo();
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = c2164308dt.LJ;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2164208ds(speed, str, z, z2, z3, c2164308dt, null), 3);
    }
}
