package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0338009w {
    public static final EnumC0338009w FAIL;
    public static final /* synthetic */ EnumC0338009w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0338009w NO_VOICE;
    public static final EnumC0338009w SUCCESS;

    public static InterfaceC2044707zh<EnumC0338009w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0338009w enumC0338009w = new EnumC0338009w("SUCCESS", 0);
        SUCCESS = enumC0338009w;
        EnumC0338009w enumC0338009w2 = new EnumC0338009w("FAIL", 1);
        FAIL = enumC0338009w2;
        EnumC0338009w enumC0338009w3 = new EnumC0338009w("NO_VOICE", 2);
        NO_VOICE = enumC0338009w3;
        EnumC0338009w[] enumC0338009wArr = {enumC0338009w, enumC0338009w2, enumC0338009w3};
        LL = enumC0338009wArr;
        LLILLJJLI = new C2254308sP(enumC0338009wArr);
    }

    public static EnumC0338009w[] values() {
        return (EnumC0338009w[]) LL.clone();
    }

    public static EnumC0338009w valueOf(String str) {
        return (EnumC0338009w) C08FF.LIZ(EnumC0338009w.class, str);
    }

    public EnumC0338009w(String str, int i) {
    }
}
