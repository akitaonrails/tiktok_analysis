package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC550960LjC {
    public static final /* synthetic */ EnumC550960LjC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC550960LjC NEEDED;
    public static final EnumC550960LjC NO_NEED;
    public static final EnumC550960LjC TAKE_IF_EXIST;

    public static InterfaceC2044707zh<EnumC550960LjC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC550960LjC enumC550960LjC = new EnumC550960LjC("NO_NEED", 0);
        NO_NEED = enumC550960LjC;
        EnumC550960LjC enumC550960LjC2 = new EnumC550960LjC("NEEDED", 1);
        NEEDED = enumC550960LjC2;
        EnumC550960LjC enumC550960LjC3 = new EnumC550960LjC("TAKE_IF_EXIST", 2);
        TAKE_IF_EXIST = enumC550960LjC3;
        EnumC550960LjC[] enumC550960LjCArr = {enumC550960LjC, enumC550960LjC2, enumC550960LjC3};
        LL = enumC550960LjCArr;
        LLILLJJLI = new C2254308sP(enumC550960LjCArr);
    }

    public static EnumC550960LjC[] values() {
        return (EnumC550960LjC[]) LL.clone();
    }

    public static EnumC550960LjC valueOf(String str) {
        return (EnumC550960LjC) C08FF.LIZ(EnumC550960LjC.class, str);
    }

    public EnumC550960LjC(String str, int i) {
    }
}
