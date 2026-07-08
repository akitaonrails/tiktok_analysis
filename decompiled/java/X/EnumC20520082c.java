package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.082c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20520082c {
    public static final EnumC20520082c FALSE;
    public static final /* synthetic */ EnumC20520082c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20520082c TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20520082c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20520082c enumC20520082c = new EnumC20520082c("FALSE", 0, "false");
        FALSE = enumC20520082c;
        EnumC20520082c enumC20520082c2 = new EnumC20520082c("TRUE", 1, "true");
        TRUE = enumC20520082c2;
        EnumC20520082c[] enumC20520082cArr = {enumC20520082c, enumC20520082c2};
        LLILLJJLI = enumC20520082cArr;
        LLILLL = new C2254308sP(enumC20520082cArr);
    }

    public static EnumC20520082c[] values() {
        return (EnumC20520082c[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20520082c valueOf(String str) {
        return (EnumC20520082c) C08FF.LIZ(EnumC20520082c.class, str);
    }

    public EnumC20520082c(String str, int i, String str2) {
        this.LL = str2;
    }
}
