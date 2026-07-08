package X;

import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18KQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KQ extends C09AY implements Function1<C18KR, Unit> {
    public C18KQ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C18KR c18kr) {
        C18KR c18kr2 = c18kr;
        C18KG c18kg = C18KG.LIZ;
        synchronized (c18kg) {
            C18KG.LIZJ = c18kr2;
        }
        do {
            FcpPageNode fcpPageNodePop = c18kg.LIZJ().pop();
            if (fcpPageNodePop != null) {
                C18KG.LIZIZ(fcpPageNodePop, "kill_app");
            }
        } while (c18kg.LIZJ().size() > 0);
        return Unit.LIZ;
    }
}
