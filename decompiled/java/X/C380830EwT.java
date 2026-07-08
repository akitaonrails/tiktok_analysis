package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEMattingStroke;
import com.ss.ugc.android.editor.core.model.StrokeParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380830EwT extends C09AY implements Function2<List<? extends C380780EwO>, Boolean, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C380820EwS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380830EwT(long j, C380820EwS c380820EwS) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = c380820EwS;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends C380780EwO> list, Boolean bool) {
        NLESegmentAIMatting segment;
        String params;
        NLEResourceNode stroke;
        C380780EwO c380780EwOLIZJ;
        String resourceId;
        VecNLEMattingStroke strokes;
        NLEMattingStroke nLEMattingStroke;
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLEAIMatting aIMatting;
        List<? extends C380780EwO> list2 = list;
        C376300EpA.LIZIZ("load_cutout_stroke_panel", null, null, null, bool.booleanValue(), System.currentTimeMillis() - this.LL, 0);
        if (this.LLILLJJLI.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            C357270DzZ c357270DzZZ4 = this.LLILLJJLI.Z4();
            C380780EwO c380780EwO = null;
            if (c357270DzZZ4 != null && (nLETrackSlotLJIIJJI = c357270DzZZ4.LJIIJJI()) != null && (aIMatting = nLETrackSlotLJIIJJI.getAIMatting()) != null) {
                segment = aIMatting.getSegment();
            } else {
                segment = null;
            }
            NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
            if (nLESegmentAIMattingDynamicCast != null && (strokes = nLESegmentAIMattingDynamicCast.getStrokes()) != null && (nLEMattingStroke = (NLEMattingStroke) C13LP.LJJJLZIJ(0, strokes)) != null) {
                params = nLEMattingStroke.getParams();
                stroke = nLEMattingStroke.getStroke();
            } else {
                params = null;
                stroke = null;
            }
            StrokeParams strokeParams = (StrokeParams) C309390CAv.LIZ(params, StrokeParams.class);
            Iterator<? extends C380780EwO> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C380780EwO next = it2.next();
                String str = next.LJ;
                if (stroke != null) {
                    resourceId = stroke.getResourceId();
                } else {
                    resourceId = null;
                }
                if (Intrinsics.LJFF(str, resourceId)) {
                    c380780EwO = next;
                    break;
                }
            }
            C380780EwO c380780EwO2 = c380780EwO;
            if (c380780EwO2 != null) {
                c380780EwOLIZJ = C383430F1p.LIZJ(c380780EwO2, strokeParams);
            } else {
                c380780EwOLIZJ = C380780EwO.LJIIJJI;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C380780EwO c380780EwOLIZ : list2) {
                if (Intrinsics.LJFF(c380780EwOLIZ.LIZLLL, c380780EwOLIZJ.LIZLLL)) {
                    c380780EwOLIZ = C380780EwO.LIZ(c380780EwOLIZJ, null, true, null, null, 0, null, 1983);
                }
                arrayList.add(c380780EwOLIZ);
            }
            if (this.LLILLJJLI.T2().LIZ) {
                C380820EwS c380820EwS = this.LLILLJJLI;
                c380820EwS.i3(new AwS584S0100000_5(c380820EwS, 479));
            }
            this.LLILLJJLI.i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 482));
            this.LLILLJJLI.i3(AFwS234S0000000_5.get$arr$(242));
            this.LLILLJJLI.i3(AFwS234S0000000_5.get$arr$(243));
        }
        return Unit.LIZ;
    }
}
