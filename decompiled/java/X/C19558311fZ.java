package X;

import androidx.lifecycle.LiveData;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.11fZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19558311fZ implements InterfaceC19560711fx {
    public VEEditor.VEState LIZ;
    public final /* synthetic */ C19557511fR LIZIZ;

    public C19558311fZ(C19557511fR c19557511fR) {
        this.LIZIZ = c19557511fR;
    }

    @Override // X.InterfaceC19560711fx
    public final void LIZ(int i, int i2, int i3) {
        C1452730nuJ c1452730nuJ;
        C19557511fR c19557511fR = this.LIZIZ;
        if (c19557511fR.LJJIII != null && i2 == 1) {
            long j = i;
            long jLIZ = c19557511fR.LJJIIJ.LIZ(j);
            if (i3 == 1) {
                this.LIZ = this.LIZIZ.LJJIII.getState();
                ((LiveData) this.LIZIZ.LJJJJLI.LLJJIJIIJIL.getValue()).setValue(Boolean.TRUE);
                c1452730nuJ = C1452730nuJ.LIZIZ(jLIZ);
            } else if (i3 == 3) {
                c1452730nuJ = C1452730nuJ.LIZIZ(jLIZ);
            } else if (i3 == 2) {
                c1452730nuJ = new C1452730nuJ(3, jLIZ, new InterfaceC1464180oCm() { // from class: X.11fk
                    @Override // X.InterfaceC1464180oCm
                    public final void onSeekDone(int i4) {
                        ((LiveData) this.LIZ.LIZIZ.LJJJJLI.LLJJIJIIJIL.getValue()).postValue(Boolean.FALSE);
                    }
                });
            } else {
                throw new AssertionError();
            }
            this.LIZIZ.LIZLLL.setValue(c1452730nuJ);
            C19557511fR c19557511fR2 = this.LIZIZ;
            C19559311fj c19559311fj = c19557511fR2.LJJJJ;
            c19559311fj.LIZIZ = jLIZ;
            c19559311fj.LIZJ = j;
            if (i3 == 2 && this.LIZ == VEEditor.VEState.STARTED) {
                c19557511fR2.LJIIIZ();
                this.LIZ = null;
            }
            if (this.LIZIZ.LJJIIJ.LIZJ()) {
                this.LIZIZ.LJJJJLI.LLJJJ = true;
            } else {
                this.LIZIZ.LJJJJLI.LLJJJ = false;
            }
        }
    }
}
