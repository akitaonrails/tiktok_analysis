package X;

import android.net.Uri;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549990qRB extends AbstractC1550060qRI {
    public final Uri LLILLJJLI;
    public final String LLILLL;

    public C1549990qRB() {
        throw null;
    }

    @Override // X.InterfaceC1550110qRN
    public final JSONObject getFormatData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("host");
        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), new Uri.Builder().scheme(this.LLILLJJLI.getScheme()).authority(this.LLILLJJLI.getAuthority()).build());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append("path");
        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), this.LLILLJJLI.getPath());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LLILLL);
        sbLIZ3.append("url");
        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ3), new Uri.Builder().scheme(this.LLILLJJLI.getScheme()).authority(this.LLILLJJLI.getAuthority()).path(this.LLILLJJLI.getPath()).build());
        C1043700dGa.LIZ(jSONObject, LIZ());
        return jSONObject;
    }

    @Override // X.InterfaceC1550120qRO
    public final String getUrl() {
        return new Uri.Builder().scheme(this.LLILLJJLI.getScheme()).authority(this.LLILLJJLI.getAuthority()).path(this.LLILLJJLI.getPath()).build().toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1549990qRB(Uri uri, String str, Map map, int i) {
        super((i & 4) != 0 ? null : map);
        str = (i & 2) != 0 ? "" : str;
        this.LLILLJJLI = uri;
        this.LLILLL = str;
    }
}
