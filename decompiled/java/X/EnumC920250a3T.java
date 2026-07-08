package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC920250a3T {
    public static final EnumC920250a3T CAN_ZOOM_TO_MAX;
    public static final EnumC920250a3T CAN_ZOOM_TO_MIN;
    public static final /* synthetic */ EnumC920250a3T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC920250a3T ZOOM_DISABLED;

    public static InterfaceC2044707zh<EnumC920250a3T> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC920250a3T enumC920250a3T = new EnumC920250a3T("CAN_ZOOM_TO_MAX", 0);
        CAN_ZOOM_TO_MAX = enumC920250a3T;
        EnumC920250a3T enumC920250a3T2 = new EnumC920250a3T("CAN_ZOOM_TO_MIN", 1);
        CAN_ZOOM_TO_MIN = enumC920250a3T2;
        EnumC920250a3T enumC920250a3T3 = new EnumC920250a3T("ZOOM_DISABLED", 2);
        ZOOM_DISABLED = enumC920250a3T3;
        EnumC920250a3T[] enumC920250a3TArr = {enumC920250a3T, enumC920250a3T2, enumC920250a3T3};
        LL = enumC920250a3TArr;
        LLILLJJLI = new C2254308sP(enumC920250a3TArr);
    }

    public static EnumC920250a3T[] values() {
        return (EnumC920250a3T[]) LL.clone();
    }

    public static EnumC920250a3T valueOf(String str) {
        return (EnumC920250a3T) C08FF.LIZ(EnumC920250a3T.class, str);
    }

    public EnumC920250a3T(String str, int i) {
    }
}
