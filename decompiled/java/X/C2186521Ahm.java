package X;

import android.content.Context;
import android.os.HandlerThread;
import android.util.AttributeSet;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Ahm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2186521Ahm extends C2186761AiA {
    public C2186531Ahn LLJJL;
    public C2186581Ahs LLJJLIIIJLLLLLLLZ;
    public InterfaceC2186931AiR LLJL;
    public ActivityC2186501Ahk LLJLIL;

    @Override // X.C2186761AiA
    public final void LIZIZ() {
        InterfaceC2186931AiR interfaceC2186931AiR = this.LLJL;
        if (interfaceC2186931AiR != null) {
            interfaceC2186931AiR.LIZ();
        }
    }

    public final void LJI() {
        C2186531Ahn c2186531Ahn = this.LLJJL;
        if (c2186531Ahn != null) {
            C21147817pM.LIZ();
            c2186531Ahn.LJIIIZ = 0;
            synchronized (c2186531Ahn.LIZJ) {
                try {
                    c2186531Ahn.LIZIZ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLJJL = null;
        }
        if (this.LLIZ) {
            C2186531Ahn c2186531Ahn2 = new C2186531Ahn(getCameraInstance(), this.LLJLIL);
            this.LLJJL = c2186531Ahn2;
            c2186531Ahn2.LJI = this.LLJJLIIIJLLLLLLLZ;
            C21147817pM.LIZ();
            if (c2186531Ahn2.LIZIZ) {
                c2186531Ahn2.LIZJ();
            }
            HandlerThread handlerThread = new HandlerThread("ScanThread");
            c2186531Ahn2.LIZLLL = handlerThread;
            handlerThread.start();
            c2186531Ahn2.LJ = new BPEAHandler(C786410Ut5.W2(c2186531Ahn2.LIZLLL), c2186531Ahn2.LJIIIIZZ);
            c2186531Ahn2.LIZIZ = true;
            c2186531Ahn2.LIZIZ();
        }
    }

    @Override // X.C2186761AiA
    public final void LIZJ() {
        super.LIZJ();
    }

    public C2186521Ahm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
