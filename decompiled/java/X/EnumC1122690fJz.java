package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1122690fJz {
    public static final EnumC1122690fJz BOTH;
    public static final EnumC1122690fJz COMMENT;
    public static final EnumC1122690fJz INTERACTION;
    public static final /* synthetic */ EnumC1122690fJz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1122690fJz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1122690fJz enumC1122690fJz = new EnumC1122690fJz("INTERACTION", 0, "interaction");
        INTERACTION = enumC1122690fJz;
        EnumC1122690fJz enumC1122690fJz2 = new EnumC1122690fJz("COMMENT", 1, "comment");
        COMMENT = enumC1122690fJz2;
        EnumC1122690fJz enumC1122690fJz3 = new EnumC1122690fJz("BOTH", 2, "both");
        BOTH = enumC1122690fJz3;
        EnumC1122690fJz[] enumC1122690fJzArr = {enumC1122690fJz, enumC1122690fJz2, enumC1122690fJz3};
        LLILLJJLI = enumC1122690fJzArr;
        LLILLL = new C2254308sP(enumC1122690fJzArr);
    }

    public static EnumC1122690fJz[] values() {
        return (EnumC1122690fJz[]) LLILLJJLI.clone();
    }

    public final String getTrackingValue() {
        return this.LL;
    }

    public static EnumC1122690fJz valueOf(String str) {
        return (EnumC1122690fJz) C08FF.LIZ(EnumC1122690fJz.class, str);
    }

    public EnumC1122690fJz(String str, int i, String str2) {
        this.LL = str2;
    }
}
