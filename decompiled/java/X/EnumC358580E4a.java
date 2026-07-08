package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC358580E4a {
    public static final EnumC358580E4a CLIPPED;
    public static final EnumC358580E4a FULL;
    public static final /* synthetic */ EnumC358580E4a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC358580E4a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC358580E4a enumC358580E4a = new EnumC358580E4a("CLIPPED", 0);
        CLIPPED = enumC358580E4a;
        EnumC358580E4a enumC358580E4a2 = new EnumC358580E4a("FULL", 1);
        FULL = enumC358580E4a2;
        EnumC358580E4a[] enumC358580E4aArr = {enumC358580E4a, enumC358580E4a2};
        LL = enumC358580E4aArr;
        LLILLJJLI = new C2254308sP(enumC358580E4aArr);
    }

    public static EnumC358580E4a[] values() {
        return (EnumC358580E4a[]) LL.clone();
    }

    public static EnumC358580E4a valueOf(String str) {
        return (EnumC358580E4a) C08FF.LIZ(EnumC358580E4a.class, str);
    }

    public EnumC358580E4a(String str, int i) {
    }
}
