package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386780mBw implements InterfaceC1282004zy {
    public Integer LL;
    public Integer LLILLJJLI;
    public Integer LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;
    public Integer LLIZ;
    public Float LLIZLLLIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_calculate_colors", this.LL);
        linkedHashMap.put("has_gaussian_blur", this.LLILLJJLI);
        linkedHashMap.put("is_support_calculate_colors", this.LLILLL);
        linkedHashMap.put("is_support_gaussian_blur", this.LLILZ);
        linkedHashMap.put("has_ocr_check", this.LLILZIL);
        linkedHashMap.put("has_ocr_check_result", this.LLILZLL);
        linkedHashMap.put("is_ocr_effective", this.LLIZ);
        linkedHashMap.put("container_black_border", this.LLIZLLLIL);
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
