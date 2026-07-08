package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1355240lN4 {
    public static final EnumC1355240lN4 BALANCED;
    public static final EnumC1355240lN4 EASY_HORIZONTAL;
    public static final EnumC1355240lN4 EASY_VERTICAL;
    public static final /* synthetic */ EnumC1355240lN4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final float LL;

    public static InterfaceC2044707zh<EnumC1355240lN4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1355240lN4 enumC1355240lN4 = new EnumC1355240lN4(1.0f, "BALANCED", 0);
        BALANCED = enumC1355240lN4;
        EnumC1355240lN4 enumC1355240lN42 = new EnumC1355240lN4(3.33f, "EASY_VERTICAL", 1);
        EASY_VERTICAL = enumC1355240lN42;
        EnumC1355240lN4 enumC1355240lN43 = new EnumC1355240lN4(0.3f, "EASY_HORIZONTAL", 2);
        EASY_HORIZONTAL = enumC1355240lN43;
        EnumC1355240lN4[] enumC1355240lN4Arr = {enumC1355240lN4, enumC1355240lN42, enumC1355240lN43};
        LLILLJJLI = enumC1355240lN4Arr;
        LLILLL = new C2254308sP(enumC1355240lN4Arr);
    }

    public static EnumC1355240lN4[] values() {
        return (EnumC1355240lN4[]) LLILLJJLI.clone();
    }

    public final float getValue() {
        return this.LL;
    }

    public static EnumC1355240lN4 valueOf(String str) {
        return (EnumC1355240lN4) C08FF.LIZ(EnumC1355240lN4.class, str);
    }

    public EnumC1355240lN4(float f, String str, int i) {
        this.LL = f;
    }
}
