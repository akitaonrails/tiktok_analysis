package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC660440PvO {
    public static final EnumC660440PvO AUTO;
    public static final EnumC660440PvO CONST_DARK;
    public static final /* synthetic */ EnumC660440PvO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC660440PvO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC660440PvO enumC660440PvO = new EnumC660440PvO("AUTO", 0);
        AUTO = enumC660440PvO;
        EnumC660440PvO enumC660440PvO2 = new EnumC660440PvO("CONST_DARK", 1);
        CONST_DARK = enumC660440PvO2;
        EnumC660440PvO[] enumC660440PvOArr = {enumC660440PvO, enumC660440PvO2};
        LL = enumC660440PvOArr;
        LLILLJJLI = new C2254308sP(enumC660440PvOArr);
    }

    public static EnumC660440PvO[] values() {
        return (EnumC660440PvO[]) LL.clone();
    }

    public static EnumC660440PvO valueOf(String str) {
        return (EnumC660440PvO) C08FF.LIZ(EnumC660440PvO.class, str);
    }

    public EnumC660440PvO(String str, int i) {
    }
}
