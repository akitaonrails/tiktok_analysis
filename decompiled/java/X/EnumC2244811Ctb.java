package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Ctb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244811Ctb implements WireEnum {
    BOT_SWITCH_STATUS_UNKNOWN(0),
    BOT_SWITCH_STATUS_OFF(1),
    BOT_SWITCH_STATUS_ON(2);

    public static final ProtoAdapter<EnumC2244811Ctb> ADAPTER = new EnumAdapter<EnumC2244811Ctb>() { // from class: X.1Cta
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244811Ctb.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244811Ctb fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BOT_SWITCH_STATUS_ON;
            }
            return BOT_SWITCH_STATUS_OFF;
        }
        return BOT_SWITCH_STATUS_UNKNOWN;
    }

    public static EnumC2244811Ctb valueOf(String str) {
        return (EnumC2244811Ctb) C08FF.LIZ(EnumC2244811Ctb.class, str);
    }

    EnumC2244811Ctb(int i) {
        this.LL = i;
    }
}
