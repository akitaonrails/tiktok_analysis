package X;

import Y.ALAdapterS3S0100000_6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899450zWp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C1302030jzF c1302030jzF, int i) {
        try {
            c1302030jzF.setMinAndMaxFrame(0, Integer.MAX_VALUE);
            c1302030jzF.setRepeatCount(i);
            c1302030jzF.setRepeatMode(-1);
            c1302030jzF.addAnimatorListener(new ALAdapterS3S0100000_6(67));
            c1302030jzF.playAnimation();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(C1302030jzF c1302030jzF, C0VSP c0vsp, String str, InterfaceC1898930zVz interfaceC1898930zVz, String str2) {
        try {
            if (str.length() != 0) {
                c1302030jzF.setImageAssetsFolder(str);
            }
            C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(c0vsp, str2);
            c1292030jj7LJ.LIZIZ(new C19335910kn(c1302030jzF, interfaceC1898930zVz, 5));
            c1292030jj7LJ.LIZ(new C19336010ko(interfaceC1898930zVz, 4));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1898930zVz.onFail();
        }
    }
}
