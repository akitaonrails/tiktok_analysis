package X;

import java.util.Map;

/* JADX INFO: renamed from: X.017G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017G implements InterfaceC1282004zy {
    public Map<String, String> LL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        Map<String, String> map = this.LL;
        return map == null ? C2097608Jq.LJ() : map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }
}
