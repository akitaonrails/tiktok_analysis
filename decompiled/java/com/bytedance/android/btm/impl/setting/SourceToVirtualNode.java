package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class SourceToVirtualNode extends LazyDataBase {

    @C09CT("source")
    public final String source = "";

    @C09CT("virtual_node")
    public final String virtualNode = "";

    public final String LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "source", this.source);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.source;
        }
        this.source = str;
        return str;
    }

    public final String LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "virtual_node", this.virtualNode);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.virtualNode;
        }
        this.virtualNode = str;
        return str;
    }
}
