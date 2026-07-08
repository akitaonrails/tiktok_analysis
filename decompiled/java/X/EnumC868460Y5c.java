package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Y5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC868460Y5c implements WireEnum {
    TYPE_USER_MESSAGE(0),
    TYPE_REACTION(1);

    public static final ProtoAdapter<EnumC868460Y5c> ADAPTER = new EnumAdapter<EnumC868460Y5c>() { // from class: X.0Y5d
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC868460Y5c.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC868460Y5c fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TYPE_REACTION;
        }
        return TYPE_USER_MESSAGE;
    }

    public static EnumC868460Y5c valueOf(String str) {
        return (EnumC868460Y5c) C08FF.LIZ(EnumC868460Y5c.class, str);
    }

    EnumC868460Y5c(int i) {
        this.LL = i;
    }
}
