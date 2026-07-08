package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1842640y3C {
    public static final /* synthetic */ EnumC1842640y3C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1842640y3C ONCE;
    public static final EnumC1842640y3C RESET;

    public static InterfaceC2044707zh<EnumC1842640y3C> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1842640y3C enumC1842640y3C = new EnumC1842640y3C("ONCE", 0);
        ONCE = enumC1842640y3C;
        EnumC1842640y3C enumC1842640y3C2 = new EnumC1842640y3C("RESET", 1);
        RESET = enumC1842640y3C2;
        EnumC1842640y3C[] enumC1842640y3CArr = {enumC1842640y3C, enumC1842640y3C2};
        LL = enumC1842640y3CArr;
        LLILLJJLI = new C2254308sP(enumC1842640y3CArr);
    }

    public static EnumC1842640y3C[] values() {
        return (EnumC1842640y3C[]) LL.clone();
    }

    public static EnumC1842640y3C valueOf(String str) {
        return (EnumC1842640y3C) C08FF.LIZ(EnumC1842640y3C.class, str);
    }

    public EnumC1842640y3C(String str, int i) {
    }
}
