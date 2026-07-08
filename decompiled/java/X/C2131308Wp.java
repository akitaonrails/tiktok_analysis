package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2131308Wp {
    public static final ECPreloadEntry[] LIZ = new ECPreloadEntry[0];
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2131508Wr());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2274081Dzi());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2131108Wn());
    public static final C01GW LJ = C452501pT.LIZIZ(new C2131408Wq());

    public static ArrayList LIZ() {
        return (ArrayList) LIZLLL.getValue();
    }

    public static ECPreloadEntry LIZIZ(String str) {
        Object next;
        Iterator it2 = ((ArrayList) LIZJ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((ECPreloadEntry) next).entryId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (ECPreloadEntry) next;
    }
}
