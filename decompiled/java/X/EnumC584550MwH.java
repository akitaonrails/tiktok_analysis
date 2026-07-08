package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584550MwH {
    public static final EnumC584550MwH IMAGE;
    public static final /* synthetic */ EnumC584550MwH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584550MwH VIDEO;

    public static InterfaceC2044707zh<EnumC584550MwH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584550MwH enumC584550MwH = new EnumC584550MwH("VIDEO", 0);
        VIDEO = enumC584550MwH;
        EnumC584550MwH enumC584550MwH2 = new EnumC584550MwH("IMAGE", 1);
        IMAGE = enumC584550MwH2;
        EnumC584550MwH[] enumC584550MwHArr = {enumC584550MwH, enumC584550MwH2};
        LL = enumC584550MwHArr;
        LLILLJJLI = new C2254308sP(enumC584550MwHArr);
    }

    public static EnumC584550MwH[] values() {
        return (EnumC584550MwH[]) LL.clone();
    }

    public static EnumC584550MwH valueOf(String str) {
        return (EnumC584550MwH) C08FF.LIZ(EnumC584550MwH.class, str);
    }

    public EnumC584550MwH(String str, int i) {
    }
}
