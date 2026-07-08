package X;

import android.content.Context;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.PushStreamData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277590jLp {
    public final Context LIZ;
    public final C1278530jNL LIZIZ;
    public final String LIZJ;
    public final InterfaceC1278670jNZ LIZLLL;
    public InterfaceC1278600jNS LJ;
    public JSONObject LJFF;
    public final LiveSdkSetting LJI;
    public PushStreamData LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public EnumC1152920g6k LJIILJJIL;
    public boolean LJIILL;
    public C1277690jLz LJIILLIIL;

    public final void LIZ(Throwable th) throws JSONException {
        if (this.LJI.mPushBase.LJJIJIL) {
            for (int i = 0; th != null && i < 10; i++) {
                String strLIZIZ = C13SZ.LIZIZ(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                JSONObject jSONObjectPut = new JSONObject().put("event_key", "pusher_create_debug_log").put("message", message).put("stack_trace", strLIZIZ).put("depth", i);
                InterfaceC1278600jNS interfaceC1278600jNS = this.LJ;
                if (interfaceC1278600jNS != null) {
                    interfaceC1278600jNS.LIZIZ(jSONObjectPut);
                }
                th = th.getCause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b A[Catch: s -> 0x0093, TryCatch #1 {s -> 0x0093, blocks: (B:10:0x007a, B:12:0x0080, B:14:0x0090, B:13:0x008b), top: B:56:0x007a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1277590jLp(android.content.Context r8, X.C1278530jNL r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1277590jLp.<init>(android.content.Context, X.0jNL, java.lang.String, java.lang.String):void");
    }
}
