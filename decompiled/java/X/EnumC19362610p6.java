package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19362610p6 implements WireEnum {
    TICKET_TYPE_APP(1),
    TICKET_TYPE_PC(2),
    TICKET_TYPE_WEB(3);

    public static final ProtoAdapter<EnumC19362610p6> ADAPTER = new EnumAdapter<EnumC19362610p6>() { // from class: X.10p7
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19362610p6.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19362610p6 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return TICKET_TYPE_WEB;
            }
            return TICKET_TYPE_PC;
        }
        return TICKET_TYPE_APP;
    }

    public static EnumC19362610p6 valueOf(String str) {
        return (EnumC19362610p6) C08FF.LIZ(EnumC19362610p6.class, str);
    }

    EnumC19362610p6(int i) {
        this.LL = i;
    }
}
