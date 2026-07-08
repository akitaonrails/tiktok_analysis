package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CFA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CFA implements WireEnum {
    VAR_LINK_MIC_LAYOUT_TYPE_FLOAT(0),
    VAR_LINK_MIC_LAYOUT_TYPE_FIXED(1);

    public static final ProtoAdapter<C1CFA> ADAPTER = new EnumAdapter<C1CFA>() { // from class: X.1CFB
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CFA.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CFA fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_LAYOUT_TYPE_FIXED;
        }
        return VAR_LINK_MIC_LAYOUT_TYPE_FLOAT;
    }

    public static C1CFA valueOf(String str) {
        return (C1CFA) C08FF.LIZ(C1CFA.class, str);
    }

    C1CFA(int i) {
        this.LL = i;
    }
}
