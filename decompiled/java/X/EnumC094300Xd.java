package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC094300Xd {
    public static final EnumC094300Xd HIGH;
    public static final /* synthetic */ EnumC094300Xd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC094300Xd LOW;
    public static final EnumC094300Xd NORMAL;

    public static InterfaceC2044707zh<EnumC094300Xd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC094300Xd enumC094300Xd = new EnumC094300Xd("LOW", 0);
        LOW = enumC094300Xd;
        EnumC094300Xd enumC094300Xd2 = new EnumC094300Xd("NORMAL", 1);
        NORMAL = enumC094300Xd2;
        EnumC094300Xd enumC094300Xd3 = new EnumC094300Xd("HIGH", 2);
        HIGH = enumC094300Xd3;
        EnumC094300Xd[] enumC094300XdArr = {enumC094300Xd, enumC094300Xd2, enumC094300Xd3};
        LL = enumC094300XdArr;
        LLILLJJLI = new C2254308sP(enumC094300XdArr);
    }

    public static EnumC094300Xd[] values() {
        return (EnumC094300Xd[]) LL.clone();
    }

    public static EnumC094300Xd valueOf(String str) {
        return (EnumC094300Xd) C08FF.LIZ(EnumC094300Xd.class, str);
    }

    public EnumC094300Xd(String str, int i) {
    }
}
