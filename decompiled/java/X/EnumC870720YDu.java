package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC870720YDu implements WireEnum {
    IMG(1),
    VIDEO(2),
    AUDIO(3),
    FILE(4),
    OTHER(10);

    public static final ProtoAdapter<EnumC870720YDu> ADAPTER = new EnumAdapter<EnumC870720YDu>() { // from class: X.0YDv
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC870720YDu.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC870720YDu fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 10) {
                            return null;
                        }
                        return OTHER;
                    }
                    return FILE;
                }
                return AUDIO;
            }
            return VIDEO;
        }
        return IMG;
    }

    public static EnumC870720YDu valueOf(String str) {
        return (EnumC870720YDu) C08FF.LIZ(EnumC870720YDu.class, str);
    }

    EnumC870720YDu(int i) {
        this.LL = i;
    }
}
