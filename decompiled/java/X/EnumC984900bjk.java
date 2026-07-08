package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC984900bjk {
    public static final /* synthetic */ EnumC984900bjk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC984900bjk LOSE;
    public static final EnumC984900bjk TIE;
    public static final EnumC984900bjk WIN;

    public static InterfaceC2044707zh<EnumC984900bjk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC984900bjk enumC984900bjk = new EnumC984900bjk("WIN", 0);
        WIN = enumC984900bjk;
        EnumC984900bjk enumC984900bjk2 = new EnumC984900bjk("LOSE", 1);
        LOSE = enumC984900bjk2;
        EnumC984900bjk enumC984900bjk3 = new EnumC984900bjk("TIE", 2);
        TIE = enumC984900bjk3;
        EnumC984900bjk[] enumC984900bjkArr = {enumC984900bjk, enumC984900bjk2, enumC984900bjk3};
        LL = enumC984900bjkArr;
        LLILLJJLI = new C2254308sP(enumC984900bjkArr);
    }

    public static EnumC984900bjk[] values() {
        return (EnumC984900bjk[]) LL.clone();
    }

    public static EnumC984900bjk valueOf(String str) {
        return (EnumC984900bjk) C08FF.LIZ(EnumC984900bjk.class, str);
    }

    public EnumC984900bjk(String str, int i) {
    }
}
