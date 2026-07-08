package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ekh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1100810ekh {
    public static final EnumC1100810ekh AUDIENCE;
    public static final EnumC1100810ekh BROADCAST;
    public static final /* synthetic */ EnumC1100810ekh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1100810ekh PREVIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1100810ekh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1100810ekh enumC1100810ekh = new EnumC1100810ekh("PREVIEW", 0, 1);
        PREVIEW = enumC1100810ekh;
        EnumC1100810ekh enumC1100810ekh2 = new EnumC1100810ekh("BROADCAST", 1, 2);
        BROADCAST = enumC1100810ekh2;
        EnumC1100810ekh enumC1100810ekh3 = new EnumC1100810ekh("AUDIENCE", 2, 3);
        AUDIENCE = enumC1100810ekh3;
        EnumC1100810ekh[] enumC1100810ekhArr = {enumC1100810ekh, enumC1100810ekh2, enumC1100810ekh3};
        LLILLJJLI = enumC1100810ekhArr;
        LLILLL = new C2254308sP(enumC1100810ekhArr);
    }

    public static EnumC1100810ekh[] values() {
        return (EnumC1100810ekh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1100810ekh valueOf(String str) {
        return (EnumC1100810ekh) C08FF.LIZ(EnumC1100810ekh.class, str);
    }

    public EnumC1100810ekh(String str, int i, int i2) {
        this.LL = i2;
    }
}
