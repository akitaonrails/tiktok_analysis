package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1073720e30 {
    public static final EnumC1073720e30 AUTO;
    public static final EnumC1073720e30 BLANK;
    public static final EnumC1073720e30 BUTTON;
    public static final EnumC1073720e30 CLICK;
    public static final /* synthetic */ EnumC1073720e30[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1073720e30 SLIDE;

    public static InterfaceC2044707zh<EnumC1073720e30> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1073720e30 enumC1073720e30 = new EnumC1073720e30("BLANK", 0);
        BLANK = enumC1073720e30;
        EnumC1073720e30 enumC1073720e302 = new EnumC1073720e30("BUTTON", 1);
        BUTTON = enumC1073720e302;
        EnumC1073720e30 enumC1073720e303 = new EnumC1073720e30("AUTO", 2);
        AUTO = enumC1073720e303;
        EnumC1073720e30 enumC1073720e304 = new EnumC1073720e30("SLIDE", 3);
        SLIDE = enumC1073720e304;
        EnumC1073720e30 enumC1073720e305 = new EnumC1073720e30("CLICK", 4);
        CLICK = enumC1073720e305;
        EnumC1073720e30[] enumC1073720e30Arr = {enumC1073720e30, enumC1073720e302, enumC1073720e303, enumC1073720e304, enumC1073720e305};
        LL = enumC1073720e30Arr;
        LLILLJJLI = new C2254308sP(enumC1073720e30Arr);
    }

    public static EnumC1073720e30[] values() {
        return (EnumC1073720e30[]) LL.clone();
    }

    public static EnumC1073720e30 valueOf(String str) {
        return (EnumC1073720e30) C08FF.LIZ(EnumC1073720e30.class, str);
    }

    public EnumC1073720e30(String str, int i) {
    }
}
