package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC925903jd {
    public static final /* synthetic */ EnumC925903jd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC925903jd MINIMAL;
    public static final EnumC925903jd NORMAL;

    public static InterfaceC2044707zh<EnumC925903jd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC925903jd enumC925903jd = new EnumC925903jd("NORMAL", 0);
        NORMAL = enumC925903jd;
        EnumC925903jd enumC925903jd2 = new EnumC925903jd("MINIMAL", 1);
        MINIMAL = enumC925903jd2;
        EnumC925903jd[] enumC925903jdArr = {enumC925903jd, enumC925903jd2};
        LL = enumC925903jdArr;
        LLILLJJLI = new C2254308sP(enumC925903jdArr);
    }

    public static EnumC925903jd[] values() {
        return (EnumC925903jd[]) LL.clone();
    }

    public static EnumC925903jd valueOf(String str) {
        return (EnumC925903jd) C08FF.LIZ(EnumC925903jd.class, str);
    }

    public EnumC925903jd(String str, int i) {
    }
}
