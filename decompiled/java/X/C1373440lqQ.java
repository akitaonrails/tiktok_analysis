package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.model.ShareConfig;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373440lqQ {
    public static final C1373440lqQ LIZ = new C1373440lqQ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(6));

    public static String LIZ(InterfaceC1369790lkX interfaceC1369790lkX, String str, String str2) {
        if (!LIZIZ(interfaceC1369790lkX, str, 0)) {
            return "";
        }
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "twitter")) {
            ISettingService iSettingService = (ISettingService) ServiceManager.get().getService(ISettingService.class);
            C844470XAv.LIZ.getClass();
            if (iSettingService.isArabicLang(C844470XAv.LIZ()) && !TextUtils.isEmpty(str2)) {
                return str2.replace("#", "");
            }
            return str2;
        }
        return str2;
    }

    public static boolean LIZIZ(InterfaceC1369790lkX interfaceC1369790lkX, String str, int i) {
        List<SharePlatform> list;
        EnumC1373410lqN enumC1373410lqN = (EnumC1373410lqN) ((Map) LIZIZ.getValue()).get(str);
        if (enumC1373410lqN == null) {
            enumC1373410lqN = EnumC1373410lqN.SHARE_DEFAULT;
        }
        int num = enumC1373410lqN.getNum();
        ShareSettings shareSettings = C313130CPf.LIZIZ().LLILLL;
        ShareConfig shareConfig = null;
        if (shareSettings != null) {
            list = shareSettings.sharePlatforms;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<SharePlatform> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SharePlatform next = it2.next();
            if (Intrinsics.LJFF(next.platformId, interfaceC1369790lkX.key())) {
                List<ShareConfig> list2 = next.shareConfigList;
                if (list2 == null || list2.isEmpty()) {
                    return false;
                }
                Iterator<ShareConfig> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        ShareConfig next2 = it3.next();
                        if (next2.scene == EnumC1373410lqN.SHARE_DEFAULT.getNum()) {
                            shareConfig = next2;
                        } else if (next2.scene == num) {
                            shareConfig = next2;
                            break;
                        }
                    } else if (shareConfig != null) {
                        break;
                    }
                }
                List<Integer> list3 = shareConfig.shareDescEnableModes;
                if (list3 != null) {
                    Iterator<Integer> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        if (it4.next().intValue() == i) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
