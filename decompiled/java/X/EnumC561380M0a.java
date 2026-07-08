package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC561380M0a {
    public static final EnumC561380M0a EFFECT;
    public static final /* synthetic */ EnumC561380M0a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC561380M0a TEMPLATE;

    public static InterfaceC2044707zh<EnumC561380M0a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC561380M0a enumC561380M0a = new EnumC561380M0a("EFFECT", 0);
        EFFECT = enumC561380M0a;
        EnumC561380M0a enumC561380M0a2 = new EnumC561380M0a("TEMPLATE", 1);
        TEMPLATE = enumC561380M0a2;
        EnumC561380M0a[] enumC561380M0aArr = {enumC561380M0a, enumC561380M0a2};
        LL = enumC561380M0aArr;
        LLILLJJLI = new C2254308sP(enumC561380M0aArr);
    }

    public static EnumC561380M0a[] values() {
        return (EnumC561380M0a[]) LL.clone();
    }

    public static EnumC561380M0a valueOf(String str) {
        return (EnumC561380M0a) C08FF.LIZ(EnumC561380M0a.class, str);
    }

    public EnumC561380M0a(String str, int i) {
    }
}
