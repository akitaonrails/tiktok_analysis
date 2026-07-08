package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1988807qg {
    public static final EnumC1988807qg IMAGE;
    public static final /* synthetic */ EnumC1988807qg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1988807qg TOP_BODY;
    public static final EnumC1988807qg UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1988807qg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1988807qg enumC1988807qg = new EnumC1988807qg("UNKNOWN", 0, 0);
        UNKNOWN = enumC1988807qg;
        EnumC1988807qg enumC1988807qg2 = new EnumC1988807qg("TOP_BODY", 1, 1);
        TOP_BODY = enumC1988807qg2;
        EnumC1988807qg enumC1988807qg3 = new EnumC1988807qg("IMAGE", 2, 2);
        IMAGE = enumC1988807qg3;
        EnumC1988807qg[] enumC1988807qgArr = {enumC1988807qg, enumC1988807qg2, enumC1988807qg3};
        LLILLJJLI = enumC1988807qgArr;
        LLILLL = new C2254308sP(enumC1988807qgArr);
    }

    public static EnumC1988807qg[] values() {
        return (EnumC1988807qg[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1988807qg valueOf(String str) {
        return (EnumC1988807qg) C08FF.LIZ(EnumC1988807qg.class, str);
    }

    public EnumC1988807qg(String str, int i, int i2) {
        this.LL = i2;
    }
}
