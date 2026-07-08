package X;

import android.content.Context;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1469520oLO extends TTVideoEngine {
    public final C1469500oLM LJIJI;
    public final C1469510oLN LJIJJ;
    public final C1469550oLR LJIJJLI;
    public final C1469540oLQ LJIL;

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public void LIZLLL(s sVar) {
        super.LIZLLL(sVar);
        if (sVar != null) {
            float f = sVar.LIZLLL;
            if (f > 0.0f) {
                C1469540oLQ c1469540oLQ = this.LJIL;
                Float fValueOf = Float.valueOf(f);
                c1469540oLQ.getClass();
                for (Object obj : (CopyOnWriteArrayList) c1469540oLQ.LL) {
                    if (obj != null) {
                        ((InterfaceC989230bqj) obj).accept(fValueOf);
                    }
                }
            }
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJILLL(InterfaceC1469360oL8 interfaceC1469360oL8) {
        ((CopyOnWriteArrayList) this.LJIJI.LL).clear();
        LLJJJJJIL(interfaceC1469360oL8);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJJ(InterfaceC1467780oIa interfaceC1467780oIa) {
        ((CopyOnWriteArrayList) this.LJIJJ.LL).clear();
        this.LJIJJ.LIZLLL(interfaceC1467780oIa);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJJIII(InterfaceC1467760oIY interfaceC1467760oIY) {
        ((CopyOnWriteArrayList) this.LJIJJLI.LL).clear();
        this.LJIJJLI.LIZLLL(interfaceC1467760oIY);
    }

    public final void LLJJJJJIL(InterfaceC1469360oL8 interfaceC1469360oL8) {
        this.LJIJI.LIZLLL(interfaceC1469360oL8);
    }

    public C1469520oLO(Context context, int i, Map map) {
        super(context, i, map);
        C1469500oLM c1469500oLM = new C1469500oLM();
        this.LJIJI = c1469500oLM;
        C1469510oLN c1469510oLN = new C1469510oLN();
        this.LJIJJ = c1469510oLN;
        C1469550oLR c1469550oLR = new C1469550oLR();
        this.LJIJJLI = c1469550oLR;
        this.LJIL = new C1469540oLQ();
        super.LLJILLL(c1469500oLM);
        C1466990oHJ c1466990oHJ = this.LIZ;
        c1466990oHJ.LLLLZLL = c1469510oLN;
        c1466990oHJ.LLLLZIL = c1469550oLR;
    }
}
