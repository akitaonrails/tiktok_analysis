package com.bytedance.android.bcm.impl.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BcmConfigModel {

    @C09CT("bcm_allowlist")
    public final List<String> bcmAllowList;

    @C09CT("bcm_in_chain")
    public List<String> bcmInChain;

    public BcmConfigModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.bcmInChain = c13bv;
        this.bcmAllowList = c13bv;
    }
}
