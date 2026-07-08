package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ekH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1100550ekH {
    public static final /* synthetic */ EnumC1100550ekH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1100550ekH ON_END;
    public static final EnumC1100550ekH ON_START;

    public static InterfaceC2044707zh<EnumC1100550ekH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1100550ekH enumC1100550ekH = new EnumC1100550ekH("ON_START", 0);
        ON_START = enumC1100550ekH;
        EnumC1100550ekH enumC1100550ekH2 = new EnumC1100550ekH("ON_END", 1);
        ON_END = enumC1100550ekH2;
        EnumC1100550ekH[] enumC1100550ekHArr = {enumC1100550ekH, enumC1100550ekH2};
        LL = enumC1100550ekHArr;
        LLILLJJLI = new C2254308sP(enumC1100550ekHArr);
    }

    public static EnumC1100550ekH[] values() {
        return (EnumC1100550ekH[]) LL.clone();
    }

    public static EnumC1100550ekH valueOf(String str) {
        return (EnumC1100550ekH) C08FF.LIZ(EnumC1100550ekH.class, str);
    }

    public EnumC1100550ekH(String str, int i) {
    }
}
