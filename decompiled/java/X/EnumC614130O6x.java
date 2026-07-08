package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC614130O6x {
    public static final EnumC614130O6x Cache;
    public static final /* synthetic */ EnumC614130O6x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC614130O6x Net;
    public static final EnumC614130O6x Optimistic;

    public static InterfaceC2044707zh<EnumC614130O6x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC614130O6x enumC614130O6x = new EnumC614130O6x("Optimistic", 0);
        Optimistic = enumC614130O6x;
        EnumC614130O6x enumC614130O6x2 = new EnumC614130O6x("Cache", 1);
        Cache = enumC614130O6x2;
        EnumC614130O6x enumC614130O6x3 = new EnumC614130O6x("Net", 2);
        Net = enumC614130O6x3;
        EnumC614130O6x[] enumC614130O6xArr = {enumC614130O6x, enumC614130O6x2, enumC614130O6x3};
        LL = enumC614130O6xArr;
        LLILLJJLI = new C2254308sP(enumC614130O6xArr);
    }

    public static EnumC614130O6x[] values() {
        return (EnumC614130O6x[]) LL.clone();
    }

    public static EnumC614130O6x valueOf(String str) {
        return (EnumC614130O6x) C08FF.LIZ(EnumC614130O6x.class, str);
    }

    public EnumC614130O6x(String str, int i) {
    }
}
