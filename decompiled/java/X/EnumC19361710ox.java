package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19361710ox implements WireEnum {
    TYPE_MENTION(1),
    TYPE_SEND_BY_GROUP_OWNER(2),
    TYPE_AUTO_SEND_BY_SERVER(3),
    TYPE_MENTION_AND_SEND_BY_GROUP_OWNER(4);

    public static final ProtoAdapter<EnumC19361710ox> ADAPTER = new EnumAdapter<EnumC19361710ox>() { // from class: X.10oy
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19361710ox.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19361710ox fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return TYPE_MENTION_AND_SEND_BY_GROUP_OWNER;
                }
                return TYPE_AUTO_SEND_BY_SERVER;
            }
            return TYPE_SEND_BY_GROUP_OWNER;
        }
        return TYPE_MENTION;
    }

    public static EnumC19361710ox valueOf(String str) {
        return (EnumC19361710ox) C08FF.LIZ(EnumC19361710ox.class, str);
    }

    EnumC19361710ox(int i) {
        this.LL = i;
    }
}
