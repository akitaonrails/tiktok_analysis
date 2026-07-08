package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527220pqS implements WireEnum {
    unknown(0),
    android(1),
    iphone(2),
    ipad(3),
    windows(4),
    macOS(5),
    harmony(6),
    web(7);

    public static final ProtoAdapter<EnumC1527220pqS> ADAPTER = new EnumAdapter<EnumC1527220pqS>() { // from class: X.0pqp
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1527220pqS.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1527220pqS fromValue(int i) {
        switch (i) {
            case 0:
                return unknown;
            case 1:
                return android;
            case 2:
                return iphone;
            case 3:
                return ipad;
            case 4:
                return windows;
            case 5:
                return macOS;
            case 6:
                return harmony;
            case 7:
                return web;
            default:
                return null;
        }
    }

    public static EnumC1527220pqS valueOf(String str) {
        return (EnumC1527220pqS) C08FF.LIZ(EnumC1527220pqS.class, str);
    }

    EnumC1527220pqS(int i) {
        this.LL = i;
    }
}
