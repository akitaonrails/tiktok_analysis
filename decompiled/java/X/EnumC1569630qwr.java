package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1569630qwr {
    public static final EnumC1569630qwr ERROR;
    public static final EnumC1569630qwr INIT;
    public static final /* synthetic */ EnumC1569630qwr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1569630qwr LOADING;
    public static final EnumC1569630qwr NORMAL;

    public static InterfaceC2044707zh<EnumC1569630qwr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1569630qwr enumC1569630qwr = new EnumC1569630qwr("INIT", 0);
        INIT = enumC1569630qwr;
        EnumC1569630qwr enumC1569630qwr2 = new EnumC1569630qwr("LOADING", 1);
        LOADING = enumC1569630qwr2;
        EnumC1569630qwr enumC1569630qwr3 = new EnumC1569630qwr("ERROR", 2);
        ERROR = enumC1569630qwr3;
        EnumC1569630qwr enumC1569630qwr4 = new EnumC1569630qwr("NORMAL", 3);
        NORMAL = enumC1569630qwr4;
        EnumC1569630qwr[] enumC1569630qwrArr = {enumC1569630qwr, enumC1569630qwr2, enumC1569630qwr3, enumC1569630qwr4};
        LL = enumC1569630qwrArr;
        LLILLJJLI = new C2254308sP(enumC1569630qwrArr);
    }

    public static EnumC1569630qwr[] values() {
        return (EnumC1569630qwr[]) LL.clone();
    }

    public static EnumC1569630qwr valueOf(String str) {
        return (EnumC1569630qwr) C08FF.LIZ(EnumC1569630qwr.class, str);
    }

    public EnumC1569630qwr(String str, int i) {
    }
}
