package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC540140LGi {
    public static final EnumC540140LGi IMAGE;
    public static final EnumC540140LGi IMAGE_AND_VIDEO;
    public static final /* synthetic */ EnumC540140LGi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC540140LGi VIDEO;

    public static InterfaceC2044707zh<EnumC540140LGi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC540140LGi enumC540140LGi = new EnumC540140LGi("IMAGE_AND_VIDEO", 0);
        IMAGE_AND_VIDEO = enumC540140LGi;
        EnumC540140LGi enumC540140LGi2 = new EnumC540140LGi("IMAGE", 1);
        IMAGE = enumC540140LGi2;
        EnumC540140LGi enumC540140LGi3 = new EnumC540140LGi("VIDEO", 2);
        VIDEO = enumC540140LGi3;
        EnumC540140LGi[] enumC540140LGiArr = {enumC540140LGi, enumC540140LGi2, enumC540140LGi3};
        LL = enumC540140LGiArr;
        LLILLJJLI = new C2254308sP(enumC540140LGiArr);
    }

    public static EnumC540140LGi[] values() {
        return (EnumC540140LGi[]) LL.clone();
    }

    public static EnumC540140LGi valueOf(String str) {
        return (EnumC540140LGi) C08FF.LIZ(EnumC540140LGi.class, str);
    }

    public EnumC540140LGi(String str, int i) {
    }
}
