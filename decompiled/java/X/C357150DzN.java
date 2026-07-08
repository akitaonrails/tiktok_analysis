package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357150DzN {
    public static final String LIZIZ(InfoStickerModel infoStickerModel) {
        String strLIZIZ = C051R.LIZIZ(infoStickerModel);
        if (strLIZIZ == null) {
            return "";
        }
        return strLIZIZ;
    }

    public static final NLETrackSlot LIZ(InfoStickerModel infoStickerModel, NLEModel nLEModel) {
        boolean z;
        NLETrackSlot next;
        String uuid = infoStickerModel.getUuid();
        if (uuid != null && uuid.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(next.getUUID(), infoStickerModel.getUuid())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot = next;
            if (nLETrackSlot != null) {
                return nLETrackSlot;
            }
        }
        return null;
    }
}
