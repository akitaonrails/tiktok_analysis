package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2236881Cgo implements WireEnum {
    NotExist(0),
    Normal(1),
    Canceling(2),
    Closed(3);

    public static final ProtoAdapter<EnumC2236881Cgo> ADAPTER = new EnumAdapter<EnumC2236881Cgo>() { // from class: X.1Cgp
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2236881Cgo.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2236881Cgo fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Closed;
                }
                return Canceling;
            }
            return Normal;
        }
        return NotExist;
    }

    public static EnumC2236881Cgo valueOf(String str) {
        return (EnumC2236881Cgo) C08FF.LIZ(EnumC2236881Cgo.class, str);
    }

    EnumC2236881Cgo(int i) {
        this.LL = i;
    }
}
