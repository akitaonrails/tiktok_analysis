package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1986207qG {
    public static final /* synthetic */ EnumC1986207qG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1986207qG MALL_VERSION_V2;
    public static final EnumC1986207qG MALL_VERSION_V3;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1986207qG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1986207qG enumC1986207qG = new EnumC1986207qG("MALL_VERSION_V2", 0, "v2");
        MALL_VERSION_V2 = enumC1986207qG;
        EnumC1986207qG enumC1986207qG2 = new EnumC1986207qG("MALL_VERSION_V3", 1, "v3");
        MALL_VERSION_V3 = enumC1986207qG2;
        EnumC1986207qG[] enumC1986207qGArr = {enumC1986207qG, enumC1986207qG2};
        LLILLJJLI = enumC1986207qGArr;
        LLILLL = new C2254308sP(enumC1986207qGArr);
    }

    public static EnumC1986207qG[] values() {
        return (EnumC1986207qG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1986207qG valueOf(String str) {
        return (EnumC1986207qG) C08FF.LIZ(EnumC1986207qG.class, str);
    }

    public EnumC1986207qG(String str, int i, String str2) {
        this.LL = str2;
    }
}
