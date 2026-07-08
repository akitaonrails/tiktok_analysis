package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783070wV7 {
    public static final EnumC1783070wV7 KEYBOARD;
    public static final /* synthetic */ EnumC1783070wV7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1783070wV7 VOICE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1783070wV7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1783070wV7 enumC1783070wV7 = new EnumC1783070wV7("KEYBOARD", 0, "KEYBOARD");
        KEYBOARD = enumC1783070wV7;
        EnumC1783070wV7 enumC1783070wV72 = new EnumC1783070wV7("VOICE", 1, "VOICE");
        VOICE = enumC1783070wV72;
        EnumC1783070wV7[] enumC1783070wV7Arr = {enumC1783070wV7, enumC1783070wV72};
        LLILLJJLI = enumC1783070wV7Arr;
        LLILLL = new C2254308sP(enumC1783070wV7Arr);
    }

    public static EnumC1783070wV7[] values() {
        return (EnumC1783070wV7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1783070wV7 valueOf(String str) {
        return (EnumC1783070wV7) C08FF.LIZ(EnumC1783070wV7.class, str);
    }

    public EnumC1783070wV7(String str, int i, String str2) {
        this.LL = str2;
    }
}
