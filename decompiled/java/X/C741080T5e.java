package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.oppo.hyperboost.IHyperboostService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS97S1000000_12;

/* JADX INFO: renamed from: X.0T5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741080T5e {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"com.ss.android.ugc.aweme.main.MainActivity", "com.ss.android.ugc.aweme.splash.SplashActivity", "com.ss.android.ugc.aweme.detail.ui.DetailActivity"});
    public static final Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public static final Map<String, Boolean> LJ = new LinkedHashMap();

    public static void LIZ(String str) {
        if (!LIZJ) {
            IHyperboostService iHyperboostService = (IHyperboostService) C741110T5h.LIZIZ.getValue();
            C844470XAv.LIZ.getClass();
            iHyperboostService.LIZ(C844470XAv.LIZ(), new C741100T5g());
            LIZJ = true;
            return;
        }
        if (!LIZIZ || !LIZ.contains(str)) {
            return;
        }
        if (TextUtils.equals(str, "com.ss.android.ugc.aweme.main.MainActivity")) {
            str = "com.ss.android.ugc.aweme.splash.SplashActivity";
        }
        LIZLLL.put(str, Boolean.FALSE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0.0:");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ2.append(C844470XAv.LIZ().getPackageName());
        sbLIZ2.append('/');
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(str);
        C0CNO.LIZ(C15O7.LJI, new AwS97S1000000_12(C2188811AlT.LIZIZ(sbLIZ), 20));
    }

    public static void LIZIZ(String str) {
        if (!LIZJ) {
            IHyperboostService iHyperboostService = (IHyperboostService) C741110T5h.LIZIZ.getValue();
            C844470XAv.LIZ.getClass();
            iHyperboostService.LIZ(C844470XAv.LIZ(), new C741100T5g());
            LIZJ = true;
            return;
        }
        if (!LIZIZ || !LIZ.contains(str)) {
            return;
        }
        if (TextUtils.equals(str, "com.ss.android.ugc.aweme.main.MainActivity")) {
            str = "com.ss.android.ugc.aweme.splash.SplashActivity";
        }
        LIZLLL.put(str, Boolean.TRUE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("30.0:");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ2.append(C844470XAv.LIZ().getPackageName());
        sbLIZ2.append('/');
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(str);
        C0CNO.LIZ(C15O7.LJI, new AwS97S1000000_12(C2188811AlT.LIZIZ(sbLIZ), 21));
    }
}
