package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0arj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC951410arj {
    public static final /* synthetic */ EnumC951410arj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC951410arj MULTI_GUEST;
    public static final EnumC951410arj NORMAL;

    public static InterfaceC2044707zh<EnumC951410arj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC951410arj enumC951410arj = new EnumC951410arj("NORMAL", 0);
        NORMAL = enumC951410arj;
        EnumC951410arj enumC951410arj2 = new EnumC951410arj("MULTI_GUEST", 1);
        MULTI_GUEST = enumC951410arj2;
        EnumC951410arj[] enumC951410arjArr = {enumC951410arj, enumC951410arj2};
        LL = enumC951410arjArr;
        LLILLJJLI = new C2254308sP(enumC951410arjArr);
    }

    public static EnumC951410arj[] values() {
        return (EnumC951410arj[]) LL.clone();
    }

    public static EnumC951410arj valueOf(String str) {
        return (EnumC951410arj) C08FF.LIZ(EnumC951410arj.class, str);
    }

    public EnumC951410arj(String str, int i) {
    }
}
