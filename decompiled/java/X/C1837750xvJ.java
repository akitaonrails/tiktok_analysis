package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0xvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837750xvJ implements InterfaceC1193104ld {
    public String LL;
    public List<String> LLILLJJLI;
    public final Map<String, String> LLILLL;

    public C1837750xvJ() {
        this(null);
    }

    @Override // X.InterfaceC1193104ld
    public final Map<String, String> getLogMap() {
        return this.LLILLL;
    }

    public C1837750xvJ(Object obj) {
        C13BV c13bv = C13BV.INSTANCE;
        this.LL = "";
        this.LLILLJJLI = c13bv;
        this.LLILLL = new LinkedHashMap();
    }
}
