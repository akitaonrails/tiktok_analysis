package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class EntranceInfoParamsOfflineConfig extends LazyDataBase {

    @C09CT("offline_feature_allow_config")
    public final List<AllowListItem> allowList;

    @C09CT("offline_keys_block_keys")
    public final List<String> keyBlackList;

    @C09CT("offline_keys_allow_keys")
    public final List<String> keyWhiteList;

    @C09CT("offline_int_switch")
    public final boolean offlineIntSwitch;

    @C09CT("offline_switch")
    public final boolean offlineSwitch;

    public final List<AllowListItem> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.allowList, AllowListItem.class, "offline_feature_allow_config");
        this.allowList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.keyBlackList, String.class, "offline_keys_block_keys");
        this.keyBlackList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LIZJ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.keyWhiteList, String.class, "offline_keys_allow_keys");
        this.keyWhiteList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final boolean LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "offline_int_switch", Boolean.valueOf(this.offlineIntSwitch));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.offlineIntSwitch;
        this.offlineIntSwitch = zBooleanValue;
        return zBooleanValue;
    }

    public final boolean LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "offline_switch", Boolean.valueOf(this.offlineSwitch));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.offlineSwitch;
        this.offlineSwitch = zBooleanValue;
        return zBooleanValue;
    }

    public EntranceInfoParamsOfflineConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this.allowList = c13bv;
        this.keyWhiteList = c13bv;
        this.keyBlackList = c13bv;
    }
}
