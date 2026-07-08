package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1236600iHi {
    public static final EnumC1236600iHi AUTH_APP;
    public static final EnumC1236600iHi AUTH_MINIGAME;
    public static final EnumC1236600iHi AUTH_MINIS;
    public static final EnumC1236600iHi AUTH_WEB;
    public static final EnumC1236600iHi IAA;
    public static final EnumC1236600iHi IAP;
    public static final /* synthetic */ EnumC1236600iHi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1236600iHi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1236600iHi enumC1236600iHi = new EnumC1236600iHi("IAA", 0, "1");
        IAA = enumC1236600iHi;
        EnumC1236600iHi enumC1236600iHi2 = new EnumC1236600iHi("IAP", 1, "2");
        IAP = enumC1236600iHi2;
        EnumC1236600iHi enumC1236600iHi3 = new EnumC1236600iHi("AUTH_APP", 2, "3");
        AUTH_APP = enumC1236600iHi3;
        EnumC1236600iHi enumC1236600iHi4 = new EnumC1236600iHi("AUTH_WEB", 3, "4");
        AUTH_WEB = enumC1236600iHi4;
        EnumC1236600iHi enumC1236600iHi5 = new EnumC1236600iHi("AUTH_MINIS", 4, "5");
        AUTH_MINIS = enumC1236600iHi5;
        EnumC1236600iHi enumC1236600iHi6 = new EnumC1236600iHi("AUTH_MINIGAME", 5, "6");
        AUTH_MINIGAME = enumC1236600iHi6;
        EnumC1236600iHi[] enumC1236600iHiArr = {enumC1236600iHi, enumC1236600iHi2, enumC1236600iHi3, enumC1236600iHi4, enumC1236600iHi5, enumC1236600iHi6};
        LLILLJJLI = enumC1236600iHiArr;
        LLILLL = new C2254308sP(enumC1236600iHiArr);
    }

    public static EnumC1236600iHi[] values() {
        return (EnumC1236600iHi[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1236600iHi valueOf(String str) {
        return (EnumC1236600iHi) C08FF.LIZ(EnumC1236600iHi.class, str);
    }

    public EnumC1236600iHi(String str, int i, String str2) {
        this.LL = str2;
    }
}
