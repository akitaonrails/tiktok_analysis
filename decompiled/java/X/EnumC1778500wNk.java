package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778500wNk {
    public static final EnumC1778500wNk EACH;
    public static final /* synthetic */ EnumC1778500wNk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1778500wNk MERGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1778500wNk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1778500wNk enumC1778500wNk = new EnumC1778500wNk("EACH", 0, "each");
        EACH = enumC1778500wNk;
        EnumC1778500wNk enumC1778500wNk2 = new EnumC1778500wNk("MERGE", 1, "merge");
        MERGE = enumC1778500wNk2;
        EnumC1778500wNk[] enumC1778500wNkArr = {enumC1778500wNk, enumC1778500wNk2};
        LLILLJJLI = enumC1778500wNkArr;
        LLILLL = new C2254308sP(enumC1778500wNkArr);
    }

    public static EnumC1778500wNk[] values() {
        return (EnumC1778500wNk[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1778500wNk valueOf(String str) {
        return (EnumC1778500wNk) C08FF.LIZ(EnumC1778500wNk.class, str);
    }

    public EnumC1778500wNk(String str, int i, String str2) {
        this.LL = str2;
    }
}
