package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040000Cg {
    public static final /* synthetic */ EnumC040000Cg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040000Cg NORMAL;
    public static final EnumC040000Cg SEE_MORE;
    public static final EnumC040000Cg SHOW_LINK;

    public static InterfaceC2044707zh<EnumC040000Cg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040000Cg enumC040000Cg = new EnumC040000Cg("NORMAL", 0);
        NORMAL = enumC040000Cg;
        EnumC040000Cg enumC040000Cg2 = new EnumC040000Cg("SHOW_LINK", 1);
        SHOW_LINK = enumC040000Cg2;
        EnumC040000Cg enumC040000Cg3 = new EnumC040000Cg("SEE_MORE", 2);
        SEE_MORE = enumC040000Cg3;
        EnumC040000Cg[] enumC040000CgArr = {enumC040000Cg, enumC040000Cg2, enumC040000Cg3};
        LL = enumC040000CgArr;
        LLILLJJLI = new C2254308sP(enumC040000CgArr);
    }

    public static EnumC040000Cg[] values() {
        return (EnumC040000Cg[]) LL.clone();
    }

    public static EnumC040000Cg valueOf(String str) {
        return (EnumC040000Cg) C08FF.LIZ(EnumC040000Cg.class, str);
    }

    public EnumC040000Cg(String str, int i) {
    }
}
