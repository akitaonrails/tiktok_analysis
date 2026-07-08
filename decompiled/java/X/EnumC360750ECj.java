package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ECj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC360750ECj {
    public static final EnumC360750ECj COMBO;
    public static final EnumC360750ECj ENTER;
    public static final EnumC360750ECj EXIT;
    public static final /* synthetic */ EnumC360750ECj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC360750ECj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC360750ECj enumC360750ECj = new EnumC360750ECj("ENTER", 0);
        ENTER = enumC360750ECj;
        EnumC360750ECj enumC360750ECj2 = new EnumC360750ECj("COMBO", 1);
        COMBO = enumC360750ECj2;
        EnumC360750ECj enumC360750ECj3 = new EnumC360750ECj("EXIT", 2);
        EXIT = enumC360750ECj3;
        EnumC360750ECj[] enumC360750ECjArr = {enumC360750ECj, enumC360750ECj2, enumC360750ECj3};
        LL = enumC360750ECjArr;
        LLILLJJLI = new C2254308sP(enumC360750ECjArr);
    }

    public static EnumC360750ECj[] values() {
        return (EnumC360750ECj[]) LL.clone();
    }

    public static EnumC360750ECj valueOf(String str) {
        return (EnumC360750ECj) C08FF.LIZ(EnumC360750ECj.class, str);
    }

    public EnumC360750ECj(String str, int i) {
    }
}
