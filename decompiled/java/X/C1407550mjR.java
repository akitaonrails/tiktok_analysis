package X;

import java.util.Iterator;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0mjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407550mjR extends AbstractC1434490nQt {
    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.WAIT_CLICK_POST;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1405220mfg) {
                if (next != null) {
                    boolean zLIZJ = ((C1405220mfg) next).LIZJ(new AwS388S0200000_22(c1404610meh, c1431070nLN, 254));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("is direct execute: ");
                    sbLIZ.append(zLIZJ);
                    c1431070nLN.LIZIZ(new C1404990mfJ("WaitClickPublishTask", C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
    }
}
