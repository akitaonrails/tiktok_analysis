package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1129500fUy {
    public static final EnumC1129500fUy EMPTY;
    public static final EnumC1129500fUy ERROR;
    public static final /* synthetic */ EnumC1129500fUy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1129500fUy LOADING;
    public static final EnumC1129500fUy READY;

    public static InterfaceC2044707zh<EnumC1129500fUy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1129500fUy enumC1129500fUy = new EnumC1129500fUy("ERROR", 0);
        ERROR = enumC1129500fUy;
        EnumC1129500fUy enumC1129500fUy2 = new EnumC1129500fUy("EMPTY", 1);
        EMPTY = enumC1129500fUy2;
        EnumC1129500fUy enumC1129500fUy3 = new EnumC1129500fUy("LOADING", 2);
        LOADING = enumC1129500fUy3;
        EnumC1129500fUy enumC1129500fUy4 = new EnumC1129500fUy("READY", 3);
        READY = enumC1129500fUy4;
        EnumC1129500fUy[] enumC1129500fUyArr = {enumC1129500fUy, enumC1129500fUy2, enumC1129500fUy3, enumC1129500fUy4};
        LL = enumC1129500fUyArr;
        LLILLJJLI = new C2254308sP(enumC1129500fUyArr);
    }

    public static EnumC1129500fUy[] values() {
        return (EnumC1129500fUy[]) LL.clone();
    }

    public static EnumC1129500fUy valueOf(String str) {
        return (EnumC1129500fUy) C08FF.LIZ(EnumC1129500fUy.class, str);
    }

    public EnumC1129500fUy(String str, int i) {
    }
}
