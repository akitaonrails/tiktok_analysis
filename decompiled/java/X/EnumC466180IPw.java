package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC466180IPw {
    public static final EnumC466180IPw AUDIO;
    public static final /* synthetic */ EnumC466180IPw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC466180IPw NETWORK;
    public static final EnumC466180IPw PERFORMANCE;

    public static InterfaceC2044707zh<EnumC466180IPw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC466180IPw enumC466180IPw = new EnumC466180IPw("NETWORK", 0);
        NETWORK = enumC466180IPw;
        EnumC466180IPw enumC466180IPw2 = new EnumC466180IPw("AUDIO", 1);
        AUDIO = enumC466180IPw2;
        EnumC466180IPw enumC466180IPw3 = new EnumC466180IPw("PERFORMANCE", 2);
        PERFORMANCE = enumC466180IPw3;
        EnumC466180IPw[] enumC466180IPwArr = {enumC466180IPw, enumC466180IPw2, enumC466180IPw3};
        LL = enumC466180IPwArr;
        LLILLJJLI = new C2254308sP(enumC466180IPwArr);
    }

    public static EnumC466180IPw[] values() {
        return (EnumC466180IPw[]) LL.clone();
    }

    public static EnumC466180IPw valueOf(String str) {
        return (EnumC466180IPw) C08FF.LIZ(EnumC466180IPw.class, str);
    }

    public EnumC466180IPw(String str, int i) {
    }
}
