package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Eu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379360Eu6 {
    public static final EnumC379360Eu6 CREATIVE;
    public static final /* synthetic */ EnumC379360Eu6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC379360Eu6 PRECISE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC379360Eu6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC379360Eu6 enumC379360Eu6 = new EnumC379360Eu6("CREATIVE", 0, "Creative");
        CREATIVE = enumC379360Eu6;
        EnumC379360Eu6 enumC379360Eu62 = new EnumC379360Eu6("PRECISE", 1, "Precise");
        PRECISE = enumC379360Eu62;
        EnumC379360Eu6[] enumC379360Eu6Arr = {enumC379360Eu6, enumC379360Eu62};
        LLILLJJLI = enumC379360Eu6Arr;
        LLILLL = new C2254308sP(enumC379360Eu6Arr);
    }

    public static EnumC379360Eu6[] values() {
        return (EnumC379360Eu6[]) LLILLJJLI.clone();
    }

    public final String getId() {
        return this.LL;
    }

    public static EnumC379360Eu6 valueOf(String str) {
        return (EnumC379360Eu6) C08FF.LIZ(EnumC379360Eu6.class, str);
    }

    public EnumC379360Eu6(String str, int i, String str2) {
        this.LL = str2;
    }
}
