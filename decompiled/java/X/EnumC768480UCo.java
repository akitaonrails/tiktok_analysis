package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC768480UCo {
    public static final EnumC768480UCo DISMISS_CAUSE_CLICK_BACK;
    public static final EnumC768480UCo DISMISS_CAUSE_CLICK_OUTSIDE;
    public static final EnumC768480UCo DISMISS_CAUSE_CLICK_SAVE;
    public static final EnumC768480UCo DISMISS_CAUSE_CLICK_UNKNOWN;
    public static final /* synthetic */ EnumC768480UCo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC768480UCo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC768480UCo enumC768480UCo = new EnumC768480UCo("DISMISS_CAUSE_CLICK_UNKNOWN", 0);
        DISMISS_CAUSE_CLICK_UNKNOWN = enumC768480UCo;
        EnumC768480UCo enumC768480UCo2 = new EnumC768480UCo("DISMISS_CAUSE_CLICK_OUTSIDE", 1);
        DISMISS_CAUSE_CLICK_OUTSIDE = enumC768480UCo2;
        EnumC768480UCo enumC768480UCo3 = new EnumC768480UCo("DISMISS_CAUSE_CLICK_BACK", 2);
        DISMISS_CAUSE_CLICK_BACK = enumC768480UCo3;
        EnumC768480UCo enumC768480UCo4 = new EnumC768480UCo("DISMISS_CAUSE_CLICK_SAVE", 3);
        DISMISS_CAUSE_CLICK_SAVE = enumC768480UCo4;
        EnumC768480UCo[] enumC768480UCoArr = {enumC768480UCo, enumC768480UCo2, enumC768480UCo3, enumC768480UCo4};
        LL = enumC768480UCoArr;
        LLILLJJLI = new C2254308sP(enumC768480UCoArr);
    }

    public static EnumC768480UCo[] values() {
        return (EnumC768480UCo[]) LL.clone();
    }

    public static EnumC768480UCo valueOf(String str) {
        return (EnumC768480UCo) C08FF.LIZ(EnumC768480UCo.class, str);
    }

    public EnumC768480UCo(String str, int i) {
    }
}
