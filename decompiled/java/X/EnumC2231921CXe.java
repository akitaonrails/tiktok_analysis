package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231921CXe implements WireEnum {
    VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_NONE(0),
    VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_PRIVATE_MSG(1),
    VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_DEEPLINK(2),
    VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_LINEUP(3);

    public static final ProtoAdapter<EnumC2231921CXe> ADAPTER = new EnumAdapter<EnumC2231921CXe>() { // from class: X.1CYI
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231921CXe.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231921CXe fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_LINEUP;
                }
                return VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_DEEPLINK;
            }
            return VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_PRIVATE_MSG;
        }
        return VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_NONE;
    }

    public static EnumC2231921CXe valueOf(String str) {
        return (EnumC2231921CXe) C08FF.LIZ(EnumC2231921CXe.class, str);
    }

    EnumC2231921CXe(int i) {
        this.LL = i;
    }
}
