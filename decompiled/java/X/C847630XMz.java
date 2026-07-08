package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847630XMz {
    public static volatile C847630XMz LIZLLL;
    public final C0XO0 LIZ;
    public volatile boolean LIZIZ;
    public C0XN2 LIZJ;

    public C847630XMz(C0XO0 c0xo0) {
        this.LIZ = c0xo0;
    }

    public static C0XN2 LIZLLL(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0XN2 c0xn2 = new C0XN2();
            c0xn2.LIZ = jSONObject.optString("message");
            c0xn2.LIZIZ = jSONObject.optInt("protocol_type");
            c0xn2.LIZLLL = jSONObject.optString("log_id");
            c0xn2.LJ = jSONObject.optBoolean("degrade");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.optString("device_name");
                jSONObjectOptJSONObject.optString("user_name");
                c0xn2.LIZJ = jSONObjectOptJSONObject.optLong("user_id");
            }
            return c0xn2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZ(C0XN2 c0xn2) {
        if (c0xn2 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("logId", c0xn2.LIZLLL);
                jSONObject.put("protocol_type", c0xn2.LIZIZ);
                jSONObject.put("is_login", this.LIZ.LLJZIJLIL);
                jSONObject.put("user_id", this.LIZ.LLJJL);
                C0XG9.LJ("passport_receive_frontier_message", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final synchronized void LIZIZ(String str) {
        C0XN2 c0xn2LIZLLL = LIZLLL(str);
        LIZ(c0xn2LIZLLL);
        if (this.LIZIZ) {
            return;
        }
        if (!this.LIZ.LLJZIJLIL) {
            return;
        }
        if (c0xn2LIZLLL == null) {
            return;
        }
        if (c0xn2LIZLLL.LJ) {
            return;
        }
        if (C848000XOk.LIZJ() && c0xn2LIZLLL.LIZJ != this.LIZ.LLJJL) {
            return;
        }
        this.LIZJ = c0xn2LIZLLL;
        if (C847400XMc.LIZ) {
            C0XMV c0xmv = C0XMV.LLJJJIL;
            if (!C0XMV.LLJJJJJIL) {
                c0xmv.getClass();
            } else {
                c0xmv.LLIZLLLIL.removeMessages(LSPassThroughRecordSizeConfig.DEFAULT);
            }
        }
        this.LIZIZ = true;
        final String strLIZLLL = C0XMV.LLJJJIL.LIZLLL("frontier", false, false);
        AbstractC847610XMx abstractC847610XMx = new AbstractC847610XMx() { // from class: X.0XN0
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                C0XN2 c0xn2 = this.LIZLLL.LIZJ;
                if (c0xn2 != null) {
                    int i = c0xn2.LIZIZ;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("protocol_type", i);
                        C0XG9.LJ("passport_frontier_message_error", jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                this.LIZLLL.LIZJ(strLIZLLL, false, null);
            }

            @Override // X.C0XH7
            public final void LJ(C0XGA c0xga, int i) {
                C0XN3 c0xn3 = (C0XN3) c0xga;
                if (c0xn3 != null && "session_expired".equalsIgnoreCase(c0xn3.LJIIIZ)) {
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject = c0xn3.LJII;
                    if (jSONObject != null && jSONObject.optJSONObject("data") != null) {
                        String strOptString = c0xn3.LJII.optJSONObject("data").optString("log_id");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList.add(new C20667087t("X-TT-LOGID", strOptString));
                        }
                    }
                    this.LIZLLL.LIZJ(strLIZLLL, true, arrayList);
                    return;
                }
                this.LIZLLL.LIZJ(strLIZLLL, false, null);
            }
        };
        Context context = this.LIZ.LLLJ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = strLIZLLL;
        new C847620XMy(context, c846070XGz.LIZIZ(), abstractC847610XMx).LJIIIZ();
    }

    public final void LIZJ(String str, boolean z, List list) {
        if (z) {
            if (C847400XMc.LIZ) {
                C0XMV c0xmv = C0XMV.LLJJJIL;
                c0xmv.getClass();
                C0XMZ.LJII(str, true, list);
                if (C0XMV.LLJJJJJIL && C847400XMc.LJII()) {
                    c0xmv.LIZIZ();
                    C0XNG c0xng = C847400XMc.LJI;
                    if (c0xng != null) {
                        C0XO0.LIZLLL(C848000XOk.LIZ()).LJ(true);
                    }
                    C0XMV.LJII("frontier", null);
                }
            }
        } else {
            this.LIZJ = null;
        }
        if (C847400XMc.LIZ) {
            C0XMV c0xmv2 = C0XMV.LLJJJIL;
            if (!C0XMV.LLJJJJJIL) {
                c0xmv2.getClass();
            } else {
                C786410Ut5.LJLJJI(LSPassThroughRecordSizeConfig.DEFAULT, c0xmv2.LLILZLL.LJI, c0xmv2.LLIZLLLIL);
            }
        }
        this.LIZIZ = false;
    }
}
