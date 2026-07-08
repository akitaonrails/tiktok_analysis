package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC314120CTa {
    public static final EnumC314120CTa COMMON;
    public static final EnumC314120CTa LATEST_COMMON;
    public static final /* synthetic */ EnumC314120CTa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC314120CTa LOCAL_CODE;
    public static final EnumC314120CTa LOCAL_STORAGE;
    public static final EnumC314120CTa UNKNOWN;

    public static InterfaceC2044707zh<EnumC314120CTa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC314120CTa enumC314120CTa = new EnumC314120CTa("COMMON", 0);
        COMMON = enumC314120CTa;
        EnumC314120CTa enumC314120CTa2 = new EnumC314120CTa("LOCAL_CODE", 1);
        LOCAL_CODE = enumC314120CTa2;
        EnumC314120CTa enumC314120CTa3 = new EnumC314120CTa("LOCAL_STORAGE", 2);
        LOCAL_STORAGE = enumC314120CTa3;
        EnumC314120CTa enumC314120CTa4 = new EnumC314120CTa("UNKNOWN", 3);
        UNKNOWN = enumC314120CTa4;
        EnumC314120CTa enumC314120CTa5 = new EnumC314120CTa("LATEST_COMMON", 4);
        LATEST_COMMON = enumC314120CTa5;
        EnumC314120CTa[] enumC314120CTaArr = {enumC314120CTa, enumC314120CTa2, enumC314120CTa3, enumC314120CTa4, enumC314120CTa5};
        LL = enumC314120CTaArr;
        LLILLJJLI = new C2254308sP(enumC314120CTaArr);
    }

    public static EnumC314120CTa[] values() {
        return (EnumC314120CTa[]) LL.clone();
    }

    public static EnumC314120CTa valueOf(String str) {
        return (EnumC314120CTa) C08FF.LIZ(EnumC314120CTa.class, str);
    }

    public EnumC314120CTa(String str, int i) {
    }
}
