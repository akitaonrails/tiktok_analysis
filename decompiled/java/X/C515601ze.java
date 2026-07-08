package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515601ze implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("MatchFallbackManager@1bb5.fetchMatchInfo$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        Long l = ((BattleInfoResponse) baseResponse.data).battleId;
        long j = c515601ze.j2;
        if (l != null && l.longValue() == j) {
            T t = baseResponse.data;
            BattleSetting battleSetting = ((BattleInfoResponse) t).setting;
            if (battleSetting != null) {
                Function2 function2 = (Function2) c515601ze.l1;
                long j2 = c515601ze.j2;
                if (battleSetting.status == 1) {
                    function2.invoke(t, Long.valueOf(j2));
                }
            }
        } else {
            String str = ((C976400bW2) c515601ze.l0).LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("battle id doesn't match, api battle id: ");
            sbLIZ.append(((BattleInfoResponse) baseResponse.data).battleId);
            sbLIZ.append(" engine battle id: ");
            sbLIZ.append(c515601ze.j2);
            C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("MatchFallbackManager@1bb5.fetchMatchInfo$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("PreviewGameLiveGuessBoardManager@613d.handleStatusChange$1");
        Long l = (Long) obj;
        C258000zC.LJ((C258000zC) c515601ze.l0, (String) ((C259800zU) c515601ze.l1).element, null, C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((c515601ze.j2 - l.longValue()) / 60), Long.valueOf((c515601ze.j2 - l.longValue()) % 60)}, 2)), null, 52);
        C1C7U.LIZIZ("PreviewGameLiveGuessBoardManager@613d.handleStatusChange$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("GameLiveGuessBoardManager@1365.handleStatusChange$1");
        Long l = (Long) obj;
        C258100zD.LJII((C258100zD) c515601ze.l0, (String) ((C259800zU) c515601ze.l1).element, null, C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((c515601ze.j2 - l.longValue()) / 60), Long.valueOf((c515601ze.j2 - l.longValue()) % 60)}, 2)), null, 20);
        C1C7U.LIZIZ("GameLiveGuessBoardManager@1365.handleStatusChange$1");
    }

    public static final void accept$3(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("MessageDetectListener@1c48.triggerHttpDetect$1");
        C474500IjA c474500IjALIZIZ = C163700jz.LIZIZ((MsgDetectMessage) c515601ze.l1, c515601ze.j2, C163700jz.LIZ((C163700jz) c515601ze.l0, true, false, false, 6));
        c474500IjALIZIZ.LJJII(Integer.valueOf(((BaseResponse) obj).LIZLLL), "request_type");
        c474500IjALIZIZ.LJJII(Boolean.TRUE, "success");
        c474500IjALIZIZ.LIZ();
        C1C7U.LIZIZ("MessageDetectListener@1c48.triggerHttpDetect$1");
    }

    public static final void accept$4(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("MessageDetectListener@1c48.triggerHttpDetect$2");
        Throwable th = (Throwable) obj;
        C474500IjA c474500IjALIZIZ = C163700jz.LIZIZ((MsgDetectMessage) c515601ze.l1, c515601ze.j2, C163700jz.LIZ((C163700jz) c515601ze.l0, true, false, false, 6));
        c474500IjALIZIZ.LJJII(Boolean.FALSE, "success");
        c474500IjALIZIZ.LJJII(th.getClass().getSimpleName(), "error_name");
        c474500IjALIZIZ.LJJII(th.getMessage(), "error_message");
        c474500IjALIZIZ.LIZ();
        C1C7U.LIZIZ("MessageDetectListener@1c48.triggerHttpDetect$2");
    }

    public static final void accept$5(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("MessageDetectListener@1c48.triggerHttpOptimizeDetect$1");
        C474500IjA c474500IjALIZIZ = C163700jz.LIZIZ((MsgDetectMessage) c515601ze.l1, c515601ze.j2, C163700jz.LIZ((C163700jz) c515601ze.l0, false, false, true, 3));
        c474500IjALIZIZ.LJJII(Integer.valueOf(((BaseResponse) obj).LIZLLL), "request_type");
        c474500IjALIZIZ.LJJII(Boolean.TRUE, "success");
        c474500IjALIZIZ.LIZ();
        C1C7U.LIZIZ("MessageDetectListener@1c48.triggerHttpOptimizeDetect$1");
    }

    public static final void accept$6(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("MessageDetectListener@1c48.triggerHttpOptimizeDetect$2");
        Throwable th = (Throwable) obj;
        C474500IjA c474500IjALIZIZ = C163700jz.LIZIZ((MsgDetectMessage) c515601ze.l1, c515601ze.j2, C163700jz.LIZ((C163700jz) c515601ze.l0, false, false, true, 3));
        c474500IjALIZIZ.LJJII(Boolean.FALSE, "success");
        c474500IjALIZIZ.LJJII(th.getClass().getSimpleName(), "error_name");
        c474500IjALIZIZ.LJJII(th.getMessage(), "error_message");
        c474500IjALIZIZ.LIZ();
        C1C7U.LIZIZ("MessageDetectListener@1c48.triggerHttpOptimizeDetect$2");
    }

    public static final void accept$7(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("MessageDetectListener@1c48.triggerWsUplinkDetect$1");
        C474500IjA c474500IjALIZIZ = C163700jz.LIZIZ((MsgDetectMessage) c515601ze.l1, c515601ze.j2, C163700jz.LIZ((C163700jz) c515601ze.l0, false, true, false, 5));
        c474500IjALIZIZ.LJJII(Integer.valueOf(((BaseResponse) obj).LIZLLL), "request_type");
        c474500IjALIZIZ.LJJII(Boolean.TRUE, "success");
        c474500IjALIZIZ.LIZ();
        C1C7U.LIZIZ("MessageDetectListener@1c48.triggerWsUplinkDetect$1");
    }

    public static final void accept$8(C515601ze c515601ze, Object obj) {
        C1C7U.LIZ("MessageDetectListener@1c48.triggerWsUplinkDetect$2");
        Throwable th = (Throwable) obj;
        C474500IjA c474500IjALIZIZ = C163700jz.LIZIZ((MsgDetectMessage) c515601ze.l1, c515601ze.j2, C163700jz.LIZ((C163700jz) c515601ze.l0, false, true, false, 5));
        c474500IjALIZIZ.LJJII(Boolean.FALSE, "success");
        c474500IjALIZIZ.LJJII(th.getClass().getSimpleName(), "error_name");
        c474500IjALIZIZ.LJJII(th.getMessage(), "error_message");
        c474500IjALIZIZ.LIZ();
        C1C7U.LIZIZ("MessageDetectListener@1c48.triggerWsUplinkDetect$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:X.01ze) (LINE:67108867) X.01ze.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:X.01ze) (LINE:67108869) X.01ze.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.01ze, java.lang.Object] */
    public C515601ze(long j, long j2, C976400bW2 c976400bW2, Function2<? super BattleInfoResponse, ? super Long, Unit> function2) {
        long j3;
        Object obj;
        obj.$t = function2;
        obj.j2 = j3;
        obj.l0 = obj;
        obj.l1 = c976400bW2;
        ?? obj2 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:X.01ze) (LINE:83886083) X.01ze.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:X.01ze) (LINE:83886085) X.01ze.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.01ze, java.lang.Object] */
    public C515601ze(long j, long j2, C258000zC c258000zC, EnumC259000zM enumC259000zM, C259800zU<String> c259800zU) {
        long j3;
        Object obj;
        obj.$t = c259800zU;
        obj.j2 = j3;
        obj.l0 = obj;
        obj.l1 = enumC259000zM;
        ?? obj2 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:X.01ze) (LINE:83951619) X.01ze.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:X.01ze) (LINE:83951621) X.01ze.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.01ze, java.lang.Object] */
    public C515601ze(long j, long j2, C258100zD c258100zD, EnumC258900zL enumC258900zL, C259800zU<String> c259800zU) {
        long j3;
        Object obj;
        obj.$t = c259800zU;
        obj.j2 = j3;
        obj.l0 = obj;
        obj.l1 = enumC258900zL;
        ?? obj2 = new Object();
    }
}
