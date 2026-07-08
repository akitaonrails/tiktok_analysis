package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.profile.business.profile.tab.api.ProfileTabApi;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0imZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255730imZ {
    public static C0VSJ LIZ(String str) {
        C844470XAv.LIZ.getClass();
        File fileW2 = C786410Ut5.w2(C844470XAv.LIZ());
        if (fileW2 == null || !fileW2.exists()) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(fileW2.getPath());
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append("aweme_publish");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(fileW2.getPath());
        sbLIZ2.append(str2);
        sbLIZ2.append("aweme_popular");
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        C1256130inD.LIZ.getClass();
        if (C1256130inD.LIZ() != 0) {
            c0vsj = c0vsj2;
        }
        try {
            if (!c0vsj.exists()) {
                if (!c0vsj.mkdirs()) {
                    return null;
                }
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c0vsj.getPath());
        sb.append(File.separator);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C1255950imv.LIZ);
        sbLIZ3.append(str);
        sb.append(C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ3)));
        return new C0VSJ(sb.toString());
    }

    public static FeedItemList LIZIZ(String str) {
        C0VSJ c0vsjLIZ = LIZ(str);
        if (c0vsjLIZ != null && c0vsjLIZ.exists()) {
            String strLJII = "";
            synchronized (C1253720ijK.LIZ) {
                try {
                    try {
                        C2137908Zd.LIZJ.getClass();
                        strLJII = C2137908Zd.LJII(c0vsjLIZ, "UTF-8");
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(strLJII)) {
                try {
                    return (FeedItemList) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strLJII, FeedItemList.class);
                } catch (l e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return null;
                } catch (s e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return null;
                } catch (UnsupportedOperationException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C2344809Gs.LJI(e4);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static void LIZJ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            if (aweme != null && C1003680cE2.LIZLLL(aweme)) {
                it2.remove();
            }
        }
    }

    public static void LIZLLL(final String str, String str2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAwemeCache fragmentUidTag ");
        sbLIZ.append(str2);
        sbLIZ.append(",  map:  ");
        Map<String, Boolean> map = C1253720ijK.LJFF;
        sbLIZ.append(map);
        C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        if ((!map.isEmpty()) && (str2 == null || Intrinsics.LJFF(((LinkedHashMap) map).get(str2), Boolean.TRUE))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getAwemeCache isNotEmpty fragmentUidTag ");
            sbLIZ2.append(str2);
            C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (map.isEmpty() && C1253720ijK.LJ) {
            if (str2 != null) {
                map.put(str2, Boolean.TRUE);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getAwemeCache hasReadCache ");
            sbLIZ3.append(C1253720ijK.LJ);
            C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        C1253720ijK.LJ = true;
        if (str2 != null) {
            map.put(str2, Boolean.TRUE);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(" getAwemeCache userId: ");
        sbLIZ4.append(str);
        C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ4));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C844470XAv.LIZ.getClass();
        ((InterfaceC1255750imb) C1488560oq6.LIZ(C844470XAv.LIZ(), InterfaceC1255750imb.class)).LIZ();
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0ima
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<FeedItemList> c09aj) {
                C1C7U.LIZ("ProfileAwemeCacheManager$Companion@eddc.getCachedPostList$1");
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(" getAwemeCache Observable starTime: ");
                sbLIZ5.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ5));
                Object obj = C1253720ijK.LIZ;
                FeedItemList feedItemListLIZIZ = C1255730imZ.LIZIZ(str);
                if (feedItemListLIZIZ == null) {
                    feedItemListLIZIZ = new FeedItemList();
                }
                feedItemListLIZIZ.dataUserId = str;
                feedItemListLIZIZ.hasMore = 0;
                C1255730imZ.LIZJ(feedItemListLIZIZ.getItems());
                C1255730imZ.LJ(str, feedItemListLIZIZ.getItems());
                c09aj.onNext(feedItemListLIZIZ);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(" getAwemeCache Observable end: ");
                sbLIZ6.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ6));
                C1C7U.LIZIZ("ProfileAwemeCacheManager$Companion@eddc.getCachedPostList$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0ijL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ProfileAwemeCacheManager$Companion@eddc.getAwemeCache$3");
                FeedItemList feedItemList = (FeedItemList) obj;
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(" getAwemeCache Observable endTime: ");
                sbLIZ5.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ5));
                C1253720ijK.LIZJ = feedItemList;
                if (((Boolean) C1ELC.LJ.getValue()).booleanValue()) {
                    C1720106oR.LJI("Profile_ProfileAwemeCacheManager", " getAwemeCache start preload image: ");
                    ProfileTabApi.LIZJ(C1253720ijK.LIZJ, true);
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("getAwemeCache call back ");
                sbLIZ6.append(C1253720ijK.LIZIZ);
                sbLIZ6.append(" , awemeList: ");
                sbLIZ6.append(C1253720ijK.LIZJ);
                C1720106oR.LJI("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ6));
                InterfaceC1253680ijG interfaceC1253680ijG = C1253720ijK.LIZIZ;
                if (interfaceC1253680ijG != null) {
                    ((C1258300iqi) interfaceC1253680ijG).LIZIZ(feedItemList);
                }
                C1C7U.LIZIZ("ProfileAwemeCacheManager$Companion@eddc.getAwemeCache$3");
            }
        }, new C09JN() { // from class: X.0ijM
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                C1C7U.LIZ("ProfileAwemeCacheManager$Companion@eddc.getAwemeCache$4");
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("api requestError: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ5.append(message);
                C1720106oR.LIZ("Profile_ProfileAwemeCacheManager", C2188811AlT.LIZIZ(sbLIZ5));
                if (th instanceof Exception) {
                    Object obj2 = C1253720ijK.LIZ;
                    C1253720ijK.LIZLLL = (Exception) th;
                    InterfaceC1253680ijG interfaceC1253680ijG = C1253720ijK.LIZIZ;
                    if (interfaceC1253680ijG != null) {
                        ((C1258300iqi) interfaceC1253680ijG).LIZ();
                    }
                } else {
                    Object obj3 = C1253720ijK.LIZ;
                    C1253720ijK.LIZLLL = new Exception(th);
                    InterfaceC1253680ijG interfaceC1253680ijG2 = C1253720ijK.LIZIZ;
                    if (interfaceC1253680ijG2 != null) {
                        ((C1258300iqi) interfaceC1253680ijG2).LIZ();
                    }
                }
                C1C7U.LIZIZ("ProfileAwemeCacheManager$Companion@eddc.getAwemeCache$4");
            }
        });
    }

    public static void LJ(String str, List list) {
        if (!Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), str)) {
            return;
        }
        List<Aweme> publishingAwemesByPermission = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getPublishingAwemesByPermission(Boolean.FALSE);
        int iLIZ = C737200Svu.LIZ(list);
        for (Aweme aweme : publishingAwemesByPermission) {
            if (list.size() == 0) {
                list.add(aweme);
            } else {
                String scheduleId = AwemeBizExtKt.getScheduleId(aweme);
                if (scheduleId == null) {
                    scheduleId = "";
                }
                if (C737200Svu.LIZIZ(scheduleId, list) < 0) {
                    ListProtector.add(list, iLIZ, aweme);
                }
            }
        }
    }
}
