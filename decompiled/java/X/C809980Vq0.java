package X;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809980Vq0 {
    public static int LIZ;
    public static int LIZIZ;
    public static C0V10 LIZJ;
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());

    public static void LIZIZ(final Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("method_push_start_frontier_push");
        int i = LIZ;
        LIZ = i + 1;
        sbLIZ.append(i);
        C818300W8e.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C809810Vpj c809810VpjLIZIZ = C809810Vpj.LIZIZ(context);
        C810720VrC c810720VrC = new InterfaceC809850Vpn() { // from class: X.0VrC
            public static C810730VrD LIZIZ;

            @Override // X.InterfaceC809850Vpn
            public final void LIZIZ() {
                if (LIZIZ != null) {
                    C2203431BLp.LIZIZ.LJII(1777, 1777);
                }
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [X.0VrD] */
            @Override // X.InterfaceC809850Vpn
            public final void LIZ(final C809810Vpj c809810Vpj) {
                C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
                c2203431BLp.LIZLLL(new C0XEZ() { // from class: X.0VrE
                    @Override // X.C0XEZ
                    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
                        InterfaceC810750VrF interfaceC810750VrF = c809810Vpj;
                        if (interfaceC810750VrF != null) {
                            interfaceC810750VrF.onReceiveConnectEvent(c821280WJq, jSONObject);
                        }
                    }
                });
                if (LIZIZ == null) {
                    LIZIZ = new InterfaceC486470J5x() { // from class: X.0VrD
                        @Override // X.InterfaceC486470J5x
                        public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("receive frontier push msg, msg = ");
                            sbLIZ2.append(wsChannelMsg);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            InterfaceC810750VrF interfaceC810750VrF = c809810Vpj;
                            if (interfaceC810750VrF != null) {
                                interfaceC810750VrF.LIZ(wsChannelMsg);
                            }
                        }
                    };
                }
                C810730VrD c810730VrD = LIZIZ;
                if (c810730VrD != null) {
                    c2203431BLp.LJI(1777, 1777, c810730VrD);
                }
            }
        };
        AtomicReference<InterfaceC809850Vpn> atomicReference = c809810VpjLIZIZ.LIZ;
        while (!atomicReference.compareAndSet(null, c810720VrC) && atomicReference.get() == null) {
        }
        C809810Vpj c809810VpjLIZIZ2 = C809810Vpj.LIZIZ(context);
        String curSecUserId = C0XQ7.LJFF().getCurSecUserId();
        c809810VpjLIZIZ2.getClass();
        if (!TextUtils.isEmpty(curSecUserId)) {
            c809810VpjLIZIZ2.LIZLLL = curSecUserId;
        }
        C0XQ7.LJFF().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0Vq5
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i2, User user, User user2) {
                String secUid;
                C821320WJu c821320WJuLIZJ;
                if (user2 != null) {
                    secUid = user2.getSecUid();
                } else {
                    secUid = "";
                }
                if (user != null && TextUtils.equals(secUid, user.getSecUid())) {
                    return;
                }
                C809810Vpj c809810VpjLIZIZ3 = C809810Vpj.LIZIZ(context);
                if (!TextUtils.equals(c809810VpjLIZIZ3.LIZLLL, secUid)) {
                    c809810VpjLIZIZ3.LIZLLL = secUid;
                    if (c809810VpjLIZIZ3.LIZ.get() != null && (c809810VpjLIZIZ3.LIZ.get() instanceof C810150VqH)) {
                        C810150VqH c810150VqH = (C810150VqH) c809810VpjLIZIZ3.LIZ.get();
                        if (!TextUtils.equals(c810150VqH.LIZLLL, secUid)) {
                            c810150VqH.LIZLLL = secUid;
                            if (c810150VqH.LIZJ != null && (c821320WJuLIZJ = c810150VqH.LIZJ(c810150VqH.LIZ)) != null) {
                                c810150VqH.LIZJ.LIZ(c821320WJuLIZJ);
                            }
                        }
                    }
                }
            }
        });
        if (!((Boolean) C1EL3.LJFF.getValue()).booleanValue()) {
            C810890VrT.LIZIZ.LJIIIZ("initFrontierPush() calls pushStart()");
            C809970Vpz.LJFF().LJII(context);
        }
        C818300W8e.LIZIZ("method_push_start_frontier_push");
        C810890VrT.LIZIZ.LJIILLIIL("init_frontier_push");
    }

    public static void LIZJ(Throwable th) {
        String message;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Scene.SCENE_SERVICE, "download_df");
            if (th.getMessage() != null) {
                message = th.getMessage();
            } else {
                message = "";
            }
            jSONObject.put("exception_msg", message);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AppLogNewUtils.onEventV3("oppo_df_invoke_exception", jSONObject);
    }

    public static void LIZ(Context context, boolean z) {
        C818300W8e.LIZ("method_push_start_on_application");
        try {
            C809050VoV.LIZ.LIZ(C810430Vqj.LIZ());
            if (z) {
                C810010Vq3 c810010Vq3LIZ = C810010Vq3.LIZ();
                boolean zLIZJ = C809970Vpz.LJFF().LIZJ(context);
                c810010Vq3LIZ.getClass();
                C808950VoL.LIZIZ().getClass();
                C808950VoL.LIZLLL().LJII(zLIZJ);
                C809970Vpz c809970VpzLJFF = C809970Vpz.LJFF();
                synchronized (c809970VpzLJFF) {
                    if (c809970VpzLJFF.LIZ(context)) {
                        c809970VpzLJFF.LIZJ = true;
                    } else {
                        c809970VpzLJFF.LIZJ = false;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        C809050VoV.LIZ(context).getClass();
                        ((AliveOnlineSettings) C0WFE.LIZ(C809360Vp0.LIZ, AliveOnlineSettings.class)).LJIJI();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C810890VrT.LIZIZ.LIZIZ("exception_setAllowPushDaemonMonitor", e);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("location", "constructInitPush");
                jSONObject.put("errorDesc", th.getMessage());
                C794240VDq.LIZJ("aweme_nofatal_track", jSONObject);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C810890VrT.LIZIZ.LIZIZ("exception_monitorCommonLog_initConfiguration", e2);
            }
            C810890VrT.LIZIZ.LIZIZ("exception_initConfiguration", th);
        }
        C818300W8e.LIZIZ("method_push_start_on_application");
        C810890VrT.LIZIZ.LJIILLIIL("init_configuration");
    }
}
