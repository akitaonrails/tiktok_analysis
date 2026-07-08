package X;

import com.ss.android.ugc.aweme.share.ShareCrowd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C093100Wr {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(11));

    public static final boolean LIZ() {
        ArrayList arrayList;
        if (Intrinsics.LJFF(LIZ.getValue(), "pre_load_all")) {
            return true;
        }
        List list = (List) C093200Ws.LIZ.getValue();
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ShareCrowd) it2.next()).crowdName);
            }
        } else {
            arrayList = new ArrayList();
        }
        return arrayList.contains(LIZ.getValue());
    }
}
