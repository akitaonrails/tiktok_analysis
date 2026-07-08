package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC378910EtN {
    public static final EnumC378910EtN ALBUM;
    public static final /* synthetic */ EnumC378910EtN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC378910EtN MEMORY;
    public static final EnumC378910EtN RESULT_PAGE;
    public static final EnumC378910EtN SLOT;
    public static final EnumC378910EtN UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC378910EtN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC378910EtN enumC378910EtN = new EnumC378910EtN("SLOT", 0, "slot");
        SLOT = enumC378910EtN;
        EnumC378910EtN enumC378910EtN2 = new EnumC378910EtN("ALBUM", 1, "album");
        ALBUM = enumC378910EtN2;
        EnumC378910EtN enumC378910EtN3 = new EnumC378910EtN("MEMORY", 2, "memory");
        MEMORY = enumC378910EtN3;
        EnumC378910EtN enumC378910EtN4 = new EnumC378910EtN("RESULT_PAGE", 3, "result_page");
        RESULT_PAGE = enumC378910EtN4;
        EnumC378910EtN enumC378910EtN5 = new EnumC378910EtN("UNKNOWN", 4, "unknown");
        UNKNOWN = enumC378910EtN5;
        EnumC378910EtN[] enumC378910EtNArr = {enumC378910EtN, enumC378910EtN2, enumC378910EtN3, enumC378910EtN4, enumC378910EtN5};
        LLILLJJLI = enumC378910EtNArr;
        LLILLL = new C2254308sP(enumC378910EtNArr);
    }

    public static EnumC378910EtN[] values() {
        return (EnumC378910EtN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC378910EtN valueOf(String str) {
        return (EnumC378910EtN) C08FF.LIZ(EnumC378910EtN.class, str);
    }

    public EnumC378910EtN(String str, int i, String str2) {
        this.LL = str2;
    }
}
