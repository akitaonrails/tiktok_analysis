package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154650g9X {
    public static final /* synthetic */ EnumC1154650g9X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154650g9X LOCAL;
    public static final EnumC1154650g9X NETWORK;

    public static InterfaceC2044707zh<EnumC1154650g9X> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154650g9X enumC1154650g9X = new EnumC1154650g9X("LOCAL", 0);
        LOCAL = enumC1154650g9X;
        EnumC1154650g9X enumC1154650g9X2 = new EnumC1154650g9X("NETWORK", 1);
        NETWORK = enumC1154650g9X2;
        EnumC1154650g9X[] enumC1154650g9XArr = {enumC1154650g9X, enumC1154650g9X2};
        LL = enumC1154650g9XArr;
        LLILLJJLI = new C2254308sP(enumC1154650g9XArr);
    }

    public static EnumC1154650g9X[] values() {
        return (EnumC1154650g9X[]) LL.clone();
    }

    public static EnumC1154650g9X valueOf(String str) {
        return (EnumC1154650g9X) C08FF.LIZ(EnumC1154650g9X.class, str);
    }

    public EnumC1154650g9X(String str, int i) {
    }
}
