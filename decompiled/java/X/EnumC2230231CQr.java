package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2230231CQr implements WireEnum {
    Schema(6),
    GroupShotRetry(31);

    public static final ProtoAdapter<EnumC2230231CQr> ADAPTER = new EnumAdapter<EnumC2230231CQr>() { // from class: X.1CQs
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2230231CQr.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2230231CQr fromValue(int i) {
        if (i != 6) {
            if (i != 31) {
                return null;
            }
            return GroupShotRetry;
        }
        return Schema;
    }

    public static EnumC2230231CQr valueOf(String str) {
        return (EnumC2230231CQr) C08FF.LIZ(EnumC2230231CQr.class, str);
    }

    EnumC2230231CQr(int i) {
        this.LL = i;
    }
}
