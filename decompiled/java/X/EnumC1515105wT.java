package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1515105wT {
    public static final /* synthetic */ EnumC1515105wT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1515105wT MULTI;
    public static final EnumC1515105wT SINGLE;

    public static InterfaceC2044707zh<EnumC1515105wT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1515105wT enumC1515105wT = new EnumC1515105wT("SINGLE", 0);
        SINGLE = enumC1515105wT;
        EnumC1515105wT enumC1515105wT2 = new EnumC1515105wT("MULTI", 1);
        MULTI = enumC1515105wT2;
        EnumC1515105wT[] enumC1515105wTArr = {enumC1515105wT, enumC1515105wT2};
        LL = enumC1515105wTArr;
        LLILLJJLI = new C2254308sP(enumC1515105wTArr);
    }

    public static EnumC1515105wT[] values() {
        return (EnumC1515105wT[]) LL.clone();
    }

    public static EnumC1515105wT valueOf(String str) {
        return (EnumC1515105wT) C08FF.LIZ(EnumC1515105wT.class, str);
    }

    public EnumC1515105wT(String str, int i) {
    }
}
