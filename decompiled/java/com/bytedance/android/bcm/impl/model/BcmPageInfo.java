package com.bytedance.android.bcm.impl.model;

import X.C18CK;
import X.C18CS;
import X.C1972007ny;
import X.C212369188x;
import X.C21243118Bh;
import X.C21247918Dd;
import X.InterfaceC21243418Bk;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.BtmSettingModel;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class BcmPageInfo extends PageInfo {
    public static final C21243118Bh Companion = new Object() { // from class: X.18Bh
    };
    public static final long serialVersionUID = 20220211;
    public transient Map<String, BcmParams> pageParams;
    public transient InterfaceC21243418Bk pageParamsProvider;
    public transient Map<String, BcmParams> unitParamsV1;

    @Override // com.bytedance.android.btm.impl.page.model.PageInfo
    public BcmPageInfo copy() {
        BcmPageInfo bcmPageInfo = new BcmPageInfo();
        copy(bcmPageInfo);
        return bcmPageInfo;
    }

    public final Map<String, BcmParams> getPageParams() {
        if (this.pageParams == null) {
            this.pageParams = new LinkedHashMap();
        }
        return this.pageParams;
    }

    public final Map<String, BcmParams> getUnitParamsV1() {
        if (this.unitParamsV1 == null) {
            this.unitParamsV1 = new LinkedHashMap();
        }
        return this.unitParamsV1;
    }

    public final C212369188x snapshot() {
        C212369188x c212369188x = new C212369188x(getPageParams(), null, getUnitParamsV1());
        c212369188x.LIZLLL = getClassSimpleName();
        return c212369188x;
    }

    @Override // com.bytedance.android.btm.impl.page.model.PageInfo, com.bytedance.android.btm.api.cache.ISavable
    public String save() {
        return super.save();
    }

    public final InterfaceC21243418Bk getPageParamsProvider() {
        return this.pageParamsProvider;
    }

    private final BcmPageInfo copy(BcmPageInfo bcmPageInfo) {
        copy((PageInfo) bcmPageInfo);
        bcmPageInfo.pageParams = getPageParams();
        bcmPageInfo.unitParamsV1 = getUnitParamsV1();
        return bcmPageInfo;
    }

    @Override // com.bytedance.android.btm.impl.page.model.PageInfo, com.bytedance.android.btm.api.cache.ISavable
    public PageInfo parse(String str) {
        super.parse(str);
        return this;
    }

    public final void setPageParams(Map<String, BcmParams> map) {
        this.pageParams = map;
    }

    public final void setPageParamsByProvider(Object obj) {
        int iIntValue;
        InterfaceC21243418Bk interfaceC21243418Bk = this.pageParamsProvider;
        Object obj2 = null;
        InterfaceC21243418Bk interfaceC21243418Bk2 = interfaceC21243418Bk;
        if (interfaceC21243418Bk == null) {
            if (obj instanceof InterfaceC21243418Bk) {
                InterfaceC21243418Bk interfaceC21243418Bk3 = (InterfaceC21243418Bk) obj;
                interfaceC21243418Bk2 = interfaceC21243418Bk3;
                if (interfaceC21243418Bk3 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        getPageBtm();
        if (getPageParams() == null) {
            new LinkedHashMap();
        }
        Map mapLIZ = interfaceC21243418Bk2.LIZ();
        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
        bugfixModelLIZIZ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_page_params", Integer.valueOf(bugfixModelLIZIZ.fixPageParams));
        if (objLIZIZ instanceof Integer) {
            obj2 = objLIZIZ;
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = bugfixModelLIZIZ.fixPageParams;
        }
        bugfixModelLIZIZ.fixPageParams = iIntValue;
        if (iIntValue == 1) {
            if (mapLIZ != getPageParams()) {
                Map<String, BcmParams> pageParams = getPageParams();
                if (pageParams != null) {
                    pageParams.clear();
                }
                Map<String, BcmParams> pageParams2 = getPageParams();
                if (pageParams2 != null) {
                    pageParams2.putAll(mapLIZ);
                }
            }
        } else {
            this.pageParams = new LinkedHashMap(mapLIZ);
        }
        C18CK.LIZ("BcmPageInfo_setPageParamsByProvider", new AwS576S0100000_32(this, 47), false);
    }

    public final void setPageParamsProvider(InterfaceC21243418Bk interfaceC21243418Bk) {
        this.pageParamsProvider = interfaceC21243418Bk;
    }

    public final void setUnitParamsV1(Map<String, BcmParams> map) {
        this.unitParamsV1 = map;
    }

    @Override // com.bytedance.android.btm.impl.page.model.PageInfo, com.bytedance.android.btm.api.cache.ISavable
    public /* bridge */ /* synthetic */ Object parse(String str) {
        parse(str);
        return this;
    }

    @Override // com.bytedance.android.btm.impl.page.model.PageInfo
    public void onPause(Object obj, C21247918Dd c21247918Dd) {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        if (C18CS.LIZ.LIZIZ().LJII() == 1) {
            setPageParamsByProvider(obj);
        }
        super.onPause(obj, c21247918Dd);
    }
}
