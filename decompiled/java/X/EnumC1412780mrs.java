package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1412780mrs {
    public static final EnumC1412780mrs CANCEL;
    public static final /* synthetic */ EnumC1412780mrs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1412780mrs LOAD_FAIL;
    public static final EnumC1412780mrs LOAD_SUCCESS;

    public static InterfaceC2044707zh<EnumC1412780mrs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1412780mrs enumC1412780mrs = new EnumC1412780mrs("LOAD_SUCCESS", 0);
        LOAD_SUCCESS = enumC1412780mrs;
        EnumC1412780mrs enumC1412780mrs2 = new EnumC1412780mrs("LOAD_FAIL", 1);
        LOAD_FAIL = enumC1412780mrs2;
        EnumC1412780mrs enumC1412780mrs3 = new EnumC1412780mrs("CANCEL", 2);
        CANCEL = enumC1412780mrs3;
        EnumC1412780mrs[] enumC1412780mrsArr = {enumC1412780mrs, enumC1412780mrs2, enumC1412780mrs3};
        LL = enumC1412780mrsArr;
        LLILLJJLI = new C2254308sP(enumC1412780mrsArr);
    }

    public static EnumC1412780mrs[] values() {
        return (EnumC1412780mrs[]) LL.clone();
    }

    public static EnumC1412780mrs valueOf(String str) {
        return (EnumC1412780mrs) C08FF.LIZ(EnumC1412780mrs.class, str);
    }

    public EnumC1412780mrs(String str, int i) {
    }
}
