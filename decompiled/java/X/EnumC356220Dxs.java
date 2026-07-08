package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356220Dxs {
    public static final EnumC356220Dxs LL;
    public static final EnumC356220Dxs LLILLJJLI;
    public static final EnumC356220Dxs LLILLL;
    public static final EnumC356220Dxs LLILZ;
    public static final /* synthetic */ EnumC356220Dxs[] LLILZIL;

    static {
        EnumC356220Dxs enumC356220Dxs = new EnumC356220Dxs("NONE", 0);
        LL = enumC356220Dxs;
        EnumC356220Dxs enumC356220Dxs2 = new EnumC356220Dxs("FREEZING", 1);
        LLILLJJLI = enumC356220Dxs2;
        EnumC356220Dxs enumC356220Dxs3 = new EnumC356220Dxs("SUCCESS", 2);
        LLILLL = enumC356220Dxs3;
        EnumC356220Dxs enumC356220Dxs4 = new EnumC356220Dxs("FAILED", 3);
        LLILZ = enumC356220Dxs4;
        EnumC356220Dxs[] enumC356220DxsArr = {enumC356220Dxs, enumC356220Dxs2, enumC356220Dxs3, enumC356220Dxs4};
        LLILZIL = enumC356220DxsArr;
        new C2254308sP(enumC356220DxsArr);
    }

    public static EnumC356220Dxs[] values() {
        return (EnumC356220Dxs[]) LLILZIL.clone();
    }

    public static EnumC356220Dxs valueOf(String str) {
        return (EnumC356220Dxs) C08FF.LIZ(EnumC356220Dxs.class, str);
    }

    public EnumC356220Dxs(String str, int i) {
    }
}
