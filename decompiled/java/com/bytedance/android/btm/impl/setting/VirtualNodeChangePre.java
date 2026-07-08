package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class VirtualNodeChangePre extends LazyDataBase {

    @C09CT("url")
    public final String url = "";

    @C09CT("btm_code")
    public final String btmCode = "";

    public final String LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm_code", this.btmCode);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.btmCode;
        }
        this.btmCode = str;
        return str;
    }

    public final String LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "url", this.url);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.url;
        }
        this.url = str;
        return str;
    }
}
