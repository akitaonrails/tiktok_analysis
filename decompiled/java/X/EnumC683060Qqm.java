package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC683060Qqm {
    public static final /* synthetic */ EnumC683060Qqm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC683060Qqm WIDTH_68;
    public static final EnumC683060Qqm WIDTH_92;

    public static InterfaceC2044707zh<EnumC683060Qqm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC683060Qqm enumC683060Qqm = new EnumC683060Qqm("WIDTH_68", 0);
        WIDTH_68 = enumC683060Qqm;
        EnumC683060Qqm enumC683060Qqm2 = new EnumC683060Qqm("WIDTH_92", 1);
        WIDTH_92 = enumC683060Qqm2;
        EnumC683060Qqm[] enumC683060QqmArr = {enumC683060Qqm, enumC683060Qqm2};
        LL = enumC683060QqmArr;
        LLILLJJLI = new C2254308sP(enumC683060QqmArr);
    }

    public static EnumC683060Qqm[] values() {
        return (EnumC683060Qqm[]) LL.clone();
    }

    public static EnumC683060Qqm valueOf(String str) {
        return (EnumC683060Qqm) C08FF.LIZ(EnumC683060Qqm.class, str);
    }

    public EnumC683060Qqm(String str, int i) {
    }
}
