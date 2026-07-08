package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.NleClipTimeAdjustData;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.SelectSegmentInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0E3V, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3V {
    public final C0E48 LIZ;
    public NLETrack LIZLLL;
    public NLETrack LJ;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public final List<NleClipTimeAdjustData> LIZIZ = new ArrayList();
    public final ArrayList<C0E3W> LIZJ = new ArrayList<>();
    public final List<NLETrackSlot> LJFF = new ArrayList();
    public final List<NLETrackSlot> LJI = new ArrayList();
    public final ArrayList<SelectSegmentInfo> LJII = new ArrayList<>();

    public final NleClipTimeAdjustData LIZ() {
        int size = this.LIZIZ.size();
        int i = this.LJIIIIZZ;
        if (i < 0 || i >= size) {
            return null;
        }
        return (NleClipTimeAdjustData) ListProtector.get(this.LIZIZ, i);
    }

    public final C0E3W LIZIZ() {
        int size = this.LIZJ.size();
        int i = this.LJIIIIZZ;
        if (i < 0 || i >= size) {
            return null;
        }
        return (C0E3W) ListProtector.get(this.LIZJ, i);
    }

    public final void LIZJ() {
        NLETrack nLETrack = this.LIZLLL;
        if (nLETrack == null) {
            nLETrack = new NLETrack();
            nLETrack.setMainTrack(true);
        }
        this.LIZLLL = nLETrack;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LJFF, this.LJIIIIZZ);
        NLETrack nLETrack2 = this.LIZLLL;
        if (nLETrack2 != null) {
            nLETrack2.clearSlot();
        }
        NLETrack nLETrack3 = this.LIZLLL;
        if (nLETrack3 != null) {
            nLETrack3.addSlot(nLETrackSlot);
        }
        NLETrack nLETrack4 = this.LIZLLL;
        if (nLETrack4 != null) {
            nLETrack4.setDuration(nLETrackSlot.getDuration());
        }
        NLETrack nLETrack5 = this.LJ;
        if (nLETrack5 == null) {
            nLETrack5 = new NLETrack();
            nLETrack5.setMainTrack(false);
            nLETrack5.setExtra("track_type", "audio");
            nLETrack5.setExtraTrackType(NLETrackType.AUDIO);
            nLETrack5.setLayer(0);
            nLETrack5.setExtra("AudioTrackType", "ORIGIN");
        }
        this.LJ = nLETrack5;
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ListProtector.get(this.LJI, this.LJIIIIZZ);
        if (nLETrackSlot2 != null) {
            NLETrack nLETrack6 = this.LJ;
            if (nLETrack6 != null) {
                nLETrack6.addSlot(nLETrackSlot2);
            }
            NLETrack nLETrack7 = this.LJ;
            if (nLETrack7 != null) {
                nLETrack7.setDuration(nLETrackSlot2.getDuration());
            }
        }
    }

    public C0E3V(C0E48 c0e48) {
        this.LIZ = c0e48;
    }
}
