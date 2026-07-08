package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990307qv {
    public static final EnumC1990307qv INTERCEPT_ENQUEUE;
    public static final EnumC1990307qv INTERCEPT_SHOW;
    public static final /* synthetic */ EnumC1990307qv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1990307qv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1990307qv enumC1990307qv = new EnumC1990307qv("INTERCEPT_ENQUEUE", 0);
        INTERCEPT_ENQUEUE = enumC1990307qv;
        EnumC1990307qv enumC1990307qv2 = new EnumC1990307qv("INTERCEPT_SHOW", 1);
        INTERCEPT_SHOW = enumC1990307qv2;
        EnumC1990307qv[] enumC1990307qvArr = {enumC1990307qv, enumC1990307qv2};
        LL = enumC1990307qvArr;
        LLILLJJLI = new C2254308sP(enumC1990307qvArr);
    }

    public static EnumC1990307qv[] values() {
        return (EnumC1990307qv[]) LL.clone();
    }

    public static EnumC1990307qv valueOf(String str) {
        return (EnumC1990307qv) C08FF.LIZ(EnumC1990307qv.class, str);
    }

    public EnumC1990307qv(String str, int i) {
    }
}
