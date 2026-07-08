package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vJB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1737230vJB {
    public static final EnumC1737230vJB AI_EFFECT_REFERENCE;
    public static final EnumC1737230vJB AI_MAKEUP;
    public static final EnumC1737230vJB FACE_FUSION;
    public static final EnumC1737230vJB FEMALE;
    public static final EnumC1737230vJB ICON_EDIT;
    public static final /* synthetic */ EnumC1737230vJB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1737230vJB MALE;
    public static final EnumC1737230vJB TOOLS_EDIT;

    public static InterfaceC2044707zh<EnumC1737230vJB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1737230vJB enumC1737230vJB = new EnumC1737230vJB("ICON_EDIT", 0);
        ICON_EDIT = enumC1737230vJB;
        EnumC1737230vJB enumC1737230vJB2 = new EnumC1737230vJB("TOOLS_EDIT", 1);
        TOOLS_EDIT = enumC1737230vJB2;
        EnumC1737230vJB enumC1737230vJB3 = new EnumC1737230vJB("FACE_FUSION", 2);
        FACE_FUSION = enumC1737230vJB3;
        EnumC1737230vJB enumC1737230vJB4 = new EnumC1737230vJB("AI_MAKEUP", 3);
        AI_MAKEUP = enumC1737230vJB4;
        EnumC1737230vJB enumC1737230vJB5 = new EnumC1737230vJB("AI_EFFECT_REFERENCE", 4);
        AI_EFFECT_REFERENCE = enumC1737230vJB5;
        EnumC1737230vJB enumC1737230vJB6 = new EnumC1737230vJB("MALE", 5);
        MALE = enumC1737230vJB6;
        EnumC1737230vJB enumC1737230vJB7 = new EnumC1737230vJB("FEMALE", 6);
        FEMALE = enumC1737230vJB7;
        EnumC1737230vJB[] enumC1737230vJBArr = {enumC1737230vJB, enumC1737230vJB2, enumC1737230vJB3, enumC1737230vJB4, enumC1737230vJB5, enumC1737230vJB6, enumC1737230vJB7};
        LL = enumC1737230vJBArr;
        LLILLJJLI = new C2254308sP(enumC1737230vJBArr);
    }

    public static EnumC1737230vJB[] values() {
        return (EnumC1737230vJB[]) LL.clone();
    }

    public static EnumC1737230vJB valueOf(String str) {
        return (EnumC1737230vJB) C08FF.LIZ(EnumC1737230vJB.class, str);
    }

    public EnumC1737230vJB(String str, int i) {
    }
}
