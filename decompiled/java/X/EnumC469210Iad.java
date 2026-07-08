package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC469210Iad {
    public static final EnumC469210Iad DETAIL_CONTAINER;
    public static final EnumC469210Iad EXTERNAL_CONTAINER;
    public static final EnumC469210Iad LIVE_CONTAINER;
    public static final /* synthetic */ EnumC469210Iad[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC469210Iad> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC469210Iad enumC469210Iad = new EnumC469210Iad("DETAIL_CONTAINER", 0);
        DETAIL_CONTAINER = enumC469210Iad;
        EnumC469210Iad enumC469210Iad2 = new EnumC469210Iad("LIVE_CONTAINER", 1);
        LIVE_CONTAINER = enumC469210Iad2;
        EnumC469210Iad enumC469210Iad3 = new EnumC469210Iad("EXTERNAL_CONTAINER", 2);
        EXTERNAL_CONTAINER = enumC469210Iad3;
        EnumC469210Iad[] enumC469210IadArr = {enumC469210Iad, enumC469210Iad2, enumC469210Iad3};
        LL = enumC469210IadArr;
        LLILLJJLI = new C2254308sP(enumC469210IadArr);
    }

    public static EnumC469210Iad[] values() {
        return (EnumC469210Iad[]) LL.clone();
    }

    public static EnumC469210Iad valueOf(String str) {
        return (EnumC469210Iad) C08FF.LIZ(EnumC469210Iad.class, str);
    }

    public EnumC469210Iad(String str, int i) {
    }
}
