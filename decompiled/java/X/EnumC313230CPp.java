package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC313230CPp {
    public static final /* synthetic */ EnumC313230CPp[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC313230CPp V0;
    public static final EnumC313230CPp V1;
    public static final EnumC313230CPp V2;
    public static final EnumC313230CPp V3;
    public static final EnumC313230CPp V4;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC313230CPp> getEntries() {
        return LLILZ;
    }

    static {
        EnumC313230CPp enumC313230CPp = new EnumC313230CPp("V0", 0, "v0", "default");
        V0 = enumC313230CPp;
        EnumC313230CPp enumC313230CPp2 = new EnumC313230CPp("V1", 1, "v1", "container alpha == 0");
        V1 = enumC313230CPp2;
        EnumC313230CPp enumC313230CPp3 = new EnumC313230CPp("V2", 2, "v2", "container is not visible, recovery");
        V2 = enumC313230CPp3;
        EnumC313230CPp enumC313230CPp4 = new EnumC313230CPp("V3", 3, "v3", "container has not attach");
        V3 = enumC313230CPp4;
        EnumC313230CPp enumC313230CPp5 = new EnumC313230CPp("V4", 4, "v4", "container or root is null");
        V4 = enumC313230CPp5;
        EnumC313230CPp[] enumC313230CPpArr = {enumC313230CPp, enumC313230CPp2, enumC313230CPp3, enumC313230CPp4, enumC313230CPp5};
        LLILLL = enumC313230CPpArr;
        LLILZ = new C2254308sP(enumC313230CPpArr);
    }

    public static EnumC313230CPp[] values() {
        return (EnumC313230CPp[]) LLILLL.clone();
    }

    public final String getErrorInfo() {
        return this.LLILLJJLI;
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC313230CPp valueOf(String str) {
        return (EnumC313230CPp) C08FF.LIZ(EnumC313230CPp.class, str);
    }

    public EnumC313230CPp(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
