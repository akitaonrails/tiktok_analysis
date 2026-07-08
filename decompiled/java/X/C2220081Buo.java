package X;

import Y.AObjectS408S0100000_34;

/* JADX INFO: renamed from: X.1Buo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2220081Buo extends AbstractC1304120k2c {
    public final C1524970pmp LIZ;
    public final C01GW LIZIZ;

    @Override // X.InterfaceC1304080k2Y
    public final void onExit() {
    }

    @Override // X.AbstractC1304120k2c, X.InterfaceC1304080k2Y
    public final void onPause() {
    }

    @Override // X.AbstractC1304120k2c, X.InterfaceC1304080k2Y
    public final void onResume() {
    }

    @Override // X.InterfaceC1304080k2Y
    public final void onStart() {
        C2220051Bul c2220051Bul = (C2220051Bul) this.LIZIZ.getValue();
        C21346018gE c21346018gE = c2220051Bul.LIZ.LIZJ;
        c21346018gE.LIZIZ.put("systemInfo", new C1304430k37("systemInfo", new C21351818hA(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getSystemInfo", new C1304430k37("getSystemInfo", new C2220091Bup(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getSystemInfoSync", new C1304430k37("getSystemInfoSync", new C21351918hB(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getWindowInfo", new C1304430k37("getWindowInfo", new C2220061Bum(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getSystemSetting", new C1304430k37("getSystemSetting", new C2220111Bur(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getDeviceInfo", new C1304430k37("getDeviceInfo", new C2220071Bun(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getDeviceBenchmarkInfo", new C1304430k37("getDeviceBenchmarkInfo", new C2220101Buq(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getAppBaseInfo", new C1304430k37("getAppBaseInfo", new C2220121Bus(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getAppAuthorizeSetting", new C1304430k37("getAppAuthorizeSetting", new C2220131But(c2220051Bul), c2220051Bul));
        c21346018gE.LIZIZ.put("getDeviceInfoSync", new C1304430k37("getDeviceInfoSync", new C2220041Buk(c2220051Bul), c2220051Bul));
    }

    public C2220081Buo(C1524970pmp c1524970pmp) {
        this.LIZ = c1524970pmp;
        c1524970pmp.LIZ();
        this.LIZIZ = C452501pT.LIZIZ(new AObjectS408S0100000_34(this, 6));
    }
}
