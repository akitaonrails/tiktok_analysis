package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19365610pa implements WireEnum {
    Internal(1),
    External(2);

    public static final ProtoAdapter<EnumC19365610pa> ADAPTER = new EnumAdapter<EnumC19365610pa>() { // from class: X.10pb
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19365610pa.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19365610pa fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return External;
        }
        return Internal;
    }

    public static EnumC19365610pa valueOf(String str) {
        return (EnumC19365610pa) C08FF.LIZ(EnumC19365610pa.class, str);
    }

    EnumC19365610pa(int i) {
        this.LL = i;
    }
}
