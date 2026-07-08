package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2230391CRh implements WireEnum {
    VAR_LINK_MIC_SETTING_TYPE_BOOL(0),
    VAR_LINK_MIC_SETTING_TYPE_INTEGER(1),
    VAR_LINK_MIC_SETTING_TYPE_LONG(2),
    VAR_LINK_MIC_SETTING_TYPE_FLOAT(3),
    VAR_LINK_MIC_SETTING_TYPE_STRING(4);

    public static final ProtoAdapter<EnumC2230391CRh> ADAPTER = new EnumAdapter<EnumC2230391CRh>() { // from class: X.1CRi
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2230391CRh.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2230391CRh fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_SETTING_TYPE_STRING;
                    }
                    return VAR_LINK_MIC_SETTING_TYPE_FLOAT;
                }
                return VAR_LINK_MIC_SETTING_TYPE_LONG;
            }
            return VAR_LINK_MIC_SETTING_TYPE_INTEGER;
        }
        return VAR_LINK_MIC_SETTING_TYPE_BOOL;
    }

    public static EnumC2230391CRh valueOf(String str) {
        return (EnumC2230391CRh) C08FF.LIZ(EnumC2230391CRh.class, str);
    }

    EnumC2230391CRh(int i) {
        this.LL = i;
    }
}
