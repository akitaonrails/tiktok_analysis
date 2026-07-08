package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0onH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486810onH {
    public static final /* synthetic */ EnumC1486810onH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1486810onH PAUSE;
    public static final EnumC1486810onH RESUME;

    public static InterfaceC2044707zh<EnumC1486810onH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1486810onH enumC1486810onH = new EnumC1486810onH("RESUME", 0);
        RESUME = enumC1486810onH;
        EnumC1486810onH enumC1486810onH2 = new EnumC1486810onH("PAUSE", 1);
        PAUSE = enumC1486810onH2;
        EnumC1486810onH[] enumC1486810onHArr = {enumC1486810onH, enumC1486810onH2};
        LL = enumC1486810onHArr;
        LLILLJJLI = new C2254308sP(enumC1486810onHArr);
    }

    public static EnumC1486810onH[] values() {
        return (EnumC1486810onH[]) LL.clone();
    }

    public static EnumC1486810onH valueOf(String str) {
        return (EnumC1486810onH) C08FF.LIZ(EnumC1486810onH.class, str);
    }

    public EnumC1486810onH(String str, int i) {
    }
}
