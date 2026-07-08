package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386610mBf implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_original", this.LL);
        linkedHashMap.put("shoot_tab_name", this.LLILLJJLI);
        linkedHashMap.put("publish_content_type", this.LLILLL);
        linkedHashMap.put("is_multi_content", this.LLILZ);
        return linkedHashMap;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }
}
