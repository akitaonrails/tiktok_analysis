package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class AllowListItem extends LazyDataBase {

    @C09CT("key")
    public final String key = "";

    @C09CT("value")
    public final String value = "";

    public final String LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "key", this.key);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.key;
        }
        this.key = str;
        return str;
    }

    public final String LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "value", this.value);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.value;
        }
        this.value = str;
        return str;
    }
}
