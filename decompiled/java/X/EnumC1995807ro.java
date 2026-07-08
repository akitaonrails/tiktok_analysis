package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1995807ro {
    public static final EnumC1995807ro CONDENSED;
    public static final /* synthetic */ EnumC1995807ro[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1995807ro NONE;
    public static final EnumC1995807ro NORMAL;

    public static InterfaceC2044707zh<EnumC1995807ro> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1995807ro enumC1995807ro = new EnumC1995807ro("NONE", 0);
        NONE = enumC1995807ro;
        EnumC1995807ro enumC1995807ro2 = new EnumC1995807ro("NORMAL", 1);
        NORMAL = enumC1995807ro2;
        EnumC1995807ro enumC1995807ro3 = new EnumC1995807ro("CONDENSED", 2);
        CONDENSED = enumC1995807ro3;
        EnumC1995807ro[] enumC1995807roArr = {enumC1995807ro, enumC1995807ro2, enumC1995807ro3};
        LL = enumC1995807roArr;
        LLILLJJLI = new C2254308sP(enumC1995807roArr);
    }

    public static EnumC1995807ro[] values() {
        return (EnumC1995807ro[]) LL.clone();
    }

    public static EnumC1995807ro valueOf(String str) {
        return (EnumC1995807ro) C08FF.LIZ(EnumC1995807ro.class, str);
    }

    public EnumC1995807ro(String str, int i) {
    }
}
