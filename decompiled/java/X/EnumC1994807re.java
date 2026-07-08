package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994807re {
    public static final EnumC1994807re FRAMEWORK_STRATEGY;
    public static final /* synthetic */ EnumC1994807re[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1994807re NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1994807re> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994807re enumC1994807re = new EnumC1994807re("NONE", 0, 0);
        NONE = enumC1994807re;
        EnumC1994807re enumC1994807re2 = new EnumC1994807re("FRAMEWORK_STRATEGY", 1, 1);
        FRAMEWORK_STRATEGY = enumC1994807re2;
        EnumC1994807re[] enumC1994807reArr = {enumC1994807re, enumC1994807re2};
        LLILLJJLI = enumC1994807reArr;
        LLILLL = new C2254308sP(enumC1994807reArr);
    }

    public static EnumC1994807re[] values() {
        return (EnumC1994807re[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1994807re valueOf(String str) {
        return (EnumC1994807re) C08FF.LIZ(EnumC1994807re.class, str);
    }

    public EnumC1994807re(String str, int i, int i2) {
        this.LL = i2;
    }
}
