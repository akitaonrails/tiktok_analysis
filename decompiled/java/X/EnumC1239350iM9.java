package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1239350iM9 {
    public static final EnumC1239350iM9 CONTINUE;
    public static final EnumC1239350iM9 DISMISS;
    public static final /* synthetic */ EnumC1239350iM9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1239350iM9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1239350iM9 enumC1239350iM9 = new EnumC1239350iM9("CONTINUE", 0, "continue");
        CONTINUE = enumC1239350iM9;
        EnumC1239350iM9 enumC1239350iM92 = new EnumC1239350iM9("DISMISS", 1, "dismiss");
        DISMISS = enumC1239350iM92;
        EnumC1239350iM9[] enumC1239350iM9Arr = {enumC1239350iM9, enumC1239350iM92};
        LLILLJJLI = enumC1239350iM9Arr;
        LLILLL = new C2254308sP(enumC1239350iM9Arr);
    }

    public static EnumC1239350iM9[] values() {
        return (EnumC1239350iM9[]) LLILLJJLI.clone();
    }

    public final String getClick() {
        return this.LL;
    }

    public static EnumC1239350iM9 valueOf(String str) {
        return (EnumC1239350iM9) C08FF.LIZ(EnumC1239350iM9.class, str);
    }

    public EnumC1239350iM9(String str, int i, String str2) {
        this.LL = str2;
    }
}
