package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC329590Cw1 {
    public static final EnumC329590Cw1 LL;
    public static final EnumC329590Cw1 LLILLJJLI;
    public static final /* synthetic */ EnumC329590Cw1[] LLILLL;

    static {
        EnumC329590Cw1 enumC329590Cw1 = new EnumC329590Cw1("REFRESH", 0);
        LL = enumC329590Cw1;
        EnumC329590Cw1 enumC329590Cw12 = new EnumC329590Cw1("LOAD_MORE", 1);
        LLILLJJLI = enumC329590Cw12;
        EnumC329590Cw1[] enumC329590Cw1Arr = {enumC329590Cw1, enumC329590Cw12};
        LLILLL = enumC329590Cw1Arr;
        new C2254308sP(enumC329590Cw1Arr);
    }

    public static EnumC329590Cw1[] values() {
        return (EnumC329590Cw1[]) LLILLL.clone();
    }

    public static EnumC329590Cw1 valueOf(String str) {
        return (EnumC329590Cw1) C08FF.LIZ(EnumC329590Cw1.class, str);
    }

    public EnumC329590Cw1(String str, int i) {
    }
}
