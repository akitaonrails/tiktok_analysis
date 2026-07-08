package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iL7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1238710iL7 {
    public static final EnumC1238710iL7 GRANTED;
    public static final /* synthetic */ EnumC1238710iL7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1238710iL7 NOT_DETERMINED;
    public static final EnumC1238710iL7 REJECTED;

    public static InterfaceC2044707zh<EnumC1238710iL7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1238710iL7 enumC1238710iL7 = new EnumC1238710iL7("NOT_DETERMINED", 0);
        NOT_DETERMINED = enumC1238710iL7;
        EnumC1238710iL7 enumC1238710iL72 = new EnumC1238710iL7("GRANTED", 1);
        GRANTED = enumC1238710iL72;
        EnumC1238710iL7 enumC1238710iL73 = new EnumC1238710iL7("REJECTED", 2);
        REJECTED = enumC1238710iL73;
        EnumC1238710iL7[] enumC1238710iL7Arr = {enumC1238710iL7, enumC1238710iL72, enumC1238710iL73};
        LL = enumC1238710iL7Arr;
        LLILLJJLI = new C2254308sP(enumC1238710iL7Arr);
    }

    public static EnumC1238710iL7[] values() {
        return (EnumC1238710iL7[]) LL.clone();
    }

    public static EnumC1238710iL7 valueOf(String str) {
        return (EnumC1238710iL7) C08FF.LIZ(EnumC1238710iL7.class, str);
    }

    public EnumC1238710iL7(String str, int i) {
    }
}
