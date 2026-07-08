package X;

import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BRQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BRQ implements InterfaceC1051760dTa {
    public final IESJsBridge LL;
    public final InterfaceC2204861BRc LLILLJJLI;

    public C1BRQ(IESJsBridge iESJsBridge, InterfaceC2204861BRc interfaceC2204861BRc) {
        this.LL = iESJsBridge;
        this.LLILLJJLI = interfaceC2204861BRc;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(final C1058910df7 c1058910df7, JSONObject jSONObject) {
        try {
            c1058910df7.LJIIJJI = false;
            C1BRP.LIZ(c1058910df7, jSONObject, this.LL, new InterfaceC2204871BRd() { // from class: X.1BRR
                @Override // X.InterfaceC2204871BRd
                public final void LIZ(JSONObject jSONObject2) {
                    this.LIZIZ.LL.LIZ(c1058910df7.LIZIZ, jSONObject2);
                }
            }, this.LLILLJJLI).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
