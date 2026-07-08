package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1355250lN5 {
    public static final EnumC1355250lN5 BALANCED;
    public static final EnumC1355250lN5 EASY_HORIZONTAL;
    public static final EnumC1355250lN5 EASY_VERTICAL;
    public static final /* synthetic */ EnumC1355250lN5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final float LL;

    public static InterfaceC2044707zh<EnumC1355250lN5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1355250lN5 enumC1355250lN5 = new EnumC1355250lN5(1.0f, "BALANCED", 0);
        BALANCED = enumC1355250lN5;
        EnumC1355250lN5 enumC1355250lN52 = new EnumC1355250lN5(3.33f, "EASY_VERTICAL", 1);
        EASY_VERTICAL = enumC1355250lN52;
        EnumC1355250lN5 enumC1355250lN53 = new EnumC1355250lN5(0.3f, "EASY_HORIZONTAL", 2);
        EASY_HORIZONTAL = enumC1355250lN53;
        EnumC1355250lN5[] enumC1355250lN5Arr = {enumC1355250lN5, enumC1355250lN52, enumC1355250lN53};
        LLILLJJLI = enumC1355250lN5Arr;
        LLILLL = new C2254308sP(enumC1355250lN5Arr);
    }

    public static EnumC1355250lN5[] values() {
        return (EnumC1355250lN5[]) LLILLJJLI.clone();
    }

    public final float getValue() {
        return this.LL;
    }

    public static EnumC1355250lN5 valueOf(String str) {
        return (EnumC1355250lN5) C08FF.LIZ(EnumC1355250lN5.class, str);
    }

    public EnumC1355250lN5(float f, String str, int i) {
        this.LL = f;
    }
}
