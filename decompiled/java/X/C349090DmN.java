package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0DmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349090DmN {
    public static String LIZ(C19536311c1 c19536311c1) {
        String strLJ;
        String strLJ2;
        NLEModel nLEModel = c19536311c1.LIZIZ;
        if (nLEModel != null) {
            Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
                if (it3.hasNext()) {
                    NLETrackSlot next = it3.next();
                    if (next == null || (strLJ2 = C348930Dm7.LJ(next)) == null) {
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(next.getUUID());
                    sbLIZ.append(strLJ2);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            return null;
        }
        NLETrackSlot nLETrackSlot = c19536311c1.LIZ;
        if (nLETrackSlot == null || (strLJ = C348930Dm7.LJ(nLETrackSlot)) == null) {
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(nLETrackSlot.getUUID());
        sbLIZ2.append(strLJ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
