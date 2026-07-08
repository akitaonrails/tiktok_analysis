package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmSettingModel extends LazyDataBase {

    @C09CT("sdk_switch_high_version")
    public int sdkSwitch = 1;

    @C09CT("bcm_sdk_switch_high_version")
    public int bcmSdkSwitch = 1;

    @C09CT("version")
    public String version = CardStruct.IStatusCode.DEFAULT;

    @C09CT("feature")
    public final FeatureModel feature = new FeatureModel();

    @C09CT("bugfix")
    public final BugfixModel bugfix = new BugfixModel();

    @C09CT("optimize")
    public final OptimizeModel optimize = new OptimizeModel();

    public final int LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "bcm_sdk_switch_high_version", Integer.valueOf(this.bcmSdkSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.bcmSdkSwitch;
        this.bcmSdkSwitch = iIntValue;
        return iIntValue;
    }

    public final int LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "sdk_switch_high_version", Integer.valueOf(this.sdkSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.sdkSwitch;
        this.sdkSwitch = iIntValue;
        return iIntValue;
    }

    public final String LJFF() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "version", this.version);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.version;
        }
        this.version = str;
        return str;
    }

    public final BugfixModel LIZIZ() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.bugfix, "bugfix");
        return this.bugfix;
    }

    public final FeatureModel LIZJ() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.feature, "feature");
        return this.feature;
    }

    public final OptimizeModel LIZLLL() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.optimize, "optimize");
        return this.optimize;
    }
}
