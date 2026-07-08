package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC617060OIe {
    public static final C617050OId Companion;
    public static final EnumC617060OIe IDENTITY_CREATOR;
    public static final EnumC617060OIe IDENTITY_SUBSCRIBER;
    public static final EnumC617060OIe INVALID;
    public static final /* synthetic */ EnumC617060OIe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<Integer, EnumC617060OIe> typeCache;
    public final int LL;

    public static InterfaceC2044707zh<EnumC617060OIe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC617060OIe enumC617060OIe = new EnumC617060OIe("INVALID", 0, -1);
        INVALID = enumC617060OIe;
        EnumC617060OIe enumC617060OIe2 = new EnumC617060OIe("IDENTITY_CREATOR", 1, 1);
        IDENTITY_CREATOR = enumC617060OIe2;
        EnumC617060OIe enumC617060OIe3 = new EnumC617060OIe("IDENTITY_SUBSCRIBER", 2, 99);
        IDENTITY_SUBSCRIBER = enumC617060OIe3;
        EnumC617060OIe[] enumC617060OIeArr = {enumC617060OIe, enumC617060OIe2, enumC617060OIe3};
        LLILLJJLI = enumC617060OIeArr;
        LLILLL = new C2254308sP(enumC617060OIeArr);
        Companion = new C617050OId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC617060OIe enumC617060OIe4 : values()) {
            linkedHashMap.put(Integer.valueOf(enumC617060OIe4.LL), enumC617060OIe4);
        }
        typeCache = C2097608Jq.LJIIZILJ(linkedHashMap);
    }

    public static EnumC617060OIe[] values() {
        return (EnumC617060OIe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC617060OIe valueOf(String str) {
        return (EnumC617060OIe) C08FF.LIZ(EnumC617060OIe.class, str);
    }

    public EnumC617060OIe(String str, int i, int i2) {
        this.LL = i2;
    }
}
