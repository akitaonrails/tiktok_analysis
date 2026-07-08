package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC625000OfK {
    public static final /* synthetic */ EnumC625000OfK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC625000OfK LOAD_LATEST;
    public static final EnumC625000OfK LOAD_MORE;
    public static final EnumC625000OfK REFRESH;

    public static InterfaceC2044707zh<EnumC625000OfK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC625000OfK enumC625000OfK = new EnumC625000OfK("LOAD_MORE", 0);
        LOAD_MORE = enumC625000OfK;
        EnumC625000OfK enumC625000OfK2 = new EnumC625000OfK("LOAD_LATEST", 1);
        LOAD_LATEST = enumC625000OfK2;
        EnumC625000OfK enumC625000OfK3 = new EnumC625000OfK("REFRESH", 2);
        REFRESH = enumC625000OfK3;
        EnumC625000OfK[] enumC625000OfKArr = {enumC625000OfK, enumC625000OfK2, enumC625000OfK3};
        LL = enumC625000OfKArr;
        LLILLJJLI = new C2254308sP(enumC625000OfKArr);
    }

    public static EnumC625000OfK[] values() {
        return (EnumC625000OfK[]) LL.clone();
    }

    public static EnumC625000OfK valueOf(String str) {
        return (EnumC625000OfK) C08FF.LIZ(EnumC625000OfK.class, str);
    }

    public EnumC625000OfK(String str, int i) {
    }
}
