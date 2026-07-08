package X;

import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileSettings;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0MbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571620MbQ {
    public static VEVideoEncodeSettings LIZIZ(CutVideoCompileSettings cutVideoCompileSettings) {
        C1780100wQK c1780100wQK = new C1780100wQK(2);
        c1780100wQK.LIZIZ.isSupportHWEncoder = cutVideoCompileSettings.LIZLLL;
        c1780100wQK.LJI(cutVideoCompileSettings.LJ);
        c1780100wQK.LJFF(cutVideoCompileSettings.LJFF);
        c1780100wQK.LJIIJ(cutVideoCompileSettings.LIZ, cutVideoCompileSettings.LIZIZ);
        c1780100wQK.LJIIIIZZ(cutVideoCompileSettings.LJII);
        int i = cutVideoCompileSettings.LJIIIIZZ;
        VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
        vEVideoEncodeSettings.resizeMode = i;
        vEVideoEncodeSettings.bitrateMode = cutVideoCompileSettings.LJI;
        vEVideoEncodeSettings.compileType = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4;
        c1780100wQK.LJII(cutVideoCompileSettings.LIZJ);
        c1780100wQK.LIZIZ.rotate = cutVideoCompileSettings.LJIIIZ;
        if (cutVideoCompileSettings.LJIIJ.length() > 0) {
            c1780100wQK.LIZIZ.externalSettingsJsonStr = cutVideoCompileSettings.LJIIJ;
        }
        Float f = cutVideoCompileSettings.LJIIJJI;
        if (f != null) {
            c1780100wQK.LIZIZ.resizeX = f.floatValue();
        }
        Float f2 = cutVideoCompileSettings.LJIIL;
        if (f2 != null) {
            c1780100wQK.LIZIZ.resizeY = f2.floatValue();
        }
        return c1780100wQK.LIZ();
    }

    public static ROTATE_DEGREE LIZJ(int i) {
        if (i != 90) {
            if (i != 180) {
                if (i != 270) {
                    return ROTATE_DEGREE.ROTATE_NONE;
                }
                return ROTATE_DEGREE.ROTATE_270;
            }
            return ROTATE_DEGREE.ROTATE_180;
        }
        return ROTATE_DEGREE.ROTATE_90;
    }

    public static void LIZ(InterfaceC1452170ntP interfaceC1452170ntP, List list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                EditVideoSegment editVideoSegment = (EditVideoSegment) it2.next();
                String strLIZ = C0WL2.LIZ(editVideoSegment.getVideoPath());
                arrayList2.add(Integer.valueOf((int) editVideoSegment.getVideoFileInfo().getDuration()));
                arrayList.add(editVideoSegment.getVideoPath());
                arrayList3.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getWidth()));
                arrayList4.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getHeight()));
                arrayList5.add(strLIZ);
            }
            interfaceC1452170ntP.addMetadata("description", C580200MpG.LIZJ(false, true, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, null));
        }
    }
}
