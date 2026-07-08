package com.bytedance.android.bcm.impl.model;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C18AX;
import X.C2188811AlT;
import X.EnumC21239918Ab;
import X.EnumC21240118Ad;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BcmUnit implements C18AX {

    @C09CT("android_flag")
    public final int androidFlag;

    @C09CT("enum_value")
    public List<? extends Object> enumValue;

    @C09CT("is_required")
    public final int isRequired;

    @C09CT("biz_type")
    public String bizType = "ecom_entrance";

    @C09CT("type")
    public final EnumC21239918Ab valueType = EnumC21239918Ab.UNDEFINED;

    @C09CT("param_type")
    public final EnumC21240118Ad paramType = EnumC21240118Ad.UNDEFINED;

    @C09CT("bcm_field_name")
    public final String bcmFieldName = "";

    @C09CT("rela_version_list")
    public final List<String> version = C13BV.INSTANCE;

    @Override // X.C18AX
    public final List<Object> LIZIZ() {
        if (this.paramType == EnumC21240118Ad.ENUM) {
            return this.enumValue;
        }
        return null;
    }

    @Override // X.C18AX
    public final boolean LIZJ() {
        return this.isRequired == 1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BcmUnit(valueType=");
        sbLIZ.append(this.valueType);
        sbLIZ.append(", paramType=");
        sbLIZ.append(this.paramType);
        sbLIZ.append(", bcmFieldName='");
        sbLIZ.append(this.bcmFieldName);
        sbLIZ.append("', enumValue=");
        sbLIZ.append(this.enumValue);
        sbLIZ.append(", androidFlag=");
        sbLIZ.append(this.androidFlag);
        sbLIZ.append(", isRequired=");
        sbLIZ.append(this.isRequired);
        sbLIZ.append(", version=");
        sbLIZ.append(C13LP.LJJLIIIJ(this.version, null, null, null, 0, null, null, 63));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C18AX
    public final String LIZ() {
        return this.bcmFieldName;
    }

    @Override // X.C18AX
    public final EnumC21239918Ab LIZLLL() {
        return this.valueType;
    }
}
