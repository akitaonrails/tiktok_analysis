package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21159117rB {
    public static final C21159217rC Companion;
    public static final EnumC21159117rB END;
    public static final /* synthetic */ EnumC21159117rB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21159117rB PAYING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21159117rB> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.17rC] */
    static {
        EnumC21159117rB enumC21159117rB = new EnumC21159117rB("PAYING", 0, "paying");
        PAYING = enumC21159117rB;
        EnumC21159117rB enumC21159117rB2 = new EnumC21159117rB("END", 1, "end");
        END = enumC21159117rB2;
        EnumC21159117rB[] enumC21159117rBArr = {enumC21159117rB, enumC21159117rB2};
        LLILLJJLI = enumC21159117rBArr;
        LLILLL = new C2254308sP(enumC21159117rBArr);
        Companion = new Object() { // from class: X.17rC
        };
    }

    public static EnumC21159117rB[] values() {
        return (EnumC21159117rB[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21159117rB valueOf(String str) {
        return (EnumC21159117rB) C08FF.LIZ(EnumC21159117rB.class, str);
    }

    public EnumC21159117rB(String str, int i, String str2) {
        this.LL = str2;
    }
}
