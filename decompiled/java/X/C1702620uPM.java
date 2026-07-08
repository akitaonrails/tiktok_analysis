package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.voiceinput.api.IVoiceInputController;
import com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702620uPM implements IPublishVoiceInputService {
    public static volatile IPublishVoiceInputService LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile long LJFF;
    public static final C1702620uPM LIZ = new C1702620uPM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(263));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1960));

    public static IPublishVoiceInputService LIZIZ() {
        Object c098200Yq;
        try {
            final Class<?> cls = Class.forName("com.ss.android.ugc.aweme.shortvideo.image.voiceinput.PublishVoiceInputServiceImpl");
            ServiceManager.get().bind(IPublishVoiceInputService.class, new ServiceProvider() { // from class: X.0uPL
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return cls.newInstance();
                }
            }).asSingleton();
            c098200Yq = (IPublishVoiceInputService) PluggableExtentionKt.pluggableSpi$default(IPublishVoiceInputService.class, false, false, false, 14, null);
            if (c098200Yq == null || c098200Yq == LIZLLL()) {
                LJFF = SystemClock.elapsedRealtime();
                c098200Yq = LIZLLL();
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
        C1702630uPN c1702630uPNLIZLLL = LIZLLL();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c1702630uPNLIZLLL;
        }
        return (IPublishVoiceInputService) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService LIZJ() {
        /*
            com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService r0 = X.C1702620uPM.LIZJ
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService> r0 = com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService r1 = (com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService) r1
            if (r1 != 0) goto L23
            boolean r0 = X.C1702620uPM.LIZLLL
            r7 = 1
            if (r0 != 0) goto L2e
            X.13zX r0 = X.C20191713zX.LIZ
            r0.getClass()
            boolean r0 = X.C20191713zX.LIZ()
            if (r0 != 0) goto L2c
            X.0uPN r1 = LIZLLL()
        L23:
            X.0uPN r0 = LIZLLL()
            if (r1 == r0) goto L2b
            X.C1702620uPM.LIZJ = r1
        L2b:
            return r1
        L2c:
            X.C1702620uPM.LIZLLL = r7
        L2e:
            long r5 = X.C1702620uPM.LJFF
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L46
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r5
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L46
            X.0uPN r1 = LIZLLL()
            goto L23
        L46:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L71
            boolean r0 = X.C1702620uPM.LJ
            if (r0 != 0) goto L6c
            X.C1702620uPM.LJ = r7
            X.01GW r0 = X.C1702620uPM.LJI
            java.lang.Object r3 = r0.getValue()
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.0uPK r2 = new X.0uPK
            r1 = 0
            r2.<init>(r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
        L6c:
            X.0uPN r1 = LIZLLL()
            goto L23
        L71:
            com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService r1 = LIZIZ()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1702620uPM.LIZJ():com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService");
    }

    public static C1702630uPN LIZLLL() {
        return (C1702630uPN) LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService
    public final boolean isAvailable() {
        return LIZJ().isAvailable();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService
    public final IVoiceInputController LIZ(Scene scene, VideoPublishEditModel videoPublishEditModel, ViewGroup viewGroup, View view, C0ZI0 c0zi0, InterfaceC1710480uc2 interfaceC1710480uc2, C1989407qm c1989407qm, InterfaceC1702650uPP interfaceC1702650uPP, AnonymousClass1978 anonymousClass1978) {
        return LIZJ().LIZ(scene, videoPublishEditModel, viewGroup, view, c0zi0, interfaceC1710480uc2, c1989407qm, interfaceC1702650uPP, anonymousClass1978);
    }
}
