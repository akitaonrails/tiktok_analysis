package X;

import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTab;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Ddj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343730Ddj {
    public static final TabConfig LIZ = new TabConfig(Boolean.TRUE, null, null, null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1215));

    public static TabConfig LIZIZ() {
        return (TabConfig) LIZIZ.getValue();
    }

    public static TopTab LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTopTab value = ");
        TabConfig tabConfigLIZIZ = LIZIZ();
        sbLIZ.append(tabConfigLIZIZ != null ? tabConfigLIZIZ.isJsonIllegal : null);
        sbLIZ.append(", ");
        TabConfig tabConfigLIZIZ2 = LIZIZ();
        sbLIZ.append(tabConfigLIZIZ2 != null ? tabConfigLIZIZ2.topTab : null);
        C2188811AlT.LIZIZ(sbLIZ);
        TabConfig tabConfigLIZIZ3 = LIZIZ();
        if (tabConfigLIZIZ3 != null) {
            return tabConfigLIZIZ3.topTab;
        }
        return null;
    }
}
