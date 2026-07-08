package Y;

import X.AbstractC19994813Le;
import X.C09JN;
import X.C0K04;
import X.C0UO0;
import X.C11JF;
import X.C13LZ;
import X.C15FV;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C354710DvR;
import X.C480460Ism;
import X.C915980Zwa;
import X.C974480bSw;
import X.C975320bUI;
import X.EnumC970440bMQ;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AfS55S1100000_31 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS55S1100000_31 afS55S1100000_31, Object obj) {
        String str;
        long id;
        User owner;
        C1C7U.LIZ("MatchSpeedChallengePresenter@e022.dealCriticalPoint$1");
        long jLongValue = ((Number) obj).longValue();
        if (((C15FV) afS55S1100000_31.l1).LLILZ != null) {
            if (jLongValue >= C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(3L, 8L))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Critical point request ");
                sbLIZ.append(afS55S1100000_31.s0);
                C20441214yg.LIZIZ("BattleTask", C2188811AlT.LIZIZ(sbLIZ));
                C15FV c15fv = (C15FV) afS55S1100000_31.l1;
                String str2 = afS55S1100000_31.s0;
                if (c15fv.LLILZ != null && c15fv.LLIZ != null) {
                    long channelId = C915980Zwa.LJII().getChannelId();
                    long battleId = C915980Zwa.LIZLLL().getBattleId();
                    JSONObject jSONObject = new JSONObject();
                    C0K04.LJFF(Scene.SCENE_SERVICE, str2, jSONObject);
                    C974480bSw c974480bSw = C974480bSw.LIZ;
                    C974480bSw.LJIJ(jSONObject, false);
                    c974480bSw.LJJIIJ(0, "battle_info_request", jSONObject);
                    C974480bSw.LIZLLL = System.currentTimeMillis();
                    if (Intrinsics.LJFF(str2, "egg_task_countdown")) {
                        str = "TASK_SETTLE";
                    } else {
                        str = "REWARD_SETTLE";
                    }
                    c15fv.LLLII = "battle_info_fallback";
                    JSONObject jSONObject2 = C975320bUI.LIZ;
                    boolean z = c15fv.LLILLL;
                    long j = c15fv.LLJ;
                    String str3 = c15fv.LLJJJIL;
                    JSONObject jSONObject3 = new JSONObject();
                    C0K04.LJFF("message_type", str, jSONObject3);
                    C975320bUI.LJIIJJI(str3, j, jSONObject3);
                    if (z) {
                        C975320bUI.LJIILL("task_battle_info_request", jSONObject3);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("network_eggtask_battle_info, scene = ");
                    sbLIZ2.append(str2);
                    C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ2));
                    C480460Ism.LIZ().getClass();
                    LinkBattleApi linkBattleApi = (LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class);
                    Room room = c15fv.LLIZ;
                    long ownerUserId = 0;
                    if (room != null) {
                        id = room.getId();
                    } else {
                        id = 0;
                    }
                    Room room2 = c15fv.LLIZ;
                    if (room2 != null && (owner = room2.getOwner()) != null) {
                        ownerUserId = owner.getId();
                    } else {
                        Room room3 = c15fv.LLIZ;
                        if (room3 != null) {
                            ownerUserId = room3.getOwnerUserId();
                        }
                    }
                    linkBattleApi.getInfo(id, channelId, battleId, ownerUserId, EnumC970440bMQ.BATTLE_INFO_SCENE_TASK.getType()).LJIILIIL(new C0UO0()).LJJLL(new AfS28S2100000_31(c15fv, str2, str, 0), new AfS28S2100000_31(c15fv, str2, str, 1));
                }
                ((C15FV) afS55S1100000_31.l1).LLLILZJ = false;
                C11JF c11jf = ((C15FV) afS55S1100000_31.l1).LLILZLL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
            }
        }
        C1C7U.LIZIZ("MatchSpeedChallengePresenter@e022.dealCriticalPoint$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS55S1100000_31 r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "GameFusionIdMonitor@cc3c.checkIsFusionIdUpdate$1"
            X.C1C7U.LIZ(r5)
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.String r1 = r6.s0
            java.lang.Object r0 = r6.l1
            X.151X r0 = (X.C151X) r0
            r0.getClass()
            java.lang.String r0 = X.C151X.LIZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L60
            java.lang.Object r0 = r6.l1
            X.151X r0 = (X.C151X) r0
            r0.getClass()
            java.lang.String r1 = X.C151X.LIZ()
            java.lang.Object r0 = r6.l1
            X.151X r0 = (X.C151X) r0
            java.lang.String r0 = r0.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L60
            java.lang.Object r0 = r6.l1
            X.151X r0 = (X.C151X) r0
            long r3 = r0.LIZLLL
            r0 = 1
            long r3 = r3 - r0
            if (r7 == 0) goto L5c
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L5c
            java.lang.Object r1 = r6.l1
            X.151X r1 = (X.C151X) r1
            java.lang.String r0 = r6.s0
            r1.LIZJ = r0
            X.151a r0 = r1.LIZ
            r0.LIZ()
            java.lang.Object r0 = r6.l1
            X.151X r0 = (X.C151X) r0
            X.11JF r0 = r0.LIZIZ
            if (r0 == 0) goto L5c
            r0.dispose()
        L5c:
            X.C1C7U.LIZIZ(r5)
            return
        L60:
            java.lang.Object r0 = r6.l1
            X.151X r0 = (X.C151X) r0
            X.151a r0 = r0.LIZ
            r0.LIZJ()
            java.lang.Object r0 = r6.l1
            X.151X r0 = (X.C151X) r0
            X.11JF r0 = r0.LIZIZ
            if (r0 == 0) goto L5c
            r0.dispose()
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS55S1100000_31.accept$1(Y.AfS55S1100000_31, java.lang.Object):void");
    }

    public AfS55S1100000_31(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
