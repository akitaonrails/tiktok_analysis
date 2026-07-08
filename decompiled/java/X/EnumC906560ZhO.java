package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0ZhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC906560ZhO implements WireEnum {
    STREAM_BLOCK_TYPE_UNKNOWN(0),
    STREAM_BLOCK_TYPE_TEXT(1),
    STREAM_BLOCK_TYPE_IMAGE(2),
    STREAM_BLOCK_TYPE_MARKDOWN(3);

    public static final ProtoAdapter<EnumC906560ZhO> ADAPTER = new EnumAdapter<EnumC906560ZhO>() { // from class: X.0ZhQ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC906560ZhO.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC906560ZhO fromValue(int i) {
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

    public static EnumC906560ZhO valueOf(String str) {
        return (EnumC906560ZhO) C08FF.LIZ(EnumC906560ZhO.class, str);
    }

    EnumC906560ZhO(int i) {
        this.LL = i;
    }
}
