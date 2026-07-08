package com.bytedance.android.live.liveinteract.multimatch.clientai;

import X.C01GW;
import X.C098200Yq;
import X.C0UO0;
import X.C1132380fZc;
import X.C1161920gLG;
import X.C11JF;
import X.C189200o6;
import X.C1ATK;
import X.C1ATM;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C292401Bi;
import X.C480460Ism;
import X.C500260Jjc;
import X.C964450bCl;
import X.InterfaceC2179811ASt;
import X.InterfaceC964460bCm;
import Y.AfS1S0101100_15;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.clientai.CohostFriendReminderSettings;
import com.bytedance.android.livesdk.livesetting.clientai.CohostNoticeStrategySettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptSetting;
import com.bytedance.android.livesdk.model.message.UserModelPredictionData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS69S0100100_15;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class CoHostFriendNoticeService implements GenericLifecycleObserver {
    public double LLILZIL;
    public DataChannel LLILZLL;
    public C11JF LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final String LL = CohostFriendReminderSettings.INSTANCE.algoPkgName();
    public final ConcurrentHashSet<String> LLILLJJLI = new ConcurrentHashSet<>();
    public final int LLILLL = LiveCoHostFriendNoticeOptSetting.INSTANCE.getValue();
    public final C01GW LLILZ = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(151));
    public final C964450bCl LLIZ = new InterfaceC2179811ASt() { // from class: X.0bCl
        @Override // X.InterfaceC2179811ASt
        public final void LIZ(C21406118pv c21406118pv) {
        }
    };
    public final ConcurrentHashSet<Long> LLJIJIL = new ConcurrentHashSet<>();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZLLL() {
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null) {
            return;
        }
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        if (jLJJLIIIJ <= 0) {
            return;
        }
        LIZJ(this, null, new AwS69S0100100_15(this, jLJJLIIIJ, 6), 3);
    }

    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show friend notice, logId == ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CoHostFriendNoticeService", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null) {
            return;
        }
        LIZJ(this, new AwS416S0200000_15(this, dataChannel, 51), null, 5);
        this.LLJ = 0;
        this.LLJI = 0;
    }

    public final void LJ(int i, long j) {
        C20441214yg.LIZIZ("CoHostFriendNoticeService", "requestTrigger");
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null && iBroadcastService.isBackgroundPauseRequest()) {
            return;
        }
        C480460Ism.LIZ().getClass();
        ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).triggerLivingFriendNotice(j, CohostNoticeStrategySettings.INSTANCE.getGetStickValue()).LJIILIIL(new C0UO0()).LJJLL(new AfS1S0101100_15(i, j, this, 3), new AfS1S0101100_15(i, j, this, 4));
    }

    public static void LIZJ(CoHostFriendNoticeService coHostFriendNoticeService, Function0 function0, AwS69S0100100_15 awS69S0100100_15, int i) {
        AFwS203S0000000_15 aFwS203S0000000_15;
        if ((i & 1) != 0) {
            aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(293);
        } else {
            aFwS203S0000000_15 = null;
        }
        if ((i & 2) != 0) {
            function0 = AFwS203S0000000_15.get$arr$(294);
        }
        Function0 function02 = awS69S0100100_15;
        if ((i & 4) != 0) {
            function02 = AFwS203S0000000_15.get$arr$(295);
        }
        int i2 = coHostFriendNoticeService.LLILLL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        aFwS203S0000000_15.getClass();
                        return;
                    } else {
                        function0.invoke();
                        function02.invoke();
                        return;
                    }
                }
                function02.invoke();
                return;
            }
            function0.invoke();
            return;
        }
        aFwS203S0000000_15.getClass();
    }

    public final void LIZIZ(final long j, List<UserModelPredictionData> list, final Function0<Unit> function0, final Function0<Unit> function02) {
        Object obj;
        Long lValueOf;
        if (this.LLJIJIL.contains(Long.valueOf(j))) {
            function02.invoke();
            return;
        }
        if (list == null) {
            function0.invoke();
            this.LLJIJIL.add(Long.valueOf(j));
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (UserModelPredictionData userModelPredictionData : list) {
                jSONArray.put(new JSONObject().put("user_id", userModelPredictionData.userId).put("model_prediction_data", new JSONObject(C2097608Jq.LJIIZILJ(userModelPredictionData.modelPredictionData))));
            }
            C189200o6.m2constructorimpl(jSONArray);
            obj = jSONArray;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        JSONArray jSONArray2 = new JSONArray();
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = jSONArray2;
        }
        InterfaceC964460bCm interfaceC964460bCm = (InterfaceC964460bCm) this.LLILZ.getValue();
        JSONObject jSONObject = new JSONObject();
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
        } else {
            lValueOf = null;
        }
        interfaceC964460bCm.LIZJ(new C1ATK("cohost_friend_reminder_display_strategy", new C1132380fZc(true, jSONObject.putOpt("room_id", lValueOf).putOpt("trigger_score", Double.valueOf(this.LLILZIL)).putOpt("online_friends_recommendation_data", obj2)), new InterfaceC2179811ASt() { // from class: X.0bCj
            @Override // X.InterfaceC2179811ASt
            public final void LIZ(C21406118pv c21406118pv) {
                JSONObject jSONObjectOptJSONObject;
                if (!c21406118pv.LIZ()) {
                    function0.invoke();
                    this.LLJIJIL.add(Long.valueOf(j));
                    return;
                }
                JSONObject jSONObject2 = c21406118pv.LIZIZ;
                if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null && jSONObjectOptJSONObject.optBoolean("should_display")) {
                    function0.invoke();
                    this.LLJIJIL.add(Long.valueOf(j));
                } else {
                    function02.invoke();
                }
            }
        }, new C1ATM(1000L, false, 11), 8));
        this.LLILZIL = 0.0d;
    }
}
