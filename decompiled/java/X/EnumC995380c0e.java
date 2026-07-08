package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995380c0e {
    public static final EnumC995380c0e FAIL;
    public static final /* synthetic */ EnumC995380c0e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995380c0e SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC995380c0e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC995380c0e enumC995380c0e = new EnumC995380c0e("SUCCESS", 0, 1);
        SUCCESS = enumC995380c0e;
        EnumC995380c0e enumC995380c0e2 = new EnumC995380c0e("FAIL", 1, 2);
        FAIL = enumC995380c0e2;
        EnumC995380c0e[] enumC995380c0eArr = {enumC995380c0e, enumC995380c0e2};
        LLILLJJLI = enumC995380c0eArr;
        LLILLL = new C2254308sP(enumC995380c0eArr);
    }

    public static EnumC995380c0e[] values() {
        return (EnumC995380c0e[]) LLILLJJLI.clone();
    }

    public final int getResultLogVal() {
        return this.LL;
    }

    public static EnumC995380c0e valueOf(String str) {
        return (EnumC995380c0e) C08FF.LIZ(EnumC995380c0e.class, str);
    }

    public EnumC995380c0e(String str, int i, int i2) {
        this.LL = i2;
    }
}
