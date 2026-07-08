package X;

import com.facebook.FacebookRequestError;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C1BJ3 implements C0WV8 {
    public final /* synthetic */ InterfaceC2202881BJm LIZ;
    public final /* synthetic */ String LIZIZ;

    public /* synthetic */ C1BJ3(InterfaceC2202881BJm interfaceC2202881BJm, String str) {
        this.LIZ = interfaceC2202881BJm;
        this.LIZIZ = str;
    }

    @Override // X.C0WV8
    public final void LIZIZ(C0WVK c0wvk) {
        InterfaceC2202881BJm interfaceC2202881BJm = this.LIZ;
        String str = this.LIZIZ;
        FacebookRequestError facebookRequestError = c0wvk.LIZJ;
        if (facebookRequestError != null) {
            interfaceC2202881BJm.LIZ(facebookRequestError.exception);
            return;
        }
        JSONObject jSONObject = c0wvk.LIZLLL;
        if (jSONObject != null) {
            C20338814iA.LIZ.put(str, jSONObject);
            interfaceC2202881BJm.LIZIZ(c0wvk.LIZLLL);
        } else {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
    }
}
