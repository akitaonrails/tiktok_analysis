package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1538530q8h {
    public static final EnumC1538530q8h JSB;
    public static final /* synthetic */ EnumC1538530q8h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1538530q8h NAVIGATE;
    public static final EnumC1538530q8h ROUTER;

    public static InterfaceC2044707zh<EnumC1538530q8h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1538530q8h enumC1538530q8h = new EnumC1538530q8h("JSB", 0);
        JSB = enumC1538530q8h;
        EnumC1538530q8h enumC1538530q8h2 = new EnumC1538530q8h("ROUTER", 1);
        ROUTER = enumC1538530q8h2;
        EnumC1538530q8h enumC1538530q8h3 = new EnumC1538530q8h("NAVIGATE", 2);
        NAVIGATE = enumC1538530q8h3;
        EnumC1538530q8h[] enumC1538530q8hArr = {enumC1538530q8h, enumC1538530q8h2, enumC1538530q8h3};
        LL = enumC1538530q8hArr;
        LLILLJJLI = new C2254308sP(enumC1538530q8hArr);
    }

    public static EnumC1538530q8h[] values() {
        return (EnumC1538530q8h[]) LL.clone();
    }

    public static EnumC1538530q8h valueOf(String str) {
        return (EnumC1538530q8h) C08FF.LIZ(EnumC1538530q8h.class, str);
    }

    public EnumC1538530q8h(String str, int i) {
    }
}
