package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0SUK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUK implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_text_mode", this.LL);
        linkedHashMap.put("is_text_trans_pic", this.LLILLJJLI);
        linkedHashMap.put("is_comment_to_post", this.LLILLL);
        linkedHashMap.put("cmt_to_post_source_group_id", this.LLILZ);
        linkedHashMap.put("cmt_to_post_source_link_position", this.LLILZIL);
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
