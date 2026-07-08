package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040600Cm {
    public static final EnumC040600Cm CACHE_FIRST;
    public static final EnumC040600Cm CACHE_ONLY;
    public static final /* synthetic */ EnumC040600Cm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040600Cm REQUEST;

    public static InterfaceC2044707zh<EnumC040600Cm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040600Cm enumC040600Cm = new EnumC040600Cm("CACHE_ONLY", 0);
        CACHE_ONLY = enumC040600Cm;
        EnumC040600Cm enumC040600Cm2 = new EnumC040600Cm("CACHE_FIRST", 1);
        CACHE_FIRST = enumC040600Cm2;
        EnumC040600Cm enumC040600Cm3 = new EnumC040600Cm("REQUEST", 2);
        REQUEST = enumC040600Cm3;
        EnumC040600Cm[] enumC040600CmArr = {enumC040600Cm, enumC040600Cm2, enumC040600Cm3};
        LL = enumC040600CmArr;
        LLILLJJLI = new C2254308sP(enumC040600CmArr);
    }

    public static EnumC040600Cm[] values() {
        return (EnumC040600Cm[]) LL.clone();
    }

    public static EnumC040600Cm valueOf(String str) {
        return (EnumC040600Cm) C08FF.LIZ(EnumC040600Cm.class, str);
    }

    public EnumC040600Cm(String str, int i) {
    }
}
