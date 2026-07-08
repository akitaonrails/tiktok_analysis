package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AwS562S0100000_18;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162830gMj extends AbstractC1161490gKZ implements InterfaceC1160790gJR {
    public final C1163160gNG LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL = "";
    public C1160990gJl LLJ;

    @Override // X.InterfaceC1160790gJR
    public final void LIZJ(C1161040gJq c1161040gJq, boolean z) {
    }

    @Override // X.InterfaceC1160790gJR
    public final C1161000gJm LJIIJ(C1161000gJm c1161000gJm) {
        return c1161000gJm;
    }

    @Override // X.InterfaceC1160790gJR
    public final void onSuccess() {
        this.LLIZ = true;
        this.LLIZLLLIL = "";
    }

    @Override // X.AbstractC1161490gKZ, X.InterfaceC1161460gKW
    public final void LJII() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_cost", this.LLILZ - this.LLILLL);
        jSONObject.put("resp2parse_cost", this.LLILZIL - this.LLILZ);
        jSONObject.put("parse_cost", this.LLILZLL - this.LLILZIL);
        jSONObject.put("total_cost", this.LLILZLL - this.LLILLL);
        JSONObject jSONObject2 = new JSONObject();
        InterfaceC1161620gKm interfaceC1161620gKm = this.LL;
        jSONObject2.put("nameSpace", interfaceC1161620gKm != null ? interfaceC1161620gKm.Ay() : null);
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LLIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        jSONObject2.put("error_msg", this.LLIZLLLIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("metric: ");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", category: ");
        sbLIZ.append(jSONObject2);
        C1530030puz.LIZJ(EnumC1490770otf.D, "RavenPerf", C2188811AlT.LIZIZ(sbLIZ), null);
        C1520360pfO c1520360pfO = new C1520360pfO("raven_perf");
        c1520360pfO.LJ = jSONObject;
        c1520360pfO.LIZLLL = jSONObject2;
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
        this.LL = null;
    }

    public C1162830gMj(C1163160gNG c1163160gNG) {
        this.LLILLJJLI = c1163160gNG;
    }

    @Override // X.InterfaceC1160790gJR
    public final void LIZLLL(C1161040gJq c1161040gJq) {
        String strEK;
        String str;
        boolean z = false;
        if (c1161040gJq != null && c1161040gJq.LLILLJJLI) {
            this.LLILZLL = System.currentTimeMillis();
            C1160990gJl c1160990gJl = this.LLJ;
            if (c1160990gJl != null && !c1160990gJl.LIZJ) {
                z = true;
            }
            boolean z2 = !z;
            InterfaceC1161620gKm interfaceC1161620gKm = this.LL;
            if (interfaceC1161620gKm != null) {
                strEK = interfaceC1161620gKm.EK();
            } else {
                strEK = null;
            }
            if (z2) {
                str = "first_response";
            } else {
                str = "loadmore_response";
            }
            C0XF0.LIZ(strEK, str, "1", 56);
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJ(C1161000gJm c1161000gJm) {
        this.LLILZIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIIZZ(C1161000gJm c1161000gJm) {
        boolean z;
        String strEK;
        String str;
        this.LLILLJJLI.LIZIZ("response_start");
        this.LLILZ = System.currentTimeMillis();
        new C1043010dFT();
        C1043010dFT.LIZ("RavenTracing_TEST", new AwS562S0100000_18(this, 2673));
        C1160990gJl c1160990gJl = this.LLJ;
        if (c1160990gJl != null && !c1160990gJl.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        InterfaceC1161620gKm interfaceC1161620gKm = this.LL;
        if (interfaceC1161620gKm != null) {
            strEK = interfaceC1161620gKm.EK();
        } else {
            strEK = null;
        }
        if (z2) {
            str = "first_request";
        } else {
            str = "loadmore_request";
        }
        C0XF0.LIZ(strEK, str, "1", 56);
    }

    @Override // X.InterfaceC1160790gJR
    public final void onError(Throwable th) {
        String str;
        String str2;
        boolean z = false;
        this.LLIZ = false;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        this.LLIZLLLIL = message;
        C1160990gJl c1160990gJl = this.LLJ;
        if (c1160990gJl != null && !c1160990gJl.LIZJ) {
            z = true;
        }
        boolean z2 = !z;
        String strEK = null;
        if (this.LLILZ > 0) {
            InterfaceC1161620gKm interfaceC1161620gKm = this.LL;
            if (interfaceC1161620gKm != null) {
                strEK = interfaceC1161620gKm.EK();
            }
            if (z2) {
                str2 = "first_response";
            } else {
                str2 = "loadmore_response";
            }
            C0XF0.LIZ(strEK, str2, CardStruct.IStatusCode.DEFAULT, 56);
            return;
        }
        InterfaceC1161620gKm interfaceC1161620gKm2 = this.LL;
        if (interfaceC1161620gKm2 != null) {
            strEK = interfaceC1161620gKm2.EK();
        }
        if (z2) {
            str = "first_request";
        } else {
            str = "loadmore_request";
        }
        C0XF0.LIZ(strEK, str, CardStruct.IStatusCode.DEFAULT, 56);
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIZ(C1160990gJl c1160990gJl, String str) {
        this.LLJ = c1160990gJl;
        this.LLILLJJLI.LIZIZ("request_start");
        this.LLILLL = System.currentTimeMillis();
    }
}
