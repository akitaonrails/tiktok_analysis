package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ala, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC947600ala {
    public static final EnumC947600ala AUDIENCE;
    public static final C947630ald Companion;
    public static final EnumC947600ala GUEST;
    public static final EnumC947600ala HOST;
    public static final /* synthetic */ EnumC947600ala[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC947600ala UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC947600ala> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0ald] */
    static {
        EnumC947600ala enumC947600ala = new EnumC947600ala("UNKNOWN", 0, 0);
        UNKNOWN = enumC947600ala;
        EnumC947600ala enumC947600ala2 = new EnumC947600ala("HOST", 1, 1);
        HOST = enumC947600ala2;
        EnumC947600ala enumC947600ala3 = new EnumC947600ala("GUEST", 2, 2);
        GUEST = enumC947600ala3;
        EnumC947600ala enumC947600ala4 = new EnumC947600ala("AUDIENCE", 3, 3);
        AUDIENCE = enumC947600ala4;
        EnumC947600ala[] enumC947600alaArr = {enumC947600ala, enumC947600ala2, enumC947600ala3, enumC947600ala4};
        LLILLJJLI = enumC947600alaArr;
        LLILLL = new C2254308sP(enumC947600alaArr);
        Companion = new Object() { // from class: X.0ald
        };
    }

    public static EnumC947600ala[] values() {
        return (EnumC947600ala[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC947600ala valueOf(String str) {
        return (EnumC947600ala) C08FF.LIZ(EnumC947600ala.class, str);
    }

    public EnumC947600ala(String str, int i, int i2) {
        this.LL = i2;
    }
}
