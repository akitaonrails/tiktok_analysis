package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586530MzT {
    public static final /* synthetic */ EnumC586530MzT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586530MzT TYPE_HISTORY;
    public static final EnumC586530MzT TYPE_RICH;
    public static final EnumC586530MzT TYPE_TEXT;

    public static InterfaceC2044707zh<EnumC586530MzT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586530MzT enumC586530MzT = new EnumC586530MzT("TYPE_TEXT", 0);
        TYPE_TEXT = enumC586530MzT;
        EnumC586530MzT enumC586530MzT2 = new EnumC586530MzT("TYPE_HISTORY", 1);
        TYPE_HISTORY = enumC586530MzT2;
        EnumC586530MzT enumC586530MzT3 = new EnumC586530MzT("TYPE_RICH", 2);
        TYPE_RICH = enumC586530MzT3;
        EnumC586530MzT[] enumC586530MzTArr = {enumC586530MzT, enumC586530MzT2, enumC586530MzT3};
        LL = enumC586530MzTArr;
        LLILLJJLI = new C2254308sP(enumC586530MzTArr);
    }

    public static EnumC586530MzT[] values() {
        return (EnumC586530MzT[]) LL.clone();
    }

    public static EnumC586530MzT valueOf(String str) {
        return (EnumC586530MzT) C08FF.LIZ(EnumC586530MzT.class, str);
    }

    public EnumC586530MzT(String str, int i) {
    }
}
