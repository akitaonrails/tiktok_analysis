package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class PreModel extends LazyDataBase {

    @C09CT("btm_page")
    public String btmPage = "";

    @C09CT("btm_pre_page")
    public List<String> btmPrePage = C13BV.INSTANCE;

    public final String LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm_page", this.btmPage);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.btmPage;
        }
        this.btmPage = str;
        return str;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.btmPrePage, String.class, "btm_pre_page");
        this.btmPrePage = arrayListLIZ;
        return arrayListLIZ;
    }
}
