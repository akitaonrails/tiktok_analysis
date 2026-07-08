package X;

import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0RGG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RGG {
    public static final C01GW<C0RGG> LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C0RGH());
    public final Map<String, Boolean> LIZ = new LinkedHashMap();
    public final Map<Integer, Boolean> LIZIZ = new LinkedHashMap();
    public final Map<String, Boolean> LIZJ = new LinkedHashMap();
    public volatile boolean LIZLLL;

    public final boolean LIZLLL() {
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        if (!C0COM.LIZIZ() || aweme == null) {
            return false;
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if ((iCommercePromoteService != null && iCommercePromoteService.LJIIJ(aweme)) || AwemeSaaSExtKt.isLive(aweme) || C0NC0.LIZ(aweme) || C729510SjV.LJJIJIL(aweme)) {
            return false;
        }
        if (AwemeExtKt.isPhotoMode(aweme) && !C294910BhB.LIZ()) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(String str) {
        if (!C0COM.LIZIZ() || str == null) {
            return false;
        }
        Map<String, Boolean> map = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene_key_");
        sbLIZ.append(str);
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        Map<String, Boolean> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene_key_");
        sbLIZ.append(str);
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
