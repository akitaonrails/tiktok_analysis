package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0nl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447010nl5 extends AbstractC1447020nl6 implements InterfaceC1447050nl9 {
    public final String LIZIZ = "AIGCLabelAggregator";

    @Override // X.InterfaceC1447040nl8
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final EnumC1446970nl1 LIZ() {
        Iterator it2 = ((LinkedHashMap) this.LIZ).values().iterator();
        int iMax = 0;
        while (it2.hasNext()) {
            iMax = Math.max(iMax, ((InterfaceC1447040nl8) it2.next()).LIZ().getType());
        }
        return iMax != 0 ? iMax != 1 ? iMax != 2 ? EnumC1446970nl1.AIGC_LABEL_UNKNOWN : EnumC1446970nl1.AIGC_LABEL_AUTO : EnumC1446970nl1.AIGC_LABEL_MANUAL : EnumC1446970nl1.AIGC_LABEL_UNKNOWN;
    }

    @Override // X.InterfaceC1447060nlA
    public final String getName() {
        return this.LIZIZ;
    }
}
