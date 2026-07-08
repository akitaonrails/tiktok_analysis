package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19379510rp implements WireEnum {
    COUNTER(0),
    TIMER(1);

    public static final ProtoAdapter<EnumC19379510rp> ADAPTER = new EnumAdapter<EnumC19379510rp>() { // from class: X.10rq
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19379510rp.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19379510rp fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TIMER;
        }
        return COUNTER;
    }

    public static EnumC19379510rp valueOf(String str) {
        return (EnumC19379510rp) C08FF.LIZ(EnumC19379510rp.class, str);
    }

    EnumC19379510rp(int i) {
        this.LL = i;
    }
}
