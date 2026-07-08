package X;

import com.ss.android.ugc.aweme.setting.performance.videoquality.CameraStabilizationBenchApiBenchStrategy;

/* JADX INFO: renamed from: X.1DSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256181DSm implements InterfaceC2256201DSo {
    public static final C2256181DSm LJIILLIIL = new C2256181DSm();
    public final /* synthetic */ InterfaceC2256201DSo LJIILL;

    @Override // X.InterfaceC2256201DSo
    public final int getFrontCameraStabilizationStrategy() {
        return this.LJIILL.getFrontCameraStabilizationStrategy();
    }

    @Override // X.InterfaceC2256201DSo
    public final int getRearCameraStabilizationStrategy() {
        return this.LJIILL.getRearCameraStabilizationStrategy();
    }

    public C2256181DSm() {
        InterfaceC2256201DSo interfaceC2256201DSo;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC2256201DSo = (InterfaceC2256201DSo) c09gaLIZIZ.LJII(CameraStabilizationBenchApiBenchStrategy.class)) == null) ? new InterfaceC2256201DSo() { // from class: X.1DSn
            @Override // X.InterfaceC2256201DSo
            public final int getFrontCameraStabilizationStrategy() {
                return 0;
            }

            @Override // X.InterfaceC2256201DSo
            public final int getRearCameraStabilizationStrategy() {
                return 0;
            }
        } : interfaceC2256201DSo;
    }
}
