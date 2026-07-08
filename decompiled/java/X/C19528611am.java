package X;

import Y.AComparatorS48S0000000_29;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19528611am extends AbstractC19529311at {
    public static final C19528611am LIZIZ = new C19528611am();

    @Override // X.AbstractC19529311at
    public final AbstractC19527711ad LIZ() {
        AbstractC19527711ad abstractC19527711ad = new AbstractC19527711ad() { // from class: X.11an
            @Override // X.AbstractC19527711ad
            public final List<List<InterfaceC19526611aS>> LIZ(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list) {
                List<InterfaceC19526611aS> listLLILIL = interfaceC19526511aR.LLILIL();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC19526611aS interfaceC19526611aS : listLLILIL) {
                    InterfaceC19526611aS interfaceC19526611aS2 = interfaceC19526611aS;
                    if (interfaceC19526611aS2.LJJI() && !interfaceC19526611aS2.LJIILIIL()) {
                        arrayList.add(interfaceC19526611aS);
                    }
                }
                if (Intrinsics.LJFF(C13LP.LJLLLL(new AComparatorS48S0000000_29(3), arrayList), C13LP.LJLLLL(new AComparatorS48S0000000_29(4), list))) {
                    return Collections.singletonList(list);
                }
                return null;
            }
        };
        abstractC19527711ad.LIZIZ = LIZIZ.LIZ;
        return abstractC19527711ad;
    }
}
