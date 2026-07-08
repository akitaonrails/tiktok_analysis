package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04t3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1239104t3 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1367));

    public static final synchronized void LIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setShareHeadShow: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator it2 = ((List) LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        ((List) LIZ.getValue()).clear();
    }
}
