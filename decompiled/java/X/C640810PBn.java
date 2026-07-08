package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640810PBn {
    public static final Keva LIZ = Keva.getRepo("personalized_search");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(636));

    public static boolean LIZIZ() {
        if (((IAccountService) LIZIZ.getValue()).LJIIJ().isLogin()) {
            return !Intrinsics.LJFF(LIZ.getString(LIZ(), ""), new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date()));
        }
        return false;
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("non_personalized_search_notice_");
        sbLIZ.append(((IAccountService) LIZIZ.getValue()).LJIIJ().getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
