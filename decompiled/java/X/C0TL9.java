package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LiveFollowGuideFrequencyControlConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TL9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TL9 {
    public static List<String> LIZLLL;
    public static List<String> LJ;
    public static final List<Long> LIZ = new ArrayList();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(394));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(395));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(393));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(392));

    public static boolean LIZJ() {
        int i = ((LiveFollowGuideFrequencyControlConfig) C0TLA.LIZIZ.getValue()).maxShowTimes;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = LJII().getLong(LIZLLL(), 0L);
            if (j > 0 && jCurrentTimeMillis < j) {
                return true;
            }
            List listLJI = LJI();
            if (listLJI != null) {
                Iterator it2 = ((ArrayList) listLJI).iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (jCurrentTimeMillis - CastLongProtector.parseLong((String) it2.next()) <= 86400000) {
                        i2++;
                    }
                    if (i2 >= i) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static List LJFF() {
        if (LIZLLL == null) {
            String[] stringArray = LJII().getStringArray(LJIIIIZZ(), new String[0]);
            ArrayList arrayList = new ArrayList();
            LIZLLL = arrayList;
            C19719612Di.LJJII(arrayList, stringArray);
        }
        return LIZLLL;
    }

    public static List LJI() {
        if (LJ == null) {
            Keva kevaLJII = LJII();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) LIZJ.getValue());
            sbLIZ.append("follow_show_frequency");
            String[] stringArray = kevaLJII.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0]);
            ArrayList arrayList = new ArrayList();
            LJ = arrayList;
            C19719612Di.LJJII(arrayList, stringArray);
        }
        return LJ;
    }

    public static Keva LJII() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) LIZJ.getValue());
        sbLIZ.append("follow_ban_end_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) LIZJ.getValue());
        sbLIZ.append("follow_close_frequency");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJ() {
        LJII().storeLong(LIZLLL(), 0L);
        List listLJFF = LJFF();
        if (listLJFF != null) {
            ArrayList arrayList = (ArrayList) listLJFF;
            arrayList.clear();
            LJII().storeStringArray(LJIIIIZZ(), (String[]) arrayList.toArray(new String[0]));
        }
    }

    public static void LJIIL() {
        List listLJFF;
        long jIntValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LJII().getLong(LIZLLL(), 0L);
        if ((j <= 0 || jCurrentTimeMillis >= j) && (listLJFF = LJFF()) != null) {
            ArrayList<String> arrayList = (ArrayList) listLJFF;
            arrayList.add(String.valueOf(jCurrentTimeMillis));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listLJFF);
            for (String str : arrayList) {
                if (jCurrentTimeMillis - CastLongProtector.parseLong(str) > ((long) ((Number) LJFF.getValue()).intValue()) * 86400000) {
                    arrayList2.remove(str);
                }
            }
            if (arrayList2.size() <= 2) {
                jIntValue = 86400000;
            } else {
                arrayList2.clear();
                jIntValue = ((long) ((Number) LJI.getValue()).intValue()) * 86400000;
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            LJII().storeLong(LIZLLL(), jCurrentTimeMillis + jIntValue);
            LJII().storeStringArray(LJIIIIZZ(), (String[]) arrayList.toArray(new String[0]));
        }
    }

    public static boolean LIZ(C1ACA c1aca) {
        long j;
        if (c1aca == null || !TextUtils.equals(c1aca.LIZLLL, "homepage_hot")) {
            return false;
        }
        List<Long> list = LIZ;
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        if (liveRoomStruct != null) {
            j = liveRoomStruct.id;
        } else {
            j = -1;
        }
        if (((ArrayList) list).contains(Long.valueOf(j))) {
            return false;
        }
        LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
        if ((liveRoomStruct2 != null && (liveRoomStruct2.hasCommerceGoods || liveRoomStruct2.existedTtlsGoods)) || LJIIIZ(c1aca)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        String str;
        long j;
        InterfaceC483300IxM interfaceC483300IxM;
        User user;
        int realtimeFollowStatus;
        int i;
        User user2;
        if (c1aca != null) {
            Aweme aweme = c1aca.LIZIZ;
            if (aweme != null) {
                LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
                if (liveRoomStruct2 != null && (user2 = liveRoomStruct2.owner) != null && user2.getFollowerStatus() == 1) {
                    i = 2;
                } else {
                    i = 1;
                }
                AwemeBizExtKt.setRealtimeFollowStatus(aweme, i);
            }
            Aweme aweme2 = c1aca.LIZIZ;
            if (aweme2 != null) {
                AwemeBizExtKt.setConsumeFollowGuide(aweme2, true);
            }
            c1aca.LJLIIL = true;
        }
        C487710JAr c487710JAr = C487710JAr.LIZ;
        String requestId = null;
        if (c1aca != null) {
            liveRoomStruct = c1aca.LIZJ;
        } else {
            liveRoomStruct = null;
        }
        c487710JAr.getClass();
        int iLIZ = C487710JAr.LIZ(liveRoomStruct);
        if (c1aca != null) {
            LiveRoomStruct liveRoomStruct3 = c1aca.LIZJ;
            if (liveRoomStruct3 != null && (user = liveRoomStruct3.owner) != null) {
                Aweme aweme3 = c1aca.LIZIZ;
                if (aweme3 != null) {
                    realtimeFollowStatus = AwemeBizExtKt.getRealtimeFollowStatus(aweme3);
                } else {
                    realtimeFollowStatus = -1;
                }
                user.setFollowStatus(realtimeFollowStatus);
            }
            LiveRoomStruct liveRoomStruct4 = c1aca.LIZJ;
            if (liveRoomStruct4 != null) {
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                C1099420eiS c1099420eiS = new C1099420eiS();
                c1099420eiS.LIZIZ(liveRoomStruct4.ownerUserId);
                c1099420eiS.LIZJ = true;
                c1099420eiS.LIZLLL();
                C1099420eiS c1099420eiS2 = c1099420eiS;
                c1099420eiS2.LJ(liveRoomStruct4.id);
                c1099420eiS2.getClass();
                interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS2));
            }
        }
        if (c1aca != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow");
            c474500IjALIZ.LJJIIZI(C0J3U.LIZ(c1aca));
            WeakReference<InterfaceC483300IxM> weakReference = c1aca.LJJLJ;
            if (weakReference != null && (interfaceC483300IxM = weakReference.get()) != null && interfaceC483300IxM.LIZ() > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_guest_connection");
            c474500IjALIZ.LJJII(Integer.valueOf(C0TKN.LIZ().versionId), "version_id");
            LiveRoomStruct liveRoomStruct5 = c1aca.LIZJ;
            if (liveRoomStruct5 != null) {
                j = liveRoomStruct5.ownerUserId;
            } else {
                j = -1;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
            c474500IjALIZ.LJJII("live_audience_c_anchor", "request_page");
            c474500IjALIZ.LJJII("preview_follow_button", "click_user_position");
            Aweme aweme4 = c1aca.LIZIZ;
            if (aweme4 != null) {
                requestId = aweme4.getRequestId();
            }
            c474500IjALIZ.LJJII(requestId, "request_id");
            c474500IjALIZ.LJJII(Integer.valueOf(iLIZ), "follow_status");
            c474500IjALIZ.LJJII(Integer.valueOf(iLIZ), "initial_follow_status");
            c474500IjALIZ.LIZ();
        }
    }

    public static long LJ(C1ACA c1aca) {
        int i;
        LiveRoomStruct liveRoomStruct;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && (feedRoomTagList = liveRoomStruct.feedRoomTagList) != null && (list = feedRoomTagList.subTags) != null && (!list.isEmpty())) {
            long j = ((FeedRoomTag) ListProtector.get(list, 0)).id;
            Iterator<Long> it2 = C0TKN.LIZ().tag2List.iterator();
            while (it2.hasNext()) {
                if (j == it2.next().longValue()) {
                    i = C0TKN.LIZ().rule1DelaySeconds;
                    break;
                }
            }
            i = C0TKN.LIZ().rule2DelaySeconds;
        } else {
            i = C0TKN.LIZ().rule2DelaySeconds;
        }
        return ((long) i) * 1000;
    }

    public static boolean LJIIIZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        User user;
        User user2;
        if (c1aca == null) {
            return false;
        }
        LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
        if ((liveRoomStruct2 == null || (user2 = liveRoomStruct2.owner) == null || user2.getFollowStatus() != 1) && ((liveRoomStruct = c1aca.LIZJ) == null || (user = liveRoomStruct.owner) == null || user.getFollowStatus() != 2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(X.C1ACA r10) {
        /*
            if (r10 == 0) goto L56
            r0 = 1
            r10.LJLI = r0
            r0 = 0
            r10.LJLIIIL = r0
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r10.LIZJ
            if (r0 == 0) goto L56
            long r2 = r0.id
        Le:
            java.util.List<java.lang.Long> r1 = X.C0TL9.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            long r9 = java.lang.System.currentTimeMillis()
            java.util.List r1 = LJI()
            if (r1 == 0) goto L87
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r5 = r1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.addAll(r1)
            java.util.Iterator r7 = r5.iterator()
        L39:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r6 = r7.next()
            java.lang.String r6 = (java.lang.String) r6
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r6)
            long r3 = r9 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L39
            r8.remove(r6)
            goto L39
        L56:
            r2 = -1
            goto Le
        L59:
            r5.clear()
            r5.addAll(r8)
            com.bytedance.keva.Keva r2 = LJII()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            X.01GW r0 = X.C0TL9.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "follow_show_frequency"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r2.storeStringArray(r1, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TL9.LJIIJJI(X.1ACA):void");
    }
}
