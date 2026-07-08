package X;

import Y.ARunnableS80S0200000_11;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0RCQ extends C2217421BqW implements Function2<C0R73, Boolean, Unit> {
    public C0RCQ(C690560R6w c690560R6w) {
        super(2, c690560R6w, C690560R6w.class, "postFrame", "postFrame(Lcom/ss/android/ugc/feed/platform/detect/data/ViewBasicInfo;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0R73 c0r73, Boolean bool) {
        C0R73 c0r732 = c0r73;
        boolean zBooleanValue = bool.booleanValue();
        this.receiver.getClass();
        if (c0r732 != null) {
            C0RCU c0rcu = new C0RCU(System.currentTimeMillis(), zBooleanValue);
            C0RCR c0rcr = new C0RCR();
            c0rcr.LIZIZ = c0rcu;
            c0rcr.LIZ = c0r732;
            c0rcr.LIZJ = null;
            C690560R6w.LIZ.getClass();
            C691990RCj c691990RCj = (C691990RCj) C690560R6w.LJ.getValue();
            c691990RCj.getClass();
            C786410Ut5.LJJZZIII((Handler) c691990RCj.LIZJ.getValue(), new ARunnableS80S0200000_11(c691990RCj, c0rcr, 71));
        }
        return Unit.LIZ;
    }
}
