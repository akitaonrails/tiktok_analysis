package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC335980DFc {
    public static final EnumC335980DFc CCDC;
    public static final EnumC335980DFc GOOGLEPAY;
    public static final /* synthetic */ EnumC335980DFc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC335980DFc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC335980DFc enumC335980DFc = new EnumC335980DFc("CCDC", 0);
        CCDC = enumC335980DFc;
        EnumC335980DFc enumC335980DFc2 = new EnumC335980DFc("GOOGLEPAY", 1);
        GOOGLEPAY = enumC335980DFc2;
        EnumC335980DFc[] enumC335980DFcArr = {enumC335980DFc, enumC335980DFc2};
        LL = enumC335980DFcArr;
        LLILLJJLI = new C2254308sP(enumC335980DFcArr);
    }

    public static EnumC335980DFc[] values() {
        return (EnumC335980DFc[]) LL.clone();
    }

    public static EnumC335980DFc valueOf(String str) {
        return (EnumC335980DFc) C08FF.LIZ(EnumC335980DFc.class, str);
    }

    public EnumC335980DFc(String str, int i) {
    }
}
