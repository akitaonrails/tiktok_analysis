package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC642470PHx {
    public static final EnumC642470PHx INNER_LOAD_MORE;
    public static final /* synthetic */ EnumC642470PHx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC642470PHx OUT_LOAD_MORE;
    public static final EnumC642470PHx REBIND;

    public static InterfaceC2044707zh<EnumC642470PHx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC642470PHx enumC642470PHx = new EnumC642470PHx("REBIND", 0);
        REBIND = enumC642470PHx;
        EnumC642470PHx enumC642470PHx2 = new EnumC642470PHx("OUT_LOAD_MORE", 1);
        OUT_LOAD_MORE = enumC642470PHx2;
        EnumC642470PHx enumC642470PHx3 = new EnumC642470PHx("INNER_LOAD_MORE", 2);
        INNER_LOAD_MORE = enumC642470PHx3;
        EnumC642470PHx[] enumC642470PHxArr = {enumC642470PHx, enumC642470PHx2, enumC642470PHx3};
        LL = enumC642470PHxArr;
        LLILLJJLI = new C2254308sP(enumC642470PHxArr);
    }

    public static EnumC642470PHx[] values() {
        return (EnumC642470PHx[]) LL.clone();
    }

    public static EnumC642470PHx valueOf(String str) {
        return (EnumC642470PHx) C08FF.LIZ(EnumC642470PHx.class, str);
    }

    public EnumC642470PHx(String str, int i) {
    }
}
