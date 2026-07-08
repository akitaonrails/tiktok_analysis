package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2007807tk {
    public static final EnumC2007807tk DEAD_ZONE;
    public static final /* synthetic */ EnumC2007807tk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2007807tk SAFE_ZONE;
    public static final EnumC2007807tk UNSAFE_TEST_ZONE;
    public static final EnumC2007807tk UNSAFE_ZONE;

    public static InterfaceC2044707zh<EnumC2007807tk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2007807tk enumC2007807tk = new EnumC2007807tk("SAFE_ZONE", 0);
        SAFE_ZONE = enumC2007807tk;
        EnumC2007807tk enumC2007807tk2 = new EnumC2007807tk("DEAD_ZONE", 1);
        DEAD_ZONE = enumC2007807tk2;
        EnumC2007807tk enumC2007807tk3 = new EnumC2007807tk("UNSAFE_ZONE", 2);
        UNSAFE_ZONE = enumC2007807tk3;
        EnumC2007807tk enumC2007807tk4 = new EnumC2007807tk("UNSAFE_TEST_ZONE", 3);
        UNSAFE_TEST_ZONE = enumC2007807tk4;
        EnumC2007807tk[] enumC2007807tkArr = {enumC2007807tk, enumC2007807tk2, enumC2007807tk3, enumC2007807tk4};
        LL = enumC2007807tkArr;
        LLILLJJLI = new C2254308sP(enumC2007807tkArr);
    }

    public static EnumC2007807tk[] values() {
        return (EnumC2007807tk[]) LL.clone();
    }

    public static EnumC2007807tk valueOf(String str) {
        return (EnumC2007807tk) C08FF.LIZ(EnumC2007807tk.class, str);
    }

    public EnumC2007807tk(String str, int i) {
    }
}
