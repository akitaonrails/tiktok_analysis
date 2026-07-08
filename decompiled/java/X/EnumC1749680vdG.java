package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749680vdG {
    public static final EnumC1749680vdG CLOSE;
    public static final /* synthetic */ EnumC1749680vdG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1749680vdG OPEN;

    public static InterfaceC2044707zh<EnumC1749680vdG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1749680vdG enumC1749680vdG = new EnumC1749680vdG("OPEN", 0);
        OPEN = enumC1749680vdG;
        EnumC1749680vdG enumC1749680vdG2 = new EnumC1749680vdG("CLOSE", 1);
        CLOSE = enumC1749680vdG2;
        EnumC1749680vdG[] enumC1749680vdGArr = {enumC1749680vdG, enumC1749680vdG2};
        LL = enumC1749680vdGArr;
        LLILLJJLI = new C2254308sP(enumC1749680vdGArr);
    }

    public static EnumC1749680vdG[] values() {
        return (EnumC1749680vdG[]) LL.clone();
    }

    public static EnumC1749680vdG valueOf(String str) {
        return (EnumC1749680vdG) C08FF.LIZ(EnumC1749680vdG.class, str);
    }

    public EnumC1749680vdG(String str, int i) {
    }
}
