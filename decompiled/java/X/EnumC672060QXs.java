package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672060QXs {
    public static final EnumC672060QXs FULL;
    public static final EnumC672060QXs FULL_TOP_IMAGE;
    public static final EnumC672060QXs FULL_US;
    public static final EnumC672060QXs HALF;
    public static final /* synthetic */ EnumC672060QXs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC672060QXs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC672060QXs enumC672060QXs = new EnumC672060QXs("FULL", 0);
        FULL = enumC672060QXs;
        EnumC672060QXs enumC672060QXs2 = new EnumC672060QXs("HALF", 1);
        HALF = enumC672060QXs2;
        EnumC672060QXs enumC672060QXs3 = new EnumC672060QXs("FULL_US", 2);
        FULL_US = enumC672060QXs3;
        EnumC672060QXs enumC672060QXs4 = new EnumC672060QXs("FULL_TOP_IMAGE", 3);
        FULL_TOP_IMAGE = enumC672060QXs4;
        EnumC672060QXs[] enumC672060QXsArr = {enumC672060QXs, enumC672060QXs2, enumC672060QXs3, enumC672060QXs4};
        LL = enumC672060QXsArr;
        LLILLJJLI = new C2254308sP(enumC672060QXsArr);
    }

    public static EnumC672060QXs[] values() {
        return (EnumC672060QXs[]) LL.clone();
    }

    public static EnumC672060QXs valueOf(String str) {
        return (EnumC672060QXs) C08FF.LIZ(EnumC672060QXs.class, str);
    }

    public EnumC672060QXs(String str, int i) {
    }
}
