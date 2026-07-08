package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231891CXb implements WireEnum {
    VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_NONE(0),
    VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FULL_SCREEN(1),
    VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FIXED(2),
    VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FLOAT(3);

    public static final ProtoAdapter<EnumC2231891CXb> ADAPTER = new EnumAdapter<EnumC2231891CXb>() { // from class: X.1CYC
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231891CXb.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231891CXb fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FLOAT;
                }
                return VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FIXED;
            }
            return VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FULL_SCREEN;
        }
        return VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_NONE;
    }

    public static EnumC2231891CXb valueOf(String str) {
        return (EnumC2231891CXb) C08FF.LIZ(EnumC2231891CXb.class, str);
    }

    EnumC2231891CXb(int i) {
        this.LL = i;
    }
}
