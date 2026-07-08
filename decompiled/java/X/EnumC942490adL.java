package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0adL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC942490adL {
    public static final EnumC942490adL FEED;
    public static final /* synthetic */ EnumC942490adL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC942490adL SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC942490adL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC942490adL enumC942490adL = new EnumC942490adL("FEED", 0, "feed");
        FEED = enumC942490adL;
        EnumC942490adL enumC942490adL2 = new EnumC942490adL("SEARCH", 1, "search");
        SEARCH = enumC942490adL2;
        EnumC942490adL[] enumC942490adLArr = {enumC942490adL, enumC942490adL2};
        LLILLJJLI = enumC942490adLArr;
        LLILLL = new C2254308sP(enumC942490adLArr);
    }

    public static EnumC942490adL[] values() {
        return (EnumC942490adL[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC942490adL valueOf(String str) {
        return (EnumC942490adL) C08FF.LIZ(EnumC942490adL.class, str);
    }

    public EnumC942490adL(String str, int i, String str2) {
        this.LL = str2;
    }
}
