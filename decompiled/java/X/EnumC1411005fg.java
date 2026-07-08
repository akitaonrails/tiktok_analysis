package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1411005fg {
    public static final EnumC1411005fg ERROR;
    public static final /* synthetic */ EnumC1411005fg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1411005fg LOADING;

    public static InterfaceC2044707zh<EnumC1411005fg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1411005fg enumC1411005fg = new EnumC1411005fg("LOADING", 0);
        LOADING = enumC1411005fg;
        EnumC1411005fg enumC1411005fg2 = new EnumC1411005fg("ERROR", 1);
        ERROR = enumC1411005fg2;
        EnumC1411005fg[] enumC1411005fgArr = {enumC1411005fg, enumC1411005fg2};
        LL = enumC1411005fgArr;
        LLILLJJLI = new C2254308sP(enumC1411005fgArr);
    }

    public static EnumC1411005fg[] values() {
        return (EnumC1411005fg[]) LL.clone();
    }

    public static EnumC1411005fg valueOf(String str) {
        return (EnumC1411005fg) C08FF.LIZ(EnumC1411005fg.class, str);
    }

    public EnumC1411005fg(String str, int i) {
    }
}
