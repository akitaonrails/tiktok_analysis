package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0EaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367190EaT implements InterfaceC367810EbT {
    public final C0E48 LIZ;
    public final C367850EbX LIZIZ;
    public final C367220EaW LIZJ;
    public final C367160EaQ LIZLLL;
    public final C367170EaR LJ;
    public final C367180EaS LJFF;

    @Override // X.InterfaceC367810EbT
    public final void LIZ(C367200EaU c367200EaU) {
        this.LIZJ.LJIJJLI = c367200EaU;
        this.LIZLLL.LJIIL = c367200EaU;
        this.LJ.LJIIL = c367200EaU;
        this.LJFF.LJIIIZ = c367200EaU;
    }

    public C367190EaT(C19EG c19eg, C0E48 c0e48) {
        this.LIZ = c0e48;
        this.LIZIZ = new C367850EbX(c19eg);
        this.LIZJ = new C367220EaW(c19eg);
        this.LIZLLL = new C367160EaQ(c19eg, c0e48);
        this.LJ = new C367170EaR(c19eg, c0e48);
        this.LJFF = new C367180EaS(c19eg);
    }

    @Override // X.InterfaceC367810EbT
    public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
        NLETrack trackBySlot;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null && (trackBySlot = C350870DpF.LJI(c0e48).getTrackBySlot(nLETrackSlot)) != null && !trackBySlot.getMainTrack()) {
            if (C351220Dpo.LLLIIL(trackBySlot)) {
                this.LIZIZ.LIZIZ(interfaceC368560Ecg, nLETrackSlot, rectF, canvas, i, j);
                return;
            }
            if (C351220Dpo.LLILLJJLI(trackBySlot)) {
                this.LIZJ.LIZIZ(interfaceC368560Ecg, nLETrackSlot, rectF, canvas, i, 0L);
                return;
            }
            if (C351220Dpo.LLLJL(trackBySlot)) {
                this.LIZLLL.LIZIZ(interfaceC368560Ecg, nLETrackSlot, rectF, canvas, i, 0L);
                return;
            }
            if (!C351220Dpo.LLJJIII(trackBySlot) && !C351220Dpo.LLLLILI(trackBySlot)) {
                if (!C351220Dpo.LLJLLIL(trackBySlot)) {
                    return;
                }
                this.LJFF.LIZIZ(interfaceC368560Ecg, nLETrackSlot, rectF, canvas, i, 0L);
                return;
            }
            this.LJ.LIZIZ(interfaceC368560Ecg, nLETrackSlot, rectF, canvas, i, 0L);
        }
    }
}
