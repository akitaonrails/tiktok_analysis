package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerTracerInfoStruct;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: X.0Row, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707400Row {
    public static final C707400Row LIZ = new C707400Row();
    public static final C707460Rp2 LIZIZ = new C707460Rp2("BannerMobDataUtils");
    public static final Type LIZJ = new TypeToken<Map<String, ? extends String>>() { // from class: X.0Rox
    }.getType();

    public static Map LIZ(BannerCommonStruct bannerCommonStruct) {
        String str;
        boolean z;
        BannerTracerInfoStruct bannerTracerInfoStruct;
        if (bannerCommonStruct != null && (bannerTracerInfoStruct = bannerCommonStruct.tracerInfo) != null) {
            str = bannerTracerInfoStruct.tracerInfoValue;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C2097608Jq.LJ();
        }
        try {
            Map map = (Map) C08JS.LIZIZ().LJIIIIZZ(str, LIZJ);
            if (map == null) {
                return C2097608Jq.LJ();
            }
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C707460Rp2 c707460Rp2 = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createMobData parse failed, raw=");
            sbLIZ.append(str);
            c707460Rp2.LJI(C2188811AlT.LIZIZ(sbLIZ), th);
            return C2097608Jq.LJ();
        }
    }
}
