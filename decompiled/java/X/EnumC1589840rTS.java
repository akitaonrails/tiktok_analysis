package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1589840rTS {
    public static final EnumC1589840rTS BOTTOM_TAB;
    public static final /* synthetic */ EnumC1589840rTS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1589840rTS TOP_TAB;

    public static InterfaceC2044707zh<EnumC1589840rTS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1589840rTS enumC1589840rTS = new EnumC1589840rTS("TOP_TAB", 0);
        TOP_TAB = enumC1589840rTS;
        EnumC1589840rTS enumC1589840rTS2 = new EnumC1589840rTS("BOTTOM_TAB", 1);
        BOTTOM_TAB = enumC1589840rTS2;
        EnumC1589840rTS[] enumC1589840rTSArr = {enumC1589840rTS, enumC1589840rTS2};
        LL = enumC1589840rTSArr;
        LLILLJJLI = new C2254308sP(enumC1589840rTSArr);
    }

    public static EnumC1589840rTS[] values() {
        return (EnumC1589840rTS[]) LL.clone();
    }

    public static EnumC1589840rTS valueOf(String str) {
        return (EnumC1589840rTS) C08FF.LIZ(EnumC1589840rTS.class, str);
    }

    public EnumC1589840rTS(String str, int i) {
    }
}
