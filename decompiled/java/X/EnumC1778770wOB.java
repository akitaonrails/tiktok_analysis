package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778770wOB {
    public static final EnumC1778770wOB FULL_PAGE;
    public static final EnumC1778770wOB HALF_SHEET;
    public static final /* synthetic */ EnumC1778770wOB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1778770wOB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778770wOB enumC1778770wOB = new EnumC1778770wOB("FULL_PAGE", 0);
        FULL_PAGE = enumC1778770wOB;
        EnumC1778770wOB enumC1778770wOB2 = new EnumC1778770wOB("HALF_SHEET", 1);
        HALF_SHEET = enumC1778770wOB2;
        EnumC1778770wOB[] enumC1778770wOBArr = {enumC1778770wOB, enumC1778770wOB2};
        LL = enumC1778770wOBArr;
        LLILLJJLI = new C2254308sP(enumC1778770wOBArr);
    }

    public static EnumC1778770wOB[] values() {
        return (EnumC1778770wOB[]) LL.clone();
    }

    public static EnumC1778770wOB valueOf(String str) {
        return (EnumC1778770wOB) C08FF.LIZ(EnumC1778770wOB.class, str);
    }

    public EnumC1778770wOB(String str, int i) {
    }
}
