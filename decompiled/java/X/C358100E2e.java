package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0E2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358100E2e extends AbstractC371450EhL<C358120E2g> {
    public final C365910EWf LIZLLL;
    public final C0E48 LJ;
    public final C19EG LJFF;

    public C358100E2e(C0EI6 c0ei6) {
        this.LIZLLL = (C365910EWf) c0ei6.LIZ(C365910EWf.class);
        this.LJ = (C0E48) c0ei6.LIZ(C0E48.class);
        this.LJFF = (C19EG) c0ei6.LIZ(C19EG.class);
    }

    public static NLETrackSlot LJFF(NLEModel nLEModel) {
        VecNLETrackSlotSPtr sortedSlots;
        NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModel);
        NLETrackSlot nLETrackSlot = null;
        if (nLETrackLIZLLL == null || (sortedSlots = nLETrackLIZLLL.getSortedSlots()) == null) {
            return null;
        }
        Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLETrackSlot next = it2.next();
            if (C351220Dpo.LLLF(next)) {
                nLETrackSlot = next;
                break;
            }
        }
        return nLETrackSlot;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // X.AbstractC371450EhL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C358120E2g> r41) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358100E2e.LIZJ(X.05Vn):java.lang.Object");
    }
}
