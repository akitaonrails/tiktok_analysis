package X;

import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0kVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321980kVQ implements InterfaceC1318090kP9 {
    public final /* synthetic */ C1318160kPG LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C1325710kbR LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C1322110kVd LJ;

    @Override // X.InterfaceC1318090kP9
    public final void LIZ(Bitmap bitmap) {
        InterfaceC1320380kSq interfaceC1320380kSqLJIIJJI;
        if (bitmap != null) {
            C1318160kPG c1318160kPG = this.LIZ;
            int i = c1318160kPG.LJ;
            int i2 = c1318160kPG.LJFF;
            if (this.LJ.getHierarchy() != null) {
                interfaceC1320380kSqLJIIJJI = this.LJ.getHierarchy().LJIIJJI();
            } else {
                interfaceC1320380kSqLJIIJJI = InterfaceC1320380kSq.LIZJ;
            }
            C1317740kOa c1317740kOa = new C1317740kOa(bitmap, i, i2, interfaceC1320380kSqLJIIJJI);
            if (this.LJ.getRootView() != null) {
                HandlerHook.viewPost(this.LJ, new ARunnableS89S0200000_20(this, c1317740kOa, 30));
                return;
            }
            C1325710kbR c1325710kbR = this.LIZJ;
            if (c1325710kbR == null) {
                return;
            }
            c1325710kbR.LJJIJL = this.LIZLLL;
        }
    }

    public C1321980kVQ(C1322110kVd c1322110kVd, C1318160kPG c1318160kPG, long j, C1325710kbR c1325710kbR, String str) {
        this.LJ = c1322110kVd;
        this.LIZ = c1318160kPG;
        this.LIZIZ = j;
        this.LIZJ = c1325710kbR;
        this.LIZLLL = str;
    }
}
