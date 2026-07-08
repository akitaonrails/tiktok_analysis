package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0DpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350890DpH {
    public static final void LIZJ(C0E48 c0e48) {
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
        }
        C350870DpF.LIZJ(c0e48, C051R.LIZIZ(new C0E1X(C0E1V.ADD_AUDIO.getNameId(), null, null, null, null, 30)));
    }

    public static final NLETrack LIZLLL(C0E48 c0e48) {
        List<NLETrack> listLJFF = C349930Dnj.LJFF(C350870DpF.LJI(c0e48));
        if (((ArrayList) listLJFF).isEmpty()) {
            return null;
        }
        return (NLETrack) ListProtector.get(listLJFF, 0);
    }

    public static final boolean LJ(C0E48 c0e48) {
        NLETrack next;
        VecNLETrackSlotSPtr sortedSlots;
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48).getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    NLETrack nLETrack = next;
                    if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack2 = next;
            if (nLETrack2 != null && (sortedSlots = nLETrack2.getSortedSlots()) != null && sortedSlots.size() > 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJFF(C0E48 c0e48) {
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
        }
        C350870DpF.LIZJ(c0e48, C051R.LIZIZ(new C0E1X(C0E1V.REPLACE_AUDIO.getNameId(), null, null, null, null, 30)));
    }

    public static final void LIZ(C0E48 c0e48, C0E1X c0e1x) {
        C350870DpF.LIZJ(c0e48, C051R.LIZIZ(c0e1x));
    }

    public static final void LIZIZ(C0E48 c0e48, String str) {
        C350870DpF.LIZJ(c0e48, C051R.LIZIZ(new C0E1X(str, null, null, null, null, 30)));
    }
}
