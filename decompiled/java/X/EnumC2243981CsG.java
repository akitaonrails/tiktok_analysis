package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2243981CsG implements WireEnum {
    TEXT(0),
    PICTURE(1);

    public static final ProtoAdapter<EnumC2243981CsG> ADAPTER = new EnumAdapter<EnumC2243981CsG>() { // from class: X.1CsL
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2243981CsG.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2243981CsG fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PICTURE;
        }
        return TEXT;
    }

    public static EnumC2243981CsG valueOf(String str) {
        return (EnumC2243981CsG) C08FF.LIZ(EnumC2243981CsG.class, str);
    }

    EnumC2243981CsG(int i) {
        this.LL = i;
    }
}
