package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s95, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1615650s95 {
    public static final /* synthetic */ EnumC1615650s95[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1615650s95 REGULAR;
    public static final EnumC1615650s95 THICK;

    public static InterfaceC2044707zh<EnumC1615650s95> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1615650s95 enumC1615650s95 = new EnumC1615650s95("REGULAR", 0);
        REGULAR = enumC1615650s95;
        EnumC1615650s95 enumC1615650s952 = new EnumC1615650s95("THICK", 1);
        THICK = enumC1615650s952;
        EnumC1615650s95[] enumC1615650s95Arr = {enumC1615650s95, enumC1615650s952};
        LL = enumC1615650s95Arr;
        LLILLJJLI = new C2254308sP(enumC1615650s95Arr);
    }

    public static EnumC1615650s95[] values() {
        return (EnumC1615650s95[]) LL.clone();
    }

    public static EnumC1615650s95 valueOf(String str) {
        return (EnumC1615650s95) C08FF.LIZ(EnumC1615650s95.class, str);
    }

    public EnumC1615650s95(String str, int i) {
    }
}
