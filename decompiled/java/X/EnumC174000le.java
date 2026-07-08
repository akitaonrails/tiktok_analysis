package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC174000le {
    public static final /* synthetic */ EnumC174000le[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC174000le LONG_PRESS;
    public static final EnumC174000le VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC174000le> getEntries() {
        return LLILLL;
    }

    static {
        EnumC174000le enumC174000le = new EnumC174000le("LONG_PRESS", 0, "long_press");
        LONG_PRESS = enumC174000le;
        EnumC174000le enumC174000le2 = new EnumC174000le("VIDEO", 1, "video");
        VIDEO = enumC174000le2;
        EnumC174000le[] enumC174000leArr = {enumC174000le, enumC174000le2};
        LLILLJJLI = enumC174000leArr;
        LLILLL = new C2254308sP(enumC174000leArr);
    }

    public static EnumC174000le[] values() {
        return (EnumC174000le[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC174000le valueOf(String str) {
        return (EnumC174000le) C08FF.LIZ(EnumC174000le.class, str);
    }

    public EnumC174000le(String str, int i, String str2) {
        this.LL = str2;
    }
}
