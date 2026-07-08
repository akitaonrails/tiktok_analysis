package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584680MwU {
    public static final /* synthetic */ EnumC584680MwU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584680MwU NONE;
    public static final EnumC584680MwU REFRESH;

    public static InterfaceC2044707zh<EnumC584680MwU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584680MwU enumC584680MwU = new EnumC584680MwU("REFRESH", 0);
        REFRESH = enumC584680MwU;
        EnumC584680MwU enumC584680MwU2 = new EnumC584680MwU("NONE", 1);
        NONE = enumC584680MwU2;
        EnumC584680MwU[] enumC584680MwUArr = {enumC584680MwU, enumC584680MwU2};
        LL = enumC584680MwUArr;
        LLILLJJLI = new C2254308sP(enumC584680MwUArr);
    }

    public static EnumC584680MwU[] values() {
        return (EnumC584680MwU[]) LL.clone();
    }

    public static EnumC584680MwU valueOf(String str) {
        return (EnumC584680MwU) C08FF.LIZ(EnumC584680MwU.class, str);
    }

    public EnumC584680MwU(String str, int i) {
    }
}
