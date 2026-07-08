package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193181AsW {
    public static final EnumC2193181AsW CLICK;
    public static final EnumC2193181AsW CLOSE;
    public static final EnumC2193181AsW DISLIKE;
    public static final EnumC2193181AsW FLAG;
    public static final /* synthetic */ EnumC2193181AsW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2193181AsW PUBLISH;
    public static final EnumC2193181AsW SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2193181AsW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2193181AsW enumC2193181AsW = new EnumC2193181AsW("SHOW", 0, 1);
        SHOW = enumC2193181AsW;
        EnumC2193181AsW enumC2193181AsW2 = new EnumC2193181AsW("CLICK", 1, 2);
        CLICK = enumC2193181AsW2;
        EnumC2193181AsW enumC2193181AsW3 = new EnumC2193181AsW("CLOSE", 2, 3);
        CLOSE = enumC2193181AsW3;
        EnumC2193181AsW enumC2193181AsW4 = new EnumC2193181AsW("PUBLISH", 3, 4);
        PUBLISH = enumC2193181AsW4;
        EnumC2193181AsW enumC2193181AsW5 = new EnumC2193181AsW("FLAG", 4, 5);
        FLAG = enumC2193181AsW5;
        EnumC2193181AsW enumC2193181AsW6 = new EnumC2193181AsW("DISLIKE", 5, 6);
        DISLIKE = enumC2193181AsW6;
        EnumC2193181AsW[] enumC2193181AsWArr = {enumC2193181AsW, enumC2193181AsW2, enumC2193181AsW3, enumC2193181AsW4, enumC2193181AsW5, enumC2193181AsW6};
        LLILLJJLI = enumC2193181AsWArr;
        LLILLL = new C2254308sP(enumC2193181AsWArr);
    }

    public static EnumC2193181AsW[] values() {
        return (EnumC2193181AsW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2193181AsW valueOf(String str) {
        return (EnumC2193181AsW) C08FF.LIZ(EnumC2193181AsW.class, str);
    }

    public EnumC2193181AsW(String str, int i, int i2) {
        this.LL = i2;
    }
}
