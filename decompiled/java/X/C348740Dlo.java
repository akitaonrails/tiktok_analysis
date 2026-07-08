package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Dlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348740Dlo {
    public static final float LIZ = 1.0f / C0L7R.LJJIJIL;
    public static final List<String> LIZIZ = new ArrayList();
    public static final List<String> LIZJ = new ArrayList();

    public static final void LIZ(NLEModel nLEModel, Function1<? super NLETrackSlot, Unit> function1) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                    arrayList.add(nLETrack);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((NLETrackSlot) obj).getAIMatting() != null) {
                    arrayList3.add(obj);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                function1.invoke(it3.next());
            }
        }
    }

    public static final void LIZIZ(NLEModel nLEModel, Function2<? super NLETrack, ? super NLETrackSlot, Unit> function2) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack2 : arrayList) {
                VecNLETrackSlotSPtr slots = nLETrack2.getSlots();
                if (slots != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (nLETrackSlot.getAIMatting() != null) {
                            arrayList2.add(nLETrackSlot);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        function2.invoke(nLETrack2, it2.next());
                    }
                }
            }
        }
    }
}
