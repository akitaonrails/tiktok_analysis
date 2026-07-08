package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19367410ps {
    public static final EnumC19367410ps BUTTON;
    public static final /* synthetic */ EnumC19367410ps[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19367410ps TAG;

    public static InterfaceC2044707zh<EnumC19367410ps> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19367410ps enumC19367410ps = new EnumC19367410ps("BUTTON", 0);
        BUTTON = enumC19367410ps;
        EnumC19367410ps enumC19367410ps2 = new EnumC19367410ps("TAG", 1);
        TAG = enumC19367410ps2;
        EnumC19367410ps[] enumC19367410psArr = {enumC19367410ps, enumC19367410ps2};
        LL = enumC19367410psArr;
        LLILLJJLI = new C2254308sP(enumC19367410psArr);
    }

    public static EnumC19367410ps[] values() {
        return (EnumC19367410ps[]) LL.clone();
    }

    public static EnumC19367410ps valueOf(String str) {
        return (EnumC19367410ps) C08FF.LIZ(EnumC19367410ps.class, str);
    }

    public EnumC19367410ps(String str, int i) {
    }
}
