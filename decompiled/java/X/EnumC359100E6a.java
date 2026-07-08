package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC359100E6a {
    public static final EnumC359100E6a GLOBAL_EFFECT;
    public static final /* synthetic */ EnumC359100E6a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC359100E6a SEGMENT_EFFECT;

    public static InterfaceC2044707zh<EnumC359100E6a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC359100E6a enumC359100E6a = new EnumC359100E6a("GLOBAL_EFFECT", 0);
        GLOBAL_EFFECT = enumC359100E6a;
        EnumC359100E6a enumC359100E6a2 = new EnumC359100E6a("SEGMENT_EFFECT", 1);
        SEGMENT_EFFECT = enumC359100E6a2;
        EnumC359100E6a[] enumC359100E6aArr = {enumC359100E6a, enumC359100E6a2};
        LL = enumC359100E6aArr;
        LLILLJJLI = new C2254308sP(enumC359100E6aArr);
    }

    public static EnumC359100E6a[] values() {
        return (EnumC359100E6a[]) LL.clone();
    }

    public static EnumC359100E6a valueOf(String str) {
        return (EnumC359100E6a) C08FF.LIZ(EnumC359100E6a.class, str);
    }

    public EnumC359100E6a(String str, int i) {
    }
}
