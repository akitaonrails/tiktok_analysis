package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0axG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC954840axG {
    public static final EnumC954840axG APPLY_GROUP_IM;
    public static final EnumC954840axG APPLY_REQUEST;
    public static final EnumC954840axG INVITE_GROUP_IM;
    public static final EnumC954840axG INVITE_REQUEST;
    public static final /* synthetic */ EnumC954840axG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC954840axG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC954840axG enumC954840axG = new EnumC954840axG("INVITE_REQUEST", 0);
        INVITE_REQUEST = enumC954840axG;
        EnumC954840axG enumC954840axG2 = new EnumC954840axG("APPLY_REQUEST", 1);
        APPLY_REQUEST = enumC954840axG2;
        EnumC954840axG enumC954840axG3 = new EnumC954840axG("INVITE_GROUP_IM", 2);
        INVITE_GROUP_IM = enumC954840axG3;
        EnumC954840axG enumC954840axG4 = new EnumC954840axG("APPLY_GROUP_IM", 3);
        APPLY_GROUP_IM = enumC954840axG4;
        EnumC954840axG[] enumC954840axGArr = {enumC954840axG, enumC954840axG2, enumC954840axG3, enumC954840axG4};
        LL = enumC954840axGArr;
        LLILLJJLI = new C2254308sP(enumC954840axGArr);
    }

    public static EnumC954840axG[] values() {
        return (EnumC954840axG[]) LL.clone();
    }

    public static EnumC954840axG valueOf(String str) {
        return (EnumC954840axG) C08FF.LIZ(EnumC954840axG.class, str);
    }

    public EnumC954840axG(String str, int i) {
    }
}
