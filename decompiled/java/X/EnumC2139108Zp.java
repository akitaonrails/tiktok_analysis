package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08Zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2139108Zp {
    public static final EnumC2139108Zp FAIL;
    public static final /* synthetic */ EnumC2139108Zp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2139108Zp SUCCESS;
    public static final EnumC2139108Zp VISIBLE;

    public static InterfaceC2044707zh<EnumC2139108Zp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2139108Zp enumC2139108Zp = new EnumC2139108Zp("VISIBLE", 0);
        VISIBLE = enumC2139108Zp;
        EnumC2139108Zp enumC2139108Zp2 = new EnumC2139108Zp("SUCCESS", 1);
        SUCCESS = enumC2139108Zp2;
        EnumC2139108Zp enumC2139108Zp3 = new EnumC2139108Zp("FAIL", 2);
        FAIL = enumC2139108Zp3;
        EnumC2139108Zp[] enumC2139108ZpArr = {enumC2139108Zp, enumC2139108Zp2, enumC2139108Zp3};
        LL = enumC2139108ZpArr;
        LLILLJJLI = new C2254308sP(enumC2139108ZpArr);
    }

    public static EnumC2139108Zp[] values() {
        return (EnumC2139108Zp[]) LL.clone();
    }

    public static EnumC2139108Zp valueOf(String str) {
        return (EnumC2139108Zp) C08FF.LIZ(EnumC2139108Zp.class, str);
    }

    public EnumC2139108Zp(String str, int i) {
    }
}
