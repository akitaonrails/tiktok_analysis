package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class BcmParamsCheck extends LazyDataBase {

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final int f14switch = 1;

    @C09CT("use_gecko")
    public final int useGecko;

    public final int LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "switch", Integer.valueOf(this.f14switch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.f14switch;
        this.f14switch = iIntValue;
        return iIntValue;
    }

    public final int LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "use_gecko", Integer.valueOf(this.useGecko));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.useGecko;
        this.useGecko = iIntValue;
        return iIntValue;
    }
}
