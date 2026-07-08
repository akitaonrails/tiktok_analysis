package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class SchemaPatternRuleModel extends LazyDataBase {

    @C09CT("btm")
    public String btm = "";

    @C09CT("patterns")
    public List<String> patterns;

    public final String LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm", this.btm);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.btm;
        }
        this.btm = str;
        return str;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.patterns, String.class, "patterns");
        this.patterns = arrayListLIZ;
        return arrayListLIZ;
    }
}
