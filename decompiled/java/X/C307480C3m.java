package X;

import com.ss.android.ugc.aweme.video.experiment.DynamicOptionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307480C3m {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4887));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4888));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4885));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4889));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4886));

    public static void LIZ(List list, List list2) {
        if (list2 != null && !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                DynamicOptionModel dynamicOptionModel = (DynamicOptionModel) it2.next();
                C308310C6r c308310C6rLIZ = dynamicOptionModel.LIZ();
                C307500C3o c307500C3o = C307500C3o.LIZ;
                String str = dynamicOptionModel.libraKey;
                c307500C3o.getClass();
                if (c308310C6rLIZ.LIZ(C307500C3o.LIZLLL(str, true))) {
                    ((ArrayList) list).add(c308310C6rLIZ);
                }
            }
        }
    }
}
