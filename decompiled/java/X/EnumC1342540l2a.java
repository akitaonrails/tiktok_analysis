package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1342540l2a {
    public static final EnumC1342540l2a CANCEL;
    public static final EnumC1342540l2a FAIL;
    public static final EnumC1342540l2a LIMIT;
    public static final /* synthetic */ EnumC1342540l2a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1342540l2a SUCCESS;

    public static InterfaceC2044707zh<EnumC1342540l2a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1342540l2a enumC1342540l2a = new EnumC1342540l2a("SUCCESS", 0);
        SUCCESS = enumC1342540l2a;
        EnumC1342540l2a enumC1342540l2a2 = new EnumC1342540l2a("FAIL", 1);
        FAIL = enumC1342540l2a2;
        EnumC1342540l2a enumC1342540l2a3 = new EnumC1342540l2a("CANCEL", 2);
        CANCEL = enumC1342540l2a3;
        EnumC1342540l2a enumC1342540l2a4 = new EnumC1342540l2a("LIMIT", 3);
        LIMIT = enumC1342540l2a4;
        EnumC1342540l2a[] enumC1342540l2aArr = {enumC1342540l2a, enumC1342540l2a2, enumC1342540l2a3, enumC1342540l2a4};
        LL = enumC1342540l2aArr;
        LLILLJJLI = new C2254308sP(enumC1342540l2aArr);
    }

    public static EnumC1342540l2a[] values() {
        return (EnumC1342540l2a[]) LL.clone();
    }

    public static EnumC1342540l2a valueOf(String str) {
        return (EnumC1342540l2a) C08FF.LIZ(EnumC1342540l2a.class, str);
    }

    public EnumC1342540l2a(String str, int i) {
    }
}
