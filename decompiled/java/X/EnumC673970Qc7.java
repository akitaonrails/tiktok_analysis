package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC673970Qc7 {
    public static final EnumC673970Qc7 AI_SEARCH;
    public static final /* synthetic */ EnumC673970Qc7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC673970Qc7 SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC673970Qc7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC673970Qc7 enumC673970Qc7 = new EnumC673970Qc7("SEARCH", 0, "search");
        SEARCH = enumC673970Qc7;
        EnumC673970Qc7 enumC673970Qc72 = new EnumC673970Qc7("AI_SEARCH", 1, "ai_search");
        AI_SEARCH = enumC673970Qc72;
        EnumC673970Qc7[] enumC673970Qc7Arr = {enumC673970Qc7, enumC673970Qc72};
        LLILLJJLI = enumC673970Qc7Arr;
        LLILLL = new C2254308sP(enumC673970Qc7Arr);
    }

    public static EnumC673970Qc7[] values() {
        return (EnumC673970Qc7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC673970Qc7 valueOf(String str) {
        return (EnumC673970Qc7) C08FF.LIZ(EnumC673970Qc7.class, str);
    }

    public EnumC673970Qc7(String str, int i, String str2) {
        this.LL = str2;
    }
}
