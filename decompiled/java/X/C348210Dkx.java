package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348210Dkx {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(NLEModel nLEModel, Function2<? super NLETrackSlot, ? super NLETrackSlot, Unit> function2) {
        VecNLETrackSPtr tracks;
        Object next;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                if (slots != null) {
                    ArrayList<NLENode> arrayList2 = new ArrayList();
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (C123100dR.LIZ(nLETrackSlot.getExtra("freeze_from_uuid"))) {
                            arrayList2.add(nLETrackSlot);
                        }
                    }
                    for (NLENode nLENode : arrayList2) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList3);
                        }
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (Intrinsics.LJFF(((NLENode) next).getUUID(), nLENode.getExtra("freeze_from_uuid"))) {
                                    break;
                                }
                            } else {
                                next = 0;
                                break;
                            }
                        }
                        function2.invoke(nLENode, next);
                    }
                }
            }
        }
    }
}
