package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386340mBE implements InterfaceC1282004zy {
    public Integer LL;
    public Integer LLILLJJLI;
    public String LLILLL;
    public Integer LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public Integer LLIZLLLIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_detail_page", this.LL);
        linkedHashMap.put("is_with_comment", this.LLILLJJLI);
        linkedHashMap.put("friends_tab_version", this.LLILLL);
        linkedHashMap.put("is_collapse_reposts", this.LLILZ);
        linkedHashMap.put("is_mute", this.LLILZIL);
        linkedHashMap.put("is_auto_play", this.LLILZLL);
        linkedHashMap.put("enter_position", this.LLIZ);
        linkedHashMap.put("is_recommend", this.LLIZLLLIL);
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
