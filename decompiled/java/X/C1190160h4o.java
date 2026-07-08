package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0h4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190160h4o {
    public static final C1190160h4o LIZ = new C1190160h4o();
    public static String LIZIZ;
    public static PoiReviewsApi.PoiReviewModel LIZJ;

    public static List LIZJ(InterfaceC1871920yoQ interfaceC1871920yoQ) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC1871920yoQ == null) {
            return arrayList;
        }
        for (int i = 0; i < interfaceC1871920yoQ.size(); i++) {
            arrayList.add(interfaceC1871920yoQ.getString(i));
        }
        return arrayList;
    }

    public static PoiReviewsApi.PoiReviewModel LIZ(String str, String str2, double d, String str3, long j, List list, boolean z, PoiReviewsApi.PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel) {
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel;
        String strLIZIZ;
        String str4 = str;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (str4 == null) {
            str4 = "";
        }
        if (z) {
            String uid = curUser.getUid();
            String nickname = curUser.getNickname();
            if (nickname != null && nickname.length() != 0) {
                String str5 = new String(Character.toChars(nickname.codePointAt(0)));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str5);
                sbLIZ.append("****");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
            poiReviewUserModel = new PoiReviewsApi.PoiReviewUserModel(uid, strLIZIZ, curUser.getUniqueId(), null, null, null, null, null, null, null, null, null, null);
        } else {
            poiReviewUserModel = new PoiReviewsApi.PoiReviewUserModel(curUser.getUid(), curUser.getNickname(), curUser.getUniqueId(), curUser.getAvatarThumb(), curUser.getAvatarMedium(), curUser.getAvatarLarger(), null, null, null, null, null, poiReviewUserLevelInfoModel, null);
        }
        Double dValueOf = Double.valueOf(d);
        ArrayList arrayList = new ArrayList();
        if ((true ^ ((ArrayList) list).isEmpty()) && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str6 = (String) it2.next();
                if (C123100dR.LIZ(str6)) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(Collections.singletonList(str6));
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUrlList(Collections.singletonList(str6));
                    arrayList.add(new PoiReviewsApi.ImageDataModel(urlModel2, urlModel));
                }
            }
        }
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = new PoiReviewsApi.PoiReviewContentModel(dValueOf, null, str3, null, arrayList, null);
        PoiReviewsApi.PoiReviewBasicInfoModel poiReviewBasicInfoModel = new PoiReviewsApi.PoiReviewBasicInfoModel(Long.valueOf(j));
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = new PoiReviewsApi.PoiReviewStatisticsModel(0L);
        Boolean bool = Boolean.FALSE;
        return new PoiReviewsApi.PoiReviewModel(str4, str2, poiReviewUserModel, poiReviewContentModel, poiReviewBasicInfoModel, poiReviewStatisticsModel, new PoiReviewsApi.PoiReviewUserStatusModel(bool, bool), null, null, null, null, null, new PoiReviewsApi.PoiReviewStatusModel(0), null, z, false, null, false, false, null, null, Boolean.TRUE, EnumC1191110h6L.DEFAULT, null, String.valueOf(System.currentTimeMillis()), false, null);
    }
}
