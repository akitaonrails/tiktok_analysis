package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0tHR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659270tHR {
    public boolean LIZ;

    public final void LIZ(InterfaceC1460000o62 interfaceC1460000o62) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        Keva keva = C1659320tHW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparking_effect");
        sbLIZ.append(20);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva keva2 = C1659320tHW.LIZ;
        int i = keva2.getInt(strLIZIZ, 0);
        if (i < 1) {
            interfaceC1460000o62.KK0(20, "star_lottie.json");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sparking_effect");
            sbLIZ2.append(20);
            keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
        }
    }
}
