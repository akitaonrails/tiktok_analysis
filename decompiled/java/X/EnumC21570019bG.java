package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21570019bG {
    public static final EnumC21570019bG CUSTOM;
    public static final EnumC21570019bG DUET;
    public static final /* synthetic */ EnumC21570019bG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21570019bG REACTION;

    public static InterfaceC2044707zh<EnumC21570019bG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21570019bG enumC21570019bG = new EnumC21570019bG("CUSTOM", 0);
        CUSTOM = enumC21570019bG;
        EnumC21570019bG enumC21570019bG2 = new EnumC21570019bG("REACTION", 1);
        REACTION = enumC21570019bG2;
        EnumC21570019bG enumC21570019bG3 = new EnumC21570019bG("DUET", 2);
        DUET = enumC21570019bG3;
        EnumC21570019bG[] enumC21570019bGArr = {enumC21570019bG, enumC21570019bG2, enumC21570019bG3};
        LL = enumC21570019bGArr;
        LLILLJJLI = new C2254308sP(enumC21570019bGArr);
    }

    public static EnumC21570019bG[] values() {
        return (EnumC21570019bG[]) LL.clone();
    }

    public static EnumC21570019bG valueOf(String str) {
        return (EnumC21570019bG) C08FF.LIZ(EnumC21570019bG.class, str);
    }

    public EnumC21570019bG(String str, int i) {
    }
}
