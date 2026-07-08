package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC858020XlI {
    public static final EnumC858020XlI IMAGE_PUBLISH_PREVIEW;
    public static final /* synthetic */ EnumC858020XlI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC858020XlI PUBLISH;
    public static final EnumC858020XlI PUBLISH_PREVIEW;

    public static InterfaceC2044707zh<EnumC858020XlI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC858020XlI enumC858020XlI = new EnumC858020XlI("PUBLISH_PREVIEW", 0);
        PUBLISH_PREVIEW = enumC858020XlI;
        EnumC858020XlI enumC858020XlI2 = new EnumC858020XlI("PUBLISH", 1);
        PUBLISH = enumC858020XlI2;
        EnumC858020XlI enumC858020XlI3 = new EnumC858020XlI("IMAGE_PUBLISH_PREVIEW", 2);
        IMAGE_PUBLISH_PREVIEW = enumC858020XlI3;
        EnumC858020XlI[] enumC858020XlIArr = {enumC858020XlI, enumC858020XlI2, enumC858020XlI3};
        LL = enumC858020XlIArr;
        LLILLJJLI = new C2254308sP(enumC858020XlIArr);
    }

    public static EnumC858020XlI[] values() {
        return (EnumC858020XlI[]) LL.clone();
    }

    public static EnumC858020XlI valueOf(String str) {
        return (EnumC858020XlI) C08FF.LIZ(EnumC858020XlI.class, str);
    }

    public EnumC858020XlI(String str, int i) {
    }
}
