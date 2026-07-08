package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1619300sEy {
    public static final EnumC1619300sEy JUMP_NEW_PAGE;
    public static final /* synthetic */ EnumC1619300sEy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1619300sEy NO_OPERATION;
    public static final EnumC1619300sEy SWITCH_TAB;

    public static InterfaceC2044707zh<EnumC1619300sEy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1619300sEy enumC1619300sEy = new EnumC1619300sEy("JUMP_NEW_PAGE", 0);
        JUMP_NEW_PAGE = enumC1619300sEy;
        EnumC1619300sEy enumC1619300sEy2 = new EnumC1619300sEy("SWITCH_TAB", 1);
        SWITCH_TAB = enumC1619300sEy2;
        EnumC1619300sEy enumC1619300sEy3 = new EnumC1619300sEy("NO_OPERATION", 2);
        NO_OPERATION = enumC1619300sEy3;
        EnumC1619300sEy[] enumC1619300sEyArr = {enumC1619300sEy, enumC1619300sEy2, enumC1619300sEy3};
        LL = enumC1619300sEyArr;
        LLILLJJLI = new C2254308sP(enumC1619300sEyArr);
    }

    public static EnumC1619300sEy[] values() {
        return (EnumC1619300sEy[]) LL.clone();
    }

    public static EnumC1619300sEy valueOf(String str) {
        return (EnumC1619300sEy) C08FF.LIZ(EnumC1619300sEy.class, str);
    }

    public EnumC1619300sEy(String str, int i) {
    }
}
