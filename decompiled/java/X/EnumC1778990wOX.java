package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778990wOX {
    public static final /* synthetic */ EnumC1778990wOX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778990wOX NOT_TRANSITIONING;
    public static final EnumC1778990wOX TO_ORIGINAL;
    public static final EnumC1778990wOX TO_TRANSLATED;

    public static InterfaceC2044707zh<EnumC1778990wOX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778990wOX enumC1778990wOX = new EnumC1778990wOX("NOT_TRANSITIONING", 0);
        NOT_TRANSITIONING = enumC1778990wOX;
        EnumC1778990wOX enumC1778990wOX2 = new EnumC1778990wOX("TO_ORIGINAL", 1);
        TO_ORIGINAL = enumC1778990wOX2;
        EnumC1778990wOX enumC1778990wOX3 = new EnumC1778990wOX("TO_TRANSLATED", 2);
        TO_TRANSLATED = enumC1778990wOX3;
        EnumC1778990wOX[] enumC1778990wOXArr = {enumC1778990wOX, enumC1778990wOX2, enumC1778990wOX3};
        LL = enumC1778990wOXArr;
        LLILLJJLI = new C2254308sP(enumC1778990wOXArr);
    }

    public static EnumC1778990wOX[] values() {
        return (EnumC1778990wOX[]) LL.clone();
    }

    public static EnumC1778990wOX valueOf(String str) {
        return (EnumC1778990wOX) C08FF.LIZ(EnumC1778990wOX.class, str);
    }

    public EnumC1778990wOX(String str, int i) {
    }
}
