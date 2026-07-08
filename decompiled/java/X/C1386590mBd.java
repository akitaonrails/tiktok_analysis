package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386590mBd implements InterfaceC1282004zy {
    public Integer LL;
    public Integer LLILLJJLI;
    public Boolean LLILLL;
    public Boolean LLILZ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_landscape_screen", null);
        linkedHashMap.put("encouraged_tablet_fullscreen", this.LL);
        linkedHashMap.put("encouraged_tablet_rotation", this.LLILLJJLI);
        linkedHashMap.put("did_fast_forward", this.LLILLL);
        linkedHashMap.put("did_rewind", this.LLILZ);
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
