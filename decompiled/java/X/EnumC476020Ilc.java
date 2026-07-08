package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ilc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC476020Ilc {
    public static final EnumC476020Ilc BOTH_MULTITAB_AND_CASTERS;
    public static final EnumC476020Ilc CASTERS;
    public static final /* synthetic */ EnumC476020Ilc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC476020Ilc MULTITAB;
    public static final EnumC476020Ilc NONE;

    public static InterfaceC2044707zh<EnumC476020Ilc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC476020Ilc enumC476020Ilc = new EnumC476020Ilc("NONE", 0);
        NONE = enumC476020Ilc;
        EnumC476020Ilc enumC476020Ilc2 = new EnumC476020Ilc("MULTITAB", 1);
        MULTITAB = enumC476020Ilc2;
        EnumC476020Ilc enumC476020Ilc3 = new EnumC476020Ilc("CASTERS", 2);
        CASTERS = enumC476020Ilc3;
        EnumC476020Ilc enumC476020Ilc4 = new EnumC476020Ilc("BOTH_MULTITAB_AND_CASTERS", 3);
        BOTH_MULTITAB_AND_CASTERS = enumC476020Ilc4;
        EnumC476020Ilc[] enumC476020IlcArr = {enumC476020Ilc, enumC476020Ilc2, enumC476020Ilc3, enumC476020Ilc4};
        LL = enumC476020IlcArr;
        LLILLJJLI = new C2254308sP(enumC476020IlcArr);
    }

    public static EnumC476020Ilc[] values() {
        return (EnumC476020Ilc[]) LL.clone();
    }

    public static EnumC476020Ilc valueOf(String str) {
        return (EnumC476020Ilc) C08FF.LIZ(EnumC476020Ilc.class, str);
    }

    public EnumC476020Ilc(String str, int i) {
    }
}
