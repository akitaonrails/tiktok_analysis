package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.144h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC202057144h {
    public static final EnumC202057144h APPEND;
    public static final EnumC202057144h KEEP;
    public static final /* synthetic */ EnumC202057144h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC202057144h REPLACE;

    public static InterfaceC2044707zh<EnumC202057144h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC202057144h enumC202057144h = new EnumC202057144h("REPLACE", 0);
        REPLACE = enumC202057144h;
        EnumC202057144h enumC202057144h2 = new EnumC202057144h("KEEP", 1);
        KEEP = enumC202057144h2;
        EnumC202057144h enumC202057144h3 = new EnumC202057144h("APPEND", 2);
        APPEND = enumC202057144h3;
        EnumC202057144h[] enumC202057144hArr = {enumC202057144h, enumC202057144h2, enumC202057144h3};
        LL = enumC202057144hArr;
        LLILLJJLI = new C2254308sP(enumC202057144hArr);
    }

    public static EnumC202057144h[] values() {
        return (EnumC202057144h[]) LL.clone();
    }

    public static EnumC202057144h valueOf(String str) {
        return (EnumC202057144h) C08FF.LIZ(EnumC202057144h.class, str);
    }

    public EnumC202057144h(String str, int i) {
    }
}
