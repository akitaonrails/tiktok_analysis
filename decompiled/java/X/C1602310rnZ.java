package X;

import Y.AComparatorS363S0200000_9;
import Y.AfS158S0200000_24;
import Y.AfS39S1000000_24;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.CardCepConfig;
import com.ss.android.ugc.aweme.ab.HotUpdateDynamicConfig;
import com.ss.android.ugc.aweme.ab.LiveRegisterWhenFeedResumedConfig;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.LiveAwemeData;
import com.ss.android.ugc.aweme.feed.LiveAwemeList;
import com.ss.android.ugc.aweme.feed.LogPb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.DeletedLiveInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS57S0500000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.audience.WebcastIMRegistryResponse;

/* JADX INFO: renamed from: X.0rnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602310rnZ {
    public static final /* synthetic */ int LJIILL = 0;
    public final InterfaceC1602390rnh LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public int LJI;
    public long LJII;
    public C1602520rnu LJIIIIZZ;
    public boolean LJIIIZ;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C1602570rnz());
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C1568190quX());
    public final C01GW LJIIL = C452501pT.LIZIZ(new C1602510rnt());
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new C1602500rns());
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C1602490rnr());

    public final InterfaceC1602300rnY LJ() {
        return (InterfaceC1602300rnY) this.LJIIJJI.getValue();
    }

    public final int LJI() {
        if (!this.LJFF) {
            return this.LJI;
        }
        int iLJLLJ = this.LIZ.LJLLJ();
        if (iLJLLJ > 5) {
            return iLJLLJ - 5;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0rnc] */
    public final void LJIJI() {
        LiveRoomStruct liveRoomStructLJI;
        if (C1602530rnv.LIZ().mainEnable) {
            List<Aweme> listLLILIL = this.LIZ.LLILIL();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listLLILIL.size();
            for (int iLJI = LJI(); iLJI < size; iLJI++) {
                Aweme aweme = (Aweme) ListProtector.get(listLLILIL, iLJI);
                if (C1602530rnv.LIZ().mainEnable && C0J4Y.LJIIIIZZ(aweme) && (liveRoomStructLJI = C0J4Y.LJI(aweme)) != null && !liveRoomStructLJI.isShow) {
                    linkedHashSet.add(Long.valueOf(liveRoomStructLJI.id));
                }
            }
            if (linkedHashSet.isEmpty()) {
                return;
            }
            LJ().LJI(new LinkedHashSet(), linkedHashSet, new InterfaceC486460J5w() { // from class: X.0rnc
                @Override // X.InterfaceC486460J5w
                public final void onFail() {
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC486460J5w
                public final void LIZ(WebcastIMRegistryResponse.ResponseData responseData) {
                    List<WebcastIMRegistryResponse.RoomData> list;
                    LiveRoomStruct liveRoomStructLJI2;
                    EnumC1602360rne enumC1602360rne;
                    String str;
                    C1602310rnZ c1602310rnZ = this.LIZ;
                    c1602310rnZ.getClass();
                    if (responseData != null && (list = responseData.rooms) != null && (!list.isEmpty()) && 1 != 0) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (WebcastIMRegistryResponse.RoomData roomData : list) {
                            if (roomData.alive) {
                                WebcastIMRegistryResponse.FilterInfoData filterInfoData = roomData.filterInfo;
                                if (filterInfoData != null && filterInfoData.isFiltered && (str = filterInfoData.reason) != null) {
                                    int iHashCode = str.hashCode();
                                    if (iHashCode != 3524) {
                                        if (iHashCode != 106440182) {
                                            if (iHashCode == 1567246465 && str.equals("nostream")) {
                                                enumC1602360rne = EnumC1602360rne.NO_STREAM;
                                            }
                                        } else if (str.equals("pause")) {
                                            enumC1602360rne = EnumC1602360rne.PAUSE;
                                        }
                                    } else if (str.equals("nr")) {
                                        enumC1602360rne = EnumC1602360rne.NR;
                                    }
                                }
                            } else {
                                enumC1602360rne = EnumC1602360rne.FINISH;
                            }
                            if (enumC1602360rne != null) {
                                linkedHashMap.put(Long.valueOf(roomData.roomId), enumC1602360rne);
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            List<Aweme> listLLILIL2 = c1602310rnZ.LIZ.LLILIL();
                            if (!listLLILIL2.isEmpty()) {
                                int size2 = listLLILIL2.size();
                                for (int iLJI2 = c1602310rnZ.LJI(); iLJI2 < size2; iLJI2++) {
                                    Aweme aweme2 = (Aweme) ListProtector.get(listLLILIL2, iLJI2);
                                    if (aweme2 != null && C0J4Y.LJIIIIZZ(aweme2) && (liveRoomStructLJI2 = C0J4Y.LJI(aweme2)) != null) {
                                        long j = liveRoomStructLJI2.id;
                                        if (j != 0 && linkedHashMap.containsKey(Long.valueOf(j))) {
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            linkedHashMap2.put("index", String.valueOf(iLJI2));
                                            linkedHashMap2.put("update_type", "4");
                                            EnumC1602360rne enumC1602360rne2 = (EnumC1602360rne) linkedHashMap.get(Long.valueOf(liveRoomStructLJI2.id));
                                            if (enumC1602360rne2 != null && c1602310rnZ.LJIIJJI(iLJI2, aweme2, enumC1602360rne2, null, linkedHashMap2)) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public static void LIZ(User user) {
        String str;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttec_enable_ec_live_head_params", true, false) && user != null && (str = user.roomData) != null && str.length() != 0 && a0.LJJIIZI(str, "\"ec_live_head_params\"", false)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("ec_live_head_params");
                user.roomData = C786410Ut5.J3(jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static Set LJFF(List list) {
        Long lValueOf;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI((Aweme) it2.next());
            if (liveRoomStructLJI != null) {
                lValueOf = Long.valueOf(liveRoomStructLJI.id);
            } else {
                lValueOf = null;
            }
            linkedHashSet.add(String.valueOf(lValueOf));
        }
        return linkedHashSet;
    }

    public static EnumC1602360rne LJII(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
        long j = feedUserRoomMonitorMessage.roomStatus;
        long j2 = feedUserRoomMonitorMessage.streamStatus;
        if (j == 4) {
            return EnumC1602360rne.FINISH;
        }
        if (j == 101) {
            return EnumC1602360rne.NR;
        }
        if (j == 3) {
            return EnumC1602360rne.PAUSE;
        }
        if (j2 == 8) {
            return EnumC1602360rne.NO_STREAM;
        }
        if (LJIILIIL(j)) {
            return EnumC1602360rne.ROOM_STATUS_EXTRA;
        }
        return null;
    }

    public static boolean LJIILIIL(long j) {
        HotUpdateDynamicConfig hotUpdateDynamicConfig = (HotUpdateDynamicConfig) C00JF.LIZIZ.getValue();
        if (hotUpdateDynamicConfig.enable && hotUpdateDynamicConfig.extraRoomStatusList.contains(Integer.valueOf((int) j))) {
            return true;
        }
        return false;
    }

    public static void LJIILLIIL(Map map) {
        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", "success");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("livesdk_preview_card_hot_update", c2344009Gk.LIZ);
    }

    public final boolean LIZLLL(int i) {
        int iLJLLJ = this.LIZ.LJLLJ();
        if (i <= iLJLLJ || i - iLJLLJ < C1602530rnv.LIZ().distance) {
            return true;
        }
        return false;
    }

    public final void LJIJJLI(String str) {
        C11NZ<Object> c11nzLJIILIIL = ((InterfaceC1601520rmI) this.LJIIJ.getValue()).LJIILIIL(str);
        if (c11nzLJIILIIL != null) {
            c11nzLJIILIIL.LJJLL(new AfS39S1000000_24(str, 0), new AfS39S1000000_24(str, 1));
        }
    }

    public static boolean LIZIZ(List list, boolean z) {
        int size = list.size();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (C1594680rbG.LIZ((Aweme) it2.next())) {
                it2.remove();
            }
        }
        int size2 = list.size();
        if (!z && size != size2) {
            return true;
        }
        return false;
    }

    public static void LJIILL(int i, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode:");
        sbLIZ.append(i);
        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("livesdk_preview_card_hot_update", c2344009Gk.LIZ);
    }

    public final void LJIIZILJ(EnumC1602400rni enumC1602400rni, long j) {
        EnumC1602360rne enumC1602360rneLJII;
        this.LJIIIZ = false;
        C1602520rnu c1602520rnu = this.LJIIIIZZ;
        if (c1602520rnu != null && (enumC1602360rneLJII = LJII(c1602520rnu.LIZJ)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("index", String.valueOf(c1602520rnu.LIZ));
            linkedHashMap.put("update_type", "3");
            LJIIJJI(c1602520rnu.LIZ, c1602520rnu.LIZIZ, enumC1602360rneLJII, Long.valueOf(c1602520rnu.LIZJ.roomStatus), linkedHashMap);
        }
        this.LJIIIIZZ = null;
        LiveRegisterWhenFeedResumedConfig.ResumedConfig resumedConfig = (LiveRegisterWhenFeedResumedConfig.ResumedConfig) LiveRegisterWhenFeedResumedConfig.LIZIZ.getValue();
        if (resumedConfig.resumedCheck) {
            int i = C1602370rnf.LIZ[enumC1602400rni.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    if (j >= resumedConfig.backstage) {
                        LJIJI();
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            if (j < resumedConfig.switchTab) {
                return;
            }
            LJIJI();
        }
    }

    public static boolean LJIJ(Aweme aweme, FeedUserRoomMonitorMessage feedUserRoomMonitorMessage, boolean z) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null && C2093608Ic.LIZJ(author.getUid(), String.valueOf(feedUserRoomMonitorMessage.anchorId))) {
            C723240SYo c723240SYo = new C723240SYo();
            c723240SYo.LIZJ = aweme.getAid();
            c723240SYo.LIZ = author.getUid();
            c723240SYo.LIZIZ = z;
            C1440005kM.LIZ(c723240SYo);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post FrontierRoomStatusEvent: ");
            sbLIZ.append(c723240SYo.LIZIZ);
            AbstractC827810Wdf.LIZ("LiveHostRoomStateListener", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(int i, List list, boolean z, boolean z2, int i2) {
        Aweme aweme;
        Aweme aweme2;
        int i3;
        Aweme aweme3;
        int i4;
        if (i2 <= 0) {
            return false;
        }
        int size = list.size() - 1;
        int i5 = i - 1;
        Aweme aweme4 = null;
        if (i5 >= 0 && i5 <= size) {
            aweme = (Aweme) ListProtector.get(list, i5);
        } else {
            aweme = null;
        }
        int i6 = i - 2;
        if (i6 >= 0 && i6 <= size) {
            aweme2 = (Aweme) ListProtector.get(list, i6);
        } else {
            aweme2 = null;
        }
        if (z) {
            i3 = i;
        } else {
            i3 = i + 1;
        }
        if (i3 >= 0 && i3 <= size) {
            aweme3 = (Aweme) ListProtector.get(list, i3);
        } else {
            aweme3 = null;
        }
        if (z) {
            i4 = i + 1;
        } else {
            i4 = i + 2;
        }
        if (i4 >= 0 && i4 <= size) {
            aweme4 = (Aweme) ListProtector.get(list, i4);
        }
        int i7 = C1602530rnv.LIZ().gap0EdgeOpt;
        if (z2 && i7 > 0) {
            if (i7 == 1) {
                if (aweme3 == null) {
                    return true;
                }
            } else if (i7 == 2 && (aweme3 == null || aweme4 == null)) {
                return true;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            if ((aweme == null || !AwemeSaaSExtKt.isLive(aweme)) && ((aweme2 == null || !AwemeSaaSExtKt.isLive(aweme2)) && ((aweme3 == null || !AwemeSaaSExtKt.isLive(aweme3)) && (aweme4 == null || !AwemeSaaSExtKt.isLive(aweme4))))) {
                return false;
            }
        } else if ((aweme == null || !AwemeSaaSExtKt.isLive(aweme)) && (aweme3 == null || !AwemeSaaSExtKt.isLive(aweme3))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0 A[Catch: Exception -> 0x0207, TryCatch #7 {Exception -> 0x0207, blocks: (B:54:0x01b9, B:56:0x01d0, B:59:0x01df, B:61:0x01e3, B:67:0x01f4, B:69:0x01f8, B:72:0x0200, B:66:0x01ee), top: B:133:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df A[Catch: Exception -> 0x0207, TryCatch #7 {Exception -> 0x0207, blocks: (B:54:0x01b9, B:56:0x01d0, B:59:0x01df, B:61:0x01e3, B:67:0x01f4, B:69:0x01f8, B:72:0x0200, B:66:0x01ee), top: B:133:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021f A[PHI: r14
      0x021f: PHI (r14v5 java.lang.Long) = (r14v3 java.lang.Long), (r14v4 java.lang.Long) binds: [B:76:0x0217, B:77:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0221 A[Catch: Exception -> 0x026e, TryCatch #0 {Exception -> 0x026e, blocks: (B:77:0x0219, B:79:0x0221), top: B:119:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024b A[Catch: Exception -> 0x0259, TryCatch #5 {Exception -> 0x0259, blocks: (B:82:0x0230, B:84:0x024b), top: B:129:0x0230 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r37, java.lang.String r38, java.util.List r39, java.util.List r40, java.util.Map r41) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1602310rnZ.LIZJ(int, java.lang.String, java.util.List, java.util.List, java.util.Map):void");
    }

    public final Pair<Boolean, Boolean> LJIIIZ(Aweme aweme, List<? extends Aweme> list, FeedUserRoomMonitorMessage feedUserRoomMonitorMessage, boolean z, boolean z2) throws JSONException {
        boolean zLJIJ;
        String uid;
        String uid2;
        Long lLJIILIIL;
        User author;
        boolean z3 = C1568260que.LIZ().keepLoop;
        boolean z4 = false;
        if (list != null && (!list.isEmpty())) {
            int iLJI = LJI();
            int size = list.size();
            boolean z5 = false;
            zLJIJ = false;
            while (true) {
                if (iLJI < size) {
                    Aweme aweme2 = (Aweme) ListProtector.get(list, iLJI);
                    Object uid3 = null;
                    long jLongValue = 0;
                    if (aweme2 != null && z && C0J4Y.LJIIIIZZ(aweme2)) {
                        LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme2);
                        if (liveRoomStructLJI != null) {
                            long j = liveRoomStructLJI.id;
                            if (j != 0 && j == feedUserRoomMonitorMessage.roomId) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("index", String.valueOf(iLJI));
                                linkedHashMap.put("update_type", "1");
                                EnumC1602360rne enumC1602360rneLJII = LJII(feedUserRoomMonitorMessage);
                                if (enumC1602360rneLJII != null) {
                                    if (this.LJIIIZ) {
                                        if (C1602530rnv.LIZ().pageLeaveHandle) {
                                            this.LJIIIIZZ = new C1602520rnu(iLJI, aweme2, feedUserRoomMonitorMessage);
                                        } else {
                                            LJIILL(14, linkedHashMap);
                                        }
                                    } else {
                                        LJIIJJI(iLJI, aweme2, enumC1602360rneLJII, Long.valueOf(feedUserRoomMonitorMessage.roomStatus), linkedHashMap);
                                    }
                                }
                                if (!z3) {
                                    z4 = true;
                                    break;
                                }
                                z5 = true;
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("index:");
                        sbLIZ.append(iLJI);
                        sbLIZ.append(" + ");
                        if (liveRoomStructLJI != null) {
                            uid3 = Long.valueOf(liveRoomStructLJI.id);
                        }
                        sbLIZ.append(uid3);
                        sbLIZ.append("  + ");
                        sbLIZ.append(feedUserRoomMonitorMessage.roomId);
                        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", C2188811AlT.LIZIZ(sbLIZ));
                    } else if (z2 && aweme2 != null && C0J4Y.LIZ(aweme2)) {
                        User author2 = aweme2.getAuthor();
                        if (author2 != null) {
                            uid = author2.getUid();
                        } else {
                            uid = null;
                        }
                        if (C2093608Ic.LIZJ(uid, String.valueOf(feedUserRoomMonitorMessage.anchorId))) {
                            User author3 = aweme2.getAuthor();
                            if (feedUserRoomMonitorMessage.roomStatus == 2 && C1602670ro9.LIZ().headShow) {
                                if (LJ().LIZIZ().LIZ && LJ().LIZIZ().LIZIZ) {
                                    C013C c013c = new C013C();
                                    if (!zLJIJ) {
                                        if (C1602670ro9.LIZ().fixMessageNotify) {
                                            zLJIJ = true;
                                        } else {
                                            Aweme awemeLLILLIZIL = this.LIZ.LLILLIZIL();
                                            if (awemeLLILLIZIL != null && (author = awemeLLILLIZIL.getAuthor()) != null) {
                                                uid3 = author.getUid();
                                            }
                                            zLJIJ = Intrinsics.LJFF(uid3, String.valueOf(feedUserRoomMonitorMessage.anchorId));
                                        }
                                        c013c.element = zLJIJ;
                                    }
                                    if (author3 != null && (uid2 = author3.getUid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid2)) != null) {
                                        jLongValue = lLJIILIIL.longValue();
                                    }
                                    LJ().LJIIJ("message", jLongValue, feedUserRoomMonitorMessage.roomId, this.LIZIZ, LJ().LIZIZ().LIZJ * 1000, new AwS57S0500000_24(this, author3, feedUserRoomMonitorMessage, c013c, aweme, 2));
                                } else {
                                    if (author3 != null) {
                                        author3.roomId = feedUserRoomMonitorMessage.roomId;
                                    }
                                    LIZ(author3);
                                    if (!zLJIJ) {
                                        zLJIJ = LJIJ(aweme, feedUserRoomMonitorMessage, false);
                                    }
                                }
                                z5 = true;
                            } else if (feedUserRoomMonitorMessage.roomStatus == 4 && C1602670ro9.LIZ().headHide) {
                                if (author3 != null) {
                                    author3.roomId = 0L;
                                }
                                LIZ(author3);
                                if (!zLJIJ) {
                                    zLJIJ = LJIJ(aweme, feedUserRoomMonitorMessage, true);
                                }
                                z5 = true;
                            }
                        }
                    }
                    iLJI++;
                } else {
                    z4 = z5;
                    break;
                }
            }
        } else {
            zLJIJ = false;
        }
        return new Pair<>(Boolean.valueOf(z4), Boolean.valueOf(zLJIJ));
    }

    public final boolean LJIIJJI(int i, Aweme aweme, EnumC1602360rne enumC1602360rne, Long l, Map map) throws JSONException {
        Long lValueOf;
        int i2;
        Pair pair;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handlePreviewUpdate: ");
        sbLIZ.append(i);
        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", C2188811AlT.LIZIZ(sbLIZ));
        LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
        map.put("message_type", enumC1602360rne.messageReportType(l));
        String uid = null;
        if (liveRoomStructLJI != null) {
            lValueOf = Long.valueOf(liveRoomStructLJI.id);
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        if (liveRoomStructLJI != null && (user = liveRoomStructLJI.owner) != null) {
            uid = user.getUid();
        }
        map.put("anchor_id", String.valueOf(uid));
        if (liveRoomStructLJI != null && !liveRoomStructLJI.isShow) {
            if (LIZLLL(i)) {
                LJIILL(2, map);
                return false;
            }
            if (Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
                LJIILL(3, map);
                return false;
            }
            List<Aweme> listLLILIL = this.LIZ.LLILIL();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            int size = listLLILIL.size();
            while (i2 < size) {
                Aweme aweme2 = (Aweme) ListProtector.get(listLLILIL, i2);
                LiveRoomStruct liveRoomStructLJI2 = C0J4Y.LJI(aweme2);
                if (AwemeSaaSExtKt.isLive(aweme2) && liveRoomStructLJI2 != null) {
                    if (!aweme2.isAd() && !liveRoomStructLJI2.isShow) {
                        arrayList.add(String.valueOf(liveRoomStructLJI2.id));
                        arrayList2.add(C0J4Y.LJFF(liveRoomStructLJI2, aweme2.getRequestId()));
                    } else {
                        pair = new Pair(new ArrayList(), new ArrayList());
                        break;
                    }
                }
                i2++;
            }
            pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.getFirst();
            List list2 = (List) pair.getSecond();
            int size2 = list.size();
            map.put("to_replace_size", String.valueOf(size2));
            if (size2 <= 0) {
                LJIILL(4, map);
                return false;
            }
            if (LJIILJJIL(i, listLLILIL, false, false, C1602530rnv.LIZ().gapBlock)) {
                LJIILL(20, map);
                return false;
            }
            if (this.LJ) {
                if (!this.LIZ.LLILLL() && SystemClock.uptimeMillis() - this.LJII <= ((Number) this.LJIILJJIL.getValue()).intValue()) {
                    LJIILL(109, map);
                    return false;
                }
            } else if (SystemClock.uptimeMillis() - this.LJII <= C1602530rnv.LIZ().frequencyControl * LSPassThroughRecordSizeConfig.DEFAULT) {
                LJIILL(5, map);
                return false;
            }
            int i3 = C1602370rnf.LIZIZ[enumC1602360rne.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                if (l != null && LJIILIIL(l.longValue())) {
                                    LJIIIIZZ(aweme, i, list, list2, map, l);
                                    return true;
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else if ((C1602530rnv.LIZ().checkType & 4) == 4) {
                            LJIIIIZZ(aweme, i, list, list2, map, l);
                            return true;
                        }
                    } else if ((C1602530rnv.LIZ().checkType & 8) == 8) {
                        LJIIIIZZ(aweme, i, list, list2, map, l);
                        return true;
                    }
                } else if ((C1602530rnv.LIZ().checkType & 2) == 2) {
                    LJIIIIZZ(aweme, i, list, list2, map, l);
                    return true;
                }
            } else if ((C1602530rnv.LIZ().checkType & 1) == 1) {
                LJIIIIZZ(aweme, i, list, list2, map, l);
                return true;
            }
            return false;
        }
        LJIILL(1, map);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0271 A[Catch: Exception -> 0x030d, TryCatch #1 {Exception -> 0x030d, blocks: (B:70:0x025e, B:72:0x0271, B:74:0x027f, B:78:0x02a2), top: B:121:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027f A[Catch: Exception -> 0x030d, TryCatch #1 {Exception -> 0x030d, blocks: (B:70:0x025e, B:72:0x0271, B:74:0x027f, B:78:0x02a2), top: B:121:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bf A[Catch: Exception -> 0x030b, TRY_LEAVE, TryCatch #2 {Exception -> 0x030b, blocks: (B:79:0x02bb, B:81:0x02bf), top: B:123:0x02bb }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d8 A[Catch: Exception -> 0x0309, TryCatch #3 {Exception -> 0x0309, blocks: (B:82:0x02cc, B:84:0x02d8, B:85:0x02de), top: B:125:0x02cc }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r33, java.util.List<com.ss.android.ugc.aweme.feed.model.live.DeletedLiveInfo> r34, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r35, java.util.Map<java.lang.String, java.lang.String> r36, java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1602310rnZ.LJIJJ(java.util.List, java.util.List, java.util.List, java.util.Map, java.lang.String):void");
    }

    public C1602310rnZ(C1564350qoL c1564350qoL, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = c1564350qoL;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.ArrayList] */
    public final void LJIIIIZZ(Aweme aweme, final int i, final List list, List list2, final Map map, Long l) throws JSONException {
        String requestId;
        int i2;
        List<LiveRoomStatesTag> liveExtraInfoStruct;
        if (this.LIZJ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hot_reload_type", 2);
            map.put("hot_reload_type", "2");
            jSONObject.put("delete_index", i);
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            jSONObject.put("delete_request_id", requestId);
            if (l != null) {
                jSONObject.put("room_status", l.longValue());
            }
            if (aweme != null && (liveExtraInfoStruct = aweme.getLiveExtraInfoStruct()) != null) {
                List list3 = (List) C304990BxR.LIZIZ.getValue();
                for (LiveRoomStatesTag liveRoomStatesTag : liveExtraInfoStruct) {
                    String str = liveRoomStatesTag.tagKey;
                    if (str != null && str.length() > 0 && list3.contains(str)) {
                        jSONObject.put(str, liveRoomStatesTag.tagValue);
                    }
                }
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new ArrayList();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = new ArrayList();
            C259800zU c259800zU3 = new C259800zU();
            c259800zU3.element = new ArrayList();
            List<Aweme> listLLILIL = this.LIZ.LLILIL();
            C118300cf c118300cf = new C118300cf();
            int i3 = 0;
            Integer num = null;
            for (Aweme aweme2 : listLLILIL) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    Aweme aweme3 = aweme2;
                    LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme3);
                    if (liveRoomStructLJI != null) {
                        if (i3 == i) {
                            c118300cf.element = ((List) c259800zU.element).size();
                        }
                        ((List) c259800zU.element).add(String.valueOf(liveRoomStructLJI.id));
                        if (AwemeBizExtKt.getSessionPosition(aweme3) < 0) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        arrayList.add(Integer.valueOf(i2));
                        arrayList2.add(Long.valueOf(liveRoomStructLJI.clientAcceptanceTime));
                        arrayList3.add(Integer.valueOf(i3));
                        String strLIZ = C0OHL.LIZ(aweme3, "slate_group_type");
                        if (Intrinsics.LJFF(strLIZ, "")) {
                            num = 1040;
                        } else {
                            if (Intrinsics.LJFF(strLIZ, CardStruct.IStatusCode.DEFAULT)) {
                                num = 2040;
                            }
                            ((List) c259800zU2.element).add(strLIZ);
                            ((List) c259800zU3.element).add(C0J4Y.LJFF(liveRoomStructLJI, aweme3.getRequestId()));
                        }
                        CardCepConfig cardCepConfigLIZ = C1602480rnq.LIZ();
                        if ((cardCepConfigLIZ.errorHandle & 1) == 1) {
                            strLIZ = cardCepConfigLIZ.defaultSlateGroupType;
                        }
                        ((List) c259800zU2.element).add(strLIZ);
                        ((List) c259800zU3.element).add(C0J4Y.LJFF(liveRoomStructLJI, aweme3.getRequestId()));
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (num != null) {
                map.put("group_error_type", String.valueOf(num.intValue() + 100));
            }
            jSONObject.put("params_log_map", C051S.LIZ(map));
            jSONObject.put("live_feed_list", new JSONArray((Collection) c259800zU.element));
            jSONObject.put("live_feed_list_is_show", new JSONArray((Collection) arrayList));
            jSONObject.put("client_accept_time", new JSONArray((Collection) arrayList2));
            jSONObject.put("live_index", new JSONArray((Collection) arrayList3));
            jSONObject.put("slate_group_type", new JSONArray((Collection) c259800zU2.element));
            jSONObject.put("hot_reload_old_reqs", new JSONArray((Collection) c259800zU3.element));
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long jLLILZLL = this.LIZ.LLILZLL(0L, false);
            if (jCurrentTimeMillis > jLLILZLL) {
                j = jCurrentTimeMillis - jLLILZLL;
            }
            jSONObject.put("waitting_time", j);
            jSONObject.put("replace_index", c118300cf.element);
            if (!this.LIZLLL) {
                LJIL(c118300cf.element, (List) c259800zU.element, (List) c259800zU2.element, (List) c259800zU3.element, i, map, false, "2");
                return;
            }
            if (((Boolean) this.LJIILIIL.getValue()).booleanValue()) {
                this.LIZ.LLIZ(jSONObject, new C1602380rng(map, this, c118300cf, c259800zU, c259800zU2, c259800zU3, i));
                return;
            } else if (this.LIZ.LIZ(jSONObject)) {
                C1602350rnd.LIZ.getClass();
                C1602350rnd.LIZ(1, map);
                return;
            } else {
                LJIL(c118300cf.element, (List) c259800zU.element, (List) c259800zU2.element, (List) c259800zU3.element, i, map, true, "3");
                return;
            }
        }
        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", "hotUpdate: start");
        long jUptimeMillis = SystemClock.uptimeMillis();
        int size = list.size();
        this.LJII = jUptimeMillis;
        this.LIZ.LLILZLL(System.currentTimeMillis(), true);
        C1602350rnd.LIZ.getClass();
        C1602350rnd.LIZ(5, map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hot_reload_old_reqs", GsonProtectorUtils.toJson(C09C2.LIZ(), list2));
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).S3().LJIIL(size, "2", list.toString(), linkedHashMap).LJJLL(new C09JN() { // from class: X.0rnV
            @Override // X.C09JN
            public final void accept(Object obj) {
                Integer numValueOf;
                ArrayList arrayList4;
                List<Aweme> list4;
                LogPb logPb;
                List<Aweme> list5;
                List<Aweme> list6;
                C1C7U.LIZ("LiveCardUpdateManager@5748.handleClientHotUpdate$1");
                LiveAwemeData liveAwemeData = (LiveAwemeData) obj;
                StringBuilder sb = new StringBuilder("hotUpdate: success ");
                LiveAwemeList liveAwemeList = liveAwemeData.data;
                String str2 = null;
                if (liveAwemeList != null && (list6 = liveAwemeList.items) != null) {
                    numValueOf = Integer.valueOf(list6.size());
                } else {
                    numValueOf = null;
                }
                sb.append(numValueOf);
                sb.append(" list：");
                LiveAwemeList liveAwemeList2 = liveAwemeData.data;
                if (liveAwemeList2 != null && (list5 = liveAwemeList2.items) != null) {
                    arrayList4 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                    Iterator<Aweme> it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(it2.next().getAid());
                    }
                } else {
                    arrayList4 = null;
                }
                sb.append(arrayList4);
                AbstractC827810Wdf.LIZ("LiveCardUpdateManager", sb.toString());
                LiveAwemeList liveAwemeList3 = liveAwemeData.data;
                if (liveAwemeList3 != null && (logPb = liveAwemeList3.logPb) != null) {
                    str2 = logPb.imprId;
                }
                map.put("request_id", str2);
                LiveAwemeList liveAwemeList4 = liveAwemeData.data;
                if (liveAwemeList4 != null && (list4 = liveAwemeList4.items) != null && (!list4.isEmpty())) {
                    Map<String, String> map2 = map;
                    C1602310rnZ c1602310rnZ = this;
                    int i5 = i;
                    List<String> list7 = list;
                    C1602350rnd.LIZ.getClass();
                    C1602350rnd.LIZ(6, map2);
                    c1602310rnZ.LIZJ(i5, str2, list4, list7, map2);
                    C1602350rnd.LIZJ(list4, map2);
                } else {
                    C1602310rnZ c1602310rnZ2 = this;
                    Map<String, String> map3 = map;
                    C1602350rnd.LIZ.getClass();
                    C1602350rnd.LIZ(7, map3);
                    c1602310rnZ2.getClass();
                    C1602310rnZ.LJIILL(7, map3);
                }
                C1C7U.LIZIZ("LiveCardUpdateManager@5748.handleClientHotUpdate$1");
            }
        }, new AfS158S0200000_24(map, this, 8));
    }

    public final void LJIIJ(final List<String> list, final int i, List<String> list2, List<String> list3, final List<DeletedLiveInfo> list4, final List<String> list5, final int i2, final Map<String, String> map) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int size = list.size();
        this.LJII = jUptimeMillis;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hot_reload_type", String.valueOf(i));
        linkedHashMap.put("hot_reload_queue_types", list2.toString());
        linkedHashMap.put("hot_reload_old_reqs", GsonProtectorUtils.toJson(C09C2.LIZ(), list3));
        this.LIZ.LLILZLL(System.currentTimeMillis(), true);
        String str = map.get("reload_link");
        C1602350rnd.LIZ.getClass();
        C1602350rnd.LIZ(5, map);
        linkedHashMap.put("reload_link", String.valueOf(str));
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).S3().LJIIL(size, "3", list.toString(), linkedHashMap).LJJLL(new C09JN() { // from class: X.0rnU
            /* JADX WARN: Type inference failed for: r11v0, types: [T, java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.C09JN
            public final void accept(Object obj) {
                Integer numValueOf;
                ArrayList arrayList;
                List<Aweme> list6;
                LogPb logPb;
                List<Aweme> list7;
                List<Aweme> list8;
                C1C7U.LIZ("LiveCardUpdateManager@5748.handleHotReloadWithCepReal$1");
                LiveAwemeData liveAwemeData = (LiveAwemeData) obj;
                StringBuilder sb = new StringBuilder("hotUpdate: success ");
                LiveAwemeList liveAwemeList = liveAwemeData.data;
                String str2 = null;
                if (liveAwemeList != null && (list8 = liveAwemeList.items) != null) {
                    numValueOf = Integer.valueOf(list8.size());
                } else {
                    numValueOf = null;
                }
                sb.append(numValueOf);
                sb.append(" list：");
                LiveAwemeList liveAwemeList2 = liveAwemeData.data;
                if (liveAwemeList2 != null && (list7 = liveAwemeList2.items) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list7, 10));
                    Iterator<Aweme> it2 = list7.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getAid());
                    }
                } else {
                    arrayList = null;
                }
                sb.append(arrayList);
                AbstractC827810Wdf.LIZ("LiveCardUpdateManager", sb.toString());
                LiveAwemeList liveAwemeList3 = liveAwemeData.data;
                if (liveAwemeList3 != null && (logPb = liveAwemeList3.logPb) != null) {
                    str2 = logPb.imprId;
                }
                map.put("request_id", str2);
                LiveAwemeList liveAwemeList4 = liveAwemeData.data;
                if (liveAwemeList4 != null && (list6 = liveAwemeList4.items) != null && (!list6.isEmpty())) {
                    Map<String, String> map2 = map;
                    C1602310rnZ c1602310rnZ = this;
                    List<DeletedLiveInfo> list9 = list4;
                    List<String> list10 = list5;
                    int i3 = i;
                    int i4 = i2;
                    List<String> list11 = list;
                    C1602350rnd.LIZ.getClass();
                    C1602350rnd.LIZ(6, map2);
                    c1602310rnZ.getClass();
                    C259800zU c259800zU = new C259800zU();
                    C717620SCy c717620SCyLLIIL = C13LP.LLIIL(list11);
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    ?? r11 = (T) new LinkedHashMap(iLIZIZ);
                    Iterator<IndexedValue<T>> it3 = c717620SCyLLIIL.iterator();
                    while (true) {
                        C717610SCx c717610SCx = (C717610SCx) it3;
                        if (!c717610SCx.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                        Pair pair = new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ));
                        r11.put(pair.getFirst(), pair.getSecond());
                    }
                    c259800zU.element = r11;
                    C013C c013c = new C013C();
                    ArrayList arrayList2 = new ArrayList(C13LP.LJLLLL(new AComparatorS363S0200000_9(c013c, c259800zU, 0), list6));
                    if (c013c.element) {
                        C1602310rnZ.LJIILL(21, map2);
                        c1602310rnZ.LJIJJLI(C13LP.LJJLIIIJ(list6, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(230), 30));
                    } else if (i3 != 1) {
                        if (i3 != 2) {
                            c1602310rnZ.LIZJ(i4, str2, arrayList2, list11, map2);
                        } else {
                            c1602310rnZ.LIZJ(i4, str2, arrayList2, list11, map2);
                        }
                    } else {
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list10, 10));
                        for (String str3 : list10) {
                            Aweme aweme = new Aweme();
                            aweme.setAid(str3);
                            arrayList3.add(aweme);
                        }
                        map2 = map2;
                        c1602310rnZ.LJIJJ(arrayList3, list9, arrayList2, map2, str2);
                    }
                    C1602350rnd.LIZ.getClass();
                    C1602350rnd.LIZJ(list6, map2);
                } else {
                    C1602310rnZ c1602310rnZ2 = this;
                    Map<String, String> map3 = map;
                    C1602350rnd.LIZ.getClass();
                    C1602350rnd.LIZ(7, map3);
                    c1602310rnZ2.getClass();
                    C1602310rnZ.LJIILL(7, map3);
                }
                C1C7U.LIZIZ("LiveCardUpdateManager@5748.handleHotReloadWithCepReal$1");
            }
        }, new AfS158S0200000_24(map, this, 3));
    }

    public final void LJIL(int i, List<String> list, List<String> list2, List<String> list3, int i2, Map<String, String> map, boolean z, String str) {
        map.put("reload_link", str);
        if (z && !((Boolean) this.LJIIL.getValue()).booleanValue()) {
            LJIILL(107, map);
            return;
        }
        if (i <= list.size() && i <= list2.size() && i <= list3.size()) {
            List<String> listSubList = list.subList(i, list.size());
            ArrayList arrayList = new ArrayList();
            List<String> listSubList2 = list2.subList(i, list2.size());
            List<String> listSubList3 = list3.subList(i, list3.size());
            if (!listSubList.isEmpty()) {
                if (!Intrinsics.LJFF(map.get("to_replace_size"), String.valueOf(listSubList.size()))) {
                    LJIILL(24, map);
                }
                LJIIJ(listSubList, 2, listSubList2, listSubList3, null, arrayList, i2, map);
                return;
            }
            LJIILL(23, map);
        }
    }

    public final void LJIIL(int i, int i2, List<String> list, List<String> list2, List<String> list3, List<DeletedLiveInfo> list4, List<String> list5, int i3, Map<String, String> map, boolean z, String str) {
        ArrayList arrayList;
        map.put("reload_link", str);
        if (z && !((Boolean) this.LJIIL.getValue()).booleanValue()) {
            LJIILL(107, map);
            return;
        }
        if (i >= 0 && i <= i2) {
            List<String> listSubList = list.subList(i, i2);
            List<String> listSubList2 = list2.subList(i, i2);
            List<String> listSubList3 = list3.subList(i, i2);
            if (list4 != null) {
                arrayList = new ArrayList(list4);
            } else {
                arrayList = null;
            }
            if (!listSubList.isEmpty()) {
                if (!Intrinsics.LJFF(map.get("to_replace_size"), String.valueOf(listSubList.size()))) {
                    LJIILL(24, map);
                }
                LJIIJ(listSubList, 1, listSubList2, listSubList3, arrayList, list5, i3, map);
                return;
            }
            LJIILL(23, map);
        }
    }
}
