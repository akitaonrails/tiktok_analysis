package X;

import android.content.Context;
import android.provider.Telephony;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.model.ShareConfig;
import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373450lqR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(3));

    public static List LIZLLL() {
        return (List) LIZ.getValue();
    }

    public static int LIZIZ(String str) {
        List listLIZLLL = LIZLLL();
        if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
            for (SharePlatform sharePlatform : LIZLLL()) {
                if (Intrinsics.LJFF(sharePlatform.platformId, str)) {
                    return sharePlatform.photoShareMode;
                }
            }
            return -2;
        }
        C1373850lr5.LIZ.getClass();
        if (!C1373540lqa.LJIIJ(str)) {
            return 0;
        }
        return 4;
    }

    public static boolean LJ(Aweme aweme) {
        if (aweme.getAwemeType() != 150 && !C710930Rud.LJII(aweme)) {
            return false;
        }
        return true;
    }

    public static int LIZ(String str, EnumC1373410lqN enumC1373410lqN) {
        List<ShareConfig> list;
        List listLIZLLL = LIZLLL();
        if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
            for (SharePlatform sharePlatform : LIZLLL()) {
                if (Intrinsics.LJFF(sharePlatform.platformId, str)) {
                    if (Intrinsics.LJFF(sharePlatform.platformId, str) && (list = sharePlatform.shareConfigList) != null && !list.isEmpty()) {
                        Iterator<ShareConfig> it2 = list.iterator();
                        ShareConfig shareConfig = null;
                        while (true) {
                            if (it2.hasNext()) {
                                ShareConfig next = it2.next();
                                if (next.scene == EnumC1373410lqN.SHARE_DEFAULT.getNum()) {
                                    shareConfig = next;
                                } else if (next.scene == enumC1373410lqN.getNum()) {
                                    shareConfig = next;
                                    break;
                                }
                            } else if (shareConfig == null) {
                                return -2;
                            }
                        }
                        return shareConfig.shareMode;
                    }
                    return -2;
                }
            }
            return -2;
        }
        return -2;
    }

    public static int LIZJ(String str, List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SharePlatform sharePlatform = (SharePlatform) it2.next();
                if (Intrinsics.LJFF(sharePlatform.platformId, str)) {
                    return sharePlatform.shareMode;
                }
            }
            return -2;
        }
        C1373850lr5.LIZ.getClass();
        return C1373540lqa.LJIIJ(str) ? 1 : 0;
    }

    public static boolean LJI(Aweme aweme, InterfaceC1369790lkX interfaceC1369790lkX) {
        if (aweme.getAwemeType() != 150) {
            return false;
        }
        List listLIZLLL = LIZLLL();
        if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
            if (LIZIZ(interfaceC1369790lkX.key()) != 4) {
                return false;
            }
        } else {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            String strKey = interfaceC1369790lkX.key();
            c1373540lqa.getClass();
            if (!C1373540lqa.LJIIJ(strKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJII(Aweme aweme, InterfaceC1369790lkX interfaceC1369790lkX) {
        int iLIZJ;
        if (aweme.getAwemeType() == 150) {
            iLIZJ = LIZIZ(interfaceC1369790lkX.key());
        } else {
            iLIZJ = LIZJ(interfaceC1369790lkX.key(), LIZLLL());
        }
        if (iLIZJ == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Aweme aweme, InterfaceC1369790lkX interfaceC1369790lkX, boolean z) {
        int iLIZJ;
        if (aweme.getAwemeType() == 150) {
            iLIZJ = LIZIZ(interfaceC1369790lkX.key());
        } else {
            iLIZJ = LIZJ(interfaceC1369790lkX.key(), LIZLLL());
        }
        if (iLIZJ == 0 && !interfaceC1369790lkX.LIZJ()) {
            return true;
        }
        return z;
    }

    public static boolean LJIIIIZZ(Aweme aweme, InterfaceC1369790lkX interfaceC1369790lkX, Context context) {
        if (!LJ(aweme)) {
            if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "sms")) {
                if (!Intrinsics.LJFF(Telephony.Sms.getDefaultSmsPackage(context), "com.google.android.apps.messaging")) {
                    int iLIZJ = LIZJ(interfaceC1369790lkX.key(), LIZLLL());
                    if (iLIZJ != 4 && iLIZJ != 5) {
                        return false;
                    }
                } else {
                    if (!((Boolean) C262440AQg.LIZ.getValue()).booleanValue()) {
                        return false;
                    }
                    int iLIZJ2 = LIZJ(interfaceC1369790lkX.key(), LIZLLL());
                    if (iLIZJ2 != 4 && iLIZJ2 != 5) {
                        return false;
                    }
                }
            } else {
                int iLIZJ3 = LIZJ(interfaceC1369790lkX.key(), LIZLLL());
                if (iLIZJ3 != 4 && iLIZJ3 != 5) {
                    return false;
                }
            }
        } else {
            List listLIZLLL = LIZLLL();
            if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
                int iLIZIZ = LIZIZ(interfaceC1369790lkX.key());
                if (iLIZIZ != 4 && iLIZIZ != 5) {
                    return false;
                }
            } else {
                C1373540lqa c1373540lqa = C1373850lr5.LIZ;
                String strKey = interfaceC1369790lkX.key();
                c1373540lqa.getClass();
                if (!C1373540lqa.LJIIJ(strKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
