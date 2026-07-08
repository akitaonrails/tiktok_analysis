package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11By, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19461211By {
    public static final EnumC19461211By LL;
    public static final EnumC19461211By LLILLJJLI;
    public static final EnumC19461211By LLILLL;
    public static final /* synthetic */ EnumC19461211By[] LLILZ;

    static {
        EnumC19461211By enumC19461211By = new EnumC19461211By("BUSY", 0);
        LL = enumC19461211By;
        EnumC19461211By enumC19461211By2 = new EnumC19461211By("SD_NOT_WRITABLE", 1);
        LLILLJJLI = enumC19461211By2;
        EnumC19461211By enumC19461211By3 = new EnumC19461211By("SD_LOW_SPACE", 2);
        LLILLL = enumC19461211By3;
        EnumC19461211By[] enumC19461211ByArr = {enumC19461211By, enumC19461211By2, enumC19461211By3};
        LLILZ = enumC19461211ByArr;
        new C2254308sP(enumC19461211ByArr);
    }

    public static EnumC19461211By[] values() {
        return (EnumC19461211By[]) LLILZ.clone();
    }

    public static EnumC19461211By valueOf(String str) {
        return (EnumC19461211By) C08FF.LIZ(EnumC19461211By.class, str);
    }

    public EnumC19461211By(String str, int i) {
    }
}
