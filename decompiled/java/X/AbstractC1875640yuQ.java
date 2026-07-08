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

/* JADX INFO: renamed from: X.0yuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1875640yuQ implements InterfaceC1700130uLL {
    public final Context LIZ;
    public final C1875390yu1 LIZIZ;
    public InterfaceC1875620yuO LIZJ;
    public int LIZLLL = -1;
    public final String LJ;

    @Override // X.InterfaceC1700130uLL
    public final void LIZIZ() {
        int i;
        synchronized (this) {
            i = this.LIZLLL;
        }
        if (i != -1) {
            C1875600yuM c1875600yuM = (C1875600yuM) this;
            try {
                C1875370ytz c1875370ytz = c1875600yuM.LJFF;
                if (c1875370ytz != null) {
                    c1875370ytz.LIZ.stopConnection();
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            InterfaceC1875620yuO interfaceC1875620yuO = c1875600yuM.LIZJ;
            if (interfaceC1875620yuO != null) {
                interfaceC1875620yuO.LIZJ("stop connect", false);
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
                    C1875600yuM c1875600yuM = (C1875600yuM) this;
                    C1875370ytz c1875370ytz = c1875600yuM.LJFF;
                    if (c1875370ytz != null) {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        JSONObject jSONObject = c1875600yuM.LIZIZ.LIZIZ;
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
                        JSONArray jSONArray = c1875600yuM.LIZIZ.LIZJ;
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
                        List<String> listSingletonList = Collections.singletonList(c1875600yuM.LIZIZ.LIZ);
                        if (listSingletonList == null || listSingletonList.isEmpty()) {
                            return;
                        }
                        c1875370ytz.LIZ.openConnection(map, map2, listSingletonList, false, false);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.stacktrace(6, C1879520z0g.LIZ, e.getStackTrace());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("net error, url = ");
        sbLIZ.append(this.LJ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("Task.base", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1875620yuO interfaceC1875620yuO = this.LIZJ;
        if (interfaceC1875620yuO != null) {
            interfaceC1875620yuO.onFailed("net error");
        }
    }

    public final synchronized void LIZLLL(int i) {
        this.LIZLLL = i;
    }

    public AbstractC1875640yuQ(Context context, C1875390yu1 c1875390yu1) {
        this.LIZ = context;
        this.LIZIZ = c1875390yu1;
        this.LJ = c1875390yu1.LIZ;
    }
}
