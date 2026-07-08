package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036700Az {
    public static final EnumC036700Az IGNORE;
    public static final /* synthetic */ EnumC036700Az[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC036700Az NOT_SHOW;
    public static final EnumC036700Az SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC036700Az> getEntries() {
        return LLILLL;
    }

    static {
        EnumC036700Az enumC036700Az = new EnumC036700Az("NOT_SHOW", 0, 0);
        NOT_SHOW = enumC036700Az;
        EnumC036700Az enumC036700Az2 = new EnumC036700Az("SHOW", 1, 1);
        SHOW = enumC036700Az2;
        EnumC036700Az enumC036700Az3 = new EnumC036700Az("IGNORE", 2, 2);
        IGNORE = enumC036700Az3;
        EnumC036700Az[] enumC036700AzArr = {enumC036700Az, enumC036700Az2, enumC036700Az3};
        LLILLJJLI = enumC036700AzArr;
        LLILLL = new C2254308sP(enumC036700AzArr);
    }

    public static EnumC036700Az[] values() {
        return (EnumC036700Az[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC036700Az valueOf(String str) {
        return (EnumC036700Az) C08FF.LIZ(EnumC036700Az.class, str);
    }

    public EnumC036700Az(String str, int i, int i2) {
        this.LL = i2;
    }
}
