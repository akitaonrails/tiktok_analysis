package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS680S0100000_31;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.158W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158W implements InterfaceC1141530foN {
    public final InterfaceC1631620sYq<Boolean, Boolean, Boolean, Unit> LL;
    public boolean LLILLJJLI = true;
    public boolean LLILLL;
    public AwS432S0200000_31 LLILZ;

    public C158W(AwS680S0100000_31 awS680S0100000_31) {
        this.LL = awS680S0100000_31;
    }

    public static JSONArray LIZIZ(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((C916720Zxm) it2.next()).LIZ());
        }
        return jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static JSONArray LIZJ(Set set) throws JSONException {
        ?? arrayList;
        ?? arrayList2;
        JSONArray jSONArray = new JSONArray();
        List<TeamUsersInfo> listGg = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).gg();
        if (listGg != null && !listGg.isEmpty()) {
            arrayList = new ArrayList();
            for (TeamUsersInfo teamUsersInfo : listGg) {
                List<Long> list = teamUsersInfo.userIds;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    for (Long l : list) {
                        if (set.contains(l)) {
                            arrayList2.add(l);
                        }
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                if (!arrayList2.isEmpty()) {
                    TeamUsersInfo teamUsersInfo2 = new TeamUsersInfo();
                    teamUsersInfo2.teamId = teamUsersInfo.teamId;
                    teamUsersInfo2.userIds = new ArrayList((Collection) arrayList2);
                    arrayList.add(teamUsersInfo2);
                }
            }
        } else if (C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_1V1) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                TeamUsersInfo teamUsersInfo3 = new TeamUsersInfo();
                teamUsersInfo3.teamId = jLongValue;
                teamUsersInfo3.userIds = C1697810uHb.LJIILJJIL(Long.valueOf(jLongValue));
                arrayList.add(teamUsersInfo3);
            }
        }
        for (TeamUsersInfo teamUsersInfo4 : arrayList) {
            JSONArray jSONArray2 = new JSONArray();
            List<Long> list2 = teamUsersInfo4.userIds;
            if (list2 != null) {
                Iterator<Long> it3 = list2.iterator();
                while (it3.hasNext()) {
                    jSONArray2.put(it3.next().toString());
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("team_id", String.valueOf(teamUsersInfo4.teamId));
            jSONObject.put("member_uids", jSONArray2);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onReceiveJsEvent: "
            r1.append(r0)
            java.lang.String r0 = r9.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r3 = "HammerLottieFEPresenter"
            X.C20441214yg.LIZIZ(r3, r0)
            java.lang.String r1 = r9.LIZ
            java.lang.String r0 = "match_hammer_effect_container_ready"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r5 = 0
            if (r0 == 0) goto L31
            r8.LLILLJJLI = r5
            java.lang.String r0 = "FE container ready, switching off sticky"
            X.C20441214yg.LIZIZ(r3, r0)
            kotlin.jvm.internal.AwS432S0200000_31 r0 = r8.LLILZ
            if (r0 == 0) goto L30
            r0.invoke()
        L30:
            return
        L31:
            java.lang.String r0 = "match_hammer_effect_play_finish"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L30
            X.0evd r1 = r9.LIZIZ
            r6 = 1
            if (r1 == 0) goto L90
            java.lang.String r0 = "success"
            int r7 = X.C1871910yoP.LIZLLL(r1, r0, r6)
            java.lang.String r0 = "should_fallback_play"
            int r4 = X.C1871910yoP.LIZLLL(r1, r0, r5)
            java.lang.String r0 = "is_current_team"
            int r0 = X.C1871910yoP.LIZLLL(r1, r0, r6)
            if (r0 == r6) goto L92
            r2 = 0
        L53:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "FE play finished: isSelfSide="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " success="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " shouldFallback="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            X.0sYq<java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> r3 = r8.LL
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r7 != r6) goto L8e
            r0 = 1
        L7f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r4 != r6) goto L86
            r5 = 1
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.invoke(r2, r1, r0)
            return
        L8e:
            r0 = 0
            goto L7f
        L90:
            r7 = 1
            r4 = 0
        L92:
            r2 = 1
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158W.mh2(X.00zr):void");
    }

    public final void LIZLLL(String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", str);
        jSONObject.put("is_current_team", z ? 1 : 0);
        C389001fE.LIZ("match_hammer_effect_play_event", jSONObject, System.currentTimeMillis() + 10000, this.LLILLJJLI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendSimplePlayEvent: eventType=");
        sbLIZ.append(str);
        sbLIZ.append(" self=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("HammerLottieFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static JSONObject LIZ(String str, String str2, List list) throws JSONException {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(Long.valueOf(((C916720Zxm) it2.next()).LIZ));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("match_type", str);
        jSONObject.put("anchor_id", str2);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (string = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("pk_id", string);
        jSONObject.put("team_info", LIZJ(linkedHashSet));
        jSONObject.put("layout_info", LIZIZ(list));
        return jSONObject;
    }
}
