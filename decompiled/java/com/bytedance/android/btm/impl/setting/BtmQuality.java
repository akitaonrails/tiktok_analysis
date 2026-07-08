package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BtmQuality extends LazyDataBase {

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final int f17switch = 1;

    @C09CT("error_codes")
    public final List<Integer> errorCodes = C13BV.INSTANCE;

    public final List<Integer> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.errorCodes, Integer.TYPE, "error_codes");
        this.errorCodes = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "switch", Integer.valueOf(this.f17switch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.f17switch;
        this.f17switch = iIntValue;
        return iIntValue;
    }
}
