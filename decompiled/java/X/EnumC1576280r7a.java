package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1576280r7a {
    public static final EnumC1576280r7a CLEAR;
    public static final EnumC1576280r7a LINK;
    public static final /* synthetic */ EnumC1576280r7a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1576280r7a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1576280r7a enumC1576280r7a = new EnumC1576280r7a("LINK", 0);
        LINK = enumC1576280r7a;
        EnumC1576280r7a enumC1576280r7a2 = new EnumC1576280r7a("CLEAR", 1);
        CLEAR = enumC1576280r7a2;
        EnumC1576280r7a[] enumC1576280r7aArr = {enumC1576280r7a, enumC1576280r7a2};
        LL = enumC1576280r7aArr;
        LLILLJJLI = new C2254308sP(enumC1576280r7aArr);
    }

    public static EnumC1576280r7a[] values() {
        return (EnumC1576280r7a[]) LL.clone();
    }

    public static EnumC1576280r7a valueOf(String str) {
        return (EnumC1576280r7a) C08FF.LIZ(EnumC1576280r7a.class, str);
    }

    public EnumC1576280r7a(String str, int i) {
    }
}
