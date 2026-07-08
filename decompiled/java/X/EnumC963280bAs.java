package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC963280bAs {
    public static final /* synthetic */ EnumC963280bAs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC963280bAs OTHERS;
    public static final EnumC963280bAs OUTSIDE;
    public static final EnumC963280bAs TIMEOUT;
    public static final EnumC963280bAs XBUTTON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC963280bAs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC963280bAs enumC963280bAs = new EnumC963280bAs("XBUTTON", 0, "x_button");
        XBUTTON = enumC963280bAs;
        EnumC963280bAs enumC963280bAs2 = new EnumC963280bAs("OUTSIDE", 1, "outside");
        OUTSIDE = enumC963280bAs2;
        EnumC963280bAs enumC963280bAs3 = new EnumC963280bAs("TIMEOUT", 2, "timeout");
        TIMEOUT = enumC963280bAs3;
        EnumC963280bAs enumC963280bAs4 = new EnumC963280bAs("OTHERS", 3, "others");
        OTHERS = enumC963280bAs4;
        EnumC963280bAs[] enumC963280bAsArr = {enumC963280bAs, enumC963280bAs2, enumC963280bAs3, enumC963280bAs4};
        LLILLJJLI = enumC963280bAsArr;
        LLILLL = new C2254308sP(enumC963280bAsArr);
    }

    public static EnumC963280bAs[] values() {
        return (EnumC963280bAs[]) LLILLJJLI.clone();
    }

    public final String getMethodName() {
        return this.LL;
    }

    public static EnumC963280bAs valueOf(String str) {
        return (EnumC963280bAs) C08FF.LIZ(EnumC963280bAs.class, str);
    }

    public EnumC963280bAs(String str, int i, String str2) {
        this.LL = str2;
    }
}
