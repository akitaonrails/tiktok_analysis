package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC682970Qqd {
    public static final EnumC682970Qqd CIRCLE;
    public static final /* synthetic */ EnumC682970Qqd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC682970Qqd SQUARE;

    public static InterfaceC2044707zh<EnumC682970Qqd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC682970Qqd enumC682970Qqd = new EnumC682970Qqd("SQUARE", 0);
        SQUARE = enumC682970Qqd;
        EnumC682970Qqd enumC682970Qqd2 = new EnumC682970Qqd("CIRCLE", 1);
        CIRCLE = enumC682970Qqd2;
        EnumC682970Qqd[] enumC682970QqdArr = {enumC682970Qqd, enumC682970Qqd2};
        LL = enumC682970QqdArr;
        LLILLJJLI = new C2254308sP(enumC682970QqdArr);
    }

    public static EnumC682970Qqd[] values() {
        return (EnumC682970Qqd[]) LL.clone();
    }

    public static EnumC682970Qqd valueOf(String str) {
        return (EnumC682970Qqd) C08FF.LIZ(EnumC682970Qqd.class, str);
    }

    public EnumC682970Qqd(String str, int i) {
    }
}
