package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586400MzG {
    public static final EnumC586400MzG GOOGLE;
    public static final /* synthetic */ EnumC586400MzG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586400MzG TIKTOK;

    public static InterfaceC2044707zh<EnumC586400MzG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586400MzG enumC586400MzG = new EnumC586400MzG("TIKTOK", 0);
        TIKTOK = enumC586400MzG;
        EnumC586400MzG enumC586400MzG2 = new EnumC586400MzG("GOOGLE", 1);
        GOOGLE = enumC586400MzG2;
        EnumC586400MzG[] enumC586400MzGArr = {enumC586400MzG, enumC586400MzG2};
        LL = enumC586400MzGArr;
        LLILLJJLI = new C2254308sP(enumC586400MzGArr);
    }

    public static EnumC586400MzG[] values() {
        return (EnumC586400MzG[]) LL.clone();
    }

    public static EnumC586400MzG valueOf(String str) {
        return (EnumC586400MzG) C08FF.LIZ(EnumC586400MzG.class, str);
    }

    public EnumC586400MzG(String str, int i) {
    }
}
