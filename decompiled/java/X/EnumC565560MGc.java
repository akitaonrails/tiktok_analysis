package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC565560MGc {
    public static final EnumC565560MGc AVAILABLE;
    public static final /* synthetic */ EnumC565560MGc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC565560MGc UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC565560MGc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC565560MGc enumC565560MGc = new EnumC565560MGc("AVAILABLE", 0);
        AVAILABLE = enumC565560MGc;
        EnumC565560MGc enumC565560MGc2 = new EnumC565560MGc("UNAVAILABLE", 1);
        UNAVAILABLE = enumC565560MGc2;
        EnumC565560MGc[] enumC565560MGcArr = {enumC565560MGc, enumC565560MGc2};
        LL = enumC565560MGcArr;
        LLILLJJLI = new C2254308sP(enumC565560MGcArr);
    }

    public static EnumC565560MGc[] values() {
        return (EnumC565560MGc[]) LL.clone();
    }

    public static EnumC565560MGc valueOf(String str) {
        return (EnumC565560MGc) C08FF.LIZ(EnumC565560MGc.class, str);
    }

    public EnumC565560MGc(String str, int i) {
    }
}
