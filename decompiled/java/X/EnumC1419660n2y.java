package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1419660n2y {
    public static final /* synthetic */ EnumC1419660n2y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1419660n2y USE_NEW_TITLE;
    public static final EnumC1419660n2y USE_ONLINE;
    public static final EnumC1419660n2y USE_PGC;

    public static InterfaceC2044707zh<EnumC1419660n2y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1419660n2y enumC1419660n2y = new EnumC1419660n2y("USE_ONLINE", 0);
        USE_ONLINE = enumC1419660n2y;
        EnumC1419660n2y enumC1419660n2y2 = new EnumC1419660n2y("USE_PGC", 1);
        USE_PGC = enumC1419660n2y2;
        EnumC1419660n2y enumC1419660n2y3 = new EnumC1419660n2y("USE_NEW_TITLE", 2);
        USE_NEW_TITLE = enumC1419660n2y3;
        EnumC1419660n2y[] enumC1419660n2yArr = {enumC1419660n2y, enumC1419660n2y2, enumC1419660n2y3};
        LL = enumC1419660n2yArr;
        LLILLJJLI = new C2254308sP(enumC1419660n2yArr);
    }

    public static EnumC1419660n2y[] values() {
        return (EnumC1419660n2y[]) LL.clone();
    }

    public static EnumC1419660n2y valueOf(String str) {
        return (EnumC1419660n2y) C08FF.LIZ(EnumC1419660n2y.class, str);
    }

    public EnumC1419660n2y(String str, int i) {
    }
}
