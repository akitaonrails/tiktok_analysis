package X;

import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0kVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321960kVO implements InterfaceC1318130kPD {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ C1316650kMp LIZIZ;
    public final /* synthetic */ C1325710kbR LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C1322110kVd LJ;

    @Override // X.InterfaceC1318130kPD
    public final void LIZ(Bitmap bitmap) {
        InterfaceC1320380kSq interfaceC1320380kSqLJIIJJI;
        if (bitmap != null) {
            C1316650kMp c1316650kMp = this.LIZIZ;
            int i = c1316650kMp.LIZJ;
            int i2 = c1316650kMp.LIZLLL;
            if (this.LJ.getHierarchy() != null) {
                interfaceC1320380kSqLJIIJJI = this.LJ.getHierarchy().LJIIJJI();
            } else {
                interfaceC1320380kSqLJIIJJI = InterfaceC1320380kSq.LIZJ;
            }
            C1317740kOa c1317740kOa = new C1317740kOa(bitmap, i, i2, interfaceC1320380kSqLJIIJJI);
            if (this.LJ.getRootView() != null) {
                HandlerHook.viewPost(this.LJ, new ARunnableS89S0200000_20(this, c1317740kOa, 29));
                return;
            }
            return;
        }
        C1325710kbR c1325710kbR = this.LIZJ;
        if (c1325710kbR == null) {
            return;
        }
        c1325710kbR.LJJIJL = this.LIZLLL;
    }

    public C1321960kVO(C1322110kVd c1322110kVd, long j, C1316650kMp c1316650kMp, C1325710kbR c1325710kbR, String str) {
        this.LJ = c1322110kVd;
        this.LIZ = j;
        this.LIZIZ = c1316650kMp;
        this.LIZJ = c1325710kbR;
        this.LIZLLL = str;
    }
}
