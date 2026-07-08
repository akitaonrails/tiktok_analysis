package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1526160pok implements WireEnum {
    Default(0),
    HttpPoll(1),
    HeartbeatPong(2),
    NeedStop(4),
    NeedAck(8),
    NeedData(16);

    public static final ProtoAdapter<EnumC1526160pok> ADAPTER = new EnumAdapter<EnumC1526160pok>() { // from class: X.0pol
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1526160pok.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1526160pok fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                return null;
                            }
                            return NeedData;
                        }
                        return NeedAck;
                    }
                    return NeedStop;
                }
                return HeartbeatPong;
            }
            return HttpPoll;
        }
        return Default;
    }

    public static EnumC1526160pok valueOf(String str) {
        return (EnumC1526160pok) C08FF.LIZ(EnumC1526160pok.class, str);
    }

    EnumC1526160pok(int i) {
        this.LL = i;
    }
}
