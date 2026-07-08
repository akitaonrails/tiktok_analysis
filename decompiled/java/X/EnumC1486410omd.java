package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0omd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486410omd {
    public static final EnumC1486410omd FAKE;
    public static final /* synthetic */ EnumC1486410omd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1486410omd NOT_AVAILABLE;
    public static final EnumC1486410omd STRONG;
    public static final EnumC1486410omd WEAK;

    public static InterfaceC2044707zh<EnumC1486410omd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1486410omd enumC1486410omd = new EnumC1486410omd("STRONG", 0);
        STRONG = enumC1486410omd;
        EnumC1486410omd enumC1486410omd2 = new EnumC1486410omd("WEAK", 1);
        WEAK = enumC1486410omd2;
        EnumC1486410omd enumC1486410omd3 = new EnumC1486410omd("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = enumC1486410omd3;
        EnumC1486410omd enumC1486410omd4 = new EnumC1486410omd("FAKE", 3);
        FAKE = enumC1486410omd4;
        EnumC1486410omd[] enumC1486410omdArr = {enumC1486410omd, enumC1486410omd2, enumC1486410omd3, enumC1486410omd4};
        LL = enumC1486410omdArr;
        LLILLJJLI = new C2254308sP(enumC1486410omdArr);
    }

    public static EnumC1486410omd[] values() {
        return (EnumC1486410omd[]) LL.clone();
    }

    public static EnumC1486410omd valueOf(String str) {
        return (EnumC1486410omd) C08FF.LIZ(EnumC1486410omd.class, str);
    }

    public EnumC1486410omd(String str, int i) {
    }
}
