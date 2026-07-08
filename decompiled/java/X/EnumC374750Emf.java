package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Emf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC374750Emf {
    public static final /* synthetic */ EnumC374750Emf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC374750Emf SHADOW;
    public static final EnumC374750Emf STRENGTH;

    public static InterfaceC2044707zh<EnumC374750Emf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC374750Emf enumC374750Emf = new EnumC374750Emf("STRENGTH", 0);
        STRENGTH = enumC374750Emf;
        EnumC374750Emf enumC374750Emf2 = new EnumC374750Emf("SHADOW", 1);
        SHADOW = enumC374750Emf2;
        EnumC374750Emf[] enumC374750EmfArr = {enumC374750Emf, enumC374750Emf2};
        LL = enumC374750EmfArr;
        LLILLJJLI = new C2254308sP(enumC374750EmfArr);
    }

    public static EnumC374750Emf[] values() {
        return (EnumC374750Emf[]) LL.clone();
    }

    public static EnumC374750Emf valueOf(String str) {
        return (EnumC374750Emf) C08FF.LIZ(EnumC374750Emf.class, str);
    }

    public EnumC374750Emf(String str, int i) {
    }
}
