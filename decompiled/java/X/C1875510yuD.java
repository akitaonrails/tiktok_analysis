package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875510yuD {
    public final /* synthetic */ InterfaceC1875560yuI LIZ;
    public final /* synthetic */ C1875550yuH LIZIZ;
    public final /* synthetic */ InterfaceC1548390qOb LIZJ;
    public final /* synthetic */ C1875530yuF LIZLLL;

    public final void LIZIZ() {
        InterfaceC1875560yuI interfaceC1875560yuI = this.LIZ;
        new C1870890yml();
        interfaceC1875560yuI.onSuccess("");
        C1875550yuH c1875550yuH = this.LIZIZ;
        InterfaceC1548390qOb interfaceC1548390qOb = this.LIZJ;
        String str = this.LIZLLL.LIZIZ;
        c1875550yuH.getClass();
        HashMap map = new HashMap();
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "closed");
        if (str != null) {
            map.put("socketTaskID", str);
        }
        C1323890kYV c1323890kYV = new C1323890kYV(new JSONObject(map));
        if (interfaceC1548390qOb != null) {
            interfaceC1548390qOb.H4(c1323890kYV, "x.socketStatusChanged");
        }
    }

    public final void LIZ(String str) {
        this.LIZ.LJIIJ(str);
    }

    public C1875510yuD(C1875540yuG c1875540yuG, C1875550yuH c1875550yuH, InterfaceC1548390qOb interfaceC1548390qOb, C1875530yuF c1875530yuF) {
        this.LIZ = c1875540yuG;
        this.LIZIZ = c1875550yuH;
        this.LIZJ = interfaceC1548390qOb;
        this.LIZLLL = c1875530yuF;
    }
}
