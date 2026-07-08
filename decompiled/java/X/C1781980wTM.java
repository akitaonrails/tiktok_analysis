package X;

import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.ICWatermarkService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.ss.android.vesdk.VEWatermarkParam;
import com.zhiliaoapp.musically.R;
import lth.o;

/* JADX INFO: renamed from: X.0wTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781980wTM {
    public static final void LJFF(String str) {
        C438740HIi c438740HIi = new C438740HIi();
        ((ICWatermarkService) ServiceManager.get().getService(ICWatermarkService.class)).LIZ(R.drawable.btp);
        c438740HIi.LIZ = BitmapFactory.decodeResource(o.LIZ.getResources(), R.drawable.btp);
        c438740HIi.LJFF(str);
    }

    public static final C1782000wTO LIZIZ(String str, int[] iArr, CreativeInfo creativeInfo, boolean z, String str2, int i) {
        boolean z2;
        String[] strArrLJ = new C1847530yB5(iArr[0], iArr[1], -1, creativeInfo, str).LJ(i);
        VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
        if (strArrLJ != null && strArrLJ.length != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        int[] iArrLIZ = C534390KxZ.LIZ(strArrLJ[0]);
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity = new VEWatermarkParam.VEWatermarkEntity();
        vEWatermarkEntity.images = strArrLJ;
        vEWatermarkEntity.interval = 2;
        vEWatermarkEntity.width = iArrLIZ[0];
        vEWatermarkEntity.height = iArrLIZ[1];
        vEWatermarkEntity.xOffset = 0;
        vEWatermarkEntity.yOffset = 0;
        vEWatermarkEntity.position = VEWaterMarkPosition.TL;
        int i2 = C1781950wTJ.LIZ;
        if (i2 != 0 && !z) {
            vEWatermarkEntity.sequenceIn = 0L;
            vEWatermarkEntity.sequenceOut = i2;
        } else {
            vEWatermarkEntity.sequenceIn = 0L;
            vEWatermarkEntity.sequenceOut = 2147483647L;
        }
        vEWatermarkParam.setEntities((VEWatermarkParam.VEWatermarkEntity[]) C1697810uHb.LJIILJJIL(vEWatermarkEntity).toArray(new VEWatermarkParam.VEWatermarkEntity[0]));
        if (z && str2.length() > 0) {
            vEWatermarkParam.needExtFile = true;
            vEWatermarkParam.extFile = str2;
        }
        return new C1782000wTO(vEWatermarkParam);
    }

    public static final C1782010wTP LIZJ(String str, int[] iArr, CreativeInfo creativeInfo, boolean z, String str2, int i) {
        boolean z2;
        String[] strArrLIZJ = new C1847530yB5(iArr[0], iArr[1], -1, creativeInfo, str).LIZJ(i);
        VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
        if (strArrLIZJ != null && strArrLIZJ.length != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        int[] iArrLIZ = C534390KxZ.LIZ(strArrLIZJ[0]);
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity = new VEWatermarkParam.VEWatermarkEntity();
        vEWatermarkEntity.images = strArrLIZJ;
        vEWatermarkEntity.interval = 2;
        vEWatermarkEntity.width = iArrLIZ[0];
        vEWatermarkEntity.height = iArrLIZ[1];
        vEWatermarkEntity.xOffset = 0;
        vEWatermarkEntity.yOffset = 0;
        vEWatermarkEntity.position = VEWaterMarkPosition.BL;
        int i2 = C1781950wTJ.LIZ;
        if (i2 != 0 && !z) {
            vEWatermarkEntity.sequenceIn = 0L;
            vEWatermarkEntity.sequenceOut = i2;
        } else {
            vEWatermarkEntity.sequenceIn = 0L;
            vEWatermarkEntity.sequenceOut = 2147483647L;
        }
        vEWatermarkParam.setEntities((VEWatermarkParam.VEWatermarkEntity[]) C1697810uHb.LJIILJJIL(vEWatermarkEntity).toArray(new VEWatermarkParam.VEWatermarkEntity[0]));
        if (z && str2.length() > 0) {
            vEWatermarkParam.needExtFile = true;
            vEWatermarkParam.extFile = str2;
        }
        return new C1782010wTP(vEWatermarkParam);
    }

    public static final C1782020wTQ LIZLLL(String str, int[] iArr, CreativeInfo creativeInfo, boolean z, String str2, int i) {
        boolean z2;
        String[] strArrLIZLLL = new C1847530yB5(iArr[0], iArr[1], -1, creativeInfo, str).LIZLLL(i);
        VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
        if (strArrLIZLLL != null && strArrLIZLLL.length != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        int[] iArrLIZ = C534390KxZ.LIZ(strArrLIZLLL[0]);
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity = new VEWatermarkParam.VEWatermarkEntity();
        vEWatermarkEntity.images = strArrLIZLLL;
        vEWatermarkEntity.interval = 2;
        vEWatermarkEntity.width = iArrLIZ[0];
        vEWatermarkEntity.height = iArrLIZ[1];
        vEWatermarkEntity.xOffset = 0;
        vEWatermarkEntity.yOffset = 0;
        vEWatermarkEntity.position = VEWaterMarkPosition.BR;
        int i2 = C1781950wTJ.LIZ;
        if (i2 != 0 && !z) {
            vEWatermarkEntity.sequenceIn = 0L;
            vEWatermarkEntity.sequenceOut = i2;
        } else {
            vEWatermarkEntity.sequenceIn = 0L;
            vEWatermarkEntity.sequenceOut = 2147483647L;
        }
        vEWatermarkParam.setEntities((VEWatermarkParam.VEWatermarkEntity[]) C1697810uHb.LJIILJJIL(vEWatermarkEntity).toArray(new VEWatermarkParam.VEWatermarkEntity[0]));
        if (z && str2.length() > 0) {
            vEWatermarkParam.needExtFile = true;
            vEWatermarkParam.extFile = str2;
        }
        return new C1782020wTQ(vEWatermarkParam);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196 A[PHI: r11
      0x0196: PHI (r11v2 java.lang.String[]) = (r11v1 java.lang.String[]), (r11v5 java.lang.String[]) binds: [B:61:0x0192, B:6:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1781990wTN LIZ(java.lang.String r19, int[] r20, com.ss.android.ugc.aweme.creative.model.CreativeInfo r21, boolean r22, java.lang.String r23, int r24, java.util.List r25, X.InterfaceC2257101DWa r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1781980wTM.LIZ(java.lang.String, int[], com.ss.android.ugc.aweme.creative.model.CreativeInfo, boolean, java.lang.String, int, java.util.List, X.1DWa, boolean):X.0wTN");
    }

    public static final C1433300nOy LJ(int i, String str, InterfaceC2257101DWa interfaceC2257101DWa, int[] iArr, boolean z, String str2, boolean z2, CreativeInfo creativeInfo, String str3, int i2, boolean z3, boolean z4) {
        VEWatermarkParam vEWatermarkParamLIZ = C1781950wTJ.LIZ(C1781950wTJ.LIZIZ(creativeInfo, i, str, iArr), interfaceC2257101DWa, iArr, z, str2, z2, str3, i2, z3, z4, C13BV.INSTANCE);
        if (vEWatermarkParamLIZ != null) {
            return new C1433300nOy(vEWatermarkParamLIZ);
        }
        return null;
    }
}
