package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1162, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1162 {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final AnonymousClass1163 LJII;
    public static final AnonymousClass1163 LJIIIIZZ;

    static {
        String str = Api.LIZ;
        LIZ = str;
        String strLJIILJJIL = C1ER1.LIZIZ.LJIILJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/aweme/v1/challenge/detail/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("/aweme/v1/challenge/aweme/");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("/aweme/v1/challenge/fresh/aweme/");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append("/aweme/v1/commerce/challenge/detail/");
        LJ = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(str);
        sbLIZ5.append("/aweme/v1/commerce/challenge/aweme/");
        LJFF = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(str);
        sbLIZ6.append("/aweme/v1/commerce/challenge/fresh/aweme/");
        LJI = C2188811AlT.LIZIZ(sbLIZ6);
        LJII = (AnonymousClass1163) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(str).create(AnonymousClass1163.class);
        LJIIIIZZ = (AnonymousClass1163) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(strLJIILJJIL).create(AnonymousClass1163.class);
    }

    public static ChallengeDetail LIZ(int i, String str, String str2, boolean z) {
        String str3;
        if (((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIZILJ(str) && !C10EU.LJIIIIZZ()) {
            str3 = LJ;
        } else {
            str3 = LIZIZ;
        }
        HashMap map = new HashMap();
        if (z) {
            map.put("hashtag_name", str);
            map.put("query_type", String.valueOf(1));
        } else {
            map.put("ch_id", str);
            map.put("query_type", String.valueOf(0));
        }
        map.put("click_reason", String.valueOf(i));
        if (!TextUtils.isEmpty(str2)) {
            map.put("preview_token", str2);
        }
        return LJII.LIZLLL(str3, map).get();
    }
}
