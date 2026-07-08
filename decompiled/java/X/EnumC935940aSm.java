package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC935940aSm {
    public static final /* synthetic */ EnumC935940aSm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC935940aSm STATE_FAILED;
    public static final EnumC935940aSm STATE_PROGRESS;
    public static final EnumC935940aSm STATE_SUCCESS;

    public static InterfaceC2044707zh<EnumC935940aSm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC935940aSm enumC935940aSm = new EnumC935940aSm("STATE_SUCCESS", 0);
        STATE_SUCCESS = enumC935940aSm;
        EnumC935940aSm enumC935940aSm2 = new EnumC935940aSm("STATE_FAILED", 1);
        STATE_FAILED = enumC935940aSm2;
        EnumC935940aSm enumC935940aSm3 = new EnumC935940aSm("STATE_PROGRESS", 2);
        STATE_PROGRESS = enumC935940aSm3;
        EnumC935940aSm[] enumC935940aSmArr = {enumC935940aSm, enumC935940aSm2, enumC935940aSm3};
        LL = enumC935940aSmArr;
        LLILLJJLI = new C2254308sP(enumC935940aSmArr);
    }

    public static EnumC935940aSm[] values() {
        return (EnumC935940aSm[]) LL.clone();
    }

    public static EnumC935940aSm valueOf(String str) {
        return (EnumC935940aSm) C08FF.LIZ(EnumC935940aSm.class, str);
    }

    public EnumC935940aSm(String str, int i) {
    }
}
