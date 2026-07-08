package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ctw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC328300Ctw {
    public static final /* synthetic */ EnumC328300Ctw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC328300Ctw NONE;
    public static final EnumC328300Ctw SENT;

    public static InterfaceC2044707zh<EnumC328300Ctw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC328300Ctw enumC328300Ctw = new EnumC328300Ctw("NONE", 0);
        NONE = enumC328300Ctw;
        EnumC328300Ctw enumC328300Ctw2 = new EnumC328300Ctw("SENT", 1);
        SENT = enumC328300Ctw2;
        EnumC328300Ctw[] enumC328300CtwArr = {enumC328300Ctw, enumC328300Ctw2};
        LL = enumC328300CtwArr;
        LLILLJJLI = new C2254308sP(enumC328300CtwArr);
    }

    public static EnumC328300Ctw[] values() {
        return (EnumC328300Ctw[]) LL.clone();
    }

    public static EnumC328300Ctw valueOf(String str) {
        return (EnumC328300Ctw) C08FF.LIZ(EnumC328300Ctw.class, str);
    }

    public EnumC328300Ctw(String str, int i) {
    }
}
