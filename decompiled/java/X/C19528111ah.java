package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.11ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19528111ah extends AbstractC19529311at {
    public static final C19528111ah LIZIZ = new C19528111ah();

    @Override // X.AbstractC19529311at
    public final AbstractC19527711ad LIZ() {
        AbstractC19527711ad abstractC19527711ad = new AbstractC19527711ad() { // from class: X.11ac
            @Override // X.AbstractC19527711ad
            public final List<List<InterfaceC19526611aS>> LIZ(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list) {
                List<InterfaceC19526611aS> listLLILIL = interfaceC19526511aR.LLILIL();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC19526611aS interfaceC19526611aS : listLLILIL) {
                    if (interfaceC19526611aS.LJJI()) {
                        arrayList.add(interfaceC19526611aS);
                    }
                }
                if (arrayList.size() == list.size()) {
                    return Collections.singletonList(list);
                }
                return null;
            }
        };
        abstractC19527711ad.LIZIZ = LIZIZ.LIZ;
        return abstractC19527711ad;
    }
}
