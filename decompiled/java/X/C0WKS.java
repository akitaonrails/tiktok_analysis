package X;

import android.net.Uri;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WKS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WKS implements InterfaceC1550110qRN {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C01GW LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS557S0100000_13(this, 191));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WKS)) {
            return false;
        }
        C0WKS c0wks = (C0WKS) obj;
        return Intrinsics.LJFF(this.LL, c0wks.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0wks.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0wks.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApiRequest(url=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", method=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", body=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Uri LIZ() {
        return (Uri) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1550110qRN
    public final JSONObject getFormatData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", new Uri.Builder().scheme(LIZ().getScheme()).authority(LIZ().getAuthority()).build());
        jSONObject.put("path", LIZ().getPath());
        jSONObject.put("url", new Uri.Builder().scheme(LIZ().getScheme()).authority(LIZ().getAuthority()).path(LIZ().getPath()).build());
        jSONObject.put("method", this.LLILLJJLI);
        return jSONObject;
    }

    public C0WKS(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
