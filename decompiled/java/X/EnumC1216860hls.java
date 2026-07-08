package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216860hls {
    public static final EnumC1216860hls ALLOW;
    public static final EnumC1216860hls BLOCK;
    public static final /* synthetic */ EnumC1216860hls[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1216860hls> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216860hls enumC1216860hls = new EnumC1216860hls("BLOCK", 0, 0);
        BLOCK = enumC1216860hls;
        EnumC1216860hls enumC1216860hls2 = new EnumC1216860hls("ALLOW", 1, 1);
        ALLOW = enumC1216860hls2;
        EnumC1216860hls[] enumC1216860hlsArr = {enumC1216860hls, enumC1216860hls2};
        LLILLJJLI = enumC1216860hlsArr;
        LLILLL = new C2254308sP(enumC1216860hlsArr);
    }

    public static EnumC1216860hls[] values() {
        return (EnumC1216860hls[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1216860hls valueOf(String str) {
        return (EnumC1216860hls) C08FF.LIZ(EnumC1216860hls.class, str);
    }

    public EnumC1216860hls(String str, int i, int i2) {
        this.LL = i2;
    }
}
