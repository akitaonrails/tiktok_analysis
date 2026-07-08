package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0khZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329510khZ implements InterfaceC1327470keH {
    public volatile C1328800kgQ LIZ;
    public final /* synthetic */ InterfaceC1329940kiG LIZIZ;

    @Override // X.InterfaceC1327470keH
    public final C1328800kgQ LIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = ImagePipelineConfigFactory.LJJJJJ(this.LIZIZ.LIZJ());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }

    public C1329510khZ(InterfaceC1329940kiG interfaceC1329940kiG) {
        this.LIZIZ = interfaceC1329940kiG;
    }
}
