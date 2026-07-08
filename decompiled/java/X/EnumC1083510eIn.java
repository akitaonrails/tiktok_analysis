package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083510eIn {
    public static final EnumC1083510eIn BOTTOM;
    public static final /* synthetic */ EnumC1083510eIn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083510eIn TOP;

    public static InterfaceC2044707zh<EnumC1083510eIn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083510eIn enumC1083510eIn = new EnumC1083510eIn("TOP", 0);
        TOP = enumC1083510eIn;
        EnumC1083510eIn enumC1083510eIn2 = new EnumC1083510eIn("BOTTOM", 1);
        BOTTOM = enumC1083510eIn2;
        EnumC1083510eIn[] enumC1083510eInArr = {enumC1083510eIn, enumC1083510eIn2};
        LL = enumC1083510eInArr;
        LLILLJJLI = new C2254308sP(enumC1083510eInArr);
    }

    public static EnumC1083510eIn[] values() {
        return (EnumC1083510eIn[]) LL.clone();
    }

    public static EnumC1083510eIn valueOf(String str) {
        return (EnumC1083510eIn) C08FF.LIZ(EnumC1083510eIn.class, str);
    }

    public EnumC1083510eIn(String str, int i) {
    }
}
