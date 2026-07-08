package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18g6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21345218g6 implements InterfaceC21345518g9 {
    public C21347918gX LIZ;
    public final List<C21344518fz> LIZIZ = new ArrayList();

    public final void LIZIZ(C21347218gQ c21347218gQ) {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.LIZIZ) {
            for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
                try {
                    C21344518fz c21344518fz = (C21344518fz) ((ArrayList) this.LIZIZ).get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "page");
                    jSONObject.put("title", c21344518fz.LIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("");
                    sbLIZ.append(i);
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, C2188811AlT.LIZIZ(sbLIZ));
                    jSONObject.put("description", "");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ws://");
                    sbLIZ2.append(c21344518fz.LIZLLL);
                    jSONObject.put("webSocketDebuggerUrl", C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("/devtools/inspector.html?ws=");
                    sbLIZ3.append(c21344518fz.LIZLLL);
                    jSONObject.put("devtoolsFrontendUrl", C2188811AlT.LIZIZ(sbLIZ3));
                    jSONArray.put(jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C21347918gX c21347918gXLIZ = AbstractC21348018gY.LIZ(jSONArray.toString(), "application/json");
        c21347218gQ.LIZJ = 200;
        c21347218gQ.LIZLLL = "OK";
        c21347218gQ.LJ = c21347918gXLIZ;
    }

    public final void LIZJ(C21347218gQ c21347218gQ) throws JSONException {
        String str;
        if (this.LIZ == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Browser", "VMSDK-Debugger");
            jSONObject.put("Protocol-Version", "1.3");
            synchronized (C805320ViU.class) {
                if (!C805320ViU.LIZJ) {
                    C805320ViU.LIZJ = true;
                    try {
                        C805320ViU.LIZIZ = C805320ViU.LIZIZ();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                str = C805320ViU.LIZIZ;
            }
            jSONObject.put("Android-Package", str);
            jSONObject.put("V8-Version", "7.2.1");
            this.LIZ = AbstractC21348018gY.LIZ(C786410Ut5.J3(jSONObject), "application/json");
        }
        C21347918gX c21347918gX = this.LIZ;
        c21347218gQ.LIZJ = 200;
        c21347218gQ.LIZLLL = "OK";
        c21347218gQ.LJ = c21347918gX;
    }

    @Override // X.InterfaceC21345518g9
    public final boolean LIZ(C21345418g8 c21345418g8, C21347318gR c21347318gR, C21347218gQ c21347218gQ) {
        String path = c21347318gR.LIZJ.getPath();
        try {
            if ("/json/version".equals(path)) {
                LIZJ(c21347218gQ);
            } else if ("/json".equals(path) || "/json/list".equals(path)) {
                LIZIZ(c21347218gQ);
            } else {
                c21347218gQ.LIZJ = 501;
                c21347218gQ.LIZLLL = "Not implemented";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No support for ");
                sbLIZ.append(path);
                sbLIZ.append("\n");
                c21347218gQ.LJ = AbstractC21348018gY.LIZ(C2188811AlT.LIZIZ(sbLIZ), "text/plain");
            }
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            c21347218gQ.LIZJ = 500;
            c21347218gQ.LIZLLL = "Internal server error";
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(e.toString());
            sbLIZ2.append("\n");
            c21347218gQ.LJ = AbstractC21348018gY.LIZ(C2188811AlT.LIZIZ(sbLIZ2), "text/plain");
            return true;
        }
    }
}
