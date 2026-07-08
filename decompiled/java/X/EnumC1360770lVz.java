package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1360770lVz {
    public static final /* synthetic */ EnumC1360770lVz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1360770lVz NORMAL_FEED;
    public static final EnumC1360770lVz PILLS_LOAD_MORE;
    public static final EnumC1360770lVz PRELOAD_FEED;
    public static final EnumC1360770lVz RED_DOT;
    public static final EnumC1360770lVz UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1360770lVz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1360770lVz enumC1360770lVz = new EnumC1360770lVz("UNKNOWN", 0, 0);
        UNKNOWN = enumC1360770lVz;
        EnumC1360770lVz enumC1360770lVz2 = new EnumC1360770lVz("RED_DOT", 1, 1);
        RED_DOT = enumC1360770lVz2;
        EnumC1360770lVz enumC1360770lVz3 = new EnumC1360770lVz("NORMAL_FEED", 2, 2);
        NORMAL_FEED = enumC1360770lVz3;
        EnumC1360770lVz enumC1360770lVz4 = new EnumC1360770lVz("PRELOAD_FEED", 3, 3);
        PRELOAD_FEED = enumC1360770lVz4;
        EnumC1360770lVz enumC1360770lVz5 = new EnumC1360770lVz("PILLS_LOAD_MORE", 4, 4);
        PILLS_LOAD_MORE = enumC1360770lVz5;
        EnumC1360770lVz[] enumC1360770lVzArr = {enumC1360770lVz, enumC1360770lVz2, enumC1360770lVz3, enumC1360770lVz4, enumC1360770lVz5};
        LLILLJJLI = enumC1360770lVzArr;
        LLILLL = new C2254308sP(enumC1360770lVzArr);
    }

    public static EnumC1360770lVz[] values() {
        return (EnumC1360770lVz[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1360770lVz valueOf(String str) {
        return (EnumC1360770lVz) C08FF.LIZ(EnumC1360770lVz.class, str);
    }

    public EnumC1360770lVz(String str, int i, int i2) {
        this.LL = i2;
    }
}
