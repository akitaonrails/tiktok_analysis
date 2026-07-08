package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0noG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1448980noG {
    public static final EnumC1448980noG AUTO_APPLY;
    public static final EnumC1448980noG AUTO_SELECT;
    public static final /* synthetic */ EnumC1448980noG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1448980noG MANUAL_SET;
    public static final EnumC1448980noG RECOVER;
    public static final EnumC1448980noG UI_CLICK;
    public static final EnumC1448980noG UI_GALLERY;

    public static InterfaceC2044707zh<EnumC1448980noG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1448980noG enumC1448980noG = new EnumC1448980noG("UI_CLICK", 0);
        UI_CLICK = enumC1448980noG;
        EnumC1448980noG enumC1448980noG2 = new EnumC1448980noG("UI_GALLERY", 1);
        UI_GALLERY = enumC1448980noG2;
        EnumC1448980noG enumC1448980noG3 = new EnumC1448980noG("MANUAL_SET", 2);
        MANUAL_SET = enumC1448980noG3;
        EnumC1448980noG enumC1448980noG4 = new EnumC1448980noG("AUTO_SELECT", 3);
        AUTO_SELECT = enumC1448980noG4;
        EnumC1448980noG enumC1448980noG5 = new EnumC1448980noG("RECOVER", 4);
        RECOVER = enumC1448980noG5;
        EnumC1448980noG enumC1448980noG6 = new EnumC1448980noG("AUTO_APPLY", 5);
        AUTO_APPLY = enumC1448980noG6;
        EnumC1448980noG[] enumC1448980noGArr = {enumC1448980noG, enumC1448980noG2, enumC1448980noG3, enumC1448980noG4, enumC1448980noG5, enumC1448980noG6};
        LL = enumC1448980noGArr;
        LLILLJJLI = new C2254308sP(enumC1448980noGArr);
    }

    public static EnumC1448980noG[] values() {
        return (EnumC1448980noG[]) LL.clone();
    }

    public static EnumC1448980noG valueOf(String str) {
        return (EnumC1448980noG) C08FF.LIZ(EnumC1448980noG.class, str);
    }

    public EnumC1448980noG(String str, int i) {
    }
}
