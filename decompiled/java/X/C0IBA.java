package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0IBA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public enum C0IBA implements WireEnum {
    UNKNOWN(0),
    UNAVAILABLE(1),
    STORY_EXPIRED(2),
    FRIENDS_ONLY(3);

    public static final ProtoAdapter<C0IBA> ADAPTER = new EnumAdapter<C0IBA>() { // from class: X.0IBC
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0IBA.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0IBA fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FRIENDS_ONLY;
                }
                return STORY_EXPIRED;
            }
            return UNAVAILABLE;
        }
        return UNKNOWN;
    }

    public static C0IBA valueOf(String str) {
        return (C0IBA) C08FF.LIZ(C0IBA.class, str);
    }

    C0IBA(int i) {
        this.LL = i;
    }
}
