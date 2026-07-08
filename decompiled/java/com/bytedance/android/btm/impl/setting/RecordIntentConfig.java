package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1697810uHb;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RecordIntentConfig extends LazyDataBase {

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public int f18switch = 1;

    @C09CT("keys")
    public final List<String> keys = C1697810uHb.LJIIJJI("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "tab");

    public final List<String> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.keys, String.class, "keys");
        this.keys = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "switch", Integer.valueOf(this.f18switch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.f18switch;
        this.f18switch = iIntValue;
        return iIntValue;
    }
}
