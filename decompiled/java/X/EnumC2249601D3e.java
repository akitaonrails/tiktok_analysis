package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249601D3e {
    public static final EnumC2249601D3e LL;
    public static final EnumC2249601D3e LLILLJJLI;
    public static final /* synthetic */ EnumC2249601D3e[] LLILLL;

    static {
        EnumC2249601D3e enumC2249601D3e = new EnumC2249601D3e("LINE", 0);
        LL = enumC2249601D3e;
        EnumC2249601D3e enumC2249601D3e2 = new EnumC2249601D3e("SPACE", 1);
        LLILLJJLI = enumC2249601D3e2;
        EnumC2249601D3e[] enumC2249601D3eArr = {enumC2249601D3e, enumC2249601D3e2};
        LLILLL = enumC2249601D3eArr;
        new C2254308sP(enumC2249601D3eArr);
    }

    public static EnumC2249601D3e[] values() {
        return (EnumC2249601D3e[]) LLILLL.clone();
    }

    public static EnumC2249601D3e valueOf(String str) {
        return (EnumC2249601D3e) C08FF.LIZ(EnumC2249601D3e.class, str);
    }

    public EnumC2249601D3e(String str, int i) {
    }
}
