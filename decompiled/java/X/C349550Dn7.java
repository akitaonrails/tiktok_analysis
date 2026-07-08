package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349550Dn7 {
    public static final void LIZ(NLEModel nLEModel) {
        for (NLETrack nLETrack : (ArrayList) C351220Dpo.LJLLI(nLEModel)) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                if (LJFF(nLETrackSlot)) {
                    arrayList.add(nLETrackSlot);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nLETrack.removeSlot((NLETrackSlot) it2.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList<NLETrackSlot> LIZJ(NLEModel nLEModel) {
        ?? arrayList;
        List<NLETrack> listLJLLI = C351220Dpo.LJLLI(nLEModel);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) listLJLLI).iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : slots) {
                    if (LJFF(nLETrackSlot)) {
                        arrayList.add(nLETrackSlot);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(arrayList, arrayList2);
        }
        return new ArrayList<>(C13LP.LJLLLL(new AComparatorS24S0000000_5(136), arrayList2));
    }

    public static final ArrayList<NLETrack> LJ(NLEModel nLEModel) {
        ArrayList<NLETrack> arrayList = new ArrayList<>();
        for (NLETrack nLETrack : C351220Dpo.LJLLI(nLEModel)) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            if (slots != null && !slots.isEmpty()) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (LJFF(it2.next())) {
                        arrayList.add(nLETrack);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean LJFF(NLETrackSlot nLETrackSlot) {
        return Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "SUBTITLE");
    }

    public static final boolean LJI(NLETrackSlot nLETrackSlot) {
        return Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "TEXT_STICKER");
    }

    public static final NLETrackSlot LIZIZ(NLEModel nLEModel, String str) {
        NLETrackSlot nLETrackSlot;
        Iterator it2 = ((ArrayList) C351220Dpo.LJLLI(nLEModel)).iterator();
        while (true) {
            nLETrackSlot = null;
            if (!it2.hasNext()) {
                break;
            }
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    NLETrackSlot next = it3.next();
                    if (Intrinsics.LJFF(next.getUUID(), str)) {
                        nLETrackSlot = next;
                        break;
                    }
                }
                nLETrackSlot = nLETrackSlot;
                if (nLETrackSlot != null) {
                    break;
                }
            }
        }
        return nLETrackSlot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x000a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.ies.nle.editor_jni.NLETrack LIZLLL(com.bytedance.ies.nle.editor_jni.NLEModel r4, java.lang.String r5) {
        /*
            java.util.List r0 = X.C351220Dpo.LJLLI(r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
        La:
            boolean r1 = r4.hasNext()
            r0 = 0
            if (r1 == 0) goto L3b
            java.lang.Object r3 = r4.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r3 = (com.bytedance.ies.nle.editor_jni.NLETrack) r3
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r3.getSlots()
            if (r0 == 0) goto La
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            java.lang.String r0 = r0.getUUID()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L21
            if (r1 == 0) goto La
            return r3
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349550Dn7.LIZLLL(com.bytedance.ies.nle.editor_jni.NLEModel, java.lang.String):com.bytedance.ies.nle.editor_jni.NLETrack");
    }
}
