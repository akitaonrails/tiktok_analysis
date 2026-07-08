package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC356490DyJ implements C0E62 {
    public final C0E60 LIZ;

    @Override // X.C0E62
    public Pair<NLETrackSlot, Long> LIZJ() {
        return null;
    }

    @Override // X.C0E62
    public void LIZLLL() {
    }

    @Override // X.C0E62
    public void LJ(Pair<? extends NLETrackSlot, Long> pair) {
    }

    public boolean LJFF(C0E48 c0e48) {
        return false;
    }

    @Override // X.C0E62
    public void LIZIZ() {
        C0E48 c0e48 = this.LIZ.LIZIZ;
        if (c0e48 == null) {
            return;
        }
        if (c0e48.getPlayer().isPlaying()) {
            c0e48.getPlayer().pause(false);
        }
        c0e48.getPlayer().LJIJJLI();
        if (LJFF(c0e48)) {
            return;
        }
        C350870DpF.LIZ(c0e48, false);
    }

    public void LJI() {
        VecNLETrackSPtr tracks;
        C0E60 c0e60 = this.LIZ;
        C0E48 c0e48 = c0e60.LIZIZ;
        if (c0e48 != null) {
            boolean zResetHead = c0e48.LLFII().LJI().resetHead();
            NLEModel model = c0e48.LLFII().LJI().getModel();
            boolean z = model == null || (tracks = model.getTracks()) == null || tracks.size() == 0;
            if (!zResetHead || z) {
                C356530DyN.LIZIZ(C0E5P.LIZIZ, c0e60.LIZ, c0e48.LLFII().LJI().restore(c0e60.LIZLLL).swigValue() != NLEError.SUCCESS.swigValue() ? "restore failed " : "restore success");
            }
            ((LinkedHashMap) C350110Do1.LIZJ.LIZ).clear();
        }
    }

    @Override // X.C0E62
    public void LIZ() {
        LJI();
    }

    public AbstractC356490DyJ(C0E60 c0e60) {
        this.LIZ = c0e60;
    }
}
