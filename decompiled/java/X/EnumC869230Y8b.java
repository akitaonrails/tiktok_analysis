package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Y8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC869230Y8b implements WireEnum {
    IgnoreSenderRankUpdate(1),
    IgnoreReceiverRankUpdate(2),
    IgnoreAllRankUpdate(3);

    public static final ProtoAdapter<EnumC869230Y8b> ADAPTER = new EnumAdapter<EnumC869230Y8b>() { // from class: X.0Y8c
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC869230Y8b.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC869230Y8b fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return IgnoreAllRankUpdate;
            }
            return IgnoreReceiverRankUpdate;
        }
        return IgnoreSenderRankUpdate;
    }

    public static EnumC869230Y8b valueOf(String str) {
        return (EnumC869230Y8b) C08FF.LIZ(EnumC869230Y8b.class, str);
    }

    EnumC869230Y8b(int i) {
        this.LL = i;
    }
}
