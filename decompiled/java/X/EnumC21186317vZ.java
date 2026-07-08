package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17vZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21186317vZ {
    public static final EnumC21186317vZ GLOBAL;
    public static final /* synthetic */ EnumC21186317vZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21186317vZ SEA;
    public static final EnumC21186317vZ US;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21186317vZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21186317vZ enumC21186317vZ = new EnumC21186317vZ("GLOBAL", 0, "global");
        GLOBAL = enumC21186317vZ;
        EnumC21186317vZ enumC21186317vZ2 = new EnumC21186317vZ("SEA", 1, "sea");
        SEA = enumC21186317vZ2;
        EnumC21186317vZ enumC21186317vZ3 = new EnumC21186317vZ("US", 2, "us");
        US = enumC21186317vZ3;
        EnumC21186317vZ[] enumC21186317vZArr = {enumC21186317vZ, enumC21186317vZ2, enumC21186317vZ3};
        LLILLJJLI = enumC21186317vZArr;
        LLILLL = new C2254308sP(enumC21186317vZArr);
    }

    public static EnumC21186317vZ[] values() {
        return (EnumC21186317vZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21186317vZ valueOf(String str) {
        return (EnumC21186317vZ) C08FF.LIZ(EnumC21186317vZ.class, str);
    }

    public EnumC21186317vZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
