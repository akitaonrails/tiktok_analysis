package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;

/* JADX INFO: renamed from: X.0vmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755610vmp implements InterfaceC1755020vls {
    public final IPdpStarter.PdpEnterParam LIZ;
    public boolean LIZIZ;

    public C1755610vmp() {
        this(null);
    }

    @Override // X.InterfaceC1755020vls
    public final C987903td w0() {
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ;
        return C1025903zl.LIZIZ(pdpEnterParam != null ? pdpEnterParam.bizType : null, null);
    }

    @Override // X.InterfaceC1755020vls
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1755020vls
    public final IPdpStarter.PdpEnterParam v4() {
        return this.LIZ;
    }

    public C1755610vmp(IPdpStarter.PdpEnterParam pdpEnterParam) {
        this.LIZ = pdpEnterParam;
        boolean z = false;
        if (pdpEnterParam != null && pdpEnterParam.fullScreen) {
            z = true;
        }
        this.LIZIZ = z;
    }
}
