package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1031610cx5 {
    public static final EnumC1031610cx5 END;
    public static final /* synthetic */ EnumC1031610cx5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1031610cx5 OVER;
    public static final EnumC1031610cx5 PAUSE;
    public static final EnumC1031610cx5 RESTART;
    public static final EnumC1031610cx5 RESUME;
    public static final EnumC1031610cx5 START;

    public static InterfaceC2044707zh<EnumC1031610cx5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1031610cx5 enumC1031610cx5 = new EnumC1031610cx5("START", 0);
        START = enumC1031610cx5;
        EnumC1031610cx5 enumC1031610cx52 = new EnumC1031610cx5("RESUME", 1);
        RESUME = enumC1031610cx52;
        EnumC1031610cx5 enumC1031610cx53 = new EnumC1031610cx5("PAUSE", 2);
        PAUSE = enumC1031610cx53;
        EnumC1031610cx5 enumC1031610cx54 = new EnumC1031610cx5("OVER", 3);
        OVER = enumC1031610cx54;
        EnumC1031610cx5 enumC1031610cx55 = new EnumC1031610cx5("END", 4);
        END = enumC1031610cx55;
        EnumC1031610cx5 enumC1031610cx56 = new EnumC1031610cx5("RESTART", 5);
        RESTART = enumC1031610cx56;
        EnumC1031610cx5[] enumC1031610cx5Arr = {enumC1031610cx5, enumC1031610cx52, enumC1031610cx53, enumC1031610cx54, enumC1031610cx55, enumC1031610cx56};
        LL = enumC1031610cx5Arr;
        LLILLJJLI = new C2254308sP(enumC1031610cx5Arr);
    }

    public static EnumC1031610cx5[] values() {
        return (EnumC1031610cx5[]) LL.clone();
    }

    public static EnumC1031610cx5 valueOf(String str) {
        return (EnumC1031610cx5) C08FF.LIZ(EnumC1031610cx5.class, str);
    }

    public EnumC1031610cx5(String str, int i) {
    }
}
