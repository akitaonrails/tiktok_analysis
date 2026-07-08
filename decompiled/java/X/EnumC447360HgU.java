package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC447360HgU {
    public static final EnumC447360HgU BOTTOM;
    public static final EnumC447360HgU END;
    public static final /* synthetic */ EnumC447360HgU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC447360HgU START;
    public static final EnumC447360HgU TOP;

    public static InterfaceC2044707zh<EnumC447360HgU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC447360HgU enumC447360HgU = new EnumC447360HgU("START", 0);
        START = enumC447360HgU;
        EnumC447360HgU enumC447360HgU2 = new EnumC447360HgU("END", 1);
        END = enumC447360HgU2;
        EnumC447360HgU enumC447360HgU3 = new EnumC447360HgU("TOP", 2);
        TOP = enumC447360HgU3;
        EnumC447360HgU enumC447360HgU4 = new EnumC447360HgU("BOTTOM", 3);
        BOTTOM = enumC447360HgU4;
        EnumC447360HgU[] enumC447360HgUArr = {enumC447360HgU, enumC447360HgU2, enumC447360HgU3, enumC447360HgU4};
        LL = enumC447360HgUArr;
        LLILLJJLI = new C2254308sP(enumC447360HgUArr);
    }

    public static EnumC447360HgU[] values() {
        return (EnumC447360HgU[]) LL.clone();
    }

    public static EnumC447360HgU valueOf(String str) {
        return (EnumC447360HgU) C08FF.LIZ(EnumC447360HgU.class, str);
    }

    public EnumC447360HgU(String str, int i) {
    }
}
