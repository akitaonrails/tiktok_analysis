package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;

/* JADX INFO: renamed from: X.0Dke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348020Dke {
    public static boolean LIZ(NLETrack nLETrack) {
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType nLETrackType = NLETrackType.EFFECT;
        if (trackType == nLETrackType || nLETrack.getExtraTrackType() == nLETrackType) {
            return true;
        }
        String strLJIIJ = C348350DlB.LJIIJ(nLETrack);
        if (strLJIIJ != null) {
            int iHashCode = strLJIIJ.hashCode();
            if (iHashCode != 2251950) {
                if (iHashCode != 2571565) {
                    if (iHashCode != 69775675 || !strLJIIJ.equals("IMAGE")) {
                        return false;
                    }
                } else if (!strLJIIJ.equals("TEXT")) {
                    return false;
                }
            } else if (!strLJIIJ.equals("INFO")) {
                return false;
            }
            return true;
        }
        return false;
    }
}
