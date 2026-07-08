package com.bytedance.android.btm.api.config;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BackupAddBtmEventConfig extends LazyDataBase {

    @C09CT("event")
    public final String event = "";

    @C09CT("params")
    public final List<ParamKV> params = C13BV.INSTANCE;

    public final String LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event", this.event);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.event;
        }
        this.event = str;
        return str;
    }

    public final List<ParamKV> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.params, ParamKV.class, "params");
        this.params = arrayListLIZ;
        return arrayListLIZ;
    }
}
