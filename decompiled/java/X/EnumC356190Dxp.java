package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356190Dxp {
    public static final EnumC356190Dxp LL;
    public static final EnumC356190Dxp LLILLJJLI;
    public static final EnumC356190Dxp LLILLL;
    public static final EnumC356190Dxp LLILZ;
    public static final /* synthetic */ EnumC356190Dxp[] LLILZIL;

    static {
        EnumC356190Dxp enumC356190Dxp = new EnumC356190Dxp("NONE", 0);
        LL = enumC356190Dxp;
        EnumC356190Dxp enumC356190Dxp2 = new EnumC356190Dxp("REVERSING", 1);
        LLILLJJLI = enumC356190Dxp2;
        EnumC356190Dxp enumC356190Dxp3 = new EnumC356190Dxp("SUCCESS", 2);
        LLILLL = enumC356190Dxp3;
        EnumC356190Dxp enumC356190Dxp4 = new EnumC356190Dxp("FAILED", 3);
        LLILZ = enumC356190Dxp4;
        EnumC356190Dxp[] enumC356190DxpArr = {enumC356190Dxp, enumC356190Dxp2, enumC356190Dxp3, enumC356190Dxp4, new EnumC356190Dxp("CANCELED", 4)};
        LLILZIL = enumC356190DxpArr;
        new C2254308sP(enumC356190DxpArr);
    }

    public static EnumC356190Dxp[] values() {
        return (EnumC356190Dxp[]) LLILZIL.clone();
    }

    public static EnumC356190Dxp valueOf(String str) {
        return (EnumC356190Dxp) C08FF.LIZ(EnumC356190Dxp.class, str);
    }

    public EnumC356190Dxp(String str, int i) {
    }
}
