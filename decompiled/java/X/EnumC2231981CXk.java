package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231981CXk implements WireEnum {
    VAR_LINK_MIC_AGREE_STATUS_UNKNOWN(0),
    VAR_LINK_MIC_AGREE_STATUS_AGREE(1),
    VAR_LINK_MIC_AGREE_STATUS_REJECT(2);

    public static final ProtoAdapter<EnumC2231981CXk> ADAPTER = new EnumAdapter<EnumC2231981CXk>() { // from class: X.1CY8
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231981CXk.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231981CXk fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_AGREE_STATUS_REJECT;
            }
            return VAR_LINK_MIC_AGREE_STATUS_AGREE;
        }
        return VAR_LINK_MIC_AGREE_STATUS_UNKNOWN;
    }

    public static EnumC2231981CXk valueOf(String str) {
        return (EnumC2231981CXk) C08FF.LIZ(EnumC2231981CXk.class, str);
    }

    EnumC2231981CXk(int i) {
        this.LL = i;
    }
}
