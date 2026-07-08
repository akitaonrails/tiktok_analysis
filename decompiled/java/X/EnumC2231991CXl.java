package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231991CXl implements WireEnum {
    VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_UNKNOWN(0),
    VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_ONE_CLICK_MICRO(1),
    VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_ONE_CLICK_CAPSULE(2);

    public static final ProtoAdapter<EnumC2231991CXl> ADAPTER = new EnumAdapter<EnumC2231991CXl>() { // from class: X.1CYD
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231991CXl.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231991CXl fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_ONE_CLICK_CAPSULE;
            }
            return VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_ONE_CLICK_MICRO;
        }
        return VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_UNKNOWN;
    }

    public static EnumC2231991CXl valueOf(String str) {
        return (EnumC2231991CXl) C08FF.LIZ(EnumC2231991CXl.class, str);
    }

    EnumC2231991CXl(int i) {
        this.LL = i;
    }
}
