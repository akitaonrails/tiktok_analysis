package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1014290cV9 {
    public static final EnumC1014290cV9 BOTTOM;
    public static final EnumC1014290cV9 LEFT;
    public static final /* synthetic */ EnumC1014290cV9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1014290cV9 RIGHT;
    public static final EnumC1014290cV9 TOP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1014290cV9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1014290cV9 enumC1014290cV9 = new EnumC1014290cV9("LEFT", 0, "left");
        LEFT = enumC1014290cV9;
        EnumC1014290cV9 enumC1014290cV92 = new EnumC1014290cV9("RIGHT", 1, "right");
        RIGHT = enumC1014290cV92;
        EnumC1014290cV9 enumC1014290cV93 = new EnumC1014290cV9("TOP", 2, "top");
        TOP = enumC1014290cV93;
        EnumC1014290cV9 enumC1014290cV94 = new EnumC1014290cV9("BOTTOM", 3, "bottom");
        BOTTOM = enumC1014290cV94;
        EnumC1014290cV9[] enumC1014290cV9Arr = {enumC1014290cV9, enumC1014290cV92, enumC1014290cV93, enumC1014290cV94};
        LLILLJJLI = enumC1014290cV9Arr;
        LLILLL = new C2254308sP(enumC1014290cV9Arr);
    }

    public static EnumC1014290cV9[] values() {
        return (EnumC1014290cV9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1014290cV9 valueOf(String str) {
        return (EnumC1014290cV9) C08FF.LIZ(EnumC1014290cV9.class, str);
    }

    public EnumC1014290cV9(String str, int i, String str2) {
        this.LL = str2;
    }
}
