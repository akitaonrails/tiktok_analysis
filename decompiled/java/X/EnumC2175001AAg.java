package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2175001AAg {
    public static final /* synthetic */ EnumC2175001AAg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2175001AAg MASK;
    public static final EnumC2175001AAg NORMAL;
    public static final EnumC2175001AAg PAID_MASK;
    public static final EnumC2175001AAg PREVIEW;

    public static InterfaceC2044707zh<EnumC2175001AAg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2175001AAg enumC2175001AAg = new EnumC2175001AAg("NORMAL", 0);
        NORMAL = enumC2175001AAg;
        EnumC2175001AAg enumC2175001AAg2 = new EnumC2175001AAg("PREVIEW", 1);
        PREVIEW = enumC2175001AAg2;
        EnumC2175001AAg enumC2175001AAg3 = new EnumC2175001AAg("MASK", 2);
        MASK = enumC2175001AAg3;
        EnumC2175001AAg enumC2175001AAg4 = new EnumC2175001AAg("PAID_MASK", 3);
        PAID_MASK = enumC2175001AAg4;
        EnumC2175001AAg[] enumC2175001AAgArr = {enumC2175001AAg, enumC2175001AAg2, enumC2175001AAg3, enumC2175001AAg4};
        LL = enumC2175001AAgArr;
        LLILLJJLI = new C2254308sP(enumC2175001AAgArr);
    }

    public static EnumC2175001AAg[] values() {
        return (EnumC2175001AAg[]) LL.clone();
    }

    public static EnumC2175001AAg valueOf(String str) {
        return (EnumC2175001AAg) C08FF.LIZ(EnumC2175001AAg.class, str);
    }

    public EnumC2175001AAg(String str, int i) {
    }
}
