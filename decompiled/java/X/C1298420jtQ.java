package X;

import Y.ARunnableS53S0300000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298420jtQ {
    public final C1312690kGR LIZ;
    public final ArrayList<InterfaceC1298410jtP> LIZIZ = new ArrayList<>();
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public C1298420jtQ(C1312690kGR c1312690kGR) {
        this.LIZ = c1312690kGR;
    }

    public final void LIZIZ(int i) {
        if (this.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPseudoStatusChanged id: ");
            sbLIZ.append(i);
            sbLIZ.append(" failed since mTemplateAssembler is null");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LIZJ(C1294230jmf c1294230jmf) {
        if (this.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendCustomEvent event: ");
            sbLIZ.append(c1294230jmf.LIZIZ);
            sbLIZ.append(" failed since mTemplateAssembler is null");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZ(EnumC1298380jtM.kLynxEventTypeCustomEvent, c1294230jmf);
    }

    public final void LIZ(EnumC1298380jtM enumC1298380jtM, C1298400jtO c1298400jtO) {
        ARunnableS53S0300000_20 aRunnableS53S0300000_20 = new ARunnableS53S0300000_20(enumC1298380jtM, c1298400jtO, this, 43);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            aRunnableS53S0300000_20.run();
        } else {
            C786410Ut5.LJJZZIII(this.LIZJ, aRunnableS53S0300000_20);
        }
    }
}
