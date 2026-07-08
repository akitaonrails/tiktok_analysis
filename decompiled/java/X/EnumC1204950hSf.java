package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204950hSf {
    public static final EnumC1204950hSf ALLOW;
    public static final EnumC1204950hSf CLOSE;
    public static final /* synthetic */ EnumC1204950hSf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1204950hSf SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1204950hSf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1204950hSf enumC1204950hSf = new EnumC1204950hSf("SHOW", 0, "show");
        SHOW = enumC1204950hSf;
        EnumC1204950hSf enumC1204950hSf2 = new EnumC1204950hSf("CLOSE", 1, "close");
        CLOSE = enumC1204950hSf2;
        EnumC1204950hSf enumC1204950hSf3 = new EnumC1204950hSf("ALLOW", 2, "allow");
        ALLOW = enumC1204950hSf3;
        EnumC1204950hSf[] enumC1204950hSfArr = {enumC1204950hSf, enumC1204950hSf2, enumC1204950hSf3};
        LLILLJJLI = enumC1204950hSfArr;
        LLILLL = new C2254308sP(enumC1204950hSfArr);
    }

    public static EnumC1204950hSf[] values() {
        return (EnumC1204950hSf[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1204950hSf valueOf(String str) {
        return (EnumC1204950hSf) C08FF.LIZ(EnumC1204950hSf.class, str);
    }

    public EnumC1204950hSf(String str, int i, String str2) {
        this.LL = str2;
    }
}
