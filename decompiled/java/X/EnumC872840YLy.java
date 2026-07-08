package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC872840YLy implements WireEnum {
    TYPING(3),
    CLEAR_INPUT(4);

    public static final ProtoAdapter<EnumC872840YLy> ADAPTER = new EnumAdapter<EnumC872840YLy>() { // from class: X.0YLz
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC872840YLy.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC872840YLy fromValue(int i) {
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return CLEAR_INPUT;
        }
        return TYPING;
    }

    public static EnumC872840YLy valueOf(String str) {
        return (EnumC872840YLy) C08FF.LIZ(EnumC872840YLy.class, str);
    }

    EnumC872840YLy(int i) {
        this.LL = i;
    }
}
