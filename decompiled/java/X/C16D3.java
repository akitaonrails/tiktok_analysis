package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;

/* JADX INFO: renamed from: X.16D3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16D3 extends C16D1 {
    public C16DL LLJJIJIL;

    public C16D3(String str) {
        super(new URI(str), new C16D6(), 5000);
    }

    @Override // X.C16D1
    public final void LJJII(Exception exc) {
        C16DL c16dl = this.LLJJIJIL;
        if (c16dl != null) {
            exc.getMessage();
            c16dl.LIZJ();
        }
    }

    public final void LJJIIZI(String str) {
        if (isOpen()) {
            try {
                LIZ(str);
                C16DL c16dl = this.LLJJIJIL;
                if (c16dl != null) {
                    c16dl.LIZIZ();
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C16DL c16dl2 = this.LLJJIJIL;
                if (c16dl2 != null) {
                    c16dl2.LIZIZ();
                    return;
                }
                return;
            }
        }
        C16DL c16dl3 = this.LLJJIJIL;
        if (c16dl3 != null) {
            c16dl3.LIZIZ();
        }
        C16DL c16dl4 = this.LLJJIJIL;
        if (c16dl4 != null) {
            c16dl4.LIZJ();
        }
    }
}
