package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994440bz8 {
    public static final EnumC994440bz8 LL;
    public static final EnumC994440bz8 LLILLJJLI;
    public static final EnumC994440bz8 LLILLL;
    public static final /* synthetic */ EnumC994440bz8[] LLILZ;

    static {
        EnumC994440bz8 enumC994440bz8 = new EnumC994440bz8("NONE", 0);
        LL = enumC994440bz8;
        EnumC994440bz8 enumC994440bz82 = new EnumC994440bz8("SHOW", 1);
        LLILLJJLI = enumC994440bz82;
        EnumC994440bz8 enumC994440bz83 = new EnumC994440bz8("HIDE", 2);
        LLILLL = enumC994440bz83;
        EnumC994440bz8[] enumC994440bz8Arr = {enumC994440bz8, enumC994440bz82, enumC994440bz83};
        LLILZ = enumC994440bz8Arr;
        new C2254308sP(enumC994440bz8Arr);
    }

    public static EnumC994440bz8[] values() {
        return (EnumC994440bz8[]) LLILZ.clone();
    }

    public static EnumC994440bz8 valueOf(String str) {
        return (EnumC994440bz8) C08FF.LIZ(EnumC994440bz8.class, str);
    }

    public EnumC994440bz8(String str, int i) {
    }
}
