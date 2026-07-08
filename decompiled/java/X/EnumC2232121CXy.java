package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232121CXy implements WireEnum {
    VAR_LIVE_REQUEST_METHOD_GET(0),
    VAR_LIVE_REQUEST_METHOD_POST(1);

    public static final ProtoAdapter<EnumC2232121CXy> ADAPTER = new EnumAdapter<EnumC2232121CXy>() { // from class: X.1CYh
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232121CXy.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232121CXy fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LIVE_REQUEST_METHOD_POST;
        }
        return VAR_LIVE_REQUEST_METHOD_GET;
    }

    public static EnumC2232121CXy valueOf(String str) {
        return (EnumC2232121CXy) C08FF.LIZ(EnumC2232121CXy.class, str);
    }

    EnumC2232121CXy(int i) {
        this.LL = i;
    }
}
