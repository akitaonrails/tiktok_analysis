package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0O0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O0Z implements InterfaceC1282004zy {
    public int LL;
    public Long LLILLJJLI;
    public String LLILLL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_prompt_related", Integer.valueOf(this.LL));
        linkedHashMap.put("instruction_id", this.LLILLJJLI);
        linkedHashMap.put("related_prompt", this.LLILLL);
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
