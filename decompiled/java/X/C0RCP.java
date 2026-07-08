package X;

import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RCP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0RCP extends C2217421BqW implements Function0<Unit> {
    public C0RCP(C690560R6w c690560R6w) {
        super(0, c690560R6w, C690560R6w.class, "postDetectTask", "postDetectTask()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.receiver.getClass();
        C01GW c01gw = C690560R6w.LJ;
        C691990RCj c691990RCj = (C691990RCj) c01gw.getValue();
        C0R5L c0r5l = new C0R5L() { // from class: X.0RCS
        };
        c691990RCj.getClass();
        C786410Ut5.LJJZZIII((Handler) c691990RCj.LIZJ.getValue(), new ARunnableS80S0200000_11(c691990RCj, c0r5l, 71));
        C691990RCj c691990RCj2 = (C691990RCj) c01gw.getValue();
        c691990RCj2.getClass();
        C786410Ut5.LJJZZIII((Handler) c691990RCj2.LIZJ.getValue(), new ARunnableS111S0100000_11(c691990RCj2, 167));
        return Unit.LIZ;
    }
}
