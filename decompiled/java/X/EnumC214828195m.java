package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.195m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC214828195m {
    public static final EnumC214828195m COMPACT;
    public static final EnumC214828195m LARGE;
    public static final /* synthetic */ EnumC214828195m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC214828195m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC214828195m enumC214828195m = new EnumC214828195m("LARGE", 0);
        LARGE = enumC214828195m;
        EnumC214828195m enumC214828195m2 = new EnumC214828195m("COMPACT", 1);
        COMPACT = enumC214828195m2;
        EnumC214828195m[] enumC214828195mArr = {enumC214828195m, enumC214828195m2};
        LL = enumC214828195mArr;
        LLILLJJLI = new C2254308sP(enumC214828195mArr);
    }

    public static EnumC214828195m[] values() {
        return (EnumC214828195m[]) LL.clone();
    }

    public static EnumC214828195m valueOf(String str) {
        return (EnumC214828195m) C08FF.LIZ(EnumC214828195m.class, str);
    }

    public EnumC214828195m(String str, int i) {
    }
}
