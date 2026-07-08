package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1123560fLO {
    public static final EnumC1123560fLO DROP;
    public static final EnumC1123560fLO FALLBACK;
    public static final /* synthetic */ EnumC1123560fLO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1123560fLO NO_CHANGE;

    public static InterfaceC2044707zh<EnumC1123560fLO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1123560fLO enumC1123560fLO = new EnumC1123560fLO("DROP", 0);
        DROP = enumC1123560fLO;
        EnumC1123560fLO enumC1123560fLO2 = new EnumC1123560fLO("FALLBACK", 1);
        FALLBACK = enumC1123560fLO2;
        EnumC1123560fLO enumC1123560fLO3 = new EnumC1123560fLO("NO_CHANGE", 2);
        NO_CHANGE = enumC1123560fLO3;
        EnumC1123560fLO[] enumC1123560fLOArr = {enumC1123560fLO, enumC1123560fLO2, enumC1123560fLO3};
        LL = enumC1123560fLOArr;
        LLILLJJLI = new C2254308sP(enumC1123560fLOArr);
    }

    public static EnumC1123560fLO[] values() {
        return (EnumC1123560fLO[]) LL.clone();
    }

    public static EnumC1123560fLO valueOf(String str) {
        return (EnumC1123560fLO) C08FF.LIZ(EnumC1123560fLO.class, str);
    }

    public EnumC1123560fLO(String str, int i) {
    }
}
