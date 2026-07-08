package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wO7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778730wO7 {
    public static final EnumC1778730wO7 GENERATION;
    public static final /* synthetic */ EnumC1778730wO7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778730wO7 SENDING;

    public static InterfaceC2044707zh<EnumC1778730wO7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778730wO7 enumC1778730wO7 = new EnumC1778730wO7("SENDING", 0);
        SENDING = enumC1778730wO7;
        EnumC1778730wO7 enumC1778730wO72 = new EnumC1778730wO7("GENERATION", 1);
        GENERATION = enumC1778730wO72;
        EnumC1778730wO7[] enumC1778730wO7Arr = {enumC1778730wO7, enumC1778730wO72};
        LL = enumC1778730wO7Arr;
        LLILLJJLI = new C2254308sP(enumC1778730wO7Arr);
    }

    public static EnumC1778730wO7[] values() {
        return (EnumC1778730wO7[]) LL.clone();
    }

    public static EnumC1778730wO7 valueOf(String str) {
        return (EnumC1778730wO7) C08FF.LIZ(EnumC1778730wO7.class, str);
    }

    public EnumC1778730wO7(String str, int i) {
    }
}
