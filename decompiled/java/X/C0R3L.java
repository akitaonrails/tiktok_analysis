package X;

import com.ss.android.ugc.aweme.tako.nimblecard.experiment.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.nimblecard.experiment.TakoNimbleConfigData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0R3L, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R3L {
    public static final TakoNimbleConfigData LIZ = new TakoNimbleConfigData(null, 1, null);
    public static final C01GW LIZIZ;
    public static final List<Integer> LIZJ;

    static {
        List<Integer> arrayList;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(368));
        LIZIZ = c01gwLIZIZ;
        List<TakoNimbleConfig> list = ((TakoNimbleConfigData) c01gwLIZIZ.getValue()).configList;
        if (list != null) {
            arrayList = new ArrayList<>();
            Iterator<TakoNimbleConfig> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterable iterable = it2.next().cardType;
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterable, arrayList);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        LIZJ = arrayList;
    }
}
