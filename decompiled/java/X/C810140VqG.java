package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push.frontier.setting.FrontierLocalSetting;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810140VqG {
    public final synchronized void LIZJ(Context context, InterfaceC810280VqU interfaceC810280VqU) {
        boolean z;
        FrontierLocalSetting frontierLocalSetting = (FrontierLocalSetting) C0WFE.LIZ(context, FrontierLocalSetting.class);
        PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) C0WFE.LIZ(context, PushOnlineSettings.class);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - frontierLocalSetting.LIZIZ()) / 60000 < pushOnlineSettings.LJIJJ()) {
            z = true;
        } else {
            z = false;
        }
        C810130VqF c810130VqFLJIIIZ = frontierLocalSetting.LJIIIZ();
        if (c810130VqFLJIIIZ == null || !c810130VqFLJIIIZ.LIZ() || !z) {
            String strLIZIZ = C0V4R.LIZIZ(C1128604bE.LIZ("/cloudpush/update_frontier_setting/"), C809030VoT.LJIIJ.LJI());
            new C808790Vo5();
            try {
                if (LIZIZ(AbstractC808800Vo6.LIZ.LIZLLL(strLIZIZ, new ArrayList(), null), jCurrentTimeMillis, frontierLocalSetting, interfaceC810280VqU)) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ(301, jCurrentTimeMillis, th.getLocalizedMessage());
            }
        }
        C810180VqK c810180VqK = (C810180VqK) interfaceC810280VqU;
        C810150VqH c810150VqH = c810180VqK.LIZIZ;
        InterfaceC810750VrF interfaceC810750VrF = c810180VqK.LIZ;
        C821320WJu c821320WJuLIZJ = c810150VqH.LIZJ(c810130VqFLJIIIZ);
        if (c821320WJuLIZJ != null) {
            C821300WJs c821300WJs = c810150VqH.LIZJ;
            if (c821300WJs != null) {
                c821300WJs.LIZ(c821320WJuLIZJ);
            } else {
                c810150VqH.LIZJ = C821310WJt.LIZJ(c810150VqH.LIZIZ, c821320WJuLIZJ, interfaceC810750VrF);
            }
        }
    }

    public static void LIZ(int i, long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request frontier setting failed, errorCode: ");
        sbLIZ.append(i);
        sbLIZ.append(" response: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C810160VqI c810160VqILIZ = C810160VqI.LIZ();
        if (c810160VqILIZ.LIZIZ == null) {
            synchronized (c810160VqILIZ) {
                try {
                    if (c810160VqILIZ.LIZIZ == null) {
                        c810160VqILIZ.LIZIZ = new C810240VqQ();
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        C810240VqQ c810240VqQ = c810160VqILIZ.LIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        c810240VqQ.getClass();
        try {
            new JSONObject().put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            new JSONObject().put("log", str);
        } catch (JSONException th) {
        }
        try {
            new JSONObject().put("time_consuming", jCurrentTimeMillis);
        } catch (JSONException th2) {
        }
    }

    public static boolean LIZIZ(String str, long j, FrontierLocalSetting frontierLocalSetting, InterfaceC810280VqU interfaceC810280VqU) {
        if (TextUtils.isEmpty(str)) {
            LIZ(304, j, str);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!TextUtils.equals("success", jSONObject.optString("message"))) {
            LIZ(302, j, str);
            return false;
        }
        C810130VqF c810130VqFLIZIZ = C810130VqF.LIZIZ(jSONObject.optJSONObject("frontier_setting"));
        if (c810130VqFLIZIZ != null && c810130VqFLIZIZ.LIZ()) {
            frontierLocalSetting.LJJIJ(System.currentTimeMillis());
            frontierLocalSetting.LJIJJ(c810130VqFLIZIZ);
            C810160VqI c810160VqILIZ = C810160VqI.LIZ();
            if (c810160VqILIZ.LIZIZ == null) {
                synchronized (c810160VqILIZ) {
                    try {
                        if (c810160VqILIZ.LIZIZ == null) {
                            c810160VqILIZ.LIZIZ = new C810240VqQ();
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C810240VqQ c810240VqQ = c810160VqILIZ.LIZIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            c810240VqQ.getClass();
            try {
                new JSONObject().put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0L);
            } catch (JSONException th) {
            }
            try {
                new JSONObject().put("time_consuming", jCurrentTimeMillis);
            } catch (JSONException th2) {
            }
            C810180VqK c810180VqK = (C810180VqK) interfaceC810280VqU;
            C810150VqH c810150VqH = c810180VqK.LIZIZ;
            InterfaceC810750VrF interfaceC810750VrF = c810180VqK.LIZ;
            C821320WJu c821320WJuLIZJ = c810150VqH.LIZJ(c810130VqFLIZIZ);
            if (c821320WJuLIZJ != null) {
                C821300WJs c821300WJs = c810150VqH.LIZJ;
                if (c821300WJs != null) {
                    c821300WJs.LIZ(c821320WJuLIZJ);
                    return true;
                }
                c810150VqH.LIZJ = C821310WJt.LIZJ(c810150VqH.LIZIZ, c821320WJuLIZJ, interfaceC810750VrF);
                return true;
            }
            return true;
        }
        LIZ(303, j, str);
        return false;
    }
}
