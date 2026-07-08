package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1334180kp6 {
    public static final EnumC1334180kp6 HIGH;
    public static final /* synthetic */ EnumC1334180kp6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1334180kp6 LOW;
    public static final EnumC1334180kp6 MID;

    public static InterfaceC2044707zh<EnumC1334180kp6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1334180kp6 enumC1334180kp6 = new EnumC1334180kp6("HIGH", 0);
        HIGH = enumC1334180kp6;
        EnumC1334180kp6 enumC1334180kp62 = new EnumC1334180kp6("MID", 1);
        MID = enumC1334180kp62;
        EnumC1334180kp6 enumC1334180kp63 = new EnumC1334180kp6("LOW", 2);
        LOW = enumC1334180kp63;
        EnumC1334180kp6[] enumC1334180kp6Arr = {enumC1334180kp6, enumC1334180kp62, enumC1334180kp63};
        LL = enumC1334180kp6Arr;
        LLILLJJLI = new C2254308sP(enumC1334180kp6Arr);
    }

    public static EnumC1334180kp6[] values() {
        return (EnumC1334180kp6[]) LL.clone();
    }

    public static EnumC1334180kp6 valueOf(String str) {
        return (EnumC1334180kp6) C08FF.LIZ(EnumC1334180kp6.class, str);
    }

    public EnumC1334180kp6(String str, int i) {
    }
}
