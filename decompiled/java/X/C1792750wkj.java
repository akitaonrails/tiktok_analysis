package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0wkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792750wkj implements InterfaceC1193104ld {
    public final String LL;
    public final String LLILLJJLI;
    public final Map<String, String> LLILLL;

    public C1792750wkj() {
        this("", "");
    }

    @Override // X.InterfaceC1193104ld
    public final Map<String, String> getLogMap() {
        return this.LLILLL;
    }

    public C1792750wkj(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = new LinkedHashMap();
    }
}
