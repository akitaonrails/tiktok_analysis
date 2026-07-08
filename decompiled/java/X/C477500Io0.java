package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendShowUser;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiTopLiveEnableToastWithLogSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Io0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477500Io0 {
    public static long LIZIZ;
    public static final C477500Io0 LIZ = new C477500Io0();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(403));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(404));

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<webcast.api.feed.LiveTab> LJIIJ() {
        /*
            java.util.List r1 = com.bytedance.android.livesdk.livesetting.linkmic.TopLiveTabsSetting.getTopLiveTabs()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L13:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r4 = r5.next()
            com.bytedance.android.livesdk.livesetting.linkmic.TopLiveTabsSetting$TopLiveTab r4 = (com.bytedance.android.livesdk.livesetting.linkmic.TopLiveTabsSetting.TopLiveTab) r4
            webcast.api.feed.LiveTab r3 = new webcast.api.feed.LiveTab
            r3.<init>()
            java.lang.String r0 = r4.id
            java.lang.String r2 = "discover"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L56
            r0 = 1
        L2f:
            r3.type = r0
            java.lang.String r1 = r4.title
            if (r1 == 0) goto L4b
            X.0Io0 r0 = X.C477500Io0.LIZ
            r0.getClass()
            java.lang.String r0 = LJIIL(r1)
            if (r0 == 0) goto L4b
            r2 = r0
        L41:
            r3.name = r2
            java.lang.String r0 = ""
            r3.content = r0
            r6.add(r3)
            goto L13
        L4b:
            java.lang.String r0 = r4.id
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L41
            java.lang.String r2 = "hangout"
            goto L41
        L56:
            r0 = 2
            goto L2f
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477500Io0.LJIIJ():java.util.List");
    }

    public static String LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hangout_audio_");
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(RecommendItem recommendItem) {
        Object c098200Yq;
        String string;
        User user;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (recommendItem != null) {
            LIZ.getClass();
            linkedHashMap.put("mg_distribution_type", LJI(recommendItem));
            RecommendShowUser recommendShowUser = recommendItem.user;
            if (recommendShowUser == null || (user = recommendShowUser.user) == null || (string = Long.valueOf(user.getId()).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("distribution_user_id", string);
            linkedHashMap.put("distribution_user_list", LJII(recommendItem));
        }
        try {
            c098200Yq = URLEncoder.encode(C1516000pYM.LIZJ(linkedHashMap), "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static String LJI(RecommendItem recommendItem) {
        int i = recommendItem.skylightItemType;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return "anchor";
                    }
                    return "both_guest_guest";
                }
                return "both_guest_anchor";
            }
            return "both_anchor_guest";
        }
        return "guest";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJII(com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem r8) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477500Io0.LJII(com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem):java.lang.String");
    }

    public static String LJIIIIZZ(RecommendItem recommendItem) {
        boolean z;
        if (recommendItem == null) {
            return "";
        }
        int i = recommendItem.skylightItemType;
        if (i == 7) {
            return "outroom_friend";
        }
        GuestApplyInfo guestApplyInfo = recommendItem.guestApplyInfo;
        if (guestApplyInfo == null || i != 6) {
            return "";
        }
        if (LJIILIIL(i, guestApplyInfo)) {
            return "mg_apply_accepted";
        }
        boolean z2 = true;
        if (guestApplyInfo.applyStatus == 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isHangupApplyPending, result= ");
        sbLIZ.append(z);
        sbLIZ.append(", skylightItemType=");
        sbLIZ.append(i);
        sbLIZ.append(",applyStatus=");
        sbLIZ.append(Integer.valueOf(guestApplyInfo.applyStatus));
        sbLIZ.append(", permitTime=");
        sbLIZ.append(Long.valueOf(guestApplyInfo.permitTime));
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            return "mg_applying";
        }
        if (guestApplyInfo.applyStatus != 1 || C158B.LIZJ() < guestApplyInfo.permitExpireTime) {
            z2 = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isHangupApplyExpired, result= ");
        sbLIZ2.append(z2);
        sbLIZ2.append(", skylightItemType=");
        sbLIZ2.append(i);
        sbLIZ2.append(",applyStatus=");
        sbLIZ2.append(Integer.valueOf(guestApplyInfo.applyStatus));
        sbLIZ2.append(", time=");
        sbLIZ2.append(C158B.LIZJ());
        sbLIZ2.append(", permitTime=");
        sbLIZ2.append(Long.valueOf(guestApplyInfo.permitTime));
        sbLIZ2.append(", permitExpireTime=");
        sbLIZ2.append(Long.valueOf(guestApplyInfo.permitExpireTime));
        sbLIZ2.append(", ");
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ2));
        if (!z2) {
            return "";
        }
        return "mg_apply_expired";
    }

    public static String LJIIIZ(FeedItem feedItem) {
        GuestApplyInfo guestApplyInfo;
        if (feedItem == null || feedItem.type != 21 || (guestApplyInfo = feedItem.skylightMultiGuestApplyInfo) == null) {
            return null;
        }
        if (guestApplyInfo.applyStatus == 1) {
            long j = guestApplyInfo.permitTime;
            long j2 = guestApplyInfo.permitExpireTime;
            long jLIZJ = C158B.LIZJ();
            if (j <= jLIZJ && jLIZJ < j2) {
                return "mg_apply_accepted";
            }
        }
        int i = guestApplyInfo.applyStatus;
        if (i == 0) {
            return "mg_applying";
        }
        if (i != 1 || C158B.LIZJ() < guestApplyInfo.permitExpireTime) {
            return null;
        }
        return "mg_apply_expired";
    }

    public static String LJIIJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_merge_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        LiveFeedDraw.Companion.getClass();
        sbLIZ2.append(C0ISY.LIZIZ(strLIZIZ));
        sbLIZ2.append("_match");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String LJIIL(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Integer numValueOf = Integer.valueOf(C786410Ut5.n3(contextLIZ.getResources(), str, "string", contextLIZ.getPackageName()));
        if (numValueOf.intValue() <= 0) {
            return null;
        }
        return contextLIZ.getResources().getString(numValueOf.intValue());
    }

    public static boolean LJIILL(RecommendedRoom recommendedRoom) {
        boolean z = true;
        if (recommendedRoom == null || (recommendedRoom.roomType != 1 && recommendedRoom.roomType != 2)) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isRandomMatchSuccess, source= ");
        sbLIZ.append("StartRandomMatchSucceed");
        sbLIZ.append(", result= ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static C477680IoI LJIJ(Throwable th) {
        Integer numValueOf;
        String strValueOf;
        String message = th.getMessage();
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            numValueOf = Integer.valueOf(c501470JlZ.getErrorCode());
            String errorMsg = c501470JlZ.getErrorMsg();
            if (errorMsg != null && errorMsg.length() != 0) {
                message = c501470JlZ.getErrorMsg();
            } else {
                String prompt = c501470JlZ.getPrompt();
                if (prompt != null && prompt.length() != 0) {
                    message = c501470JlZ.getPrompt();
                } else {
                    message = c501470JlZ.getMessage();
                }
            }
            if (c501470JlZ instanceof C477520Io2) {
                strValueOf = ((C477520Io2) th).getxTtLogId();
            } else {
                strValueOf = c501470JlZ.getLogId();
            }
        } else {
            numValueOf = null;
            if (th instanceof C1811850xFX) {
                strValueOf = String.valueOf(((C1811850xFX) th).getCronetError());
            } else {
                strValueOf = null;
            }
        }
        return new C477680IoI(numValueOf, message, strValueOf);
    }

    public static boolean LJIILIIL(int i, GuestApplyInfo guestApplyInfo) {
        Integer numValueOf;
        Long lValueOf;
        boolean z = false;
        if (6 == i && guestApplyInfo != null && guestApplyInfo.applyStatus == 1) {
            long j = guestApplyInfo.permitTime;
            long j2 = guestApplyInfo.permitExpireTime;
            long jLIZJ = C158B.LIZJ();
            if (j <= jLIZJ && jLIZJ < j2) {
                z = true;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isHangupApplyAccept, result= ");
        sbLIZ.append(z);
        sbLIZ.append(", skylightItemType=");
        sbLIZ.append(i);
        sbLIZ.append(",applyStatus=");
        Long lValueOf2 = null;
        if (guestApplyInfo != null) {
            numValueOf = Integer.valueOf(guestApplyInfo.applyStatus);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", time=");
        sbLIZ.append(C158B.LIZJ());
        sbLIZ.append(", permitTime=");
        if (guestApplyInfo != null) {
            lValueOf = Long.valueOf(guestApplyInfo.permitTime);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", permitExpireTime=");
        if (guestApplyInfo != null) {
            lValueOf2 = Long.valueOf(guestApplyInfo.permitExpireTime);
        }
        sbLIZ.append(lValueOf2);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static boolean LJIILJJIL(GuestApplyInfo guestApplyInfo, Integer num) {
        Integer numValueOf;
        Long lValueOf;
        boolean z = false;
        if (num != null && num.intValue() == 0 && guestApplyInfo != null && guestApplyInfo.applyStatus == 1) {
            long j = guestApplyInfo.permitTime;
            long j2 = guestApplyInfo.permitExpireTime;
            long jLIZJ = C158B.LIZJ();
            if (j <= jLIZJ && jLIZJ < j2) {
                z = true;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isHangupApplyAccept, result= ");
        sbLIZ.append(z);
        sbLIZ.append(", mgUpdateSkylightType=");
        sbLIZ.append(num);
        sbLIZ.append(",applyStatus=");
        Long lValueOf2 = null;
        if (guestApplyInfo != null) {
            numValueOf = Integer.valueOf(guestApplyInfo.applyStatus);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", time=");
        sbLIZ.append(C158B.LIZJ());
        sbLIZ.append(", permitTime=");
        if (guestApplyInfo != null) {
            lValueOf = Long.valueOf(guestApplyInfo.permitTime);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", permitExpireTime=");
        if (guestApplyInfo != null) {
            lValueOf2 = Long.valueOf(guestApplyInfo.permitExpireTime);
        }
        sbLIZ.append(lValueOf2);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static void LJIILLIIL(String str, String str2, Throwable th) {
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("legolas_");
            sbLIZ.append(str);
            C20441214yg.LJFF(C2188811AlT.LIZIZ(sbLIZ), str2, th);
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && !(th instanceof C501470JlZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(':');
                sbLIZ2.append(th.getMessage());
                C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("legolas_");
        sbLIZ3.append(str);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), str2);
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || !LiveMultiTopLiveEnableToastWithLogSetting.INSTANCE.isEnable()) {
            return;
        }
        C766270U4b.LJIIJJI(str2);
    }

    public static ArrayList LIZIZ(String str, long j, List list, String str2) {
        if (list != null) {
            list.size();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Room room = (Room) it2.next();
                if (room.getId() != j) {
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    C464330IIt.LJ(room, enterRoomConfig);
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                    roomsData.enterMethod = str2;
                    roomsData.enterFromMerge = "live_merge";
                    enterRoomConfig.mLogData.requestId = str;
                    arrayList.add(enterRoomConfig);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C477500Io0 r7, long r8, java.lang.String r10, java.lang.String r11, java.lang.Long r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477500Io0.LIZLLL(X.0Io0, long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r9, long r10, java.lang.Long r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477500Io0.LIZJ(int, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C477500Io0 r12, long r13, com.bytedance.android.livesdkapi.depend.model.live.Room r15, java.lang.String r16, java.lang.Long r17, java.lang.String r18, boolean r19, X.C477510Io1 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477500Io0.LJ(X.0Io0, long, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.Long, java.lang.String, boolean, X.0Io1, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(X.C477500Io0 r18, long r19, com.bytedance.android.livesdkapi.depend.model.live.Room r21, java.lang.String r22, java.lang.Long r23, java.lang.String r24, boolean r25, X.C477510Io1 r26, java.lang.String r27, java.lang.Integer r28, com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem r29, java.util.List r30, java.lang.Integer r31, java.lang.String r32, X.EnumC477480Iny r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477500Io0.LJIJI(X.0Io0, long, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.Long, java.lang.String, boolean, X.0Io1, java.lang.String, java.lang.Integer, com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem, java.util.List, java.lang.Integer, java.lang.String, X.0Iny, java.lang.String, int):void");
    }
}
