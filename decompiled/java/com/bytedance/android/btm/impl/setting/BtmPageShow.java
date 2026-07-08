package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmPageShow extends LazyDataBase {

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch_high_version")
    public final int f16switch = 1;

    public final int LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "switch_high_version", Integer.valueOf(this.f16switch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.f16switch;
        this.f16switch = iIntValue;
        return iIntValue;
    }
}
