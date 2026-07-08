package X;

import kotlin.jvm.internal.AwS10S1301000_16;
import kotlin.jvm.internal.AwS3S1401000_16;

/* JADX INFO: renamed from: X.0cTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013550cTx {
    public final C1013560cTy LIZ;

    public C1013550cTx(C1013560cTy c1013560cTy) {
        this.LIZ = c1013560cTy;
    }

    public final void LIZJ(int i, Integer num, Integer num2, String str) {
        C1013560cTy c1013560cTy = this.LIZ;
        c1013560cTy.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logProductPlay: playOrder:");
        sbLIZ.append(num);
        sbLIZ.append(", videoIndex: ");
        sbLIZ.append(i);
        sbLIZ.append(", videoLength: ");
        sbLIZ.append(num2);
        sbLIZ.append(" vid:");
        sbLIZ.append(str);
        C1022620cia.LIZ("AnoleMultiContentLogger", C2188811AlT.LIZIZ(sbLIZ));
        c1013560cTy.logAd(c1013560cTy.LIZIZ, new AwS10S1301000_16(num, num2, c1013560cTy, i, str, 2));
    }

    public final void LIZLLL(int i, Integer num, Integer num2, String str) {
        C1013560cTy c1013560cTy = this.LIZ;
        c1013560cTy.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logProductPlay2s: playOrder:");
        sbLIZ.append(num);
        sbLIZ.append(", videoIndex: ");
        sbLIZ.append(i);
        sbLIZ.append(", videoLength: ");
        sbLIZ.append(num2);
        sbLIZ.append(" vid:");
        sbLIZ.append(str);
        C1022620cia.LIZ("AnoleMultiContentLogger", C2188811AlT.LIZIZ(sbLIZ));
        c1013560cTy.logAd(c1013560cTy.LIZJ, new AwS10S1301000_16(num, num2, c1013560cTy, i, str, 3));
    }

    public final void LIZ(int i, Integer num, Integer num2, Integer num3, String str) {
        C1013560cTy c1013560cTy = this.LIZ;
        c1013560cTy.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logProductBreak: playOrder:");
        sbLIZ.append(num);
        sbLIZ.append(", duration:");
        sbLIZ.append(num2);
        sbLIZ.append(" videoIndex: ");
        sbLIZ.append(i);
        sbLIZ.append(", videoLength: ");
        sbLIZ.append(num3);
        sbLIZ.append(" vid:");
        sbLIZ.append(str);
        C1022620cia.LIZ("AnoleMultiContentLogger", C2188811AlT.LIZIZ(sbLIZ));
        c1013560cTy.logAd(c1013560cTy.LIZLLL, new AwS3S1401000_16(num, num3, c1013560cTy, i, str, num2, 0));
    }

    public final void LIZIZ(int i, Integer num, Integer num2, Integer num3, String str) {
        C1013560cTy c1013560cTy = this.LIZ;
        c1013560cTy.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logProductOver: playOrder:");
        sbLIZ.append(num);
        sbLIZ.append(", duration:");
        sbLIZ.append(num2);
        sbLIZ.append(" videoIndex: ");
        sbLIZ.append(i);
        sbLIZ.append(", videoLength: ");
        sbLIZ.append(num3);
        sbLIZ.append(" vid:");
        sbLIZ.append(str);
        C1022620cia.LIZ("AnoleMultiContentLogger", C2188811AlT.LIZIZ(sbLIZ));
        c1013560cTy.logAd(c1013560cTy.LJ, new AwS3S1401000_16(num, num3, c1013560cTy, i, str, num2, 1));
    }
}
