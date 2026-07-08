package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07t9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2004107t9 {
    public static final /* synthetic */ EnumC2004107t9[] LL;

    static {
        EnumC2004107t9[] enumC2004107t9Arr = {new EnumC2004107t9("NORMAL", 0), new EnumC2004107t9("SPLIT_LINE", 1)};
        LL = enumC2004107t9Arr;
        new C2254308sP(enumC2004107t9Arr);
    }

    public static EnumC2004107t9[] values() {
        return (EnumC2004107t9[]) LL.clone();
    }

    public static EnumC2004107t9 valueOf(String str) {
        return (EnumC2004107t9) C08FF.LIZ(EnumC2004107t9.class, str);
    }

    public EnumC2004107t9(String str, int i) {
    }
}
