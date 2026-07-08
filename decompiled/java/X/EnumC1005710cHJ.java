package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005710cHJ {
    public static final EnumC1005710cHJ CARD;
    public static final /* synthetic */ EnumC1005710cHJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1005710cHJ POPUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1005710cHJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1005710cHJ enumC1005710cHJ = new EnumC1005710cHJ("POPUP", 0, "pop_up");
        POPUP = enumC1005710cHJ;
        EnumC1005710cHJ enumC1005710cHJ2 = new EnumC1005710cHJ("CARD", 1, "card");
        CARD = enumC1005710cHJ2;
        EnumC1005710cHJ[] enumC1005710cHJArr = {enumC1005710cHJ, enumC1005710cHJ2};
        LLILLJJLI = enumC1005710cHJArr;
        LLILLL = new C2254308sP(enumC1005710cHJArr);
    }

    public static EnumC1005710cHJ[] values() {
        return (EnumC1005710cHJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1005710cHJ valueOf(String str) {
        return (EnumC1005710cHJ) C08FF.LIZ(EnumC1005710cHJ.class, str);
    }

    public EnumC1005710cHJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
