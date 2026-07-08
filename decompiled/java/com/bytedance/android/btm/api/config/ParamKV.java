package com.bytedance.android.btm.api.config;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ParamKV extends LazyDataBase {

    @C09CT("key")
    public final String key = "";

    @C09CT("values")
    public final List<Object> values = C13BV.INSTANCE;

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

    public final List<Object> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.values, Object.class, "values");
        this.values = arrayListLIZ;
        return arrayListLIZ;
    }
}
