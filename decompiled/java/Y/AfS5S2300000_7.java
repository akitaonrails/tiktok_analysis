package Y;

import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0JFN;
import X.C0JFO;
import X.C0K02;
import X.C0K04;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C238400w2;
import X.C474500IjA;
import X.C501470JlZ;
import X.C510340Jzs;
import X.C510360Jzu;
import X.C510380Jzw;
import X.EnumC510330Jzr;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class AfS5S2300000_7 implements C09JN {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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
        }
    }

    public static final void accept$0(AfS5S2300000_7 afS5S2300000_7, Object obj) {
        C1C7U.LIZ("SubscribeMonitor@400b.monitorMetricsForApiObservable$2");
        ((C238400w2) afS5S2300000_7.l2).element = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_subscription_");
        sbLIZ.append(((EnumC510330Jzr) afS5S2300000_7.l3).getEvent());
        sbLIZ.append("_request_new");
        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C510380Jzw.LJIIZILJ(c474500IjALIZ, (C238400w2) afS5S2300000_7.l2, afS5S2300000_7.s0, afS5S2300000_7.s1, (Map) afS5S2300000_7.l4);
        c474500IjALIZ.LIZ();
        int i = C510340Jzs.LIZ[((EnumC510330Jzr) afS5S2300000_7.l3).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    long j = ((C238400w2) afS5S2300000_7.l2).element;
                    JSONObject jSONObject = new JSONObject();
                    C0K04.LJ("start_time", j, jSONObject);
                    C510380Jzw.LJIL("subscription_privilege_all_detail_request", jSONObject);
                }
            } else {
                long j2 = ((C238400w2) afS5S2300000_7.l2).element;
                JSONObject jSONObject2 = new JSONObject();
                C0K04.LJ("start_time", j2, jSONObject2);
                C510380Jzw.LJIL("subscription_get_emotes_request", jSONObject2);
            }
        } else {
            long j3 = ((C238400w2) afS5S2300000_7.l2).element;
            JSONObject jSONObject3 = new JSONObject();
            C0K04.LJ("start_time", j3, jSONObject3);
            C510380Jzw.LJJ("subscription_get_sub_info_request", jSONObject3);
        }
        C1C7U.LIZIZ("SubscribeMonitor@400b.monitorMetricsForApiObservable$2");
    }

    public static final void accept$1(AfS5S2300000_7 afS5S2300000_7, Object obj) {
        C1C7U.LIZ("SubscribeMonitor@400b.monitorMetricsForApiObservable$4");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_subscription_");
        sbLIZ.append(((EnumC510330Jzr) afS5S2300000_7.l2).getEvent());
        sbLIZ.append("_failed_new");
        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C510380Jzw.LJIILL(c474500IjALIZ, (C238400w2) afS5S2300000_7.l3, afS5S2300000_7.s0, afS5S2300000_7.s1, (Map) afS5S2300000_7.l4);
        if (th instanceof C501470JlZ) {
            c474500IjALIZ.LJJII(((C501470JlZ) th).getLogId(), "logid");
        }
        JSONObject jSONObject = new JSONObject();
        C0K02.LJIIJJI(th, jSONObject);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                c474500IjALIZ.LJJII(jSONObject.get(next), next);
                C189200o6.m2constructorimpl(c474500IjALIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        c474500IjALIZ.LIZ();
        int i = C510360Jzu.LIZ[((EnumC510330Jzr) afS5S2300000_7.l2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C510380Jzw.LJIJI(((C238400w2) afS5S2300000_7.l3).element, th);
                }
            } else {
                C510380Jzw.LJIJ(((C238400w2) afS5S2300000_7.l3).element, th);
            }
        } else {
            C510380Jzw.LJIILIIL(((C238400w2) afS5S2300000_7.l3).element, th);
        }
        C1C7U.LIZIZ("SubscribeMonitor@400b.monitorMetricsForApiObservable$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS5S2300000_7 afS5S2300000_7, Object obj) {
        List<PictionaryFullInfo> list;
        PictionaryFullInfo next;
        long j;
        PictionaryStatistics pictionaryStatistics;
        C1C7U.LIZ("DrawGuessUtil@bdeb.exitDrawGuessGame$1");
        ((Function0) afS5S2300000_7.l2).invoke();
        DrawGuessSummaryResponse drawGuessSummaryResponse = (DrawGuessSummaryResponse) ((BaseResponse) obj).data;
        if (drawGuessSummaryResponse != null && (list = drawGuessSummaryResponse.pictionaryList) != null) {
            DataChannel dataChannel = (DataChannel) afS5S2300000_7.l4;
            String str = afS5S2300000_7.s1;
            Iterator<PictionaryFullInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    long j2 = next.pictionaryInfo.id;
                    C0JFN.LIZ.getClass();
                    Long lLJIJJ = C0JFN.LJIJJ(dataChannel);
                    if (lLJIJJ != null && j2 == lLJIJJ.longValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PictionaryFullInfo pictionaryFullInfo = next;
            if (pictionaryFullInfo != null && (pictionaryStatistics = pictionaryFullInfo.pictionaryStatistics) != null) {
                j = pictionaryStatistics.guessCorrectUv;
            } else {
                j = 0;
            }
            C0JFN.LIZ.getClass();
            C0JFN.LJJIII(j, dataChannel);
            C0JFO.LJIIIZ(dataChannel, Long.valueOf(j), str);
            C0JFN.LJIILL(dataChannel, list);
        } else {
            C0JFN c0jfn = C0JFN.LIZ;
            Fragment fragment = (Fragment) afS5S2300000_7.l3;
            DataChannel dataChannel2 = (DataChannel) afS5S2300000_7.l4;
            c0jfn.getClass();
            C0JFN.LJIJI(fragment, dataChannel2, C0JFN.LJJI(dataChannel2));
        }
        C0JFN c0jfn2 = C0JFN.LIZ;
        DataChannel dataChannel3 = (DataChannel) afS5S2300000_7.l4;
        String str2 = afS5S2300000_7.s0;
        c0jfn2.getClass();
        C0JFN.LJIILJJIL(dataChannel3, str2, false);
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.exitDrawGuessGame$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS5S2300000_7(X.EnumC510330Jzr r2, java.lang.String r3, java.lang.String r4, java.util.Map r5, X.C238400w2 r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L13
            r0 = r1
            r0.l2 = r2
            r0.l3 = r6
            r0.s0 = r3
            r0.s1 = r4
            r0.l4 = r5
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l2 = r6
            r0.l3 = r2
            r0.s0 = r3
            r0.s1 = r4
            r0.l4 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS5S2300000_7.<init>(X.0Jzr, java.lang.String, java.lang.String, java.util.Map, X.00w2, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS5S2300000_7(Function0 function0, Function0<Unit> function02, Fragment fragment, DataChannel dataChannel, String str, String str2) {
        this.$t = str2;
        this.l2 = function0;
        this.l3 = function02;
        this.l4 = fragment;
        this.s0 = dataChannel;
        this.s1 = str;
    }
}
