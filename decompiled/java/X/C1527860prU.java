package X;

import android.os.Handler;
import com.bytedance.sync.v4.compensate.CompensatorImplV4;

/* JADX INFO: renamed from: X.0prU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527860prU implements InterfaceC1527480pqs {
    public final InterfaceC1527580pr2 LL;
    public final AbstractC1526380pp6<Handler> LLILLJJLI;
    public final InterfaceC1525730po3 LLILLL;
    public final boolean LLILZ;
    public AbstractC1527850prT LLILZIL;
    public InterfaceC1525970poR LLILZLL;
    public final boolean LLIZ;

    @Override // X.InterfaceC1527480pqs
    public final void LIZIZ() {
        AbstractC1527850prT abstractC1527850prT = this.LLILZIL;
        if (abstractC1527850prT == null || abstractC1527850prT.LIZJ() == 1) {
            AbstractC1527850prT abstractC1527850prT2 = this.LLILZIL;
            if (abstractC1527850prT2 != null) {
                abstractC1527850prT2.LIZ();
            }
            C1527900prY c1527900prY = new C1527900prY();
            c1527900prY.LIZ = this.LLILZLL.poll();
            c1527900prY.LIZIZ = this.LLILZLL.LJII();
            C1527840prS c1527840prS = new C1527840prS(this.LL, this.LLILLL, this.LLILLJJLI, c1527900prY);
            this.LLILZIL = c1527840prS;
            c1527840prS.LJ();
        }
    }

    @Override // X.InterfaceC1527550pqz
    public final int LIZLLL() {
        return ((CompensatorImplV4) this.LL).LLIZ ? 3 : 4;
    }

    @Override // X.InterfaceC1527480pqs
    public final void destroy() {
        C1527890prX.LIZ("[CompensatorV4] HttpsCompensator destroy");
        AbstractC1527850prT abstractC1527850prT = this.LLILZIL;
        if (abstractC1527850prT != null) {
            abstractC1527850prT.LIZ();
        }
    }

    @Override // X.InterfaceC1527480pqs
    public final void LJIIJ(C1527060pqC c1527060pqC) {
        AbstractC1527850prT abstractC1527850prT = this.LLILZIL;
        if (abstractC1527850prT != null && this.LLIZ) {
            abstractC1527850prT.LJFF(c1527060pqC);
        }
    }

    @Override // X.InterfaceC1527480pqs
    public final void LIZ(InterfaceC1525970poR interfaceC1525970poR, boolean z) {
        int iLIZ;
        int iLJIIJJI;
        AbstractC1527850prT c1527880prW;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[CompensatorV4] HttpsCompensator start readyToPoll = ");
        sbLIZ.append(z);
        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = interfaceC1525970poR;
        C1527900prY c1527900prY = new C1527900prY();
        if (z) {
            iLIZ = interfaceC1525970poR.poll();
        } else {
            iLIZ = interfaceC1525970poR.LIZ();
        }
        c1527900prY.LIZ = iLIZ;
        if (z) {
            iLJIIJJI = interfaceC1525970poR.LJII();
        } else {
            iLJIIJJI = interfaceC1525970poR.LJIIJJI();
        }
        c1527900prY.LIZIZ = iLJIIJJI;
        if (z) {
            c1527880prW = new C1527840prS(this.LL, this.LLILLL, this.LLILLJJLI, c1527900prY);
        } else {
            c1527880prW = new C1527880prW(this.LL, this.LLILLL, this.LLILLJJLI, c1527900prY);
        }
        this.LLILZIL = c1527880prW;
        if (!this.LLILZ) {
            c1527880prW.LIZIZ();
        }
        c1527880prW.LJ();
    }

    @Override // X.InterfaceC1527480pqs
    public final void LIZJ(InterfaceC1525970poR interfaceC1525970poR, boolean z) {
        int iLIZ;
        int iLJIIJJI;
        this.LLILZLL = interfaceC1525970poR;
        C1527900prY c1527900prY = new C1527900prY();
        if (z) {
            iLIZ = interfaceC1525970poR.poll();
        } else {
            iLIZ = interfaceC1525970poR.LIZ();
        }
        c1527900prY.LIZ = iLIZ;
        if (z) {
            iLJIIJJI = interfaceC1525970poR.LJII();
        } else {
            iLJIIJJI = interfaceC1525970poR.LJIIJJI();
        }
        c1527900prY.LIZIZ = iLJIIJJI;
        this.LLILZIL.LJ = c1527900prY;
    }

    public C1527860prU(InterfaceC1527580pr2 interfaceC1527580pr2, AbstractC1526380pp6<Handler> abstractC1526380pp6, InterfaceC1525730po3 interfaceC1525730po3, boolean z, boolean z2) {
        this.LL = interfaceC1527580pr2;
        this.LLILLJJLI = abstractC1526380pp6;
        this.LLILLL = interfaceC1525730po3;
        this.LLILZ = z;
        this.LLIZ = z2;
    }
}
