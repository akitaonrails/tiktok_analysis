package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1Dr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2268771Dr9 {
    public final C2268811DrD[] LIZ;
    public final C2268811DrD[] LIZIZ;

    public AbstractC2268771Dr9(List<C2268811DrD> list) {
        ArrayList arrayList = (ArrayList) list;
        C2268811DrD[] c2268811DrDArr = new C2268811DrD[arrayList.size()];
        this.LIZ = c2268811DrDArr;
        this.LIZIZ = new C2268811DrD[arrayList.size()];
        arrayList.toArray(c2268811DrDArr);
    }
}
