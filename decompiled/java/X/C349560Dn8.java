package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349560Dn8 {
    public static final NLETrack LIZ(NLEModel nLEModel) {
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        if (nLEModel == null) {
            return null;
        }
        Iterator<NLETrack> it2 = C351220Dpo.LJLLI(nLEModel).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getLayer() == 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null) {
            VecNLETrackSlotSPtr slots2 = nLETrack.getSlots();
            if (slots2 != null && slots2.size() == 0) {
                return nLETrack;
            }
            VecNLETrackSlotSPtr slots3 = nLETrack.getSlots();
            if ((slots3 == null || slots3.size() != 0) && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = slots.get(0)) != null && C349550Dn7.LJFF(nLETrackSlot)) {
                return nLETrack;
            }
        }
        return null;
    }

    public static final List<NLETrackSlot> LIZJ(C0E48 c0e48) {
        List<NLETrack> listLJ = LJ(C350870DpF.LJI(c0e48));
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().getSlots());
        }
        return arrayList;
    }

    public static final int LIZLLL(C0E48 c0e48) {
        List<NLETrackSlot> listLIZJ = LIZJ(c0e48);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZJ) {
            if (C349550Dn7.LJI((NLETrackSlot) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public static final List<NLETrack> LJ(NLEModel nLEModel) {
        List<NLETrack> listLJLJJLL = C351220Dpo.LJLJJLL(nLEModel);
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : listLJLJJLL) {
            if (Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "TEXT")) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final boolean LJFF(NLEModel nLEModel) {
        return !C349550Dn7.LIZJ(nLEModel).isEmpty();
    }

    public static final NLETrackSlot LIZIZ(C0E48 c0e48, String str) {
        NLETrackSlot nLETrackSlot = null;
        if (c0e48 == null) {
            return null;
        }
        Iterator<NLETrackSlot> it2 = LIZJ(c0e48).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLETrackSlot next = it2.next();
            if (TextUtils.equals(next.getUUID(), str)) {
                nLETrackSlot = next;
                break;
            }
        }
        return nLETrackSlot;
    }
}
