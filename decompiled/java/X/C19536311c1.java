package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.11c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19536311c1 {
    public final NLETrackSlot LIZ;
    public final NLEModel LIZIZ;
    public Effect LIZJ;
    public String LIZLLL;
    public String LJ;
    public List<? extends List<Double>> LJFF;
    public String LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public float LJII = 1.0f;
    public String LJIILIIL = "";

    public final String LIZ() {
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        NLETrackSlot nLETrackSlot2 = this.LIZ;
        if (nLETrackSlot2 != null) {
            NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
            if (mainSegment2 == null || (resource2 = mainSegment2.getResource()) == null) {
                return null;
            }
            return resource2.getResourceFile();
        }
        NLEModel nLEModel = this.LIZIZ;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null || (nLETrack = (NLETrack) C13LP.LJJJLL(tracks)) == null || (slots = nLETrack.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (resource = mainSegment.getResource()) == null) {
            return null;
        }
        return resource.getResourceFile();
    }

    public final String LIZIZ() {
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr slots;
        NLENode nLENode;
        NLETrackSlot nLETrackSlot = this.LIZ;
        if (nLETrackSlot != null) {
            return nLETrackSlot.getUUID();
        }
        NLEModel nLEModel = this.LIZIZ;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null || (nLETrack = (NLETrack) C13LP.LJJJLL(tracks)) == null || (slots = nLETrack.getSlots()) == null || (nLENode = (NLENode) C13LP.LJJJLL(slots)) == null) {
            return null;
        }
        return nLENode.getUUID();
    }

    public C19536311c1(NLETrackSlot nLETrackSlot, Effect effect, NLEModel nLEModel) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = nLEModel;
        this.LIZJ = effect;
    }
}
