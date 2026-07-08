package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Ach, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2183371Ach implements WireEnum {
    VAR_LINK_ARCH_TYPE_UNKNOWN(0),
    VAR_LINK_ARCH_TYPE_INNER(1),
    VAR_LINK_ARCH_TYPE_CROSS(2);

    public static final ProtoAdapter<EnumC2183371Ach> ADAPTER = new EnumAdapter<EnumC2183371Ach>() { // from class: X.1Aci
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2183371Ach.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2183371Ach fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_ARCH_TYPE_CROSS;
            }
            return VAR_LINK_ARCH_TYPE_INNER;
        }
        return VAR_LINK_ARCH_TYPE_UNKNOWN;
    }

    public static EnumC2183371Ach valueOf(String str) {
        return (EnumC2183371Ach) C08FF.LIZ(EnumC2183371Ach.class, str);
    }

    EnumC2183371Ach(int i) {
        this.LL = i;
    }
}
