package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Dvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354870Dvh {
    public static final float LIZIZ() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int LIZ(int i) {
        return (int) ((i * LIZIZ()) + 0.5f);
    }

    public static final NLETrackSlot LIZJ(NLEModel nLEModel, String str) {
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                if (TextUtils.equals(nLETrackSlot.getUUID(), str)) {
                    return nLETrackSlot;
                }
            }
        }
        return null;
    }
}
