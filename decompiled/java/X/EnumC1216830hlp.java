package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216830hlp {
    public static final EnumC1216830hlp INSTAGRAM;
    public static final EnumC1216830hlp LEMON8;
    public static final /* synthetic */ EnumC1216830hlp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216830hlp TWITTER;
    public static final EnumC1216830hlp UNKNOWN;
    public static final EnumC1216830hlp WEBSITE;
    public static final EnumC1216830hlp YOUTUBE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1216830hlp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216830hlp enumC1216830hlp = new EnumC1216830hlp("UNKNOWN", 0, 0);
        UNKNOWN = enumC1216830hlp;
        EnumC1216830hlp enumC1216830hlp2 = new EnumC1216830hlp("WEBSITE", 1, 1);
        WEBSITE = enumC1216830hlp2;
        EnumC1216830hlp enumC1216830hlp3 = new EnumC1216830hlp("INSTAGRAM", 2, 2);
        INSTAGRAM = enumC1216830hlp3;
        EnumC1216830hlp enumC1216830hlp4 = new EnumC1216830hlp("YOUTUBE", 3, 3);
        YOUTUBE = enumC1216830hlp4;
        EnumC1216830hlp enumC1216830hlp5 = new EnumC1216830hlp("TWITTER", 4, 4);
        TWITTER = enumC1216830hlp5;
        EnumC1216830hlp enumC1216830hlp6 = new EnumC1216830hlp("LEMON8", 5, 5);
        LEMON8 = enumC1216830hlp6;
        EnumC1216830hlp[] enumC1216830hlpArr = {enumC1216830hlp, enumC1216830hlp2, enumC1216830hlp3, enumC1216830hlp4, enumC1216830hlp5, enumC1216830hlp6};
        LLILLJJLI = enumC1216830hlpArr;
        LLILLL = new C2254308sP(enumC1216830hlpArr);
    }

    public static EnumC1216830hlp[] values() {
        return (EnumC1216830hlp[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1216830hlp valueOf(String str) {
        return (EnumC1216830hlp) C08FF.LIZ(EnumC1216830hlp.class, str);
    }

    public EnumC1216830hlp(String str, int i, int i2) {
        this.LL = i2;
    }
}
