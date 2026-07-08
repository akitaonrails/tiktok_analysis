package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0X2C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2C implements InterfaceC2210571BfT {
    public static final C0X2C LIZ = new C0X2C();
    public static boolean LIZIZ;

    @Override // X.InterfaceC2210571BfT
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC2210571BfT
    public final void getAbClient() {
    }

    @Override // X.InterfaceC2210571BfT
    public final void getAbFeature() {
    }

    @Override // X.InterfaceC2210571BfT
    public final void getAbFlag() {
    }

    @Override // X.InterfaceC2210571BfT
    public final String LIZ() {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        boolean z = c2213981Bky.getChannel().equals("monkey") || c2213981Bky.getChannel().equals("autotest");
        boolean zEquals = c2213981Bky.getChannel().equals("live_inhouse");
        if (!c2213981Bky.isRegressionTest() && !c2213981Bky.isOffline() && !z && !zEquals) {
            return c2213981Bky.LIZ();
        }
        String mockChannel = C2211941Bhg.LIZ.getMockChannel();
        return mockChannel == null ? c2213981Bky.LIZ() : mockChannel;
    }

    @Override // X.InterfaceC2210571BfT
    public final String LIZJ() {
        return C2213981Bky.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC2210571BfT
    public final String getAbVersion() {
        if (LIZIZ) {
            return getVersion();
        }
        return null;
    }

    @Override // X.InterfaceC2210571BfT
    public final int getAid() {
        return C2213981Bky.LIZIZ.getAppId();
    }

    @Override // X.InterfaceC2210571BfT
    public final String getAppName() {
        return C2213981Bky.LIZIZ.getAppName();
    }

    @Override // X.InterfaceC2210571BfT
    public final String getChannel() {
        return C2213981Bky.LIZIZ.getChannel();
    }

    @Override // X.InterfaceC2210571BfT
    public final Context getContext() {
        return C2213981Bky.LIZIZ.getApplicationContext();
    }

    @Override // X.InterfaceC2210571BfT
    public final int getManifestVersionCode() {
        return (int) C2213981Bky.LIZIZ.getVersionCode();
    }

    @Override // X.InterfaceC2210571BfT
    public final int getUpdateVersionCode() {
        return (int) C2213981Bky.LIZIZ.getUpdateVersionCode();
    }

    @Override // X.InterfaceC2210571BfT
    public final String getVersion() {
        return C2213981Bky.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC2210571BfT
    public final int getVersionCode() {
        return (int) C2213981Bky.LIZIZ.LIZIZ();
    }
}
