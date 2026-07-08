package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC945540aiG {
    public static final EnumC945540aiG EDIT;
    public static final EnumC945540aiG EXPAND;
    public static final /* synthetic */ EnumC945540aiG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC945540aiG REMOVE;
    public static final EnumC945540aiG SHRINK;
    public static final EnumC945540aiG SWITCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC945540aiG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC945540aiG enumC945540aiG = new EnumC945540aiG("EXPAND", 0, "expand");
        EXPAND = enumC945540aiG;
        EnumC945540aiG enumC945540aiG2 = new EnumC945540aiG("SHRINK", 1, "shrink");
        SHRINK = enumC945540aiG2;
        EnumC945540aiG enumC945540aiG3 = new EnumC945540aiG("SWITCH", 2, "switch");
        SWITCH = enumC945540aiG3;
        EnumC945540aiG enumC945540aiG4 = new EnumC945540aiG("EDIT", 3, "edit");
        EDIT = enumC945540aiG4;
        EnumC945540aiG enumC945540aiG5 = new EnumC945540aiG("REMOVE", 4, "remove");
        REMOVE = enumC945540aiG5;
        EnumC945540aiG[] enumC945540aiGArr = {enumC945540aiG, enumC945540aiG2, enumC945540aiG3, enumC945540aiG4, enumC945540aiG5};
        LLILLJJLI = enumC945540aiGArr;
        LLILLL = new C2254308sP(enumC945540aiGArr);
    }

    public static EnumC945540aiG[] values() {
        return (EnumC945540aiG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC945540aiG valueOf(String str) {
        return (EnumC945540aiG) C08FF.LIZ(EnumC945540aiG.class, str);
    }

    public EnumC945540aiG(String str, int i, String str2) {
        this.LL = str2;
    }
}
