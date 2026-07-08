package b7k;

import X.C0CHQ;
import X.C1643930ssh;
import X.InterfaceC1294060jmO;
import X.InterfaceC1645100sua;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class b implements InterfaceC1645100sua {
    public final C1643930ssh LIZ;

    @Override // X.InterfaceC1645100sua
    public boolean LIZJ() {
        C1643930ssh c1643930ssh = this.LIZ;
        if (Intrinsics.LJFF(c1643930ssh.LIZ, "ttnowfilter")) {
            return c1643930ssh.LIZIZ.getBoolean("disable_filter", false);
        }
        if (c1643930ssh.LIZIZ.contains("disable_filter")) {
            return c1643930ssh.LIZIZ.getBoolean("disable_filter", false);
        }
        boolean zLJJL = C0CHQ.LIZ().LJJIIZI().LJJL(false);
        c1643930ssh.LIZIZ.storeBoolean("disable_filter", zLJJL);
        return zLJJL;
    }

    public b(C1643930ssh c1643930ssh) {
        this.LIZ = c1643930ssh;
    }

    @Override // X.InterfaceC1645100sua
    @InterfaceC1294060jmO
    public final String LIZ(int i) throws IllegalAccessException {
        throw new IllegalAccessException("Please use getDefaultFilterResId(cameraFacing: Int): String?");
    }

    @Override // X.InterfaceC1645100sua
    public void LJ(boolean z) {
        this.LIZ.LIZIZ.storeBoolean("disable_filter", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String LJFF(int r13) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7k.b.LJFF(int):java.lang.String");
    }

    @Override // X.InterfaceC1645100sua
    @InterfaceC1294060jmO
    public final void LIZLLL(int i, String str) throws IllegalAccessException {
        throw new IllegalAccessException("Please use saveDefaultFilterResId(cameraFacing: Int, filterId: String)");
    }

    public void LJI(int i, String str) {
        String str2;
        C1643930ssh c1643930ssh = this.LIZ;
        c1643930ssh.getClass();
        if (i != 0) {
            if (i == 1) {
                str2 = "CameraFilter_Selected_Front_Filter";
            } else {
                throw new IllegalArgumentException("cameraPosition must be CAMERA_FACING_BACK or CAMERA_FACING_FRONT");
            }
        } else {
            str2 = "CameraFilter_Selected_Back_Filter";
        }
        c1643930ssh.LIZIZ.storeString(str2, str);
    }
}
