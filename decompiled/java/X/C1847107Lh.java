package X;

import java.util.Map;

/* JADX INFO: renamed from: X.07Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1847107Lh implements InterfaceC1847507Ll {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;

    @Override // X.InterfaceC1847507Ll
    public final Map<String, Object> getParams() {
        Map<String, Object> map = this.LIZIZ;
        return map == null ? C2097608Jq.LJ() : map;
    }

    @Override // X.InterfaceC1847507Ll
    public final String getEvent() {
        return this.LIZ;
    }

    public C1847107Lh(String str, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
