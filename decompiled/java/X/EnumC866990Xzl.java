package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC866990Xzl {
    public static final EnumC866990Xzl DISSOLVE;
    public static final EnumC866990Xzl LEAVE;
    public static final /* synthetic */ EnumC866990Xzl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC866990Xzl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC866990Xzl enumC866990Xzl = new EnumC866990Xzl("DISSOLVE", 0, "dissolve");
        DISSOLVE = enumC866990Xzl;
        EnumC866990Xzl enumC866990Xzl2 = new EnumC866990Xzl("LEAVE", 1, "leave");
        LEAVE = enumC866990Xzl2;
        EnumC866990Xzl[] enumC866990XzlArr = {enumC866990Xzl, enumC866990Xzl2};
        LLILLJJLI = enumC866990XzlArr;
        LLILLL = new C2254308sP(enumC866990XzlArr);
    }

    public static EnumC866990Xzl[] values() {
        return (EnumC866990Xzl[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC866990Xzl valueOf(String str) {
        return (EnumC866990Xzl) C08FF.LIZ(EnumC866990Xzl.class, str);
    }

    public EnumC866990Xzl(String str, int i, String str2) {
        this.LL = str2;
    }
}
