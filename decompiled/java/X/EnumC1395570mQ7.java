package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1395570mQ7 {
    public static final EnumC1395570mQ7 COMPLETED;
    public static final /* synthetic */ EnumC1395570mQ7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1395570mQ7 STARTED;
    public static final EnumC1395570mQ7 UNSET;

    public static InterfaceC2044707zh<EnumC1395570mQ7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1395570mQ7 enumC1395570mQ7 = new EnumC1395570mQ7("UNSET", 0);
        UNSET = enumC1395570mQ7;
        EnumC1395570mQ7 enumC1395570mQ72 = new EnumC1395570mQ7("STARTED", 1);
        STARTED = enumC1395570mQ72;
        EnumC1395570mQ7 enumC1395570mQ73 = new EnumC1395570mQ7("COMPLETED", 2);
        COMPLETED = enumC1395570mQ73;
        EnumC1395570mQ7[] enumC1395570mQ7Arr = {enumC1395570mQ7, enumC1395570mQ72, enumC1395570mQ73};
        LL = enumC1395570mQ7Arr;
        LLILLJJLI = new C2254308sP(enumC1395570mQ7Arr);
    }

    public static EnumC1395570mQ7[] values() {
        return (EnumC1395570mQ7[]) LL.clone();
    }

    public static EnumC1395570mQ7 valueOf(String str) {
        return (EnumC1395570mQ7) C08FF.LIZ(EnumC1395570mQ7.class, str);
    }

    public EnumC1395570mQ7(String str, int i) {
    }
}
