package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584530MwF {
    public static final EnumC584530MwF DYNAMIC_BLUR;
    public static final /* synthetic */ EnumC584530MwF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584530MwF NONE;
    public static final EnumC584530MwF STATIC_BLUR;

    public static InterfaceC2044707zh<EnumC584530MwF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584530MwF enumC584530MwF = new EnumC584530MwF("NONE", 0);
        NONE = enumC584530MwF;
        EnumC584530MwF enumC584530MwF2 = new EnumC584530MwF("STATIC_BLUR", 1);
        STATIC_BLUR = enumC584530MwF2;
        EnumC584530MwF enumC584530MwF3 = new EnumC584530MwF("DYNAMIC_BLUR", 2);
        DYNAMIC_BLUR = enumC584530MwF3;
        EnumC584530MwF[] enumC584530MwFArr = {enumC584530MwF, enumC584530MwF2, enumC584530MwF3};
        LL = enumC584530MwFArr;
        LLILLJJLI = new C2254308sP(enumC584530MwFArr);
    }

    public static EnumC584530MwF[] values() {
        return (EnumC584530MwF[]) LL.clone();
    }

    public static EnumC584530MwF valueOf(String str) {
        return (EnumC584530MwF) C08FF.LIZ(EnumC584530MwF.class, str);
    }

    public EnumC584530MwF(String str, int i) {
    }
}
