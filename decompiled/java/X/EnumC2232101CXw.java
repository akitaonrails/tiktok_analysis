package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232101CXw implements WireEnum {
    VAR_LINK_MIC_BIZ_USER_SETTING_LAYOUT_GRID(0),
    VAR_LINK_MIC_BIZ_USER_SETTING_LAYOUT_FLOATING(1);

    public static final ProtoAdapter<EnumC2232101CXw> ADAPTER = new EnumAdapter<EnumC2232101CXw>() { // from class: X.1CYT
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232101CXw.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232101CXw fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_BIZ_USER_SETTING_LAYOUT_FLOATING;
        }
        return VAR_LINK_MIC_BIZ_USER_SETTING_LAYOUT_GRID;
    }

    public static EnumC2232101CXw valueOf(String str) {
        return (EnumC2232101CXw) C08FF.LIZ(EnumC2232101CXw.class, str);
    }

    EnumC2232101CXw(int i) {
        this.LL = i;
    }
}
