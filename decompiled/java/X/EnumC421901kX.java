package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC421901kX {
    public static final EnumC421901kX CANCEL_BUTTON;
    public static final EnumC421901kX CONFIRM_BUTTON;
    public static final /* synthetic */ EnumC421901kX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC421901kX OTHER;

    public static InterfaceC2044707zh<EnumC421901kX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC421901kX enumC421901kX = new EnumC421901kX("OTHER", 0);
        OTHER = enumC421901kX;
        EnumC421901kX enumC421901kX2 = new EnumC421901kX("CANCEL_BUTTON", 1);
        CANCEL_BUTTON = enumC421901kX2;
        EnumC421901kX enumC421901kX3 = new EnumC421901kX("CONFIRM_BUTTON", 2);
        CONFIRM_BUTTON = enumC421901kX3;
        EnumC421901kX[] enumC421901kXArr = {enumC421901kX, enumC421901kX2, enumC421901kX3};
        LL = enumC421901kXArr;
        LLILLJJLI = new C2254308sP(enumC421901kXArr);
    }

    public static EnumC421901kX[] values() {
        return (EnumC421901kX[]) LL.clone();
    }

    public static EnumC421901kX valueOf(String str) {
        return (EnumC421901kX) C08FF.LIZ(EnumC421901kX.class, str);
    }

    public EnumC421901kX(String str, int i) {
    }
}
