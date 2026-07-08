package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class LongChainFirstScene extends LazyDataBase {

    @C09CT("ecommerce")
    public final List<String> ecommerce;

    @C09CT("tab")
    public final List<String> tab;

    public final List<String> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.ecommerce, String.class, "ecommerce");
        this.ecommerce = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.tab, String.class, "tab");
        this.tab = arrayListLIZ;
        return arrayListLIZ;
    }

    public LongChainFirstScene() {
        C13BV c13bv = C13BV.INSTANCE;
        this.tab = c13bv;
        this.ecommerce = c13bv;
    }
}
