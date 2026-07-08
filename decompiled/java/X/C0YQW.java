package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YQW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YQW implements WireEnum {
    TYPE_BY_CONVERSATION(1),
    TYPE_BY_USER(2),
    TYPE_BY_RANK(3);

    public static final ProtoAdapter<C0YQW> ADAPTER = new EnumAdapter<C0YQW>() { // from class: X.0YQX
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YQW.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YQW fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return TYPE_BY_RANK;
            }
            return TYPE_BY_USER;
        }
        return TYPE_BY_CONVERSATION;
    }

    public static C0YQW valueOf(String str) {
        return (C0YQW) C08FF.LIZ(C0YQW.class, str);
    }

    C0YQW(int i) {
        this.LL = i;
    }
}
