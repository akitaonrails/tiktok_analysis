package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BcmWhitelist extends LazyDataBase {

    @C09CT("biz_allowlist")
    public List<String> bizWhitelist;

    @C09CT("delete_unregistered")
    public int deleteUnregistered = 1;

    @C09CT("key_allowlist")
    public List<String> keyWhitelist;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public int f15switch;

    public final int LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "delete_unregistered", Integer.valueOf(this.deleteUnregistered));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.deleteUnregistered;
        this.deleteUnregistered = iIntValue;
        return iIntValue;
    }

    public BcmWhitelist() {
        C13BV c13bv = C13BV.INSTANCE;
        this.bizWhitelist = c13bv;
        this.keyWhitelist = c13bv;
    }
}
