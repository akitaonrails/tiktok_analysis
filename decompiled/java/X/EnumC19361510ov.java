package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19361510ov implements WireEnum {
    DEFAULT_TOKEN(0),
    APP_TOKEN(1),
    SERVER_TOKEN(2);

    public static final ProtoAdapter<EnumC19361510ov> ADAPTER = new EnumAdapter<EnumC19361510ov>() { // from class: X.10ow
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19361510ov.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19361510ov fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SERVER_TOKEN;
            }
            return APP_TOKEN;
        }
        return DEFAULT_TOKEN;
    }

    public static EnumC19361510ov valueOf(String str) {
        return (EnumC19361510ov) C08FF.LIZ(EnumC19361510ov.class, str);
    }

    EnumC19361510ov(int i) {
        this.LL = i;
    }
}
