package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC625700OgS {
    public static final /* synthetic */ EnumC625700OgS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC625700OgS NETWORK_MOBILE;
    public static final EnumC625700OgS NETWORK_NO;
    public static final EnumC625700OgS NETWORK_WIFI;
    public final int LL;

    public static InterfaceC2044707zh<EnumC625700OgS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC625700OgS enumC625700OgS = new EnumC625700OgS("NETWORK_NO", 0, 0);
        NETWORK_NO = enumC625700OgS;
        EnumC625700OgS enumC625700OgS2 = new EnumC625700OgS("NETWORK_MOBILE", 1, 1);
        NETWORK_MOBILE = enumC625700OgS2;
        EnumC625700OgS enumC625700OgS3 = new EnumC625700OgS("NETWORK_WIFI", 2, 2);
        NETWORK_WIFI = enumC625700OgS3;
        EnumC625700OgS[] enumC625700OgSArr = {enumC625700OgS, enumC625700OgS2, enumC625700OgS3};
        LLILLJJLI = enumC625700OgSArr;
        LLILLL = new C2254308sP(enumC625700OgSArr);
    }

    public static EnumC625700OgS[] values() {
        return (EnumC625700OgS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC625700OgS valueOf(String str) {
        return (EnumC625700OgS) C08FF.LIZ(EnumC625700OgS.class, str);
    }

    public EnumC625700OgS(String str, int i, int i2) {
        this.LL = i2;
    }
}
