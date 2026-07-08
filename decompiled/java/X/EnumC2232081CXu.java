package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232081CXu implements WireEnum {
    VAR_LINK_MIC_APPLY_INTENT_NORMAL_APPLY(0),
    VAR_LINK_MIC_APPLY_INTENT_DIRECT_AGREE(1);

    public static final ProtoAdapter<EnumC2232081CXu> ADAPTER = new EnumAdapter<EnumC2232081CXu>() { // from class: X.1CYE
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232081CXu.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232081CXu fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_APPLY_INTENT_DIRECT_AGREE;
        }
        return VAR_LINK_MIC_APPLY_INTENT_NORMAL_APPLY;
    }

    public static EnumC2232081CXu valueOf(String str) {
        return (EnumC2232081CXu) C08FF.LIZ(EnumC2232081CXu.class, str);
    }

    EnumC2232081CXu(int i) {
        this.LL = i;
    }
}
