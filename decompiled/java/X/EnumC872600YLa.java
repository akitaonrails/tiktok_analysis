package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC872600YLa implements WireEnum {
    UNKNOWN_AUTH(0),
    SESSION_AUTH(1),
    TOKEN_AUTH(2);

    public static final ProtoAdapter<EnumC872600YLa> ADAPTER = new EnumAdapter<EnumC872600YLa>() { // from class: X.0YLc
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC872600YLa.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC872600YLa fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return TOKEN_AUTH;
            }
            return SESSION_AUTH;
        }
        return UNKNOWN_AUTH;
    }

    public static EnumC872600YLa valueOf(String str) {
        return (EnumC872600YLa) C08FF.LIZ(EnumC872600YLa.class, str);
    }

    EnumC872600YLa(int i) {
        this.LL = i;
    }
}
