package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Diq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346900Diq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4473));

    public static boolean LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        NLETrack nLETrack = null;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLETrack next = it2.next();
                if (C351220Dpo.LLILL(next)) {
                    nLETrack = next;
                    break;
                }
            }
        }
        if (nLETrack != null || ((Boolean) LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}
