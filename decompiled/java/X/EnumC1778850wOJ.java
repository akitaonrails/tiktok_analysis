package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778850wOJ {
    public static final EnumC1778850wOJ Dynamic;
    public static final /* synthetic */ EnumC1778850wOJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778850wOJ Single;

    public static InterfaceC2044707zh<EnumC1778850wOJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778850wOJ enumC1778850wOJ = new EnumC1778850wOJ("Dynamic", 0);
        Dynamic = enumC1778850wOJ;
        EnumC1778850wOJ enumC1778850wOJ2 = new EnumC1778850wOJ("Single", 1);
        Single = enumC1778850wOJ2;
        EnumC1778850wOJ[] enumC1778850wOJArr = {enumC1778850wOJ, enumC1778850wOJ2};
        LL = enumC1778850wOJArr;
        LLILLJJLI = new C2254308sP(enumC1778850wOJArr);
    }

    public static EnumC1778850wOJ[] values() {
        return (EnumC1778850wOJ[]) LL.clone();
    }

    public static EnumC1778850wOJ valueOf(String str) {
        return (EnumC1778850wOJ) C08FF.LIZ(EnumC1778850wOJ.class, str);
    }

    public EnumC1778850wOJ(String str, int i) {
    }
}
