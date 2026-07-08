package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1530890pwN implements InterfaceC1532190pyT {
    public final String LL;
    public final Long LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final Map<String, String> LLILZIL;

    @Override // X.InterfaceC1532190pyT
    public String getFilepath() {
        return this.LL;
    }

    @Override // X.InterfaceC1532190pyT
    public Map<String, String> getHttpResponseHeaders() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1532190pyT
    public Integer getResourceSize() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1532190pyT
    public String getResourceUniqueId() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1532190pyT
    public Long getVersion() {
        return this.LLILLJJLI;
    }

    public C1530890pwN(String str, Long l, Integer num, String str2, Map map, int i) {
        str = (i & 1) != 0 ? null : str;
        l = (i & 2) != 0 ? null : l;
        num = (i & 4) != 0 ? null : num;
        str2 = (i & 8) != 0 ? null : str2;
        map = (i & 16) != 0 ? null : map;
        this.LL = str;
        this.LLILLJJLI = l;
        this.LLILLL = num;
        this.LLILZ = str2;
        this.LLILZIL = map;
    }
}
