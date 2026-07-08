package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06vF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1762306vF {
    public static final EnumC1762306vF CACHE;
    public static final EnumC1762306vF CODE_CACHE;
    public static final EnumC1762306vF FILES;
    public static final /* synthetic */ EnumC1762306vF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1762306vF ROOT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1762306vF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1762306vF enumC1762306vF = new EnumC1762306vF("ROOT", 0, "root");
        ROOT = enumC1762306vF;
        EnumC1762306vF enumC1762306vF2 = new EnumC1762306vF("CACHE", 1, "cache");
        CACHE = enumC1762306vF2;
        EnumC1762306vF enumC1762306vF3 = new EnumC1762306vF("CODE_CACHE", 2, "code_cache");
        CODE_CACHE = enumC1762306vF3;
        EnumC1762306vF enumC1762306vF4 = new EnumC1762306vF("FILES", 3, "files");
        FILES = enumC1762306vF4;
        EnumC1762306vF[] enumC1762306vFArr = {enumC1762306vF, enumC1762306vF2, enumC1762306vF3, enumC1762306vF4};
        LLILLJJLI = enumC1762306vFArr;
        LLILLL = new C2254308sP(enumC1762306vFArr);
    }

    public static EnumC1762306vF[] values() {
        return (EnumC1762306vF[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1762306vF valueOf(String str) {
        return (EnumC1762306vF) C08FF.LIZ(EnumC1762306vF.class, str);
    }

    public EnumC1762306vF(String str, int i, String str2) {
        this.LL = str2;
    }
}
