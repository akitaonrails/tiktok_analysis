package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154350g93 {
    public static final /* synthetic */ EnumC1154350g93[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154350g93 OTHER;
    public static final EnumC1154350g93 TIME_END;

    public static InterfaceC2044707zh<EnumC1154350g93> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154350g93 enumC1154350g93 = new EnumC1154350g93("TIME_END", 0);
        TIME_END = enumC1154350g93;
        EnumC1154350g93 enumC1154350g932 = new EnumC1154350g93("OTHER", 1);
        OTHER = enumC1154350g932;
        EnumC1154350g93[] enumC1154350g93Arr = {enumC1154350g93, enumC1154350g932};
        LL = enumC1154350g93Arr;
        LLILLJJLI = new C2254308sP(enumC1154350g93Arr);
    }

    public static EnumC1154350g93[] values() {
        return (EnumC1154350g93[]) LL.clone();
    }

    public static EnumC1154350g93 valueOf(String str) {
        return (EnumC1154350g93) C08FF.LIZ(EnumC1154350g93.class, str);
    }

    public EnumC1154350g93(String str, int i) {
    }
}
