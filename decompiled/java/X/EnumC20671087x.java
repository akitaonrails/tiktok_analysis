package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.087x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20671087x {
    public static final EnumC20671087x Fail;
    public static final /* synthetic */ EnumC20671087x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20671087x Loading;
    public static final EnumC20671087x Success;

    public static InterfaceC2044707zh<EnumC20671087x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20671087x enumC20671087x = new EnumC20671087x("Success", 0);
        Success = enumC20671087x;
        EnumC20671087x enumC20671087x2 = new EnumC20671087x("Loading", 1);
        Loading = enumC20671087x2;
        EnumC20671087x enumC20671087x3 = new EnumC20671087x("Fail", 2);
        Fail = enumC20671087x3;
        EnumC20671087x[] enumC20671087xArr = {enumC20671087x, enumC20671087x2, enumC20671087x3};
        LL = enumC20671087xArr;
        LLILLJJLI = new C2254308sP(enumC20671087xArr);
    }

    public static EnumC20671087x[] values() {
        return (EnumC20671087x[]) LL.clone();
    }

    public static EnumC20671087x valueOf(String str) {
        return (EnumC20671087x) C08FF.LIZ(EnumC20671087x.class, str);
    }

    public EnumC20671087x(String str, int i) {
    }
}
