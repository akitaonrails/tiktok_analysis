package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1842500y2y {
    public static final EnumC1842500y2y CAPSULE;
    public static final EnumC1842500y2y DOWNGRADE;
    public static final /* synthetic */ EnumC1842500y2y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1842500y2y MOCK_ANIMATION;
    public final Class<?> LL;

    public static InterfaceC2044707zh<EnumC1842500y2y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1842500y2y enumC1842500y2y = new EnumC1842500y2y(0, InterfaceC1842820y3U.class, "DOWNGRADE");
        DOWNGRADE = enumC1842500y2y;
        EnumC1842500y2y enumC1842500y2y2 = new EnumC1842500y2y(1, InterfaceC1842870y3Z.class, "CAPSULE");
        CAPSULE = enumC1842500y2y2;
        EnumC1842500y2y enumC1842500y2y3 = new EnumC1842500y2y(2, InterfaceC1842780y3Q.class, "MOCK_ANIMATION");
        MOCK_ANIMATION = enumC1842500y2y3;
        EnumC1842500y2y[] enumC1842500y2yArr = {enumC1842500y2y, enumC1842500y2y2, enumC1842500y2y3};
        LLILLJJLI = enumC1842500y2yArr;
        LLILLL = new C2254308sP(enumC1842500y2yArr);
    }

    public static EnumC1842500y2y[] values() {
        return (EnumC1842500y2y[]) LLILLJJLI.clone();
    }

    public final Class<?> getServiceClass() {
        return this.LL;
    }

    public static EnumC1842500y2y valueOf(String str) {
        return (EnumC1842500y2y) C08FF.LIZ(EnumC1842500y2y.class, str);
    }

    public EnumC1842500y2y(int i, Class cls, String str) {
        this.LL = cls;
    }
}
