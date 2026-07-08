package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1186860gzU {
    public static final EnumC1186860gzU APPEAR;
    public static final EnumC1186860gzU BEFORE_APPEAR;
    public static final EnumC1186860gzU DESTROY;
    public static final EnumC1186860gzU DISAPPEAR;
    public static final /* synthetic */ EnumC1186860gzU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1186860gzU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1186860gzU enumC1186860gzU = new EnumC1186860gzU("BEFORE_APPEAR", 0);
        BEFORE_APPEAR = enumC1186860gzU;
        EnumC1186860gzU enumC1186860gzU2 = new EnumC1186860gzU("APPEAR", 1);
        APPEAR = enumC1186860gzU2;
        EnumC1186860gzU enumC1186860gzU3 = new EnumC1186860gzU("DISAPPEAR", 2);
        DISAPPEAR = enumC1186860gzU3;
        EnumC1186860gzU enumC1186860gzU4 = new EnumC1186860gzU("DESTROY", 3);
        DESTROY = enumC1186860gzU4;
        EnumC1186860gzU[] enumC1186860gzUArr = {enumC1186860gzU, enumC1186860gzU2, enumC1186860gzU3, enumC1186860gzU4};
        LL = enumC1186860gzUArr;
        LLILLJJLI = new C2254308sP(enumC1186860gzUArr);
    }

    public static EnumC1186860gzU[] values() {
        return (EnumC1186860gzU[]) LL.clone();
    }

    public static EnumC1186860gzU valueOf(String str) {
        return (EnumC1186860gzU) C08FF.LIZ(EnumC1186860gzU.class, str);
    }

    public EnumC1186860gzU(String str, int i) {
    }
}
