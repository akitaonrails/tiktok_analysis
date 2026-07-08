package X;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ewM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108040ewM extends C09AY implements Function1<C1088240eQQ, Unit> {
    public C1108040ewM() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1088240eQQ c1088240eQQ) {
        C1088240eQQ c1088240eQQ2 = c1088240eQQ;
        if (c1088240eQQ2.LIZIZ) {
            int i = C1107940ewC.LIZ[c1088240eQQ2.LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C1108350ewr.LIZLLL(C1697810uHb.LJIIJJI(1, 2), 1024, EnumC1108060ewO.LIVE_PIN_CARD);
                } else {
                    C1108350ewr.LIZLLL(Collections.singletonList(1), 1024, EnumC1108060ewO.LIVE_PIN_CARD);
                }
            } else {
                C1108350ewr.LIZLLL(Collections.singletonList(2), 1024, EnumC1108060ewO.LIVE_PIN_CARD);
            }
        } else {
            C1108350ewr.LIZJ(C1697810uHb.LJIIJJI(1, 2), 1024, EnumC1108060ewO.LIVE_PIN_CARD);
        }
        return Unit.LIZ;
    }
}
