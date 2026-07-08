package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1630206Zw {
    public static final EnumC1630206Zw DISMISS;
    public static final EnumC1630206Zw DISMISSING;
    public static final /* synthetic */ EnumC1630206Zw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1630206Zw OPEN;

    public static InterfaceC2044707zh<EnumC1630206Zw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1630206Zw enumC1630206Zw = new EnumC1630206Zw("OPEN", 0);
        OPEN = enumC1630206Zw;
        EnumC1630206Zw enumC1630206Zw2 = new EnumC1630206Zw("DISMISSING", 1);
        DISMISSING = enumC1630206Zw2;
        EnumC1630206Zw enumC1630206Zw3 = new EnumC1630206Zw("DISMISS", 2);
        DISMISS = enumC1630206Zw3;
        EnumC1630206Zw[] enumC1630206ZwArr = {enumC1630206Zw, enumC1630206Zw2, enumC1630206Zw3};
        LL = enumC1630206ZwArr;
        LLILLJJLI = new C2254308sP(enumC1630206ZwArr);
    }

    public static EnumC1630206Zw[] values() {
        return (EnumC1630206Zw[]) LL.clone();
    }

    public static EnumC1630206Zw valueOf(String str) {
        return (EnumC1630206Zw) C08FF.LIZ(EnumC1630206Zw.class, str);
    }

    public EnumC1630206Zw(String str, int i) {
    }
}
