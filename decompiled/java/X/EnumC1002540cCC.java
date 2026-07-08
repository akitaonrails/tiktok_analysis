package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cCC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1002540cCC {
    public static final EnumC1002540cCC AUTO;
    public static final EnumC1002540cCC BACK_DETAIL;
    public static final /* synthetic */ EnumC1002540cCC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1002540cCC RETRY;

    public static InterfaceC2044707zh<EnumC1002540cCC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1002540cCC enumC1002540cCC = new EnumC1002540cCC("AUTO", 0);
        AUTO = enumC1002540cCC;
        EnumC1002540cCC enumC1002540cCC2 = new EnumC1002540cCC("BACK_DETAIL", 1);
        BACK_DETAIL = enumC1002540cCC2;
        EnumC1002540cCC enumC1002540cCC3 = new EnumC1002540cCC("RETRY", 2);
        RETRY = enumC1002540cCC3;
        EnumC1002540cCC[] enumC1002540cCCArr = {enumC1002540cCC, enumC1002540cCC2, enumC1002540cCC3};
        LL = enumC1002540cCCArr;
        LLILLJJLI = new C2254308sP(enumC1002540cCCArr);
    }

    public static EnumC1002540cCC[] values() {
        return (EnumC1002540cCC[]) LL.clone();
    }

    public static EnumC1002540cCC valueOf(String str) {
        return (EnumC1002540cCC) C08FF.LIZ(EnumC1002540cCC.class, str);
    }

    public EnumC1002540cCC(String str, int i) {
    }
}
