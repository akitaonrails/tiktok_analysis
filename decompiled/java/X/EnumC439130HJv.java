package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439130HJv {
    public static final EnumC439130HJv ADDED_LIST;
    public static final /* synthetic */ EnumC439130HJv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC439130HJv PROFILE_TAB;
    public static final EnumC439130HJv STORE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC439130HJv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC439130HJv enumC439130HJv = new EnumC439130HJv("PROFILE_TAB", 0, 2);
        PROFILE_TAB = enumC439130HJv;
        EnumC439130HJv enumC439130HJv2 = new EnumC439130HJv("ADDED_LIST", 1, 3);
        ADDED_LIST = enumC439130HJv2;
        EnumC439130HJv enumC439130HJv3 = new EnumC439130HJv("STORE", 2, 4);
        STORE = enumC439130HJv3;
        EnumC439130HJv[] enumC439130HJvArr = {enumC439130HJv, enumC439130HJv2, enumC439130HJv3};
        LLILLJJLI = enumC439130HJvArr;
        LLILLL = new C2254308sP(enumC439130HJvArr);
    }

    public static EnumC439130HJv[] values() {
        return (EnumC439130HJv[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC439130HJv valueOf(String str) {
        return (EnumC439130HJv) C08FF.LIZ(EnumC439130HJv.class, str);
    }

    public EnumC439130HJv(String str, int i, int i2) {
        this.LL = i2;
    }
}
