package X;

import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0nRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434840nRS {
    public static final C05XT LIZ() {
        return new C05XT();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0T8t] */
    public static final C742010T8t LIZIZ() {
        return new InterfaceC742020T8u() { // from class: X.0T8t
            public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

            @Override // X.InterfaceC742020T8u
            public final void LIZ(ARunnableS112S0100000_12 aRunnableS112S0100000_12) {
                C0TLG c0tlg = new C0TLG(aRunnableS112S0100000_12);
                if (Looper.getMainLooper().equals(Looper.myLooper())) {
                    c0tlg.invoke();
                } else {
                    C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS112S0100000_12(c0tlg, 450));
                }
            }
        };
    }

    public static final Executor LIZJ() {
        return (Executor) C0T5W.LIZ.getValue();
    }

    public static final Executor LJ() {
        return (Executor) C0T5W.LIZIZ.getValue();
    }

    public static final Executor LIZLLL(C1433530nPL c1433530nPL) {
        C1433500nPI c1433500nPI;
        Executor executor;
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = c1433530nPL.LJI;
        if ((interfaceRunnableC1433480nPG instanceof C1433500nPI) && (c1433500nPI = (C1433500nPI) interfaceRunnableC1433480nPG) != null && (executor = c1433500nPI.LLILZ) != null) {
            return executor;
        }
        if (((Boolean) C266670Acj.LIZ.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("executor is not specified in this publish record, publishId=");
            sbLIZ.append(c1433530nPL.LIZIZ);
            Npth.reportBizException("PublishWaveFallback", new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)), "WaveExecutorHelper", C2097608Jq.LJ());
            C1433730nPf.LIZ.getClass();
            return C1433730nPf.LJI;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("executor is not specified in this publish record, publishId=");
        sbLIZ2.append(c1433530nPL.LIZIZ);
        sbLIZ2.append(", task: ");
        sbLIZ2.append(c1433530nPL.LJI);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
