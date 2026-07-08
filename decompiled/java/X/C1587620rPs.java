package X;

import Y.ARunnableS78S0200000_9;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedListApi;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedPreload;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.service.FriendsTabDebugRequestParams;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.ss.android.ugc.aweme.service.Response;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587620rPs {
    public static boolean LIZIZ() {
        return FriendsFeedListApi.LJ.getValue().booleanValue();
    }

    public static int LIZLLL() {
        return (ComplianceServiceProvider.LJI().LJIIJ(false) && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) ? 1 : 0;
    }

    public static void LJFF(String str) {
        PowerPreloadServiceImpl.LIZIZ().LIZ("/tiktok/v1/friend/friend_feed", null);
        C1587540rPk.LL.getClass();
        EnumC1587000rOs enumC1587000rOs = EnumC1587000rOs.FYP_GUIDE_CARD;
        if (Intrinsics.LJFF(str, enumC1587000rOs.getScene())) {
            C1587540rPk.LLIZ = null;
        } else {
            C1587540rPk.LLILZLL = null;
        }
        if (Intrinsics.LJFF(str, enumC1587000rOs.getScene()) && !C1587540rPk.LLIZLLLIL) {
            C1587540rPk.LLILLL = 0L;
        } else {
            C1587540rPk.LLILLJJLI = 0L;
        }
    }

    public static void LIZ(FriendsFeedResponse friendsFeedResponse, String str) {
        int size;
        String aid;
        FriendsFeed friendsFeed;
        Aweme aweme;
        if (str != null && str.length() != 0) {
            try {
                List list = (List) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<List<? extends String>>() { // from class: X.0rPv
                }.getType());
                List<FriendsFeed> list2 = friendsFeedResponse.friendFeedData;
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                if (list.size() > size) {
                    return;
                }
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    for (int i2 = 0; i2 < size; i2++) {
                        List<FriendsFeed> list3 = friendsFeedResponse.friendFeedData;
                        if (list3 != null && (friendsFeed = (FriendsFeed) C13LP.LJJJLZIJ(i2, list3)) != null && (aweme = friendsFeed.getAweme()) != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        if (Intrinsics.LJFF(aid, list.get(i))) {
                            if (i2 != -1) {
                                List<FriendsFeed> list4 = friendsFeedResponse.friendFeedData;
                                if (list4 != null) {
                                    FriendsFeed friendsFeed2 = list4.get(i);
                                    FriendsFeed friendsFeed3 = list4.get(i2);
                                    List<FriendsFeed> list5 = friendsFeedResponse.friendFeedData;
                                    if (list5 != null) {
                                        list5.set(i, friendsFeed3);
                                    }
                                    List<FriendsFeed> list6 = friendsFeedResponse.friendFeedData;
                                    if (list6 != null) {
                                        list6.set(i2, friendsFeed2);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "adjustRespOrderWithAwemeIds");
            }
        }
    }

    public static void LJ(final String str, final String str2, final String str3) {
        boolean zLJI = MethodIDManager.LJI(137773);
        if (C1906580ziK.LJI() && ((Boolean) C278450Avj.LIZ.getValue()).booleanValue()) {
            new C1587640rPu("/tiktok/v1/friend/friend_feed", "background_request", str, str3).LIZ();
            if (Intrinsics.LJFF(str, EnumC1587000rOs.NUMBER_DOT_CHANGE.getScene())) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        PowerPreloadServiceImpl.LIZIZ().LIZ("/tiktok/v1/friend/friend_feed", null);
        C1587540rPk.LL.getClass();
        EnumC1587000rOs enumC1587000rOs = EnumC1587000rOs.FYP_GUIDE_CARD;
        if (Intrinsics.LJFF(str, enumC1587000rOs.getScene())) {
            C1587540rPk.LLIZ = null;
        } else {
            C1587540rPk.LLILZLL = null;
        }
        if (Intrinsics.LJFF(str, enumC1587000rOs.getScene()) && !C1587540rPk.LLIZLLLIL) {
            C1587540rPk.LLILLL = 0L;
        } else {
            C1587540rPk.LLILLJJLI = 0L;
        }
        final C238400w2 c238400w2 = new C238400w2();
        final C238400w2 c238400w22 = new C238400w2();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c238400w2.element = jElapsedRealtime;
        c238400w22.element = jElapsedRealtime - C1150504el.LIZ().LJJIII;
        C20153113tJ c20153113tJ = C20152913tH.LIZLLL;
        InterfaceC20153213tK interfaceC20153213tK = new InterfaceC20153213tK() { // from class: X.0rPl
            @Override // X.InterfaceC20153213tK
            public final void LIZ(C20152113t9 c20152113t9) {
                Bundle bundle = new Bundle();
                C238400w2 c238400w23 = c238400w2;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                bundle.putLong("start_time", c238400w23.element);
                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, str4, bundle);
                C786410Ut5.LJJJI("aweme_ids", str5, bundle);
                C786410Ut5.LJJJI("red_dot_source", str6, bundle);
                final C238400w2 c238400w24 = c238400w2;
                final C238400w2 c238400w25 = c238400w22;
                final String str7 = str;
                final String str8 = str3;
                c20152113t9.LIZ(bundle, FriendsFeedPreload.class, new InterfaceC1726310v1Z() { // from class: X.0rPj
                    @Override // X.InterfaceC1726310v1Z
                    public final void LIZ(Exception exc) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - c238400w24.element;
                        String message = exc.getMessage();
                        if (message == null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onFail ");
                            sbLIZ.append(C13LE.LIZ(exc.getClass()).LJI());
                            message = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        long j = c238400w25.element;
                        long j2 = FriendsFeedListApi.LIZJ;
                        long j3 = 0;
                        if (j2 > 0) {
                            j3 = c238400w24.element - j2;
                        }
                        C1587790rQ9 c1587790rQ9 = new C1587790rQ9(str7, j, j3, jElapsedRealtime2, false, -1, message, 0, str8, 384);
                        C1587740rQ4.LIZ.getClass();
                        C1587740rQ4.LIZLLL(c1587790rQ9);
                        FriendsFeedListApi.LIZJ = c238400w24.element;
                    }

                    @Override // X.InterfaceC1726310v1Z
                    public final void onSuccess(Object obj) {
                        boolean z;
                        int i;
                        String str9;
                        int size;
                        Aweme aweme;
                        List<FriendsFeed> list;
                        C1587540rPk c1587540rPk = C1587540rPk.LL;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String str10 = str7;
                        EnumC1587000rOs enumC1587000rOs2 = EnumC1587000rOs.FYP_GUIDE_CARD;
                        boolean zLJFF = Intrinsics.LJFF(str10, enumC1587000rOs2.getScene());
                        c1587540rPk.getClass();
                        if (zLJFF && !C1587540rPk.LLIZLLLIL) {
                            C1587540rPk.LLILLL = jCurrentTimeMillis;
                        } else {
                            C1587540rPk.LLILLJJLI = jCurrentTimeMillis;
                        }
                        boolean z2 = obj instanceof FriendsFeedResponse;
                        FriendsFeedResponse friendsFeedResponse = null;
                        if (z2) {
                            friendsFeedResponse = (FriendsFeedResponse) obj;
                        }
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        long j = c238400w24.element;
                        long j2 = jElapsedRealtime2 - j;
                        if (obj != null && (obj instanceof FriendsFeedResponse) && ((BaseResponse) obj).status_code == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (friendsFeedResponse != null) {
                            i = friendsFeedResponse.status_code;
                        } else {
                            i = -2;
                        }
                        if (friendsFeedResponse == null || (str9 = friendsFeedResponse.status_msg) == null) {
                            str9 = "onSuccess";
                        }
                        long j3 = c238400w25.element;
                        long j4 = FriendsFeedListApi.LIZJ;
                        long j5 = 0;
                        if (j4 > 0) {
                            j5 = j - j4;
                        }
                        if (friendsFeedResponse != null && (list = friendsFeedResponse.friendFeedData) != null) {
                            size = list.size();
                        } else {
                            size = 0;
                        }
                        C1587790rQ9 c1587790rQ9 = new C1587790rQ9(str7, j3, j5, j2, z, i, str9, size, str8, 256);
                        C1587740rQ4.LIZ.getClass();
                        C1587740rQ4.LIZLLL(c1587790rQ9);
                        FriendsFeedListApi.LIZJ = c238400w24.element;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (C1906580ziK.LIZ() && C1589640rT8.LIZIZ.l2()) {
                            C1587620rPs.LJFF("curActivity is IMainActivity && FriendsFeedService.isCurrentInFriendsFeed()");
                            return;
                        }
                        if (z2) {
                            FriendsFeedResponse friendsFeedResponse2 = (FriendsFeedResponse) obj;
                            if (Intrinsics.LJFF(str7, enumC1587000rOs2.getScene()) && !C1587540rPk.LLIZLLLIL) {
                                C1587540rPk.LLIZ = friendsFeedResponse2;
                            } else {
                                C1587540rPk.LLILZLL = friendsFeedResponse2;
                            }
                            C1516430pZ3 c1516430pZ3 = C1516430pZ3.LL;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            c1516430pZ3.getClass();
                            C1516430pZ3.LLILLL.storeLong("client_read_gids_report_time", jCurrentTimeMillis2);
                            List<FriendsFeed> list2 = friendsFeedResponse2.friendFeedData;
                            if (list2 != null && (!list2.isEmpty())) {
                                ArrayList arrayList = new ArrayList();
                                for (FriendsFeed friendsFeed : list2) {
                                    if (friendsFeed.getFeedType() == 1) {
                                        arrayList.add(friendsFeed);
                                    }
                                }
                                FriendsFeed friendsFeed2 = (FriendsFeed) C13LP.LJJJLZIJ(0, arrayList);
                                if (friendsFeed2 != null && (aweme = friendsFeed2.getAweme()) != null) {
                                    C823050WQl.LIZLLL().execute(new ARunnableS78S0200000_9(aweme, activityLJFF, 26));
                                    return;
                                }
                            }
                            FriendsFeedListApi.FriendsFeedApi friendsFeedApi = FriendsFeedListApi.LIZ;
                            C1587620rPs.LJFF("preloadVideoCover logic");
                        }
                    }
                }, Boolean.FALSE);
            }
        };
        c20153113tJ.getClass();
        C20153113tJ.LIZJ(interfaceC20153213tK);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJI(FriendsFeedResponse friendsFeedResponse, int i, int i2, List list, List list2, String str, String str2) {
        IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        if (iFriendsTabDebugService != null) {
            new FriendsTabDebugRequestParams(str2, i, i2, list, list2, str);
            iFriendsTabDebugService.LIZ();
        }
        FriendsFeedResponse friendsFeedResponseLJI = FriendsFeedResponse.LJI(friendsFeedResponse, null, 1023);
        IFriendsTabDebugService iFriendsTabDebugService2 = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        if (iFriendsTabDebugService2 != null) {
            new Response(friendsFeedResponseLJI.source, friendsFeedResponseLJI.hasMore, null, friendsFeedResponseLJI.lastViewItemId, friendsFeedResponseLJI.pageToken, friendsFeedResponseLJI.preload, friendsFeedResponseLJI.LL);
            iFriendsTabDebugService2.LIZLLL();
        }
        if (friendsFeedResponseLJI.friendFeedData != null) {
            ((IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class)).LIZIZ();
        }
        IFriendsTabDebugService iFriendsTabDebugService3 = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        Application applicationLIZ = C1BWL.LIZ();
        if (applicationLIZ != null) {
            C786410Ut5.M3(applicationLIZ);
        }
        iFriendsTabDebugService3.LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0223 A[Catch: Exception -> 0x04aa, TRY_ENTER, TryCatch #1 {Exception -> 0x04aa, blocks: (B:3:0x0011, B:5:0x0029, B:7:0x002f, B:9:0x0047, B:11:0x004f, B:12:0x0051, B:26:0x009b, B:32:0x00ae, B:33:0x00cb, B:35:0x00d1, B:36:0x00dd, B:38:0x00e9, B:39:0x00ef, B:41:0x00fe, B:43:0x0102, B:49:0x0118, B:51:0x0126, B:52:0x012b, B:72:0x0197, B:74:0x01ab, B:78:0x01bc, B:80:0x01d0, B:84:0x01e1, B:88:0x01f6, B:92:0x0207, B:96:0x0214, B:100:0x0223, B:45:0x010c, B:15:0x0075, B:19:0x0084, B:22:0x0090), top: B:238:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0249 A[Catch: Exception -> 0x04a8, TryCatch #2 {Exception -> 0x04a8, blocks: (B:138:0x032a, B:55:0x0135, B:66:0x0165, B:70:0x0178, B:76:0x01b6, B:82:0x01db, B:86:0x01f0, B:90:0x0201, B:94:0x020e, B:98:0x021d, B:102:0x022a, B:104:0x0249, B:105:0x024c, B:65:0x0162, B:106:0x0254, B:109:0x0265, B:111:0x0284, B:113:0x0298, B:114:0x02a0, B:116:0x02a6, B:118:0x02ba, B:119:0x02c2, B:121:0x02c8, B:122:0x02d4, B:124:0x02da, B:125:0x02e2, B:127:0x02e8, B:128:0x02ec, B:130:0x02f2, B:131:0x02f8, B:133:0x02fe, B:134:0x0302, B:136:0x0321, B:137:0x0324, B:57:0x013e, B:59:0x0142, B:61:0x0150), top: B:239:0x0114, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165 A[Catch: Exception -> 0x04a8, TryCatch #2 {Exception -> 0x04a8, blocks: (B:138:0x032a, B:55:0x0135, B:66:0x0165, B:70:0x0178, B:76:0x01b6, B:82:0x01db, B:86:0x01f0, B:90:0x0201, B:94:0x020e, B:98:0x021d, B:102:0x022a, B:104:0x0249, B:105:0x024c, B:65:0x0162, B:106:0x0254, B:109:0x0265, B:111:0x0284, B:113:0x0298, B:114:0x02a0, B:116:0x02a6, B:118:0x02ba, B:119:0x02c2, B:121:0x02c8, B:122:0x02d4, B:124:0x02da, B:125:0x02e2, B:127:0x02e8, B:128:0x02ec, B:130:0x02f2, B:131:0x02f8, B:133:0x02fe, B:134:0x0302, B:136:0x0321, B:137:0x0324, B:57:0x013e, B:59:0x0142, B:61:0x0150), top: B:239:0x0114, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1 A[Catch: Exception -> 0x04aa, TRY_ENTER, TryCatch #1 {Exception -> 0x04aa, blocks: (B:3:0x0011, B:5:0x0029, B:7:0x002f, B:9:0x0047, B:11:0x004f, B:12:0x0051, B:26:0x009b, B:32:0x00ae, B:33:0x00cb, B:35:0x00d1, B:36:0x00dd, B:38:0x00e9, B:39:0x00ef, B:41:0x00fe, B:43:0x0102, B:49:0x0118, B:51:0x0126, B:52:0x012b, B:72:0x0197, B:74:0x01ab, B:78:0x01bc, B:80:0x01d0, B:84:0x01e1, B:88:0x01f6, B:92:0x0207, B:96:0x0214, B:100:0x0223, B:45:0x010c, B:15:0x0075, B:19:0x0084, B:22:0x0090), top: B:238:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f6 A[Catch: Exception -> 0x04aa, TRY_ENTER, TryCatch #1 {Exception -> 0x04aa, blocks: (B:3:0x0011, B:5:0x0029, B:7:0x002f, B:9:0x0047, B:11:0x004f, B:12:0x0051, B:26:0x009b, B:32:0x00ae, B:33:0x00cb, B:35:0x00d1, B:36:0x00dd, B:38:0x00e9, B:39:0x00ef, B:41:0x00fe, B:43:0x0102, B:49:0x0118, B:51:0x0126, B:52:0x012b, B:72:0x0197, B:74:0x01ab, B:78:0x01bc, B:80:0x01d0, B:84:0x01e1, B:88:0x01f6, B:92:0x0207, B:96:0x0214, B:100:0x0223, B:45:0x010c, B:15:0x0075, B:19:0x0084, B:22:0x0090), top: B:238:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0207 A[Catch: Exception -> 0x04aa, TRY_ENTER, TryCatch #1 {Exception -> 0x04aa, blocks: (B:3:0x0011, B:5:0x0029, B:7:0x002f, B:9:0x0047, B:11:0x004f, B:12:0x0051, B:26:0x009b, B:32:0x00ae, B:33:0x00cb, B:35:0x00d1, B:36:0x00dd, B:38:0x00e9, B:39:0x00ef, B:41:0x00fe, B:43:0x0102, B:49:0x0118, B:51:0x0126, B:52:0x012b, B:72:0x0197, B:74:0x01ab, B:78:0x01bc, B:80:0x01d0, B:84:0x01e1, B:88:0x01f6, B:92:0x0207, B:96:0x0214, B:100:0x0223, B:45:0x010c, B:15:0x0075, B:19:0x0084, B:22:0x0090), top: B:238:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0214 A[Catch: Exception -> 0x04aa, TRY_ENTER, TryCatch #1 {Exception -> 0x04aa, blocks: (B:3:0x0011, B:5:0x0029, B:7:0x002f, B:9:0x0047, B:11:0x004f, B:12:0x0051, B:26:0x009b, B:32:0x00ae, B:33:0x00cb, B:35:0x00d1, B:36:0x00dd, B:38:0x00e9, B:39:0x00ef, B:41:0x00fe, B:43:0x0102, B:49:0x0118, B:51:0x0126, B:52:0x012b, B:72:0x0197, B:74:0x01ab, B:78:0x01bc, B:80:0x01d0, B:84:0x01e1, B:88:0x01f6, B:92:0x0207, B:96:0x0214, B:100:0x0223, B:45:0x010c, B:15:0x0075, B:19:0x0084, B:22:0x0090), top: B:238:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse LIZJ(int r51, int r52, java.lang.String r53, java.util.List r54, java.util.List r55, java.util.List r56, java.util.List r57, java.lang.String r58, java.lang.String r59, boolean r60, boolean r61) {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587620rPs.LIZJ(int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, boolean):com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse");
    }
}
