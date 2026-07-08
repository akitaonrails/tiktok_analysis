package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PromotePageModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911570zqN {
    public static final C1911570zqN LIZ = new C1911570zqN();
    public static Long LIZIZ = 0L;

    public static final int LJ() {
        User currentUser;
        CommerceUserInfo commerceUserInfo;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (commerceUserInfo = currentUser.getCommerceUserInfo()) == null) {
            return 0;
        }
        return commerceUserInfo.promotePayType;
    }

    public static final int LJFF() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) {
            return 0;
        }
        return currentUser.getAccountType();
    }

    public static final String LJI() {
        String currentUserID;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) ? "" : currentUserID;
    }

    public static final void LJIIIZ() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "promote_stop_triggle_gecko", true, false)) {
            return;
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZIZ() != null) {
            C1041280dCg.LIZ("tiktok_promote_pia_next", new AbstractC1552040qUU() { // from class: X.0zqO
            }, null);
        }
    }

    public static List LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && C1017070cZd.LJJIJLIJ(aweme) != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && awemeRawAdLJJIJLIJ.softAdType() == 1) {
            List<Integer> list = C00RK.LIZ;
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            List<Integer> list2 = C00RK.LIZ;
            List<Integer> list3 = (List) c0c64LJIILLIIL.LJJII(List.class, list2, "remove_label_promote", true);
            if (list3 != null) {
                list2 = list3;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().intValue()));
            }
            return arrayList;
        }
        return null;
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        PromotePageModel promotePageModel;
        Integer num;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isPromotePage() || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || awemeRawAd2.getPromotePageModel() == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null || (promotePageModel = awemeRawAd3.getPromotePageModel()) == null || (num = promotePageModel.promoteLynxSchemaType) == null) {
            return false;
        }
        if (num.intValue() != 1 && num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static Uri LJIIIIZZ(Uri uri) {
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str, "_pia_")) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it2.next());
                }
            }
        }
        return builderClearQuery.build();
    }

    public static boolean LIZ(String str, String str2) {
        if (!C13LP.LJJJJ(str, C1210850hcB.LIZ)) {
            return false;
        }
        if (str2 != null && !str2.equals("video")) {
            return false;
        }
        return true;
    }

    public static final String LIZJ(Long l, String str, String str2, String str3) {
        String strLIZIZ;
        if (l == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("&source=");
            sbLIZ.append(str3);
            sbLIZ.append("&item_id=");
            sbLIZ.append(str2);
            sbLIZ.append("&userId=");
            sbLIZ.append(LJI());
            sbLIZ.append("&use_spark=1");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("&source=");
            sbLIZ2.append(str3);
            sbLIZ2.append("&item_id=");
            sbLIZ2.append(str2);
            sbLIZ2.append("&userId=");
            sbLIZ2.append(LJI());
            sbLIZ2.append("&click_time=");
            sbLIZ2.append(l);
            sbLIZ2.append("&use_spark=1");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return C2821017j.LIZ(UriProtector.parse(strLIZIZ), C1697810uHb.LJIILJJIL("enable_prefetch", "enable_pending_js_task")).toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(java.lang.String r9, java.lang.String r10, java.lang.Long r11, java.lang.String r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.Map<java.lang.String, ? extends java.lang.Object> r18) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1911570zqN.LIZLLL(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }
}
