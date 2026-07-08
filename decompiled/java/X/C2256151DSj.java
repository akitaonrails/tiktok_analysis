package X;

import com.ss.android.ugc.aweme.setting.performance.publish.PrePublishDowngradeStrategyBenchImpl;

/* JADX INFO: renamed from: X.1DSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256151DSj implements InterfaceC2256171DSl {
    public static final C2256151DSj LJIILLIIL = new C2256151DSj();
    public final /* synthetic */ InterfaceC2256171DSl LJIILL;

    @Override // X.InterfaceC2256171DSl
    public final boolean disablePreCompile() {
        return this.LJIILL.disablePreCompile();
    }

    public C2256151DSj() {
        InterfaceC2256171DSl interfaceC2256171DSl;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC2256171DSl = (InterfaceC2256171DSl) c09gaLIZIZ.LJII(PrePublishDowngradeStrategyBenchImpl.class)) == null) ? new InterfaceC2256171DSl() { // from class: X.1DSk
            @Override // X.InterfaceC2256171DSl
            public final boolean disablePreCompile() {
                return false;
            }
        } : interfaceC2256171DSl;
    }
}
