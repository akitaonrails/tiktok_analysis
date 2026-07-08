package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC333530D5r implements Serializable {
    public static final /* synthetic */ EnumC333530D5r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC333530D5r NETWORK;
    public static final EnumC333530D5r SERVER;
    public static final EnumC333530D5r UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC333530D5r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC333530D5r enumC333530D5r = new EnumC333530D5r("NETWORK", 0);
        NETWORK = enumC333530D5r;
        EnumC333530D5r enumC333530D5r2 = new EnumC333530D5r("UNAVAILABLE", 1);
        UNAVAILABLE = enumC333530D5r2;
        EnumC333530D5r enumC333530D5r3 = new EnumC333530D5r("SERVER", 2);
        SERVER = enumC333530D5r3;
        EnumC333530D5r[] enumC333530D5rArr = {enumC333530D5r, enumC333530D5r2, enumC333530D5r3};
        LL = enumC333530D5rArr;
        LLILLJJLI = new C2254308sP(enumC333530D5rArr);
    }

    public static EnumC333530D5r[] values() {
        return (EnumC333530D5r[]) LL.clone();
    }

    public static EnumC333530D5r valueOf(String str) {
        return (EnumC333530D5r) C08FF.LIZ(EnumC333530D5r.class, str);
    }

    public EnumC333530D5r(String str, int i) {
    }
}
