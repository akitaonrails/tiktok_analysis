package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Ctd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244831Ctd implements WireEnum {
    UNKNOWN_ACTION(0),
    FAVORITE(1),
    PIN(2),
    UNREAD(3);

    public static final ProtoAdapter<EnumC2244831Ctd> ADAPTER = new EnumAdapter<EnumC2244831Ctd>() { // from class: X.1Ctc
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244831Ctd.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244831Ctd fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return UNREAD;
                }
                return PIN;
            }
            return FAVORITE;
        }
        return UNKNOWN_ACTION;
    }

    public static EnumC2244831Ctd valueOf(String str) {
        return (EnumC2244831Ctd) C08FF.LIZ(EnumC2244831Ctd.class, str);
    }

    EnumC2244831Ctd(int i) {
        this.LL = i;
    }
}
