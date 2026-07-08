package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040500Cl {
    public static final EnumC040500Cl COMPLETED;
    public static final EnumC040500Cl FAILED;
    public static final /* synthetic */ EnumC040500Cl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040500Cl UNFAILED;

    public static InterfaceC2044707zh<EnumC040500Cl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040500Cl enumC040500Cl = new EnumC040500Cl("UNFAILED", 0);
        UNFAILED = enumC040500Cl;
        EnumC040500Cl enumC040500Cl2 = new EnumC040500Cl("FAILED", 1);
        FAILED = enumC040500Cl2;
        EnumC040500Cl enumC040500Cl3 = new EnumC040500Cl("COMPLETED", 2);
        COMPLETED = enumC040500Cl3;
        EnumC040500Cl[] enumC040500ClArr = {enumC040500Cl, enumC040500Cl2, enumC040500Cl3};
        LL = enumC040500ClArr;
        LLILLJJLI = new C2254308sP(enumC040500ClArr);
    }

    public static EnumC040500Cl[] values() {
        return (EnumC040500Cl[]) LL.clone();
    }

    public static EnumC040500Cl valueOf(String str) {
        return (EnumC040500Cl) C08FF.LIZ(EnumC040500Cl.class, str);
    }

    public EnumC040500Cl(String str, int i) {
    }
}
