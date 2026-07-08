package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779770wPn {
    public static final EnumC1779770wPn LL;
    public static final EnumC1779770wPn LLILLJJLI;
    public static final EnumC1779770wPn LLILLL;
    public static final /* synthetic */ EnumC1779770wPn[] LLILZ;

    static {
        EnumC1779770wPn enumC1779770wPn = new EnumC1779770wPn("IDLE", 0);
        LL = enumC1779770wPn;
        EnumC1779770wPn enumC1779770wPn2 = new EnumC1779770wPn("PENDING", 1);
        LLILLJJLI = enumC1779770wPn2;
        EnumC1779770wPn enumC1779770wPn3 = new EnumC1779770wPn("LOADING", 2);
        LLILLL = enumC1779770wPn3;
        EnumC1779770wPn[] enumC1779770wPnArr = {enumC1779770wPn, enumC1779770wPn2, enumC1779770wPn3};
        LLILZ = enumC1779770wPnArr;
        new C2254308sP(enumC1779770wPnArr);
    }

    public static EnumC1779770wPn[] values() {
        return (EnumC1779770wPn[]) LLILZ.clone();
    }

    public static EnumC1779770wPn valueOf(String str) {
        return (EnumC1779770wPn) C08FF.LIZ(EnumC1779770wPn.class, str);
    }

    public EnumC1779770wPn(String str, int i) {
    }
}
