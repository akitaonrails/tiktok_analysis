package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0czl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1033270czl {
    public static final C1033360czu Companion;
    public static final /* synthetic */ EnumC1033270czl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1033270czl RE_ENGAGEMENT;
    public static final EnumC1033270czl TASK_CENTER;
    public static final EnumC1033270czl UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1033270czl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1033270czl enumC1033270czl = new EnumC1033270czl("UNKNOWN", 0, 0);
        UNKNOWN = enumC1033270czl;
        EnumC1033270czl enumC1033270czl2 = new EnumC1033270czl("TASK_CENTER", 1, 1);
        TASK_CENTER = enumC1033270czl2;
        EnumC1033270czl enumC1033270czl3 = new EnumC1033270czl("RE_ENGAGEMENT", 2, 2);
        RE_ENGAGEMENT = enumC1033270czl3;
        EnumC1033270czl[] enumC1033270czlArr = {enumC1033270czl, enumC1033270czl2, enumC1033270czl3};
        LLILLJJLI = enumC1033270czlArr;
        LLILLL = new C2254308sP(enumC1033270czlArr);
        Companion = new C1033360czu();
    }

    public static EnumC1033270czl[] values() {
        return (EnumC1033270czl[]) LLILLJJLI.clone();
    }

    public final boolean isValid() {
        return this != UNKNOWN;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1033270czl valueOf(String str) {
        return (EnumC1033270czl) C08FF.LIZ(EnumC1033270czl.class, str);
    }

    public EnumC1033270czl(String str, int i, int i2) {
        this.LL = i2;
    }
}
