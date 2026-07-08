package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class SchemaRulesModel extends LazyDataBase {

    @C09CT("rules")
    public final List<SchemaPatternRuleModel> rules;

    public final List<SchemaPatternRuleModel> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.rules, SchemaPatternRuleModel.class, "rules");
        this.rules = arrayListLIZ;
        return arrayListLIZ;
    }
}
