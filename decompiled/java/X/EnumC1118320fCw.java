package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1118320fCw {
    public static final /* synthetic */ EnumC1118320fCw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1118320fCw NO;
    public static final EnumC1118320fCw WHATEVER;
    public static final EnumC1118320fCw YES;

    public static InterfaceC2044707zh<EnumC1118320fCw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1118320fCw enumC1118320fCw = new EnumC1118320fCw("YES", 0);
        YES = enumC1118320fCw;
        EnumC1118320fCw enumC1118320fCw2 = new EnumC1118320fCw("NO", 1);
        NO = enumC1118320fCw2;
        EnumC1118320fCw enumC1118320fCw3 = new EnumC1118320fCw("WHATEVER", 2);
        WHATEVER = enumC1118320fCw3;
        EnumC1118320fCw[] enumC1118320fCwArr = {enumC1118320fCw, enumC1118320fCw2, enumC1118320fCw3};
        LL = enumC1118320fCwArr;
        LLILLJJLI = new C2254308sP(enumC1118320fCwArr);
    }

    public static EnumC1118320fCw[] values() {
        return (EnumC1118320fCw[]) LL.clone();
    }

    public static EnumC1118320fCw valueOf(String str) {
        return (EnumC1118320fCw) C08FF.LIZ(EnumC1118320fCw.class, str);
    }

    public EnumC1118320fCw(String str, int i) {
    }
}
