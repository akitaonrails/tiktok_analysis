package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC435580H6e {
    public static final EnumC435580H6e LL;
    public static final EnumC435580H6e LLILLJJLI;
    public static final EnumC435580H6e LLILLL;
    public static final /* synthetic */ EnumC435580H6e[] LLILZ;

    static {
        EnumC435580H6e enumC435580H6e = new EnumC435580H6e("WAITING", 0);
        LL = enumC435580H6e;
        EnumC435580H6e enumC435580H6e2 = new EnumC435580H6e("IN_PROGRESS", 1);
        LLILLJJLI = enumC435580H6e2;
        EnumC435580H6e enumC435580H6e3 = new EnumC435580H6e("DONE", 2);
        LLILLL = enumC435580H6e3;
        EnumC435580H6e[] enumC435580H6eArr = {enumC435580H6e, enumC435580H6e2, enumC435580H6e3};
        LLILZ = enumC435580H6eArr;
        new C2254308sP(enumC435580H6eArr);
    }

    public static EnumC435580H6e[] values() {
        return (EnumC435580H6e[]) LLILZ.clone();
    }

    public static EnumC435580H6e valueOf(String str) {
        return (EnumC435580H6e) C08FF.LIZ(EnumC435580H6e.class, str);
    }

    public EnumC435580H6e(String str, int i) {
    }
}
