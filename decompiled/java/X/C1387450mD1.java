package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387450mD1 implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab_name", this.LL);
        linkedHashMap.put("playlist_type", this.LLILLJJLI);
        linkedHashMap.put("content_source", this.LLILLL);
        linkedHashMap.put("tag_line", this.LLILZ);
        linkedHashMap.put("is_profile_tab_search", this.LLILZIL);
        linkedHashMap.put("profile_tab_search_id", this.LLILZLL);
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
