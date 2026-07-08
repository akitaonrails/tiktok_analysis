package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356310Dy1 {
    public static final EnumC356310Dy1 EDIT;
    public static final EnumC356310Dy1 EDITOR_PRO;
    public static final EnumC356310Dy1 EDIT_RECOMMEND;
    public static final /* synthetic */ EnumC356310Dy1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC356310Dy1 MULTI_TRACK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC356310Dy1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC356310Dy1 enumC356310Dy1 = new EnumC356310Dy1("EDIT", 0, 1);
        EDIT = enumC356310Dy1;
        EnumC356310Dy1 enumC356310Dy12 = new EnumC356310Dy1("EDITOR_PRO", 1, 2);
        EDITOR_PRO = enumC356310Dy12;
        EnumC356310Dy1 enumC356310Dy13 = new EnumC356310Dy1("MULTI_TRACK", 2, 3);
        MULTI_TRACK = enumC356310Dy13;
        EnumC356310Dy1 enumC356310Dy14 = new EnumC356310Dy1("EDIT_RECOMMEND", 3, 4);
        EDIT_RECOMMEND = enumC356310Dy14;
        EnumC356310Dy1[] enumC356310Dy1Arr = {enumC356310Dy1, enumC356310Dy12, enumC356310Dy13, enumC356310Dy14};
        LLILLJJLI = enumC356310Dy1Arr;
        LLILLL = new C2254308sP(enumC356310Dy1Arr);
    }

    public static EnumC356310Dy1[] values() {
        return (EnumC356310Dy1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC356310Dy1 valueOf(String str) {
        return (EnumC356310Dy1) C08FF.LIZ(EnumC356310Dy1.class, str);
    }

    public EnumC356310Dy1(String str, int i, int i2) {
        this.LL = i2;
    }
}
