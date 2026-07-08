package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Zhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC906790Zhl implements WireEnum {
    STREAM_REPLY_TYPE_UNKNOWN(0),
    STREAM_REPLY_TYPE_ANSWER(1),
    STREAM_REPLY_TYPE_SUGGEST(2),
    STREAM_REPLY_TYPE_FUNCTION_CALL(3),
    STREAM_REPLY_TYPE_TOOL_OUTPUT(4),
    STREAM_REPLY_TYPE_THINKING(5),
    STREAM_REPLY_TYPE_VERBOSE(100);

    public static final ProtoAdapter<EnumC906790Zhl> ADAPTER = new EnumAdapter<EnumC906790Zhl>() { // from class: X.0Zhn
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC906790Zhl.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC906790Zhl fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 100) {
                                    return null;
                                }
                                return STREAM_REPLY_TYPE_VERBOSE;
                            }
                            return STREAM_REPLY_TYPE_THINKING;
                        }
                        return STREAM_REPLY_TYPE_TOOL_OUTPUT;
                    }
                    return STREAM_REPLY_TYPE_FUNCTION_CALL;
                }
                return STREAM_REPLY_TYPE_SUGGEST;
            }
            return STREAM_REPLY_TYPE_ANSWER;
        }
        return STREAM_REPLY_TYPE_UNKNOWN;
    }

    public static EnumC906790Zhl valueOf(String str) {
        return (EnumC906790Zhl) C08FF.LIZ(EnumC906790Zhl.class, str);
    }

    EnumC906790Zhl(int i) {
        this.LL = i;
    }
}
