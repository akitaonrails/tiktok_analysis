package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009707u3 {
    public static final EnumC2009707u3 CLOSE_BUTTON;
    public static final EnumC2009707u3 GREY_AREA;
    public static final /* synthetic */ EnumC2009707u3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009707u3 NOT_CLOSE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009707u3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009707u3 enumC2009707u3 = new EnumC2009707u3("NOT_CLOSE", 0, 0);
        NOT_CLOSE = enumC2009707u3;
        EnumC2009707u3 enumC2009707u32 = new EnumC2009707u3("GREY_AREA", 1, 1);
        GREY_AREA = enumC2009707u32;
        EnumC2009707u3 enumC2009707u33 = new EnumC2009707u3("CLOSE_BUTTON", 2, 2);
        CLOSE_BUTTON = enumC2009707u33;
        EnumC2009707u3[] enumC2009707u3Arr = {enumC2009707u3, enumC2009707u32, enumC2009707u33};
        LLILLJJLI = enumC2009707u3Arr;
        LLILLL = new C2254308sP(enumC2009707u3Arr);
    }

    public static EnumC2009707u3[] values() {
        return (EnumC2009707u3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2009707u3 valueOf(String str) {
        return (EnumC2009707u3) C08FF.LIZ(EnumC2009707u3.class, str);
    }

    public EnumC2009707u3(String str, int i, int i2) {
        this.LL = i2;
    }
}
