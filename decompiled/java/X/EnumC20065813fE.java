package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20065813fE {
    public static final EnumC20065813fE Final;
    public static final EnumC20065813fE Initial;
    public static final /* synthetic */ EnumC20065813fE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20065813fE Main;

    public static InterfaceC2044707zh<EnumC20065813fE> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC20065813fE valueOf(String str) {
        return (EnumC20065813fE) C08FF.LIZ(EnumC20065813fE.class, str);
    }

    public static EnumC20065813fE[] values() {
        return (EnumC20065813fE[]) LL.clone();
    }

    static {
        EnumC20065813fE enumC20065813fE = new EnumC20065813fE("Initial", 0);
        Initial = enumC20065813fE;
        EnumC20065813fE enumC20065813fE2 = new EnumC20065813fE("Main", 1);
        Main = enumC20065813fE2;
        EnumC20065813fE enumC20065813fE3 = new EnumC20065813fE("Final", 2);
        Final = enumC20065813fE3;
        EnumC20065813fE[] enumC20065813fEArr = {enumC20065813fE, enumC20065813fE2, enumC20065813fE3};
        LL = enumC20065813fEArr;
        LLILLJJLI = new C2254308sP(enumC20065813fEArr);
    }

    public EnumC20065813fE(String str, int i) {
    }
}
