package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1136630fgT {
    public static final EnumC1136630fgT ANCHOR;
    public static final /* synthetic */ EnumC1136630fgT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1136630fgT OTHER;
    public static final EnumC1136630fgT SELF;

    public static InterfaceC2044707zh<EnumC1136630fgT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1136630fgT enumC1136630fgT = new EnumC1136630fgT("SELF", 0);
        SELF = enumC1136630fgT;
        EnumC1136630fgT enumC1136630fgT2 = new EnumC1136630fgT("ANCHOR", 1);
        ANCHOR = enumC1136630fgT2;
        EnumC1136630fgT enumC1136630fgT3 = new EnumC1136630fgT("OTHER", 2);
        OTHER = enumC1136630fgT3;
        EnumC1136630fgT[] enumC1136630fgTArr = {enumC1136630fgT, enumC1136630fgT2, enumC1136630fgT3};
        LL = enumC1136630fgTArr;
        LLILLJJLI = new C2254308sP(enumC1136630fgTArr);
    }

    public static EnumC1136630fgT[] values() {
        return (EnumC1136630fgT[]) LL.clone();
    }

    public static EnumC1136630fgT valueOf(String str) {
        return (EnumC1136630fgT) C08FF.LIZ(EnumC1136630fgT.class, str);
    }

    public EnumC1136630fgT(String str, int i) {
    }
}
