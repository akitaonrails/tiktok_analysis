package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YAP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YAP implements WireEnum {
    MESSAGE_REACTION_TYPE_UNKNOWN(0),
    MESSAGE_REACTION_TYPE_LEGACY_EMOJI(1),
    MESSAGE_REACTION_TYPE_EMOJI(2),
    MESSAGE_REACTION_TYPE_AI_MOJI(3);

    public static final ProtoAdapter<C0YAP> ADAPTER = new EnumAdapter<C0YAP>() { // from class: X.0YAy
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YAP.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YAP fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return MESSAGE_REACTION_TYPE_AI_MOJI;
                }
                return MESSAGE_REACTION_TYPE_EMOJI;
            }
            return MESSAGE_REACTION_TYPE_LEGACY_EMOJI;
        }
        return MESSAGE_REACTION_TYPE_UNKNOWN;
    }

    public static C0YAP valueOf(String str) {
        return (C0YAP) C08FF.LIZ(C0YAP.class, str);
    }

    C0YAP(int i) {
        this.LL = i;
    }
}
