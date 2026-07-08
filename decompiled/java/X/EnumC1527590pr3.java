package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527590pr3 implements WireEnum {
    Params(0),
    CustomParams(1),
    ErrCode(100),
    ErrMsg(101);

    public static final ProtoAdapter<EnumC1527590pr3> ADAPTER = new EnumAdapter<EnumC1527590pr3>() { // from class: X.0pr4
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1527590pr3.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1527590pr3 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 100) {
                    if (i != 101) {
                        return null;
                    }
                    return ErrMsg;
                }
                return ErrCode;
            }
            return CustomParams;
        }
        return Params;
    }

    public static EnumC1527590pr3 valueOf(String str) {
        return (EnumC1527590pr3) C08FF.LIZ(EnumC1527590pr3.class, str);
    }

    EnumC1527590pr3(int i) {
        this.LL = i;
    }
}
