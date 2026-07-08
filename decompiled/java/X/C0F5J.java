package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0F5J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5J {
    public final C0F5K LIZ;
    public final C0F52 LIZIZ;
    public final InterfaceC384400F5i LIZJ;

    public final void LIZ() {
        View currentFocus;
        InputMethodManager inputMethodManager;
        C19EG activity = this.LIZ.LIZ.getActivity();
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null || (inputMethodManager = this.LIZ.LIZ.LLLLLJLJLL) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }

    public final void LIZIZ(long j) {
        boolean z;
        C0F5K c0f5k = this.LIZ;
        C0E48 c0e48 = c0f5k.LIZIZ;
        if (c0e48 != null) {
            VideoPublishEditModel videoPublishEditModel = c0f5k.LIZJ;
            if (videoPublishEditModel != null && C1416310mxZ.LJIILL(videoPublishEditModel)) {
                z = true;
            } else {
                z = false;
            }
            NLETrackSlot nLETrackSlot = null;
            if (z) {
                NLEModel nLEModelLIZJ = this.LIZ.LIZJ();
                if (nLEModelLIZJ != null) {
                    Iterator<NLETrackSlot> it2 = C349550Dn7.LIZJ(nLEModelLIZJ).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        NLETrackSlot next = it2.next();
                        NLETrackSlot nLETrackSlot2 = next;
                        long startTime = nLETrackSlot2.getStartTime();
                        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        if (startTime - j2 < j && j < nLETrackSlot2.getEndTime() + j2) {
                            nLETrackSlot = next;
                            break;
                        }
                    }
                    NLETrackSlot nLETrackSlot3 = nLETrackSlot;
                    if (nLETrackSlot3 != null) {
                        c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlot3, 0, null, false, 0, 254), "select_slot_event", false);
                        return;
                    }
                    return;
                }
                return;
            }
            NLETrack nLETrackLIZ = C349560Dn8.LIZ(C350870DpF.LJI(c0e48));
            if (nLETrackLIZ == null) {
                return;
            }
            Iterator<NLETrackSlot> it3 = nLETrackLIZ.getSlots().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                NLETrackSlot next2 = it3.next();
                NLETrackSlot nLETrackSlot4 = next2;
                long startTime2 = nLETrackSlot4.getStartTime();
                long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                if (startTime2 - j3 < j && j < nLETrackSlot4.getEndTime() + j3) {
                    nLETrackSlot = next2;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot5 = nLETrackSlot;
            if (nLETrackSlot5 == null) {
                return;
            }
            c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlot5, 0, null, false, 0, 254), "select_slot_event", false);
        }
    }

    public C0F5J(C0F5K c0f5k, C0F52 c0f52, C0F5I c0f5i) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f52;
        this.LIZJ = c0f5i;
    }
}
