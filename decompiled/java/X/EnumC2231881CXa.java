package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231881CXa implements WireEnum {
    VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_UNKNOWN(0),
    VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_PANEL(1),
    VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_CAPSULE(2),
    VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_EMPTY_POSITION(3);

    public static final ProtoAdapter<EnumC2231881CXa> ADAPTER = new EnumAdapter<EnumC2231881CXa>() { // from class: X.1CYB
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231881CXa.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231881CXa fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_EMPTY_POSITION;
                }
                return VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_CAPSULE;
            }
            return VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_PANEL;
        }
        return VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_UNKNOWN;
    }

    public static EnumC2231881CXa valueOf(String str) {
        return (EnumC2231881CXa) C08FF.LIZ(EnumC2231881CXa.class, str);
    }

    EnumC2231881CXa(int i) {
        this.LL = i;
    }
}
