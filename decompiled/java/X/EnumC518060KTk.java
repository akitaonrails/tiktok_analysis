package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC518060KTk {
    public static final EnumC518060KTk GENERAL;
    public static final /* synthetic */ EnumC518060KTk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC518060KTk PREFETCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC518060KTk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC518060KTk enumC518060KTk = new EnumC518060KTk("PREFETCH", 0, "prefetch");
        PREFETCH = enumC518060KTk;
        EnumC518060KTk enumC518060KTk2 = new EnumC518060KTk("GENERAL", 1, "general");
        GENERAL = enumC518060KTk2;
        EnumC518060KTk[] enumC518060KTkArr = {enumC518060KTk, enumC518060KTk2};
        LLILLJJLI = enumC518060KTkArr;
        LLILLL = new C2254308sP(enumC518060KTkArr);
    }

    public static EnumC518060KTk[] values() {
        return (EnumC518060KTk[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC518060KTk valueOf(String str) {
        return (EnumC518060KTk) C08FF.LIZ(EnumC518060KTk.class, str);
    }

    public EnumC518060KTk(String str, int i, String str2) {
        this.LL = str2;
    }
}
