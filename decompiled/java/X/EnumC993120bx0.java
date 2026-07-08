package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993120bx0 {
    public static final EnumC993120bx0 FULL_WIDTH;
    public static final /* synthetic */ EnumC993120bx0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993120bx0 WRAP_CONTENT_HIGH;
    public static final EnumC993120bx0 WRAP_CONTENT_LOW;

    public static InterfaceC2044707zh<EnumC993120bx0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993120bx0 enumC993120bx0 = new EnumC993120bx0("FULL_WIDTH", 0);
        FULL_WIDTH = enumC993120bx0;
        EnumC993120bx0 enumC993120bx02 = new EnumC993120bx0("WRAP_CONTENT_HIGH", 1);
        WRAP_CONTENT_HIGH = enumC993120bx02;
        EnumC993120bx0 enumC993120bx03 = new EnumC993120bx0("WRAP_CONTENT_LOW", 2);
        WRAP_CONTENT_LOW = enumC993120bx03;
        EnumC993120bx0[] enumC993120bx0Arr = {enumC993120bx0, enumC993120bx02, enumC993120bx03};
        LL = enumC993120bx0Arr;
        LLILLJJLI = new C2254308sP(enumC993120bx0Arr);
    }

    public static EnumC993120bx0[] values() {
        return (EnumC993120bx0[]) LL.clone();
    }

    public static EnumC993120bx0 valueOf(String str) {
        return (EnumC993120bx0) C08FF.LIZ(EnumC993120bx0.class, str);
    }

    public EnumC993120bx0(String str, int i) {
    }
}
