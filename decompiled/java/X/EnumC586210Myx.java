package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Myx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586210Myx {
    public static final EnumC586210Myx FYP_PREVIEW;
    public static final /* synthetic */ EnumC586210Myx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586210Myx NONE;
    public static final EnumC586210Myx VHS;

    public static InterfaceC2044707zh<EnumC586210Myx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586210Myx enumC586210Myx = new EnumC586210Myx("NONE", 0);
        NONE = enumC586210Myx;
        EnumC586210Myx enumC586210Myx2 = new EnumC586210Myx("VHS", 1);
        VHS = enumC586210Myx2;
        EnumC586210Myx enumC586210Myx3 = new EnumC586210Myx("FYP_PREVIEW", 2);
        FYP_PREVIEW = enumC586210Myx3;
        EnumC586210Myx[] enumC586210MyxArr = {enumC586210Myx, enumC586210Myx2, enumC586210Myx3};
        LL = enumC586210MyxArr;
        LLILLJJLI = new C2254308sP(enumC586210MyxArr);
    }

    public static EnumC586210Myx[] values() {
        return (EnumC586210Myx[]) LL.clone();
    }

    public static EnumC586210Myx valueOf(String str) {
        return (EnumC586210Myx) C08FF.LIZ(EnumC586210Myx.class, str);
    }

    public EnumC586210Myx(String str, int i) {
    }
}
