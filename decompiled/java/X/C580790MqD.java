package X;

import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0MqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580790MqD extends AbstractC1552040qUU {
    public final int $t;

    @Override // X.AbstractC1552040qUU
    public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
        switch (this.$t) {
            case 0:
                LJIIJJI$0(this, updatePackage, th);
                break;
            case 1:
                LJIIJJI$1(this, updatePackage, th);
                break;
            default:
                super.LJIIJJI(updatePackage, th);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        switch (this.$t) {
            case 0:
                LJIL$0(this, j, updatePackage);
                break;
            case 1:
                LJIL$1(this, j, updatePackage);
                break;
            default:
                super.LJIL(j, updatePackage);
                break;
        }
    }

    public C580790MqD(int i) {
        this.$t = i;
    }

    public static final void LJIIJJI$0(C580790MqD c580790MqD, UpdatePackage updatePackage, Throwable th) {
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDownloadFail ");
        sbLIZ.append(th);
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIIJJI$1(C580790MqD c580790MqD, UpdatePackage updatePackage, Throwable th) {
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDownloadFail ");
        sbLIZ.append(th);
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIL$0(C580790MqD c580790MqD, long j, UpdatePackage updatePackage) {
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateSuccess ");
        sbLIZ.append(j);
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", C2188811AlT.LIZIZ(sbLIZ));
        C572540Mcu.LIZ.getClass();
        C1331660kl2.LJIIIIZZ(C572540Mcu.LIZ()).LJJIII();
    }

    public static final void LJIL$1(C580790MqD c580790MqD, long j, UpdatePackage updatePackage) {
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateSuccess ");
        sbLIZ.append(j);
        C201955140j.LIZLLL(c1662160tM6, "TextToImageGeckoManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
