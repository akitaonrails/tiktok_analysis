package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19361910oz implements WireEnum {
    PER_USER(1),
    PER_CONVERSATION(2);

    public static final ProtoAdapter<EnumC19361910oz> ADAPTER = new EnumAdapter<EnumC19361910oz>() { // from class: X.10p0
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19361910oz.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19361910oz fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return PER_CONVERSATION;
        }
        return PER_USER;
    }

    public static EnumC19361910oz valueOf(String str) {
        return (EnumC19361910oz) C08FF.LIZ(EnumC19361910oz.class, str);
    }

    EnumC19361910oz(int i) {
        this.LL = i;
    }
}
