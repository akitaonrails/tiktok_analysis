package X;

import com.google.gson.n;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0gsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182810gsx implements Serializable {
    public final String LL;
    public final String LLILLJJLI;

    public final n toJSONObject() {
        n nVar = new n();
        nVar.LJJIIJ("lat", this.LL);
        nVar.LJJIIJ("lng", this.LLILLJJLI);
        return nVar;
    }

    public final String getLat() {
        return this.LL;
    }

    public final String getLng() {
        return this.LLILLJJLI;
    }

    public C1182810gsx(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
