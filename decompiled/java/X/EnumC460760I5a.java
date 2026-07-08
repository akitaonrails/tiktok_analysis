package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC460760I5a {
    public static final /* synthetic */ EnumC460760I5a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC460760I5a NONE;
    public static final EnumC460760I5a STORY;

    public static InterfaceC2044707zh<EnumC460760I5a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC460760I5a enumC460760I5a = new EnumC460760I5a("NONE", 0);
        NONE = enumC460760I5a;
        EnumC460760I5a enumC460760I5a2 = new EnumC460760I5a("STORY", 1);
        STORY = enumC460760I5a2;
        EnumC460760I5a[] enumC460760I5aArr = {enumC460760I5a, enumC460760I5a2};
        LL = enumC460760I5aArr;
        LLILLJJLI = new C2254308sP(enumC460760I5aArr);
    }

    public static EnumC460760I5a[] values() {
        return (EnumC460760I5a[]) LL.clone();
    }

    public static EnumC460760I5a valueOf(String str) {
        return (EnumC460760I5a) C08FF.LIZ(EnumC460760I5a.class, str);
    }

    public EnumC460760I5a(String str, int i) {
    }
}
