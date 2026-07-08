package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429114wj {
    public static final EnumC20429114wj EDIT;
    public static final /* synthetic */ EnumC20429114wj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429114wj NORMAL;
    public static final EnumC20429114wj ONLY_READ;
    public static final EnumC20429114wj ONLY_READ_OPT;

    public static InterfaceC2044707zh<EnumC20429114wj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429114wj enumC20429114wj = new EnumC20429114wj("NORMAL", 0);
        NORMAL = enumC20429114wj;
        EnumC20429114wj enumC20429114wj2 = new EnumC20429114wj("ONLY_READ", 1);
        ONLY_READ = enumC20429114wj2;
        EnumC20429114wj enumC20429114wj3 = new EnumC20429114wj("ONLY_READ_OPT", 2);
        ONLY_READ_OPT = enumC20429114wj3;
        EnumC20429114wj enumC20429114wj4 = new EnumC20429114wj("EDIT", 3);
        EDIT = enumC20429114wj4;
        EnumC20429114wj[] enumC20429114wjArr = {enumC20429114wj, enumC20429114wj2, enumC20429114wj3, enumC20429114wj4};
        LL = enumC20429114wjArr;
        LLILLJJLI = new C2254308sP(enumC20429114wjArr);
    }

    public static EnumC20429114wj[] values() {
        return (EnumC20429114wj[]) LL.clone();
    }

    public static EnumC20429114wj valueOf(String str) {
        return (EnumC20429114wj) C08FF.LIZ(EnumC20429114wj.class, str);
    }

    public EnumC20429114wj(String str, int i) {
    }
}
