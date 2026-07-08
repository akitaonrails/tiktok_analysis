package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036500Ax {
    public static final /* synthetic */ EnumC036500Ax[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC036500Ax SCALE_END;

    public static InterfaceC2044707zh<EnumC036500Ax> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC036500Ax enumC036500Ax = new EnumC036500Ax();
        SCALE_END = enumC036500Ax;
        EnumC036500Ax[] enumC036500AxArr = {enumC036500Ax};
        LL = enumC036500AxArr;
        LLILLJJLI = new C2254308sP(enumC036500AxArr);
    }

    public static EnumC036500Ax[] values() {
        return (EnumC036500Ax[]) LL.clone();
    }

    public static EnumC036500Ax valueOf(String str) {
        return (EnumC036500Ax) C08FF.LIZ(EnumC036500Ax.class, str);
    }
}
