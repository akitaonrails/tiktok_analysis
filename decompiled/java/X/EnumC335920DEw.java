package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC335920DEw {
    public static final /* synthetic */ EnumC335920DEw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC335920DEw V0;
    public static final EnumC335920DEw V1;
    public static final EnumC335920DEw V2;

    public static InterfaceC2044707zh<EnumC335920DEw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC335920DEw enumC335920DEw = new EnumC335920DEw("V0", 0);
        V0 = enumC335920DEw;
        EnumC335920DEw enumC335920DEw2 = new EnumC335920DEw("V1", 1);
        V1 = enumC335920DEw2;
        EnumC335920DEw enumC335920DEw3 = new EnumC335920DEw("V2", 2);
        V2 = enumC335920DEw3;
        EnumC335920DEw[] enumC335920DEwArr = {enumC335920DEw, enumC335920DEw2, enumC335920DEw3};
        LL = enumC335920DEwArr;
        LLILLJJLI = new C2254308sP(enumC335920DEwArr);
    }

    public static EnumC335920DEw[] values() {
        return (EnumC335920DEw[]) LL.clone();
    }

    public static EnumC335920DEw valueOf(String str) {
        return (EnumC335920DEw) C08FF.LIZ(EnumC335920DEw.class, str);
    }

    public EnumC335920DEw(String str, int i) {
    }
}
