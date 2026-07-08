package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC571120Mac {
    public static final /* synthetic */ EnumC571120Mac[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC571120Mac REJECT;
    public static final EnumC571120Mac REQUIRE;
    public static final EnumC571120Mac REQUIRE_ANY;

    public static InterfaceC2044707zh<EnumC571120Mac> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC571120Mac enumC571120Mac = new EnumC571120Mac("REQUIRE", 0);
        REQUIRE = enumC571120Mac;
        EnumC571120Mac enumC571120Mac2 = new EnumC571120Mac("REJECT", 1);
        REJECT = enumC571120Mac2;
        EnumC571120Mac enumC571120Mac3 = new EnumC571120Mac("REQUIRE_ANY", 2);
        REQUIRE_ANY = enumC571120Mac3;
        EnumC571120Mac[] enumC571120MacArr = {enumC571120Mac, enumC571120Mac2, enumC571120Mac3};
        LL = enumC571120MacArr;
        LLILLJJLI = new C2254308sP(enumC571120MacArr);
    }

    public static EnumC571120Mac[] values() {
        return (EnumC571120Mac[]) LL.clone();
    }

    public static EnumC571120Mac valueOf(String str) {
        return (EnumC571120Mac) C08FF.LIZ(EnumC571120Mac.class, str);
    }

    public EnumC571120Mac(String str, int i) {
    }
}
