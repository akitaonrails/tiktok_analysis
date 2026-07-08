package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995340c0a {
    public static final EnumC995340c0a ELEMENT;
    public static final /* synthetic */ EnumC995340c0a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995340c0a NEEDED_ELEMENT;

    public static InterfaceC2044707zh<EnumC995340c0a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995340c0a enumC995340c0a = new EnumC995340c0a("ELEMENT", 0);
        ELEMENT = enumC995340c0a;
        EnumC995340c0a enumC995340c0a2 = new EnumC995340c0a("NEEDED_ELEMENT", 1);
        NEEDED_ELEMENT = enumC995340c0a2;
        EnumC995340c0a[] enumC995340c0aArr = {enumC995340c0a, enumC995340c0a2};
        LL = enumC995340c0aArr;
        LLILLJJLI = new C2254308sP(enumC995340c0aArr);
    }

    public static EnumC995340c0a[] values() {
        return (EnumC995340c0a[]) LL.clone();
    }

    public static EnumC995340c0a valueOf(String str) {
        return (EnumC995340c0a) C08FF.LIZ(EnumC995340c0a.class, str);
    }

    public EnumC995340c0a(String str, int i) {
    }
}
