package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15f2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20574215f2 {
    public static final EnumC20574215f2 LL;
    public static final EnumC20574215f2 LLILLJJLI;
    public static final EnumC20574215f2 LLILLL;
    public static final /* synthetic */ EnumC20574215f2[] LLILZ;

    static {
        EnumC20574215f2 enumC20574215f2 = new EnumC20574215f2("SUCCESS", 0);
        LL = enumC20574215f2;
        EnumC20574215f2 enumC20574215f22 = new EnumC20574215f2("LOAD_FAIL", 1);
        LLILLJJLI = enumC20574215f22;
        EnumC20574215f2 enumC20574215f23 = new EnumC20574215f2("LOADING", 2);
        LLILLL = enumC20574215f23;
        EnumC20574215f2[] enumC20574215f2Arr = {enumC20574215f2, enumC20574215f22, enumC20574215f23};
        LLILZ = enumC20574215f2Arr;
        new C2254308sP(enumC20574215f2Arr);
    }

    public static EnumC20574215f2[] values() {
        return (EnumC20574215f2[]) LLILZ.clone();
    }

    public static EnumC20574215f2 valueOf(String str) {
        return (EnumC20574215f2) C08FF.LIZ(EnumC20574215f2.class, str);
    }

    public EnumC20574215f2(String str, int i) {
    }
}
