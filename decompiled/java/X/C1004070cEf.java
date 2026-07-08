package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004070cEf {
    public static void LIZ(String str, AnoleComponentModel anoleComponentModel, long j, AwemeRawAd awemeRawAd, Map map, int i) {
        if ((i & 64) != 0) {
            map = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("anole_ad", str, awemeRawAd);
        c1022820ciuLIZLLL.LIZJ(null, "refer");
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("component_id", Long.valueOf(anoleComponentModel.getID())), new Pair("template_id", Long.valueOf(j)), new Pair("component_type", anoleComponentModel.type));
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        c1022820ciuLIZLLL.LIZ(mapLJIIJ);
        c1022820ciuLIZLLL.LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTrack(), label = ");
        sbLIZ.append(str);
        sbLIZ.append(",tag = ");
        sbLIZ.append("anole_ad");
        sbLIZ.append(",refer = ");
        sbLIZ.append((String) null);
        sbLIZ.append(", trackMap = ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
