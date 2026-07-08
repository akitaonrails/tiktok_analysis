package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1182880gt4 {
    public static final EnumC1182880gt4 CARD;
    public static final /* synthetic */ EnumC1182880gt4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1182880gt4 MAP;

    public static InterfaceC2044707zh<EnumC1182880gt4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1182880gt4 enumC1182880gt4 = new EnumC1182880gt4("CARD", 0);
        CARD = enumC1182880gt4;
        EnumC1182880gt4 enumC1182880gt42 = new EnumC1182880gt4("MAP", 1);
        MAP = enumC1182880gt42;
        EnumC1182880gt4[] enumC1182880gt4Arr = {enumC1182880gt4, enumC1182880gt42};
        LL = enumC1182880gt4Arr;
        LLILLJJLI = new C2254308sP(enumC1182880gt4Arr);
    }

    public static EnumC1182880gt4[] values() {
        return (EnumC1182880gt4[]) LL.clone();
    }

    public static EnumC1182880gt4 valueOf(String str) {
        return (EnumC1182880gt4) C08FF.LIZ(EnumC1182880gt4.class, str);
    }

    public EnumC1182880gt4(String str, int i) {
    }
}
