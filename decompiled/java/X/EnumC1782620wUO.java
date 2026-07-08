package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782620wUO implements Serializable {
    public static final EnumC1782620wUO FIXED;
    public static final /* synthetic */ EnumC1782620wUO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782620wUO RELATIVE;

    public static InterfaceC2044707zh<EnumC1782620wUO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782620wUO enumC1782620wUO = new EnumC1782620wUO("FIXED", 0);
        FIXED = enumC1782620wUO;
        EnumC1782620wUO enumC1782620wUO2 = new EnumC1782620wUO("RELATIVE", 1);
        RELATIVE = enumC1782620wUO2;
        EnumC1782620wUO[] enumC1782620wUOArr = {enumC1782620wUO, enumC1782620wUO2};
        LL = enumC1782620wUOArr;
        LLILLJJLI = new C2254308sP(enumC1782620wUOArr);
    }

    public static EnumC1782620wUO[] values() {
        return (EnumC1782620wUO[]) LL.clone();
    }

    public static EnumC1782620wUO valueOf(String str) {
        return (EnumC1782620wUO) C08FF.LIZ(EnumC1782620wUO.class, str);
    }

    public EnumC1782620wUO(String str, int i) {
    }
}
