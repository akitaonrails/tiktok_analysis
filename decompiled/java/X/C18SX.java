package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.18SX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C18SX implements WireEnum {
    MessageNormal(10001),
    MessageCenter(10002),
    BannerTop(20001),
    BannerBottom(20002),
    PopupTop(30001),
    PopupBottom(30002);

    public static final ProtoAdapter<C18SX> ADAPTER = new EnumAdapter<C18SX>() { // from class: X.18SZ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C18SX.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C18SX fromValue(int i) {
        if (i != 10001) {
            if (i != 10002) {
                if (i != 20001) {
                    if (i != 20002) {
                        if (i != 30001) {
                            if (i != 30002) {
                                return null;
                            }
                            return PopupBottom;
                        }
                        return PopupTop;
                    }
                    return BannerBottom;
                }
                return BannerTop;
            }
            return MessageCenter;
        }
        return MessageNormal;
    }

    public static C18SX valueOf(String str) {
        return (C18SX) C08FF.LIZ(C18SX.class, str);
    }

    C18SX(int i) {
        this.LL = i;
    }
}
