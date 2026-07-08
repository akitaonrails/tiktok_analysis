package com.bytedance.android.btm.api.config;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BcmChainEventConfig extends LazyDataBase {

    @C09CT("btm_allowlist")
    public final List<String> btmAllowlist;

    @C09CT("btm_blocklist")
    public final List<String> btmBlocklist;

    @C09CT("event")
    public String event = "";

    @C09CT("chain_length")
    public int chainLength = -1;

    @C09CT("default_send")
    public final int defaultSend = 1;

    public final List<String> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.btmAllowlist, String.class, "btm_allowlist");
        this.btmAllowlist = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.btmBlocklist, String.class, "btm_blocklist");
        this.btmBlocklist = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "chain_length", Integer.valueOf(this.chainLength));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.chainLength;
        this.chainLength = iIntValue;
        return iIntValue;
    }

    public final int LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "default_send", Integer.valueOf(this.defaultSend));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.defaultSend;
        this.defaultSend = iIntValue;
        return iIntValue;
    }

    public final String LJ() {
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

    public BcmChainEventConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this.btmAllowlist = c13bv;
        this.btmBlocklist = c13bv;
    }

    public final void LJFF(int i) {
        this.chainLength = i;
        C1972007ny.LIZJ(this, "chain_length");
    }

    public final void LJI(String str) {
        this.event = str;
        C1972007ny.LIZJ(this, "event");
    }
}
