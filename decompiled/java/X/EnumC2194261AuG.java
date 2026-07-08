package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2194261AuG {
    public static final C2194271AuH Companion;
    public static final /* synthetic */ EnumC2194261AuG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2194261AuG LOAD_FAILED;
    public static final EnumC2194261AuG LOAD_START;
    public static final EnumC2194261AuG LOAD_SUCCESS;
    public static final EnumC2194261AuG MAINFRAME_LOAD_SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2194261AuG> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1AuH] */
    static {
        EnumC2194261AuG enumC2194261AuG = new EnumC2194261AuG("LOAD_START", 0, 0);
        LOAD_START = enumC2194261AuG;
        EnumC2194261AuG enumC2194261AuG2 = new EnumC2194261AuG("MAINFRAME_LOAD_SUCCESS", 1, 1);
        MAINFRAME_LOAD_SUCCESS = enumC2194261AuG2;
        EnumC2194261AuG enumC2194261AuG3 = new EnumC2194261AuG("LOAD_SUCCESS", 2, 2);
        LOAD_SUCCESS = enumC2194261AuG3;
        EnumC2194261AuG enumC2194261AuG4 = new EnumC2194261AuG("LOAD_FAILED", 3, 3);
        LOAD_FAILED = enumC2194261AuG4;
        EnumC2194261AuG[] enumC2194261AuGArr = {enumC2194261AuG, enumC2194261AuG2, enumC2194261AuG3, enumC2194261AuG4};
        LLILLJJLI = enumC2194261AuGArr;
        LLILLL = new C2254308sP(enumC2194261AuGArr);
        Companion = new Object() { // from class: X.1AuH
        };
    }

    public static EnumC2194261AuG[] values() {
        return (EnumC2194261AuG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2194261AuG valueOf(String str) {
        return (EnumC2194261AuG) C08FF.LIZ(EnumC2194261AuG.class, str);
    }

    public EnumC2194261AuG(String str, int i, int i2) {
        this.LL = i2;
    }
}
