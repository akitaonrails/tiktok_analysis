package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1986107qF {
    public static final /* synthetic */ EnumC1986107qF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1986107qF NONE;
    public static final EnumC1986107qF SLIDE_FROM_BOTTOM;

    public static InterfaceC2044707zh<EnumC1986107qF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1986107qF enumC1986107qF = new EnumC1986107qF("NONE", 0);
        NONE = enumC1986107qF;
        EnumC1986107qF enumC1986107qF2 = new EnumC1986107qF("SLIDE_FROM_BOTTOM", 1);
        SLIDE_FROM_BOTTOM = enumC1986107qF2;
        EnumC1986107qF[] enumC1986107qFArr = {enumC1986107qF, enumC1986107qF2};
        LL = enumC1986107qFArr;
        LLILLJJLI = new C2254308sP(enumC1986107qFArr);
    }

    public static EnumC1986107qF[] values() {
        return (EnumC1986107qF[]) LL.clone();
    }

    public static EnumC1986107qF valueOf(String str) {
        return (EnumC1986107qF) C08FF.LIZ(EnumC1986107qF.class, str);
    }

    public EnumC1986107qF(String str, int i) {
    }
}
