package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cn5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2240771Cn5 implements WireEnum {
    STREAM_BLOCK_TYPE_UNKNOWN(0),
    STREAM_BLOCK_TYPE_TEXT(1),
    STREAM_BLOCK_TYPE_IMAGE(2),
    STREAM_BLOCK_TYPE_MARKDOWN(3);

    public static final ProtoAdapter<EnumC2240771Cn5> ADAPTER = new EnumAdapter<EnumC2240771Cn5>() { // from class: X.1Cn7
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2240771Cn5.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2240771Cn5 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return STREAM_BLOCK_TYPE_MARKDOWN;
                }
                return STREAM_BLOCK_TYPE_IMAGE;
            }
            return STREAM_BLOCK_TYPE_TEXT;
        }
        return STREAM_BLOCK_TYPE_UNKNOWN;
    }

    public static EnumC2240771Cn5 valueOf(String str) {
        return (EnumC2240771Cn5) C08FF.LIZ(EnumC2240771Cn5.class, str);
    }

    EnumC2240771Cn5(int i) {
        this.LL = i;
    }
}
