package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0D0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332090D0d {
    public static final List<AbstractC331870Czh> LIZ(List<? extends AbstractC331870Czh> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC331870Czh abstractC331870Czh : list) {
            AbstractC331870Czh abstractC331870Czh2 = abstractC331870Czh;
            if (!(abstractC331870Czh2 instanceof C0D0F)) {
                if (abstractC331870Czh2 instanceof C08LM) {
                    if (((C08LM) abstractC331870Czh2).isAnimating()) {
                    }
                } else if (!(abstractC331870Czh2 instanceof C08LL)) {
                    throw new C1954807lC();
                }
            }
            arrayList.add(abstractC331870Czh);
        }
        return arrayList;
    }
}
