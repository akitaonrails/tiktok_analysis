package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.NleClipTimeAdjustData;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0E3U, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3U implements C0F37 {
    public final /* synthetic */ C0E3T LIZ;

    @Override // X.C0F37
    public final C0E48 LIZ() {
        return this.LIZ.F4();
    }

    public final void LIZIZ() {
        NleClipTimeAdjustData nleClipTimeAdjustDataLIZ;
        C0E3T c0e3t = this.LIZ;
        C358370E3f c358370E3f = c0e3t.LLJJIJIL;
        C0E3V c0e3v = c0e3t.LLJJJJ;
        List<NLETrackSlot> list = c0e3v.LJFF;
        c358370E3f.LIZ = list;
        int size = ((ArrayList) list).size();
        int i = c0e3v.LJIIIIZZ;
        c358370E3f.LIZJ = (i < 0 || i >= size) ? null : (NLETrackSlot) ListProtector.get(c0e3v.LJFF, i);
        ((ArrayList) this.LIZ.LLJJIJIL.LJ).clear();
        FrameCacheViewModel.yQ2(this.LIZ.LLJJIJIIJIL);
        C0E3W c0e3wLIZIZ = this.LIZ.LLJJJJ.LIZIZ();
        if (c0e3wLIZIZ == null || (nleClipTimeAdjustDataLIZ = this.LIZ.LLJJJJ.LIZ()) == null) {
            return;
        }
        this.LIZ.i3(new AwS371S0200000_5(c0e3wLIZIZ, nleClipTimeAdjustDataLIZ, 129));
    }

    @Override // X.C0F37
    public final void j() {
        FrameCacheViewModel.yQ2(this.LIZ.LLJJIJIIJIL);
    }

    @Override // X.C0F37
    public final C358160E2k k() {
        return this.LIZ.LLJJJ;
    }

    public C0E3U(C0E3T c0e3t) {
        this.LIZ = c0e3t;
    }

    @Override // X.C0F37
    public final void l(long j) {
        C0E5D c0e5dH4 = this.LIZ.H4();
        if (c0e5dH4 != null) {
            c0e5dH4.Y3(C351220Dpo.LLLLLLL(j));
        }
        this.LIZ.LLJJJIL.LIZ();
        this.LIZ.LLJJJIL.LIZIZ(j, C0E3L.LIZ, true, true);
    }

    @Override // X.C0F37
    public final void m(long j) {
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        C0E5D c0e5dH4 = this.LIZ.H4();
        if (c0e5dH4 != null) {
            c0e5dH4.Y3(C351220Dpo.LLLLLLL(j));
        }
        C0E3V c0e3v = this.LIZ.LLJJJJ;
        NleClipTimeAdjustData nleClipTimeAdjustDataLIZ = c0e3v.LIZ();
        if (nleClipTimeAdjustDataLIZ != null) {
            long j2 = nleClipTimeAdjustDataLIZ.duration;
            nleClipTimeAdjustDataLIZ.setStartTime(j);
            nleClipTimeAdjustDataLIZ.setEndTime(j + j2);
            int size = ((ArrayList) c0e3v.LJFF).size();
            int i = c0e3v.LJIIIIZZ;
            if (i >= 0 && i < size && (nLETrackSlot = (NLETrackSlot) ListProtector.get(c0e3v.LJFF, i)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                long duration = resource.getDuration();
                if (nleClipTimeAdjustDataLIZ.endTime > duration) {
                    nleClipTimeAdjustDataLIZ.setEndTime(duration);
                    nleClipTimeAdjustDataLIZ.setStartTime(duration - nleClipTimeAdjustDataLIZ.duration);
                }
            }
        }
    }

    @Override // X.C0F37
    public final void n(int i) {
        C0E5D c0e5dH4;
        C0E3T c0e3t = this.LIZ;
        if (c0e3t.LLJJJJJIL != i) {
            c0e3t.LLJJJJJIL = i;
            c0e3t.i3(new AwS20S0001000_5(i, 17));
            C0E3V c0e3v = this.LIZ.LLJJJJ;
            c0e3v.LJIIIIZZ = i;
            c0e3v.LIZJ();
            C0E48 c0e48 = c0e3v.LIZ;
            if (c0e48 != null) {
                C350110Do1.LJII(C350870DpF.LJI(c0e48));
                C350410DoV.LIZ(c0e48.LLFII().LJI(), false, true);
            }
            LIZIZ();
            NleClipTimeAdjustData nleClipTimeAdjustDataLIZ = this.LIZ.LLJJJJ.LIZ();
            if (nleClipTimeAdjustDataLIZ != null) {
                C0E3T c0e3t2 = this.LIZ;
                C0E5D c0e5dH42 = c0e3t2.H4();
                if (c0e5dH42 != null) {
                    c0e5dH42.Y3(C351220Dpo.LLLLLLL(nleClipTimeAdjustDataLIZ.startTime));
                }
                c0e3t2.LLJJJIL.LIZIZ(nleClipTimeAdjustDataLIZ.startTime, new C0FX3(c0e3t2, 10), true, true);
            }
            C0E3W c0e3wLIZIZ = this.LIZ.LLJJJJ.LIZIZ();
            if (c0e3wLIZIZ != null && (c0e5dH4 = this.LIZ.H4()) != null) {
                c0e5dH4.y2(C351220Dpo.LLLLLLL(c0e3wLIZIZ.LJ));
            }
        }
    }

    @Override // X.C0F37
    public final void o(InterfaceC358390E3h interfaceC358390E3h) {
        C0E3T c0e3t = this.LIZ;
        C358370E3f c358370E3f = c0e3t.LLJJIJIL;
        c358370E3f.LIZIZ = interfaceC358390E3h;
        C370920EgU c370920EgUWQ2 = c0e3t.LLJJIJIIJIL.wQ2();
        C23250099c.LIZLLL(c370920EgUWQ2, c370920EgUWQ2.LLJILJIL, null, new C358360E3e(c370920EgUWQ2, c358370E3f, null), 2);
    }
}
