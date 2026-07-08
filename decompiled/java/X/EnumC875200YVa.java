package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC875200YVa implements WireEnum {
    BY_CONVERSATION(0),
    BY_USER(1);

    public static final ProtoAdapter<EnumC875200YVa> ADAPTER = new EnumAdapter<EnumC875200YVa>() { // from class: X.0YVb
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC875200YVa.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC875200YVa fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BY_USER;
        }
        return BY_CONVERSATION;
    }

    public static EnumC875200YVa valueOf(String str) {
        return (EnumC875200YVa) C08FF.LIZ(EnumC875200YVa.class, str);
    }

    EnumC875200YVa(int i) {
        this.LL = i;
    }
}
