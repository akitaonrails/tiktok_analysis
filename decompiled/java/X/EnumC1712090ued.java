package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ued, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1712090ued {
    public static final EnumC1712090ued ENABLED;
    public static final /* synthetic */ EnumC1712090ued[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1712090ued NOT_ENABLED;
    public static final EnumC1712090ued NOT_SUPPORT;
    public static final EnumC1712090ued SCANNING;

    public static InterfaceC2044707zh<EnumC1712090ued> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1712090ued enumC1712090ued = new EnumC1712090ued("NOT_SUPPORT", 0);
        NOT_SUPPORT = enumC1712090ued;
        EnumC1712090ued enumC1712090ued2 = new EnumC1712090ued("NOT_ENABLED", 1);
        NOT_ENABLED = enumC1712090ued2;
        EnumC1712090ued enumC1712090ued3 = new EnumC1712090ued("ENABLED", 2);
        ENABLED = enumC1712090ued3;
        EnumC1712090ued enumC1712090ued4 = new EnumC1712090ued("SCANNING", 3);
        SCANNING = enumC1712090ued4;
        EnumC1712090ued[] enumC1712090uedArr = {enumC1712090ued, enumC1712090ued2, enumC1712090ued3, enumC1712090ued4};
        LL = enumC1712090uedArr;
        LLILLJJLI = new C2254308sP(enumC1712090uedArr);
    }

    public static EnumC1712090ued[] values() {
        return (EnumC1712090ued[]) LL.clone();
    }

    public static EnumC1712090ued valueOf(String str) {
        return (EnumC1712090ued) C08FF.LIZ(EnumC1712090ued.class, str);
    }

    public EnumC1712090ued(String str, int i) {
    }
}
