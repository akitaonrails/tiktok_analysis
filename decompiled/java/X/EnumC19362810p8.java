package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19362810p8 implements WireEnum {
    ENTER_CONVERSATION(1),
    EXIT_CONVERSATION(2);

    public static final ProtoAdapter<EnumC19362810p8> ADAPTER = new EnumAdapter<EnumC19362810p8>() { // from class: X.10p9
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19362810p8.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19362810p8 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return EXIT_CONVERSATION;
        }
        return ENTER_CONVERSATION;
    }

    public static EnumC19362810p8 valueOf(String str) {
        return (EnumC19362810p8) C08FF.LIZ(EnumC19362810p8.class, str);
    }

    EnumC19362810p8(int i) {
        this.LL = i;
    }
}
