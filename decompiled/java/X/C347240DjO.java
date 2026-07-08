package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0DjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347240DjO {
    public static final int LIZ(NLEModel nLEModel, NLETrackType nLETrackType) {
        int iMax;
        switch (C347250DjP.LIZ[nLETrackType.ordinal()]) {
            case 3:
                iMax = LSPassThroughRecordSizeConfig.DEFAULT;
                break;
            case 4:
                iMax = 2000;
                break;
            case 5:
                iMax = LivePreCreateNextRoomPlayer.ENABLE;
                break;
            case 6:
                iMax = 4000;
                break;
            case 7:
                iMax = 5000;
                break;
            case 8:
                iMax = 7000;
                break;
            default:
                iMax = 0;
                break;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C350870DpF.LJIIIIZZ(nLETrack) == nLETrackType) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                if (slots != null) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        iMax = Math.max(iMax, it3.next().getLayer());
                    }
                }
            }
        }
        return iMax + 1;
    }
}
