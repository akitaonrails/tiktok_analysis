package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244051CsN implements WireEnum {
    Default(0),
    ServerError(1),
    Moderation(2),
    Loading(3),
    Restricted(4),
    Abnormal(5);

    public static final ProtoAdapter<EnumC2244051CsN> ADAPTER = new EnumAdapter<EnumC2244051CsN>() { // from class: X.1CsP
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244051CsN.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244051CsN fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return Abnormal;
                        }
                        return Restricted;
                    }
                    return Loading;
                }
                return Moderation;
            }
            return ServerError;
        }
        return Default;
    }

    public static EnumC2244051CsN valueOf(String str) {
        return (EnumC2244051CsN) C08FF.LIZ(EnumC2244051CsN.class, str);
    }

    EnumC2244051CsN(int i) {
        this.LL = i;
    }
}
