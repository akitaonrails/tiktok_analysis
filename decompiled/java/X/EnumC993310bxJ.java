package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993310bxJ {
    public static final EnumC993310bxJ Initialized;
    public static final EnumC993310bxJ Initializing;
    public static final /* synthetic */ EnumC993310bxJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993310bxJ Not;

    public static InterfaceC2044707zh<EnumC993310bxJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993310bxJ enumC993310bxJ = new EnumC993310bxJ("Not", 0);
        Not = enumC993310bxJ;
        EnumC993310bxJ enumC993310bxJ2 = new EnumC993310bxJ("Initializing", 1);
        Initializing = enumC993310bxJ2;
        EnumC993310bxJ enumC993310bxJ3 = new EnumC993310bxJ("Initialized", 2);
        Initialized = enumC993310bxJ3;
        EnumC993310bxJ[] enumC993310bxJArr = {enumC993310bxJ, enumC993310bxJ2, enumC993310bxJ3};
        LL = enumC993310bxJArr;
        LLILLJJLI = new C2254308sP(enumC993310bxJArr);
    }

    public static EnumC993310bxJ[] values() {
        return (EnumC993310bxJ[]) LL.clone();
    }

    public static EnumC993310bxJ valueOf(String str) {
        return (EnumC993310bxJ) C08FF.LIZ(EnumC993310bxJ.class, str);
    }

    public EnumC993310bxJ(String str, int i) {
    }
}
