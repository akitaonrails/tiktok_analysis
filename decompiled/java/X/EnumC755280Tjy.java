package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC755280Tjy {
    public static final EnumC755280Tjy ADMIN;
    public static final EnumC755280Tjy ANCHOR;
    public static final /* synthetic */ EnumC755280Tjy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC755280Tjy VIEWER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC755280Tjy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC755280Tjy enumC755280Tjy = new EnumC755280Tjy("ANCHOR", 0, "anchor");
        ANCHOR = enumC755280Tjy;
        EnumC755280Tjy enumC755280Tjy2 = new EnumC755280Tjy("ADMIN", 1, "admin");
        ADMIN = enumC755280Tjy2;
        EnumC755280Tjy enumC755280Tjy3 = new EnumC755280Tjy("VIEWER", 2, "viewer");
        VIEWER = enumC755280Tjy3;
        EnumC755280Tjy[] enumC755280TjyArr = {enumC755280Tjy, enumC755280Tjy2, enumC755280Tjy3};
        LLILLJJLI = enumC755280TjyArr;
        LLILLL = new C2254308sP(enumC755280TjyArr);
    }

    public static EnumC755280Tjy[] values() {
        return (EnumC755280Tjy[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC755280Tjy valueOf(String str) {
        return (EnumC755280Tjy) C08FF.LIZ(EnumC755280Tjy.class, str);
    }

    public EnumC755280Tjy(String str, int i, String str2) {
        this.LL = str2;
    }
}
