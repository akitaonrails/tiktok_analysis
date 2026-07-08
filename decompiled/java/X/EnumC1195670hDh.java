package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1195670hDh {
    public static final EnumC1195670hDh FILL;
    public static final /* synthetic */ EnumC1195670hDh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1195670hDh QUIET;
    public static final EnumC1195670hDh STROKED;
    public static final EnumC1195670hDh TUX_FILL;

    public static InterfaceC2044707zh<EnumC1195670hDh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1195670hDh enumC1195670hDh = new EnumC1195670hDh("STROKED", 0);
        STROKED = enumC1195670hDh;
        EnumC1195670hDh enumC1195670hDh2 = new EnumC1195670hDh("FILL", 1);
        FILL = enumC1195670hDh2;
        EnumC1195670hDh enumC1195670hDh3 = new EnumC1195670hDh("QUIET", 2);
        QUIET = enumC1195670hDh3;
        EnumC1195670hDh enumC1195670hDh4 = new EnumC1195670hDh("TUX_FILL", 3);
        TUX_FILL = enumC1195670hDh4;
        EnumC1195670hDh[] enumC1195670hDhArr = {enumC1195670hDh, enumC1195670hDh2, enumC1195670hDh3, enumC1195670hDh4};
        LL = enumC1195670hDhArr;
        LLILLJJLI = new C2254308sP(enumC1195670hDhArr);
    }

    public static EnumC1195670hDh[] values() {
        return (EnumC1195670hDh[]) LL.clone();
    }

    public static EnumC1195670hDh valueOf(String str) {
        return (EnumC1195670hDh) C08FF.LIZ(EnumC1195670hDh.class, str);
    }

    public EnumC1195670hDh(String str, int i) {
    }
}
