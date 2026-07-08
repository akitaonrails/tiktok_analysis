package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779450wPH {
    public static final EnumC1779450wPH LL;
    public static final EnumC1779450wPH LLILLJJLI;
    public static final EnumC1779450wPH LLILLL;
    public static final /* synthetic */ EnumC1779450wPH[] LLILZ;

    static {
        EnumC1779450wPH enumC1779450wPH = new EnumC1779450wPH("ALL_RESOLVED", 0);
        LL = enumC1779450wPH;
        EnumC1779450wPH enumC1779450wPH2 = new EnumC1779450wPH("KEEP_WAITING", 1);
        LLILLJJLI = enumC1779450wPH2;
        EnumC1779450wPH enumC1779450wPH3 = new EnumC1779450wPH("FAIL_FAST", 2);
        LLILLL = enumC1779450wPH3;
        EnumC1779450wPH[] enumC1779450wPHArr = {enumC1779450wPH, enumC1779450wPH2, enumC1779450wPH3};
        LLILZ = enumC1779450wPHArr;
        new C2254308sP(enumC1779450wPHArr);
    }

    public static EnumC1779450wPH[] values() {
        return (EnumC1779450wPH[]) LLILZ.clone();
    }

    public static EnumC1779450wPH valueOf(String str) {
        return (EnumC1779450wPH) C08FF.LIZ(EnumC1779450wPH.class, str);
    }

    public EnumC1779450wPH(String str, int i) {
    }
}
