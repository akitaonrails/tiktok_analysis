package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Dlq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348760Dlq implements InterfaceC347150DjF {
    public final Function2<NLETrack, NLETrackSlot, Boolean> LIZ;
    public final List<NLETrack> LIZIZ = new ArrayList();
    public final List<NLETrackSlot> LIZJ = new ArrayList();
    public final Set<String> LIZLLL = new LinkedHashSet();
    public final Set<String> LJ = new LinkedHashSet();

    @Override // X.InterfaceC347150DjF
    public final List<NLETrackSlot> LIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C348760Dlq(Function2<? super NLETrack, ? super NLETrackSlot, Boolean> function2) {
        this.LIZ = function2;
    }

    @Override // X.InterfaceC347150DjF
    public final void LIZIZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        Boolean boolInvoke = this.LIZ.invoke(nLETrack, nLETrackSlot);
        if (boolInvoke != null && boolInvoke.booleanValue()) {
            if (!this.LIZLLL.contains(nLETrack.getUUID())) {
                ((ArrayList) this.LIZIZ).add(nLETrack);
                this.LIZLLL.add(nLETrack.getUUID());
            }
            if (nLETrackSlot != null && !this.LJ.contains(nLETrackSlot.getUUID())) {
                ((ArrayList) this.LIZJ).add(nLETrackSlot);
                this.LJ.add(nLETrack.getUUID());
            }
        }
    }
}
