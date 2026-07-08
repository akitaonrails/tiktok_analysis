package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1360670lVp {
    public static final /* synthetic */ EnumC1360670lVp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1360670lVp NORMAL_FEED;
    public static final EnumC1360670lVp PRELOAD_FEED;
    public static final EnumC1360670lVp RED_DOT;
    public static final EnumC1360670lVp UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1360670lVp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1360670lVp enumC1360670lVp = new EnumC1360670lVp("UNKNOWN", 0, 0);
        UNKNOWN = enumC1360670lVp;
        EnumC1360670lVp enumC1360670lVp2 = new EnumC1360670lVp("RED_DOT", 1, 1);
        RED_DOT = enumC1360670lVp2;
        EnumC1360670lVp enumC1360670lVp3 = new EnumC1360670lVp("NORMAL_FEED", 2, 2);
        NORMAL_FEED = enumC1360670lVp3;
        EnumC1360670lVp enumC1360670lVp4 = new EnumC1360670lVp("PRELOAD_FEED", 3, 3);
        PRELOAD_FEED = enumC1360670lVp4;
        EnumC1360670lVp[] enumC1360670lVpArr = {enumC1360670lVp, enumC1360670lVp2, enumC1360670lVp3, enumC1360670lVp4};
        LLILLJJLI = enumC1360670lVpArr;
        LLILLL = new C2254308sP(enumC1360670lVpArr);
    }

    public static EnumC1360670lVp[] values() {
        return (EnumC1360670lVp[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1360670lVp valueOf(String str) {
        return (EnumC1360670lVp) C08FF.LIZ(EnumC1360670lVp.class, str);
    }

    public EnumC1360670lVp(String str, int i, int i2) {
        this.LL = i2;
    }
}
