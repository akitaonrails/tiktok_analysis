package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.062G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public enum C062G implements WireEnum {
    BOT_MODE_TOPIC(0),
    BOT_MODE_FULLY_MANAGED(1);

    public static final ProtoAdapter<C062G> ADAPTER = new EnumAdapter<C062G>() { // from class: X.062J
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C062G.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C062G fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BOT_MODE_FULLY_MANAGED;
        }
        return BOT_MODE_TOPIC;
    }

    public static C062G valueOf(String str) {
        return (C062G) C08FF.LIZ(C062G.class, str);
    }

    C062G(int i) {
        this.LL = i;
    }
}
