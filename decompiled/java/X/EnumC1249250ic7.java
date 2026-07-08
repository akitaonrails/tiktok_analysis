package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ic7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249250ic7 {
    public static final /* synthetic */ EnumC1249250ic7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1249250ic7 TYPE_DOT;
    public static final EnumC1249250ic7 TYPE_NUMBER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1249250ic7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1249250ic7 enumC1249250ic7 = new EnumC1249250ic7("TYPE_NUMBER", 0, "number");
        TYPE_NUMBER = enumC1249250ic7;
        EnumC1249250ic7 enumC1249250ic72 = new EnumC1249250ic7("TYPE_DOT", 1, "dot");
        TYPE_DOT = enumC1249250ic72;
        EnumC1249250ic7[] enumC1249250ic7Arr = {enumC1249250ic7, enumC1249250ic72};
        LLILLJJLI = enumC1249250ic7Arr;
        LLILLL = new C2254308sP(enumC1249250ic7Arr);
    }

    public static EnumC1249250ic7[] values() {
        return (EnumC1249250ic7[]) LLILLJJLI.clone();
    }

    public final String getSubTitleType() {
        return this.LL;
    }

    public static EnumC1249250ic7 valueOf(String str) {
        return (EnumC1249250ic7) C08FF.LIZ(EnumC1249250ic7.class, str);
    }

    public EnumC1249250ic7(String str, int i, String str2) {
        this.LL = str2;
    }
}
