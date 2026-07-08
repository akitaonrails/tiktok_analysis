package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Y5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC868530Y5j implements WireEnum {
    USER_SET_CONVERSATION_CATEGORY_PRIMARY(1),
    USER_SET_CONVERSATION_CATEGORY_SECONDARY(2);

    public static final ProtoAdapter<EnumC868530Y5j> ADAPTER = new EnumAdapter<EnumC868530Y5j>() { // from class: X.0Y5k
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC868530Y5j.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC868530Y5j fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return USER_SET_CONVERSATION_CATEGORY_SECONDARY;
        }
        return USER_SET_CONVERSATION_CATEGORY_PRIMARY;
    }

    public static EnumC868530Y5j valueOf(String str) {
        return (EnumC868530Y5j) C08FF.LIZ(EnumC868530Y5j.class, str);
    }

    EnumC868530Y5j(int i) {
        this.LL = i;
    }
}
