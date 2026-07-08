package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782570wUJ {
    public static final EnumC1782570wUJ AI_SUMMARY_DECORATION_BOARD;
    public static final EnumC1782570wUJ DECORATION_BOARD;
    public static final EnumC1782570wUJ FULLY_CUSTOMIZED_BOARD;
    public static final /* synthetic */ EnumC1782570wUJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1782570wUJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782570wUJ enumC1782570wUJ = new EnumC1782570wUJ("DECORATION_BOARD", 0);
        DECORATION_BOARD = enumC1782570wUJ;
        EnumC1782570wUJ enumC1782570wUJ2 = new EnumC1782570wUJ("FULLY_CUSTOMIZED_BOARD", 1);
        FULLY_CUSTOMIZED_BOARD = enumC1782570wUJ2;
        EnumC1782570wUJ enumC1782570wUJ3 = new EnumC1782570wUJ("AI_SUMMARY_DECORATION_BOARD", 2);
        AI_SUMMARY_DECORATION_BOARD = enumC1782570wUJ3;
        EnumC1782570wUJ[] enumC1782570wUJArr = {enumC1782570wUJ, enumC1782570wUJ2, enumC1782570wUJ3};
        LL = enumC1782570wUJArr;
        LLILLJJLI = new C2254308sP(enumC1782570wUJArr);
    }

    public static EnumC1782570wUJ[] values() {
        return (EnumC1782570wUJ[]) LL.clone();
    }

    public static EnumC1782570wUJ valueOf(String str) {
        return (EnumC1782570wUJ) C08FF.LIZ(EnumC1782570wUJ.class, str);
    }

    public EnumC1782570wUJ(String str, int i) {
    }
}
