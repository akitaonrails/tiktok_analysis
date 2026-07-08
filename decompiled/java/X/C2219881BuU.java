package X;

import Y.AObjectS376S0100000_34;

/* JADX INFO: renamed from: X.1BuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219881BuU extends AbstractC1304120k2c {
    public boolean LIZ;
    public final C2219841BuQ LIZIZ;
    public final C2219981Bue LIZJ;
    public final C2220011Buh LIZLLL;
    public final C2220021Bui LJ;
    public final C2220001Bug LJFF;
    public final C2219991Buf LJI;
    public final C2219971Bud LJII;

    @Override // X.InterfaceC1304080k2Y
    public final void onExit() {
        this.LIZ = false;
        this.LJI.getClass();
        this.LJFF.getClass();
        C2219841BuQ c2219841BuQ = this.LIZIZ;
        C1304330k2x c1304330k2x = c2219841BuQ.LIZIZ;
        if (c1304330k2x != null) {
            c2219841BuQ.LIZ.LJFF.LJLJJL(c1304330k2x);
        }
        C1304330k2x c1304330k2x2 = c2219841BuQ.LIZJ;
        if (c1304330k2x2 != null) {
            c2219841BuQ.LIZ.LJFF.LJLJJL(c1304330k2x2);
        }
        C2219981Bue c2219981Bue = this.LIZJ;
        C1304330k2x c1304330k2x3 = c2219981Bue.LIZIZ;
        if (c1304330k2x3 != null) {
            c2219981Bue.LIZ.LJFF.LJLJJL(c1304330k2x3);
        }
        this.LJ.getClass();
        this.LIZLLL.getClass();
        this.LJII.getClass();
    }

    @Override // X.AbstractC1304120k2c, X.InterfaceC1304080k2Y
    public final void onPause() {
        this.LIZ = false;
    }

    @Override // X.AbstractC1304120k2c, X.InterfaceC1304080k2Y
    public final void onResume() {
        this.LIZ = true;
    }

    @Override // X.InterfaceC1304080k2Y
    public final void onStart() {
        this.LIZ = true;
        C2220011Buh c2220011Buh = this.LIZLLL;
        C21346018gE c21346018gE = c2220011Buh.LIZIZ;
        c21346018gE.LIZIZ.put("setDeviceOrientation", new C1304430k37("setDeviceOrientation", new C2219911BuX(c2220011Buh), c2220011Buh));
        C2219841BuQ c2219841BuQ = this.LIZIZ;
        c2219841BuQ.LIZIZ = c2219841BuQ.LIZ.LJFF.LJJZ(EnumC1304340k2y.OnNetworkChange, new AObjectS376S0100000_34(c2219841BuQ, 4));
        c2219841BuQ.LIZJ = c2219841BuQ.LIZ.LJFF.LJJZ(EnumC1304340k2y.OnNetworkWeakChange, new AObjectS376S0100000_34(c2219841BuQ, 5));
        C21346018gE c21346018gE2 = c2219841BuQ.LIZLLL;
        c21346018gE2.LIZIZ.put("getNetworkType", new C1304430k37("getNetworkType", new C2219851BuR(c2219841BuQ), c2219841BuQ));
        C2219981Bue c2219981Bue = this.LIZJ;
        c2219981Bue.LIZIZ = c2219981Bue.LIZ.LJFF.LJJZ(EnumC1304340k2y.OnMemoryWarning, new AObjectS376S0100000_34(c2219981Bue, 3));
        C2220021Bui c2220021Bui = this.LJ;
        C21346018gE c21346018gE3 = c2220021Bui.LIZIZ;
        c21346018gE3.LIZIZ.put("setKeepScreenOn", new C1304430k37("setKeepScreenOn", new C2219891BuV(c2220021Bui), c2220021Bui));
        C21346018gE c21346018gE4 = c2220021Bui.LIZIZ;
        c21346018gE4.LIZIZ.put("setScreenBrightness", new C1304430k37("setScreenBrightness", new C2219901BuW(c2220021Bui), c2220021Bui));
        C21346018gE c21346018gE5 = c2220021Bui.LIZIZ;
        c21346018gE5.LIZIZ.put("getScreenBrightness", new C1304430k37("getScreenBrightness", new C2219941Bua(c2220021Bui), c2220021Bui));
        C2220001Bug c2220001Bug = this.LJFF;
        C21346018gE c21346018gE6 = c2220001Bug.LIZIZ;
        c21346018gE6.LIZIZ.put("getBatteryInfo", new C1304430k37("getBatteryInfo", new C2219951Bub(c2220001Bug), c2220001Bug));
        C21346018gE c21346018gE7 = c2220001Bug.LIZIZ;
        c21346018gE7.LIZIZ.put("getBatteryInfoSync", new C1304430k37("getBatteryInfoSync", new C2219961Buc(c2220001Bug), c2220001Bug));
        C2219991Buf c2219991Buf = this.LJI;
        C21346018gE c21346018gE8 = c2219991Buf.LIZ;
        c21346018gE8.LIZIZ.put("setClipboardData", new C1304430k37("setClipboardData", new C2219921BuY(c2219991Buf), c2219991Buf));
        C21346018gE c21346018gE9 = c2219991Buf.LIZ;
        c21346018gE9.LIZIZ.put("getClipboardData", new C1304430k37("getClipboardData", new C2219931BuZ(c2219991Buf), c2219991Buf));
        C2219971Bud c2219971Bud = this.LJII;
        C21346018gE c21346018gE10 = c2219971Bud.LIZJ;
        c21346018gE10.LIZIZ.put("vibrateShort", new C1304430k37("vibrateShort", new C2219861BuS(c2219971Bud), c2219971Bud));
        C21346018gE c21346018gE11 = c2219971Bud.LIZJ;
        c21346018gE11.LIZIZ.put("vibrateLong", new C1304430k37("vibrateLong", new C2219871BuT(c2219971Bud), c2219971Bud));
    }

    public C2219881BuU(C1524970pmp c1524970pmp) {
        this.LIZIZ = new C2219841BuQ(c1524970pmp);
        this.LIZJ = new C2219981Bue(c1524970pmp);
        this.LIZLLL = new C2220011Buh(c1524970pmp);
        this.LJ = new C2220021Bui(c1524970pmp);
        this.LJFF = new C2220001Bug(c1524970pmp);
        this.LJI = new C2219991Buf(c1524970pmp);
        this.LJII = new C2219971Bud(c1524970pmp, this);
    }
}
