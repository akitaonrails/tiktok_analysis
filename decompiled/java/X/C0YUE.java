package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YUE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUE implements C0YJ8 {
    public static final C0YUE LIZ = new C0YUE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(568));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(569));

    @Override // X.C0YJ8
    public final Map<String, String> LJIIIIZZ(String str) {
        C882400YjW c882400YjW = C882400YjW.LIZ;
        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        c882400YjW.getClass();
        return C882400YjW.LIZIZ(c0ym2).LJIIIIZZ();
    }

    @Override // X.C0YJ8
    public final void LIZIZ(String str, JSONObject jSONObject) {
        ((C0YUF) LIZIZ.getValue()).LIZJ(str, jSONObject);
    }

    @Override // X.C0YJ8
    public final void LIZLLL(String str, Throwable th) {
        Throwable runtimeException;
        if (th == null) {
            runtimeException = new RuntimeException("imsdk_unknown");
        } else {
            runtimeException = th;
        }
        C01GW c01gw = LIZIZ;
        ((C0YUF) c01gw.getValue()).LIZ(runtimeException, C2097608Jq.LJ());
        C01GW c01gw2 = LIZJ;
        if (((C0YUG) c01gw2.getValue()).isDebug() || ((C0YUG) c01gw2.getValue()).isLocalTest()) {
            ((C0YUF) c01gw.getValue()).LIZIZ(th);
        }
    }

    @Override // X.C0YJ8
    public final void LJII(String str, Throwable th, Map<String, String> map) {
        ((C0YUF) LIZIZ.getValue()).LIZ(th, map);
    }

    @Override // X.C0YJ8
    public final void LJIIIZ(JSONObject jSONObject, String str, float f) {
        ((C0YUF) LIZIZ.getValue()).LIZLLL(jSONObject, str);
    }
}
