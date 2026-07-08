package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC699420Rc4 {
    public static final EnumC699420Rc4 LL;
    public static final EnumC699420Rc4 LLILLJJLI;
    public static final EnumC699420Rc4 LLILLL;
    public static final EnumC699420Rc4 LLILZ;
    public static final /* synthetic */ EnumC699420Rc4[] LLILZIL;

    static {
        EnumC699420Rc4 enumC699420Rc4 = new EnumC699420Rc4("NOTIFY_OBSERVED", 0);
        LL = enumC699420Rc4;
        EnumC699420Rc4 enumC699420Rc42 = new EnumC699420Rc4("DEFERRED", 1);
        LLILLJJLI = enumC699420Rc42;
        EnumC699420Rc4 enumC699420Rc43 = new EnumC699420Rc4("SUPPRESSED", 2);
        LLILLL = enumC699420Rc43;
        EnumC699420Rc4 enumC699420Rc44 = new EnumC699420Rc4("SKIPPED", 3);
        LLILZ = enumC699420Rc44;
        EnumC699420Rc4[] enumC699420Rc4Arr = {enumC699420Rc4, enumC699420Rc42, enumC699420Rc43, enumC699420Rc44};
        LLILZIL = enumC699420Rc4Arr;
        new C2254308sP(enumC699420Rc4Arr);
    }

    public static EnumC699420Rc4[] values() {
        return (EnumC699420Rc4[]) LLILZIL.clone();
    }

    public static EnumC699420Rc4 valueOf(String str) {
        return (EnumC699420Rc4) C08FF.LIZ(EnumC699420Rc4.class, str);
    }

    public EnumC699420Rc4(String str, int i) {
    }
}
