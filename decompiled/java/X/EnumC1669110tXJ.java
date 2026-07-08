package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1669110tXJ {
    public static final EnumC1669110tXJ Clockwise;
    public static final EnumC1669110tXJ CounterClockwise;
    public static final /* synthetic */ EnumC1669110tXJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1669110tXJ> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1669110tXJ valueOf(String str) {
        return (EnumC1669110tXJ) C08FF.LIZ(EnumC1669110tXJ.class, str);
    }

    public static EnumC1669110tXJ[] values() {
        return (EnumC1669110tXJ[]) LL.clone();
    }

    static {
        EnumC1669110tXJ enumC1669110tXJ = new EnumC1669110tXJ("CounterClockwise", 0);
        CounterClockwise = enumC1669110tXJ;
        EnumC1669110tXJ enumC1669110tXJ2 = new EnumC1669110tXJ("Clockwise", 1);
        Clockwise = enumC1669110tXJ2;
        EnumC1669110tXJ[] enumC1669110tXJArr = {enumC1669110tXJ, enumC1669110tXJ2};
        LL = enumC1669110tXJArr;
        LLILLJJLI = new C2254308sP(enumC1669110tXJArr);
    }

    public EnumC1669110tXJ(String str, int i) {
    }
}
