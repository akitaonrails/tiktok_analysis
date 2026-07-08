package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477150oXh {
    public static final /* synthetic */ int LIZ = 0;

    public static C1477210oXn LIZ(InterfaceC1477240oXq interfaceC1477240oXq, List list, SimVideoUrlModel simVideoUrlModel, SimBitRate simBitRate, Boolean bool) {
        boolean z;
        boolean z2;
        String urlKey;
        int codecType;
        String fileCheckSum;
        int qualityType;
        int codecType2;
        int fps;
        int i;
        boolean z3;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String gearName = null;
        if (z) {
            return null;
        }
        if (((Boolean) C1474810oTv.S.getValue()).booleanValue() && Intrinsics.LJFF(bool, Boolean.FALSE)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String[] strArr = (String[]) ((ArrayList) C1477130oXf.LJIIIZ(simVideoUrlModel.getCreateTime(), simVideoUrlModel.getCdnUrlExpired(), (String[]) list.toArray(new String[0]))).toArray(new String[0]);
        if (simBitRate == null || (urlKey = simBitRate.getUrlKey()) == null) {
            urlKey = simVideoUrlModel.getUrlKey();
        }
        C1477230oXp c1477230oXp = new C1477230oXp();
        c1477230oXp.LIZ = strArr;
        if (simBitRate != null) {
            codecType = simBitRate.getCodecType();
        } else {
            codecType = simVideoUrlModel.getCodecType();
        }
        c1477230oXp.LIZIZ = codecType;
        c1477230oXp.LIZJ = urlKey;
        c1477230oXp.LIZLLL = simBitRate;
        if (simBitRate == null || (fileCheckSum = simBitRate.getChecksum()) == null) {
            fileCheckSum = simVideoUrlModel.getFileCheckSum();
        }
        c1477230oXp.LJ = fileCheckSum;
        int iLIZLLL = -1;
        if (z2) {
            i = -1;
        } else {
            C1477290oXv c1477290oXv = C1477280oXu.LIZ;
            String sourceId = simVideoUrlModel.getSourceId();
            long duration = (long) simVideoUrlModel.getDuration();
            if (simBitRate != null) {
                qualityType = simBitRate.getQualityType();
                gearName = simBitRate.getGearName();
            } else {
                qualityType = -1;
            }
            float aspectRatio = simVideoUrlModel.getAspectRatio();
            if (simBitRate != null) {
                codecType2 = simBitRate.getCodecType();
                fps = (int) simBitRate.getFps();
            } else {
                codecType2 = 0;
                fps = 0;
            }
            i = -1;
            iLIZLLL = c1477290oXv.LIZLLL(aspectRatio, qualityType, codecType2, fps, duration, simBitRate, simVideoUrlModel, sourceId, gearName, false);
        }
        c1477230oXp.LJI = iLIZLLL;
        if (iLIZLLL == 100) {
            z3 = true;
        } else {
            z3 = false;
        }
        c1477230oXp.LJFF = z3;
        c1477230oXp.LJII = i;
        C1477400oY6.LJJJJI.LJJIII(c1477230oXp.LIZJ, c1477230oXp.LJ);
        simVideoUrlModel.setHitBitrate(simBitRate);
        C1477210oXn c1477210oXn = new C1477210oXn(C1475700oVM.LIZ().LJJIII(simVideoUrlModel, c1477230oXp.LIZJ, c1477230oXp.LIZ), interfaceC1477240oXq);
        c1477210oXn.LIZJ = c1477230oXp;
        return c1477210oXn;
    }
}
