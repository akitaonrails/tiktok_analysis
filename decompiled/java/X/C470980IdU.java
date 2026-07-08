package X;

import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470980IdU {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(353));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(352));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(351));

    public static Map LIZ() {
        return (Map) LIZJ.getValue();
    }

    public static String LIZIZ() {
        List<ItemTab> listLIZJ = C471000IdW.LJ().LIZJ();
        return (listLIZJ == null || ((ArrayList) listLIZJ).size() <= 0) ? "" : ((ItemTab) ListProtector.get(listLIZJ, 0)).getUrl();
    }
}
