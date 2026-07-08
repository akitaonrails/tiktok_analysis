package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1875650yuR implements InterfaceC1700110uLJ {
    public final Context LIZ;
    public final C1875330ytv LIZIZ;
    public InterfaceC1875630yuP LIZJ;
    public int LIZLLL = -1;
    public final String LJ;

    @Override // X.InterfaceC1700110uLJ
    public final void LIZIZ() {
        int i;
        synchronized (this) {
            i = this.LIZLLL;
        }
        if (i != -1) {
            C1875610yuN c1875610yuN = (C1875610yuN) this;
            try {
                C1875320ytu c1875320ytu = c1875610yuN.LJFF;
                if (c1875320ytu != null) {
                    c1875320ytu.LIZ.stopConnection();
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            InterfaceC1875630yuP interfaceC1875630yuP = c1875610yuN.LIZJ;
            if (interfaceC1875630yuP != null) {
                interfaceC1875630yuP.LIZJ(false);
            }
            LIZLLL(-1);
        }
    }

    public final void LJ() {
        NetworkInfo networkInfoLJIJ;
        String string;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(this.LIZ, "connectivity");
            if (connectivityManager != null && (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) != null && networkInfoLJIJ.isConnected()) {
                if (networkInfoLJIJ.getState() == NetworkInfo.State.CONNECTED) {
                    C1875610yuN c1875610yuN = (C1875610yuN) this;
                    C1875320ytu c1875320ytu = c1875610yuN.LJFF;
                    if (c1875320ytu != null) {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        JSONObject jSONObject = c1875610yuN.LIZIZ.LIZIZ;
                        if (jSONObject != null) {
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (next.length() != 0) {
                                    Object objOpt = jSONObject.opt(next);
                                    if (objOpt == null || (string = objOpt.toString()) == null) {
                                        string = "";
                                    }
                                    map2.put(next, string);
                                }
                            }
                        }
                        JSONArray jSONArray = c1875610yuN.LIZIZ.LIZJ;
                        if (jSONArray != null) {
                            int length = jSONArray.length();
                            StringBuilder sb = new StringBuilder();
                            for (int i = 0; i < length; i++) {
                                sb.append(jSONArray.optString(i));
                                if (i != length - 1) {
                                    sb.append(",");
                                }
                            }
                            String string2 = sb.toString();
                            if (string2.length() > 0) {
                                map2.put("Sec-WebSocket-Protocol", string2);
                            }
                        }
                        List<String> listSingletonList = Collections.singletonList(c1875610yuN.LIZIZ.LIZ);
                        if (listSingletonList == null || listSingletonList.isEmpty()) {
                            return;
                        }
                        c1875320ytu.LIZ.openConnection(map, map2, listSingletonList, false, false);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.stacktrace(6, C1879530z0h.LIZ, e.getStackTrace());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("net error, url = ");
        sbLIZ.append(this.LJ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("Task.base", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1875630yuP interfaceC1875630yuP = this.LIZJ;
        if (interfaceC1875630yuP != null) {
            interfaceC1875630yuP.onFailed("net error");
        }
    }

    public final synchronized void LIZLLL(int i) {
        this.LIZLLL = i;
    }

    public AbstractC1875650yuR(Context context, C1875330ytv c1875330ytv) {
        this.LIZ = context;
        this.LIZIZ = c1875330ytv;
        this.LJ = c1875330ytv.LIZ;
    }
}
