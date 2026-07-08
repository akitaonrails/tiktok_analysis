package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cCD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1002550cCD {
    public static final EnumC1002550cCD DONE;
    public static final EnumC1002550cCD DONE_WITH_BUTTONS;
    public static final /* synthetic */ EnumC1002550cCD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1002550cCD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1002550cCD enumC1002550cCD = new EnumC1002550cCD("DONE", 0);
        DONE = enumC1002550cCD;
        EnumC1002550cCD enumC1002550cCD2 = new EnumC1002550cCD("DONE_WITH_BUTTONS", 1);
        DONE_WITH_BUTTONS = enumC1002550cCD2;
        EnumC1002550cCD[] enumC1002550cCDArr = {enumC1002550cCD, enumC1002550cCD2};
        LL = enumC1002550cCDArr;
        LLILLJJLI = new C2254308sP(enumC1002550cCDArr);
    }

    public static EnumC1002550cCD[] values() {
        return (EnumC1002550cCD[]) LL.clone();
    }

    public static EnumC1002550cCD valueOf(String str) {
        return (EnumC1002550cCD) C08FF.LIZ(EnumC1002550cCD.class, str);
    }

    public EnumC1002550cCD(String str, int i) {
    }
}
